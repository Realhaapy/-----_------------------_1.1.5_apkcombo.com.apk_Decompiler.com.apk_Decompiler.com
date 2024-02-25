package com.mr.flutter.plugin.filepicker;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.provider.MediaStore;
import android.util.Log;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public class b implements PluginRegistry.ActivityResultListener, PluginRegistry.RequestPermissionsResultListener {

    /* renamed from: m  reason: collision with root package name */
    private static final int f2951m = ((FilePickerPlugin.class.hashCode() + 43) & 65535);
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final Activity f2952e;

    /* renamed from: f  reason: collision with root package name */
    private final d f2953f;

    /* renamed from: g  reason: collision with root package name */
    private MethodChannel.Result f2954g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f2955h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f2956i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public String f2957j;

    /* renamed from: k  reason: collision with root package name */
    private String[] f2958k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public EventChannel.EventSink f2959l;

    class a implements d {
        final /* synthetic */ Activity a;

        a(Activity activity) {
            this.a = activity;
        }

        public void askForPermission(String str, int i2) {
            androidx.core.app.c.s(this.a, new String[]{str}, i2);
        }

        public boolean isPermissionGranted(String str) {
            return e.f.j.a.a(this.a, str) == 0;
        }
    }

    /* renamed from: com.mr.flutter.plugin.filepicker.b$b  reason: collision with other inner class name */
    class C0052b implements Runnable {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Intent f2960e;

        C0052b(Intent intent) {
            this.f2960e = intent;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:40:0x013f, code lost:
            r2 = (android.net.Uri) r2;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r9 = this;
                android.content.Intent r0 = r9.f2960e
                java.lang.String r1 = "Unknown activity error, please fill an issue."
                java.lang.String r2 = "unknown_activity"
                if (r0 == 0) goto L_0x017a
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                android.content.Intent r3 = r9.f2960e
                android.content.ClipData r3 = r3.getClipData()
                java.lang.String r4 = " - URI: "
                java.lang.String r5 = "[MultiFilePick] File #"
                r6 = 0
                java.lang.String r7 = "FilePickerDelegate"
                if (r3 == 0) goto L_0x006a
                android.content.Intent r1 = r9.f2960e
                android.content.ClipData r1 = r1.getClipData()
                int r1 = r1.getItemCount()
            L_0x0026:
                if (r6 >= r1) goto L_0x00fb
                android.content.Intent r2 = r9.f2960e
                android.content.ClipData r2 = r2.getClipData()
                android.content.ClipData$Item r2 = r2.getItemAt(r6)
                android.net.Uri r2 = r2.getUri()
                com.mr.flutter.plugin.filepicker.b r3 = com.mr.flutter.plugin.filepicker.b.this
                android.app.Activity r3 = r3.f2952e
                com.mr.flutter.plugin.filepicker.b r8 = com.mr.flutter.plugin.filepicker.b.this
                boolean r8 = r8.f2956i
                com.mr.flutter.plugin.filepicker.a r3 = com.mr.flutter.plugin.filepicker.c.s(r3, r2, r8)
                if (r3 == 0) goto L_0x0067
                r0.add(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r6)
                r3.append(r4)
                java.lang.String r2 = r2.getPath()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.d(r7, r2)
            L_0x0067:
                int r6 = r6 + 1
                goto L_0x0026
            L_0x006a:
                android.content.Intent r3 = r9.f2960e
                android.net.Uri r3 = r3.getData()
                java.lang.String r8 = "unknown_path"
                if (r3 == 0) goto L_0x010b
                android.content.Intent r1 = r9.f2960e
                android.net.Uri r1 = r1.getData()
                com.mr.flutter.plugin.filepicker.b r2 = com.mr.flutter.plugin.filepicker.b.this
                java.lang.String r2 = r2.f2957j
                java.lang.String r3 = "dir"
                boolean r2 = r2.equals(r3)
                if (r2 == 0) goto L_0x00c8
                int r2 = android.os.Build.VERSION.SDK_INT
                r3 = 21
                if (r2 < r3) goto L_0x00c8
                java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r1)
                android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r1, r0)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "[SingleFilePick] File URI:"
                r1.append(r2)
                java.lang.String r2 = r0.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r7, r1)
                com.mr.flutter.plugin.filepicker.b r1 = com.mr.flutter.plugin.filepicker.b.this
                android.app.Activity r1 = r1.f2952e
                java.lang.String r0 = com.mr.flutter.plugin.filepicker.c.h(r0, r1)
                if (r0 == 0) goto L_0x00c0
                com.mr.flutter.plugin.filepicker.b r1 = com.mr.flutter.plugin.filepicker.b.this
                r1.k(r0)
                goto L_0x00c7
            L_0x00c0:
                com.mr.flutter.plugin.filepicker.b r0 = com.mr.flutter.plugin.filepicker.b.this
                java.lang.String r1 = "Failed to retrieve directory path."
                r0.j(r8, r1)
            L_0x00c7:
                return
            L_0x00c8:
                com.mr.flutter.plugin.filepicker.b r2 = com.mr.flutter.plugin.filepicker.b.this
                android.app.Activity r2 = r2.f2952e
                com.mr.flutter.plugin.filepicker.b r3 = com.mr.flutter.plugin.filepicker.b.this
                boolean r3 = r3.f2956i
                com.mr.flutter.plugin.filepicker.a r1 = com.mr.flutter.plugin.filepicker.c.s(r2, r1, r3)
                if (r1 == 0) goto L_0x00dd
                r0.add(r1)
            L_0x00dd:
                boolean r1 = r0.isEmpty()
                if (r1 != 0) goto L_0x0102
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "File path:"
                r1.append(r2)
                java.lang.String r2 = r0.toString()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                android.util.Log.d(r7, r1)
            L_0x00fb:
                com.mr.flutter.plugin.filepicker.b r1 = com.mr.flutter.plugin.filepicker.b.this
                r1.k(r0)
                goto L_0x017f
            L_0x0102:
                com.mr.flutter.plugin.filepicker.b r0 = com.mr.flutter.plugin.filepicker.b.this
                java.lang.String r1 = "Failed to retrieve path."
            L_0x0106:
                r0.j(r8, r1)
                goto L_0x017f
            L_0x010b:
                android.content.Intent r3 = r9.f2960e
                android.os.Bundle r3 = r3.getExtras()
                if (r3 == 0) goto L_0x017a
                android.content.Intent r1 = r9.f2960e
                android.os.Bundle r1 = r1.getExtras()
                java.util.Set r2 = r1.keySet()
                java.lang.String r3 = "selectedItems"
                boolean r2 = r2.contains(r3)
                if (r2 == 0) goto L_0x0175
                java.util.ArrayList r1 = r1.getParcelableArrayList(r3)
                if (r1 == 0) goto L_0x00fb
                java.util.Iterator r1 = r1.iterator()
            L_0x012f:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x00fb
                java.lang.Object r2 = r1.next()
                android.os.Parcelable r2 = (android.os.Parcelable) r2
                boolean r3 = r2 instanceof android.net.Uri
                if (r3 == 0) goto L_0x0172
                android.net.Uri r2 = (android.net.Uri) r2
                com.mr.flutter.plugin.filepicker.b r3 = com.mr.flutter.plugin.filepicker.b.this
                android.app.Activity r3 = r3.f2952e
                com.mr.flutter.plugin.filepicker.b r8 = com.mr.flutter.plugin.filepicker.b.this
                boolean r8 = r8.f2956i
                com.mr.flutter.plugin.filepicker.a r3 = com.mr.flutter.plugin.filepicker.c.s(r3, r2, r8)
                if (r3 == 0) goto L_0x0172
                r0.add(r3)
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                r3.append(r6)
                r3.append(r4)
                java.lang.String r2 = r2.getPath()
                r3.append(r2)
                java.lang.String r2 = r3.toString()
                android.util.Log.d(r7, r2)
            L_0x0172:
                int r6 = r6 + 1
                goto L_0x012f
            L_0x0175:
                com.mr.flutter.plugin.filepicker.b r0 = com.mr.flutter.plugin.filepicker.b.this
                java.lang.String r1 = "Failed to retrieve path from bundle."
                goto L_0x0106
            L_0x017a:
                com.mr.flutter.plugin.filepicker.b r0 = com.mr.flutter.plugin.filepicker.b.this
                r0.j(r2, r1)
            L_0x017f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mr.flutter.plugin.filepicker.b.C0052b.run():void");
        }
    }

    class c extends Handler {
        final /* synthetic */ boolean a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(Looper looper, boolean z) {
            super(looper);
            this.a = z;
        }

        public void handleMessage(Message message) {
            b.this.f2959l.success(Boolean.valueOf(this.a));
        }
    }

    interface d {
        void askForPermission(String str, int i2);

        boolean isPermissionGranted(String str);
    }

    public b(Activity activity) {
        this(activity, (MethodChannel.Result) null, new a(activity));
    }

    b(Activity activity, MethodChannel.Result result, d dVar) {
        this.f2955h = false;
        this.f2956i = false;
        this.f2952e = activity;
        this.f2954g = result;
        this.f2953f = dVar;
    }

    private void g() {
        this.f2954g = null;
    }

    private void h(boolean z) {
        if (this.f2959l != null && !this.f2957j.equals("dir")) {
            new c(Looper.getMainLooper(), z).obtainMessage().sendToTarget();
        }
    }

    private static void i(MethodChannel.Result result) {
        result.error("already_active", "File picker is already active", (Object) null);
    }

    /* access modifiers changed from: private */
    public void j(String str, String str2) {
        if (this.f2954g != null) {
            h(false);
            this.f2954g.error(str, str2, (Object) null);
            g();
        }
    }

    /* access modifiers changed from: private */
    public void k(Object obj) {
        h(false);
        if (this.f2954g != null) {
            if (obj != null && !(obj instanceof String)) {
                ArrayList arrayList = new ArrayList();
                Iterator it = ((ArrayList) obj).iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).a());
                }
                obj = arrayList;
            }
            this.f2954g.success(obj);
            g();
        }
    }

    private boolean m(MethodChannel.Result result) {
        if (this.f2954g != null) {
            return false;
        }
        this.f2954g = result;
        return true;
    }

    private void n() {
        Intent intent;
        String str = this.f2957j;
        if (str != null) {
            if (str.equals("dir")) {
                intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
            } else {
                if (this.f2957j.equals("image/*")) {
                    intent = new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                } else {
                    intent = new Intent("android.intent.action.GET_CONTENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                }
                Uri parse = Uri.parse(Environment.getExternalStorageDirectory().getPath() + File.separator);
                Log.d("FilePickerDelegate", "Selected type " + this.f2957j);
                intent.setDataAndType(parse, this.f2957j);
                intent.setType(this.f2957j);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", this.f2955h);
                intent.putExtra("multi-pick", this.f2955h);
                if (this.f2957j.contains(",")) {
                    this.f2958k = this.f2957j.split(",");
                }
                String[] strArr = this.f2958k;
                if (strArr != null) {
                    intent.putExtra("android.intent.extra.MIME_TYPES", strArr);
                }
            }
            if (intent.resolveActivity(this.f2952e.getPackageManager()) != null) {
                this.f2952e.startActivityForResult(intent, f2951m);
                return;
            }
            Log.e("FilePickerDelegate", "Can't find a valid activity to handle the request. Make sure you've a file explorer installed.");
            j("invalid_format_type", "Can't handle the provided file type.");
        }
    }

    public void l(EventChannel.EventSink eventSink) {
        this.f2959l = eventSink;
    }

    public void o(String str, boolean z, boolean z2, String[] strArr, MethodChannel.Result result) {
        if (!m(result)) {
            i(result);
            return;
        }
        this.f2957j = str;
        this.f2955h = z;
        this.f2956i = z2;
        this.f2958k = strArr;
        if (Build.VERSION.SDK_INT >= 33 || this.f2953f.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            n();
        } else {
            this.f2953f.askForPermission("android.permission.READ_EXTERNAL_STORAGE", f2951m);
        }
    }

    public boolean onActivityResult(int i2, int i3, Intent intent) {
        if (this.f2957j == null) {
            return false;
        }
        int i4 = f2951m;
        if (i2 == i4 && i3 == -1) {
            h(true);
            new Thread(new C0052b(intent)).start();
            return true;
        } else if (i2 == i4 && i3 == 0) {
            Log.i("FilePickerDelegate", "User cancelled the picker request");
            k((Object) null);
            return true;
        } else {
            if (i2 == i4) {
                j("unknown_activity", "Unknown activity error, please fill an issue.");
            }
            return false;
        }
    }

    public boolean onRequestPermissionsResult(int i2, String[] strArr, int[] iArr) {
        boolean z = false;
        if (f2951m != i2) {
            return false;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            z = true;
        }
        if (z) {
            n();
        } else {
            j("read_external_storage_denied", "User did not allow reading external storage");
        }
        return true;
    }
}
