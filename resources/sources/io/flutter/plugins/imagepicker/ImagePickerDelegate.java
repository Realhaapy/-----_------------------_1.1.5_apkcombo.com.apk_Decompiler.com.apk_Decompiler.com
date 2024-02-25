package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.c;
import e.f.j.a;
import e.f.j.b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

public class ImagePickerDelegate implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {
    static final int REQUEST_CAMERA_IMAGE_PERMISSION = 2345;
    static final int REQUEST_CAMERA_VIDEO_PERMISSION = 2355;
    static final int REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY = 2342;
    static final int REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY = 2346;
    static final int REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY = 2352;
    static final int REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA = 2343;
    static final int REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA = 2353;
    private final Activity activity;
    private final ImagePickerCache cache;
    private CameraDevice cameraDevice;
    final File externalFilesDirectory;
    final String fileProviderName;
    private final FileUriResolver fileUriResolver;
    private final FileUtils fileUtils;
    private final ImageResizer imageResizer;
    private MethodCall methodCall;
    private Uri pendingCameraMediaUri;
    private MethodChannel.Result pendingResult;
    private final PermissionManager permissionManager;

    interface FileUriResolver {
        void getFullImagePath(Uri uri, OnPathReadyListener onPathReadyListener);

        Uri resolveFileProviderUriForFile(String str, File file);
    }

    interface OnPathReadyListener {
        void onPathReady(String str);
    }

    interface PermissionManager {
        void askForPermission(String str, int i2);

        boolean isPermissionGranted(String str);

        boolean needRequestCameraPermission();
    }

    ImagePickerDelegate(Activity activity2, File file, ImageResizer imageResizer2, MethodChannel.Result result, MethodCall methodCall2, ImagePickerCache imagePickerCache, PermissionManager permissionManager2, FileUriResolver fileUriResolver2, FileUtils fileUtils2) {
        this.activity = activity2;
        this.externalFilesDirectory = file;
        this.imageResizer = imageResizer2;
        this.fileProviderName = activity2.getPackageName() + ".flutter.image_provider";
        this.pendingResult = result;
        this.methodCall = methodCall2;
        this.permissionManager = permissionManager2;
        this.fileUriResolver = fileUriResolver2;
        this.fileUtils = fileUtils2;
        this.cache = imagePickerCache;
    }

    public ImagePickerDelegate(final Activity activity2, File file, ImageResizer imageResizer2, ImagePickerCache imagePickerCache) {
        this(activity2, file, imageResizer2, (MethodChannel.Result) null, (MethodCall) null, imagePickerCache, new PermissionManager() {
            public void askForPermission(String str, int i2) {
                c.s(activity2, new String[]{str}, i2);
            }

            public boolean isPermissionGranted(String str) {
                return a.a(activity2, str) == 0;
            }

            public boolean needRequestCameraPermission() {
                return ImagePickerUtils.needRequestCameraPermission(activity2);
            }
        }, new FileUriResolver() {
            public void getFullImagePath(Uri uri, final OnPathReadyListener onPathReadyListener) {
                Activity activity = activity2;
                String[] strArr = new String[1];
                strArr[0] = uri != null ? uri.getPath() : "";
                MediaScannerConnection.scanFile(activity, strArr, (String[]) null, new MediaScannerConnection.OnScanCompletedListener() {
                    public void onScanCompleted(String str, Uri uri) {
                        onPathReadyListener.onPathReady(str);
                    }
                });
            }

            public Uri resolveFileProviderUriForFile(String str, File file) {
                return b.getUriForFile(activity2, str, file);
            }
        }, new FileUtils());
    }

    private void clearMethodCallAndResult() {
        this.methodCall = null;
        this.pendingResult = null;
    }

    private File createTemporaryWritableFile(String str) {
        String uuid = UUID.randomUUID().toString();
        try {
            this.externalFilesDirectory.mkdirs();
            return File.createTempFile(uuid, str, this.externalFilesDirectory);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    private File createTemporaryWritableImageFile() {
        return createTemporaryWritableFile(".jpg");
    }

    private File createTemporaryWritableVideoFile() {
        return createTemporaryWritableFile(".mp4");
    }

    private void finishWithAlreadyActiveError(MethodChannel.Result result) {
        result.error("already_active", "Image picker is already active", (Object) null);
    }

    private void finishWithError(String str, String str2) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            this.cache.saveResult((ArrayList<String>) null, str, str2);
            return;
        }
        result.error(str, str2, (Object) null);
        clearMethodCallAndResult();
    }

    private void finishWithListSuccess(ArrayList<String> arrayList) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            this.cache.saveResult(arrayList, (String) null, (String) null);
            return;
        }
        result.success(arrayList);
        clearMethodCallAndResult();
    }

    private void finishWithSuccess(String str) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            this.cache.saveResult(arrayList, (String) null, (String) null);
            return;
        }
        result.success(str);
        clearMethodCallAndResult();
    }

    private String getResizedImagePath(String str) {
        return this.imageResizer.resizeImageIfNeeded(str, (Double) this.methodCall.argument("maxWidth"), (Double) this.methodCall.argument("maxHeight"), (Integer) this.methodCall.argument("imageQuality"));
    }

    private void grantUriPermissions(Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : this.activity.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.activity.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    private void handleCaptureImageResult(int i2) {
        if (i2 == -1) {
            FileUriResolver fileUriResolver2 = this.fileUriResolver;
            Uri uri = this.pendingCameraMediaUri;
            if (uri == null) {
                uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
            }
            fileUriResolver2.getFullImagePath(uri, new OnPathReadyListener() {
                public void onPathReady(String str) {
                    ImagePickerDelegate.this.handleImageResult(str, true);
                }
            });
            return;
        }
        finishWithSuccess((String) null);
    }

    private void handleCaptureVideoResult(int i2) {
        if (i2 == -1) {
            FileUriResolver fileUriResolver2 = this.fileUriResolver;
            Uri uri = this.pendingCameraMediaUri;
            if (uri == null) {
                uri = Uri.parse(this.cache.retrievePendingCameraMediaUriPath());
            }
            fileUriResolver2.getFullImagePath(uri, new OnPathReadyListener() {
                public void onPathReady(String str) {
                    ImagePickerDelegate.this.handleVideoResult(str);
                }
            });
            return;
        }
        finishWithSuccess((String) null);
    }

    private void handleChooseImageResult(int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            finishWithSuccess((String) null);
        } else {
            handleImageResult(this.fileUtils.getPathFromUri(this.activity, intent.getData()), false);
        }
    }

    private void handleChooseMultiImageResult(int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            finishWithSuccess((String) null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (intent.getClipData() != null) {
            for (int i3 = 0; i3 < intent.getClipData().getItemCount(); i3++) {
                arrayList.add(this.fileUtils.getPathFromUri(this.activity, intent.getClipData().getItemAt(i3).getUri()));
            }
        } else {
            arrayList.add(this.fileUtils.getPathFromUri(this.activity, intent.getData()));
        }
        handleMultiImageResult(arrayList, false);
    }

    private void handleChooseVideoResult(int i2, Intent intent) {
        if (i2 != -1 || intent == null) {
            finishWithSuccess((String) null);
        } else {
            handleVideoResult(this.fileUtils.getPathFromUri(this.activity, intent.getData()));
        }
    }

    /* access modifiers changed from: private */
    public void handleImageResult(String str, boolean z) {
        if (this.methodCall != null) {
            String resizedImagePath = getResizedImagePath(str);
            if (resizedImagePath != null && !resizedImagePath.equals(str) && z) {
                new File(str).delete();
            }
            finishWithSuccess(resizedImagePath);
            return;
        }
        finishWithSuccess(str);
    }

    private void handleMultiImageResult(ArrayList<String> arrayList, boolean z) {
        if (this.methodCall != null) {
            ArrayList arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                String resizedImagePath = getResizedImagePath(arrayList.get(i2));
                if (resizedImagePath != null && !resizedImagePath.equals(arrayList.get(i2)) && z) {
                    new File(arrayList.get(i2)).delete();
                }
                arrayList2.add(i2, resizedImagePath);
            }
            finishWithListSuccess(arrayList2);
            return;
        }
        finishWithListSuccess(arrayList);
    }

    /* access modifiers changed from: private */
    public void handleVideoResult(String str) {
        finishWithSuccess(str);
    }

    private void launchMultiPickImageFromGalleryIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (Build.VERSION.SDK_INT >= 18) {
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        intent.setType("image/*");
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY);
    }

    private void launchPickImageFromGalleryIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY);
    }

    private void launchPickVideoFromGalleryIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        this.activity.startActivityForResult(intent, REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0047 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void launchTakeImageWithCameraIntent() {
        /*
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.IMAGE_CAPTURE"
            r0.<init>(r1)
            io.flutter.plugins.imagepicker.CameraDevice r1 = r4.cameraDevice
            io.flutter.plugins.imagepicker.CameraDevice r2 = io.flutter.plugins.imagepicker.CameraDevice.FRONT
            if (r1 != r2) goto L_0x0010
            r4.useFrontCamera(r0)
        L_0x0010:
            java.io.File r1 = r4.createTemporaryWritableImageFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file:"
            r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4.pendingCameraMediaUri = r2
            io.flutter.plugins.imagepicker.ImagePickerDelegate$FileUriResolver r2 = r4.fileUriResolver
            java.lang.String r3 = r4.fileProviderName
            android.net.Uri r2 = r2.resolveFileProviderUriForFile(r3, r1)
            java.lang.String r3 = "output"
            r0.putExtra(r3, r2)
            r4.grantUriPermissions(r0, r2)
            android.app.Activity r2 = r4.activity     // Catch:{ ActivityNotFoundException -> 0x0047 }
            r3 = 2343(0x927, float:3.283E-42)
            r2.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x0047 }
            goto L_0x0056
        L_0x0047:
            r1.delete()     // Catch:{ SecurityException -> 0x004b }
            goto L_0x004f
        L_0x004b:
            r0 = move-exception
            r0.printStackTrace()
        L_0x004f:
            java.lang.String r0 = "no_available_camera"
            java.lang.String r1 = "No cameras available for taking pictures."
            r4.finishWithError(r0, r1)
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.ImagePickerDelegate.launchTakeImageWithCameraIntent():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:0|(1:4)|5|(1:7)|8|9|10|11|12|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r0.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0064 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void launchTakeVideoWithCameraIntent() {
        /*
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.media.action.VIDEO_CAPTURE"
            r0.<init>(r1)
            io.flutter.plugin.common.MethodCall r1 = r4.methodCall
            if (r1 == 0) goto L_0x0024
            java.lang.String r2 = "maxDuration"
            java.lang.Object r1 = r1.argument(r2)
            if (r1 == 0) goto L_0x0024
            io.flutter.plugin.common.MethodCall r1 = r4.methodCall
            java.lang.Object r1 = r1.argument(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "android.intent.extra.durationLimit"
            r0.putExtra(r2, r1)
        L_0x0024:
            io.flutter.plugins.imagepicker.CameraDevice r1 = r4.cameraDevice
            io.flutter.plugins.imagepicker.CameraDevice r2 = io.flutter.plugins.imagepicker.CameraDevice.FRONT
            if (r1 != r2) goto L_0x002d
            r4.useFrontCamera(r0)
        L_0x002d:
            java.io.File r1 = r4.createTemporaryWritableVideoFile()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "file:"
            r2.append(r3)
            java.lang.String r3 = r1.getAbsolutePath()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r4.pendingCameraMediaUri = r2
            io.flutter.plugins.imagepicker.ImagePickerDelegate$FileUriResolver r2 = r4.fileUriResolver
            java.lang.String r3 = r4.fileProviderName
            android.net.Uri r2 = r2.resolveFileProviderUriForFile(r3, r1)
            java.lang.String r3 = "output"
            r0.putExtra(r3, r2)
            r4.grantUriPermissions(r0, r2)
            android.app.Activity r2 = r4.activity     // Catch:{ ActivityNotFoundException -> 0x0064 }
            r3 = 2353(0x931, float:3.297E-42)
            r2.startActivityForResult(r0, r3)     // Catch:{ ActivityNotFoundException -> 0x0064 }
            goto L_0x0073
        L_0x0064:
            r1.delete()     // Catch:{ SecurityException -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r0 = move-exception
            r0.printStackTrace()
        L_0x006c:
            java.lang.String r0 = "no_available_camera"
            java.lang.String r1 = "No cameras available for taking pictures."
            r4.finishWithError(r0, r1)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugins.imagepicker.ImagePickerDelegate.launchTakeVideoWithCameraIntent():void");
    }

    private boolean needRequestCameraPermission() {
        PermissionManager permissionManager2 = this.permissionManager;
        if (permissionManager2 == null) {
            return false;
        }
        return permissionManager2.needRequestCameraPermission();
    }

    private boolean setPendingMethodCallAndResult(MethodCall methodCall2, MethodChannel.Result result) {
        if (this.pendingResult != null) {
            return false;
        }
        this.methodCall = methodCall2;
        this.pendingResult = result;
        this.cache.clear();
        return true;
    }

    private void useFrontCamera(Intent intent) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
            if (i2 >= 26) {
                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                return;
            }
            return;
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
    }

    public void chooseImageFromGallery(MethodCall methodCall2, MethodChannel.Result result) {
        if (!setPendingMethodCallAndResult(methodCall2, result)) {
            finishWithAlreadyActiveError(result);
        } else {
            launchPickImageFromGalleryIntent();
        }
    }

    public void chooseMultiImageFromGallery(MethodCall methodCall2, MethodChannel.Result result) {
        if (!setPendingMethodCallAndResult(methodCall2, result)) {
            finishWithAlreadyActiveError(result);
        } else {
            launchMultiPickImageFromGalleryIntent();
        }
    }

    public void chooseVideoFromGallery(MethodCall methodCall2, MethodChannel.Result result) {
        if (!setPendingMethodCallAndResult(methodCall2, result)) {
            finishWithAlreadyActiveError(result);
        } else {
            launchPickVideoFromGalleryIntent();
        }
    }

    /* access modifiers changed from: package-private */
    public CameraDevice getCameraDevice() {
        return this.cameraDevice;
    }

    public boolean onActivityResult(int i2, int i3, Intent intent) {
        if (i2 == REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY) {
            handleChooseImageResult(i3, intent);
            return true;
        } else if (i2 == REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA) {
            handleCaptureImageResult(i3);
            return true;
        } else if (i2 == REQUEST_CODE_CHOOSE_MULTI_IMAGE_FROM_GALLERY) {
            handleChooseMultiImageResult(i3, intent);
            return true;
        } else if (i2 == REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY) {
            handleChooseVideoResult(i3, intent);
            return true;
        } else if (i2 != REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA) {
            return false;
        } else {
            handleCaptureVideoResult(i3);
            return true;
        }
    }

    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        boolean z = iArr.length > 0 && iArr[0] == 0;
        if (i2 != REQUEST_CAMERA_IMAGE_PERMISSION) {
            if (i2 != REQUEST_CAMERA_VIDEO_PERMISSION) {
                return false;
            }
            if (z) {
                launchTakeVideoWithCameraIntent();
            }
        } else if (z) {
            launchTakeImageWithCameraIntent();
        }
        if (!z && (i2 == REQUEST_CAMERA_IMAGE_PERMISSION || i2 == REQUEST_CAMERA_VIDEO_PERMISSION)) {
            finishWithError("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public void retrieveLostImage(MethodChannel.Result result) {
        Map<String, Object> cacheMap = this.cache.getCacheMap();
        ArrayList arrayList = (ArrayList) cacheMap.get("pathList");
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(this.imageResizer.resizeImageIfNeeded((String) it.next(), (Double) cacheMap.get("maxWidth"), (Double) cacheMap.get("maxHeight"), Integer.valueOf(cacheMap.get("imageQuality") == null ? 100 : ((Integer) cacheMap.get("imageQuality")).intValue())));
            }
            cacheMap.put("pathList", arrayList2);
            cacheMap.put("path", arrayList2.get(arrayList2.size() - 1));
        }
        if (cacheMap.isEmpty()) {
            cacheMap = null;
        }
        result.success(cacheMap);
        this.cache.clear();
    }

    /* access modifiers changed from: package-private */
    public void saveStateBeforeResult() {
        MethodCall methodCall2 = this.methodCall;
        if (methodCall2 != null) {
            this.cache.saveTypeWithMethodCallName(methodCall2.method);
            this.cache.saveDimensionWithMethodCall(this.methodCall);
            Uri uri = this.pendingCameraMediaUri;
            if (uri != null) {
                this.cache.savePendingCameraMediaUriPath(uri);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setCameraDevice(CameraDevice cameraDevice2) {
        this.cameraDevice = cameraDevice2;
    }

    public void takeImageWithCamera(MethodCall methodCall2, MethodChannel.Result result) {
        if (!setPendingMethodCallAndResult(methodCall2, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeImageWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_IMAGE_PERMISSION);
        }
    }

    public void takeVideoWithCamera(MethodCall methodCall2, MethodChannel.Result result) {
        if (!setPendingMethodCallAndResult(methodCall2, result)) {
            finishWithAlreadyActiveError(result);
        } else if (!needRequestCameraPermission() || this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            launchTakeVideoWithCameraIntent();
        } else {
            this.permissionManager.askForPermission("android.permission.CAMERA", REQUEST_CAMERA_VIDEO_PERMISSION);
        }
    }
}
