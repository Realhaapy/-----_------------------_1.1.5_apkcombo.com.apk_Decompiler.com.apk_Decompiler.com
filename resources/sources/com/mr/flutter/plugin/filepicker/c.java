package com.mr.flutter.plugin.filepicker;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.storage.StorageManager;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.mr.flutter.plugin.filepicker.a;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class c {
    public static boolean a(Context context) {
        try {
            File[] listFiles = new File(context.getCacheDir() + "/file_picker/").listFiles();
            if (listFiles == null) {
                return true;
            }
            for (File delete : listFiles) {
                delete.delete();
            }
            return true;
        } catch (Exception e2) {
            Log.e("FilePickerUtils", "There was an error while clearing cached files: " + e2.toString());
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        if (r8 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r8 != null) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x0038, all -> 0x0031 }
            if (r8 == 0) goto L_0x002e
            boolean r9 = r8.moveToFirst()     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r9 == 0) goto L_0x002e
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ Exception -> 0x002c, all -> 0x0029 }
            if (r8 == 0) goto L_0x0028
            r8.close()
        L_0x0028:
            return r9
        L_0x0029:
            r9 = move-exception
            r7 = r8
            goto L_0x0032
        L_0x002c:
            goto L_0x0039
        L_0x002e:
            if (r8 == 0) goto L_0x003e
            goto L_0x003b
        L_0x0031:
            r9 = move-exception
        L_0x0032:
            if (r7 == 0) goto L_0x0037
            r7.close()
        L_0x0037:
            throw r9
        L_0x0038:
            r8 = r7
        L_0x0039:
            if (r8 == 0) goto L_0x003e
        L_0x003b:
            r8.close()
        L_0x003e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mr.flutter.plugin.filepicker.c.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    private static String c(Class<?> cls, Object obj) {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                return (String) cls.getMethod("getPath", new Class[0]).invoke(obj, new Object[0]);
            }
            File file = (File) cls.getMethod("getDirectory", new Class[0]).invoke(obj, new Object[0]);
            if (file != null) {
                return file.getPath();
            }
            return null;
        } catch (Exception unused) {
        }
    }

    @TargetApi(21)
    private static String d(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        return (split.length < 2 || split[1] == null) ? File.separator : split[1];
    }

    public static String e(Context context) {
        return ("mounted".equals(Environment.getExternalStorageState()) ? context.getExternalFilesDir((String) null) : context.getFilesDir()).getAbsolutePath();
    }

    public static String f(Uri uri, Context context) {
        Cursor query;
        String str = null;
        try {
            if (uri.getScheme().equals("content")) {
                query = context.getContentResolver().query(uri, new String[]{"_display_name"}, (String) null, (String[]) null, (String) null);
                if (query != null) {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_display_name"));
                    }
                }
                query.close();
            }
            if (str != null) {
                return str;
            }
            String path = uri.getPath();
            int lastIndexOf = path.lastIndexOf(47);
            return lastIndexOf != -1 ? path.substring(lastIndexOf + 1) : path;
        } catch (Exception e2) {
            Log.e("FilePickerUtils", "Failed to handle file name: " + e2.toString());
            return null;
        } catch (Throwable th) {
            query.close();
            throw th;
        }
    }

    @TargetApi(19)
    private static String g(Context context, Uri uri) {
        Log.e("FilePickerUtils", "Getting for API 19 or above" + uri);
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            Log.e("FilePickerUtils", "Document URI");
            int i2 = 0;
            if (o(uri)) {
                Log.e("FilePickerUtils", "External Document URI");
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    Log.e("FilePickerUtils", "Primary External Document URI");
                    return e(context) + "/" + split[1];
                }
            } else if (m(uri)) {
                Log.e("FilePickerUtils", "Downloads External Document URI");
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    if (documentId.startsWith("raw:")) {
                        return documentId.replaceFirst("raw:", "");
                    }
                    String[] strArr = {"content://downloads/public_downloads", "content://downloads/my_downloads", "content://downloads/all_downloads"};
                    if (documentId.contains(":")) {
                        documentId = documentId.split(":")[1];
                    }
                    while (i2 < 3) {
                        try {
                            String b = b(context, ContentUris.withAppendedId(Uri.parse(strArr[i2]), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                            if (b != null) {
                                return b;
                            }
                            i2++;
                        } catch (Exception e2) {
                            Log.e("FilePickerUtils", "Something went wrong while retrieving document path: " + e2.toString());
                        }
                    }
                }
            } else if (q(uri)) {
                Log.e("FilePickerUtils", "Media Document URI");
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    Log.i("FilePickerUtils", "Image Media Document URI");
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    Log.i("FilePickerUtils", "Video Media Document URI");
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    Log.i("FilePickerUtils", "Audio Media Document URI");
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return b(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else if ("content".equalsIgnoreCase(uri.getScheme())) {
            Log.e("FilePickerUtils", "NO DOCUMENT URI - CONTENT");
            if (p(uri)) {
                return uri.getLastPathSegment();
            }
            if (n(uri)) {
                return null;
            }
            return b(context, uri, (String) null, (String[]) null);
        } else if ("file".equalsIgnoreCase(uri.getScheme())) {
            Log.e("FilePickerUtils", "No DOCUMENT URI - FILE");
            return uri.getPath();
        }
        return null;
    }

    public static String h(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30 || !m(uri)) {
            String l2 = l(k(uri), context);
            if (l2 == null) {
                return File.separator;
            }
            String str = File.separator;
            if (l2.endsWith(str)) {
                l2 = l2.substring(0, l2.length() - 1);
            }
            String d2 = d(uri);
            if (d2.endsWith(str)) {
                d2 = d2.substring(0, d2.length() - 1);
            }
            if (d2.length() <= 0) {
                return l2;
            }
            if (d2.startsWith(str)) {
                return l2 + d2;
            }
            return l2 + str + d2;
        }
        String documentId = DocumentsContract.getDocumentId(uri);
        String path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getPath();
        if (documentId.equals("downloads")) {
            return path;
        }
        if (documentId.matches("^ms[df]\\:.*")) {
            String f2 = f(uri, context);
            return path + "/" + f2;
        } else if (documentId.startsWith("raw:")) {
            return documentId.split(":")[1];
        } else {
            return null;
        }
    }

    public static String[] i(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(arrayList.get(i2));
            if (mimeTypeFromExtension == null) {
                Log.w("FilePickerUtils", "Custom file type " + arrayList.get(i2) + " is unsupported and will be ignored.");
            } else {
                arrayList2.add(mimeTypeFromExtension);
            }
        }
        Log.d("FilePickerUtils", "Allowed file extensions mimes: " + arrayList2);
        return (String[]) arrayList2.toArray(new String[0]);
    }

    public static String j(Uri uri, Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return g(context, uri);
        }
        if ("content".equalsIgnoreCase(uri.getScheme())) {
            return p(uri) ? uri.getLastPathSegment() : b(context, uri, (String) null, (String[]) null);
        }
        if ("file".equalsIgnoreCase(uri.getScheme())) {
            return uri.getPath();
        }
        return null;
    }

    @TargetApi(21)
    private static String k(Uri uri) {
        String[] split = DocumentsContract.getTreeDocumentId(uri).split(":");
        if (split.length > 0) {
            return split[0];
        }
        return null;
    }

    @SuppressLint({"ObsoleteSdkInt"})
    private static String l(String str, Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return null;
        }
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService("storage");
            Class<?> cls = Class.forName("android.os.storage.StorageVolume");
            Method method = storageManager.getClass().getMethod("getVolumeList", new Class[0]);
            Method method2 = cls.getMethod("getUuid", new Class[0]);
            Method method3 = cls.getMethod("isPrimary", new Class[0]);
            Object invoke = method.invoke(storageManager, new Object[0]);
            if (invoke == null) {
                return null;
            }
            int length = Array.getLength(invoke);
            for (int i2 = 0; i2 < length; i2++) {
                Object obj = Array.get(invoke, i2);
                String str2 = (String) method2.invoke(obj, new Object[0]);
                if (((Boolean) method3.invoke(obj, new Object[0])) != null && "primary".equals(str)) {
                    return c(cls, obj);
                }
                if (str2 != null && str2.equals(str)) {
                    return c(cls, obj);
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static boolean m(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean n(Uri uri) {
        return "com.dropbox.android.FileCache".equals(uri.getAuthority());
    }

    private static boolean o(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean p(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean q(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static void r(File file, a.C0051a aVar) {
        String str;
        try {
            int length = (int) file.length();
            byte[] bArr = new byte[length];
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                bufferedInputStream.read(bArr, 0, length);
                bufferedInputStream.close();
            } catch (FileNotFoundException e2) {
                str = "File not found: " + e2.getMessage();
            } catch (IOException e3) {
                str = "Failed to close file streams: " + e3.getMessage();
            }
            aVar.b(bArr);
            Log.e("FilePickerUtils", str, (Throwable) null);
            aVar.b(bArr);
        } catch (Exception e4) {
            Log.e("FilePickerUtils", "Failed to load bytes into memory with error " + e4.toString() + ". Probably the file is too big to fit device memory. Bytes won't be added to the file this time.");
        }
    }

    public static a s(Context context, Uri uri, boolean z) {
        String str;
        File file;
        FileOutputStream fileOutputStream;
        StringBuilder sb;
        String str2;
        String j2 = j(uri, context);
        a.C0051a aVar = new a.C0051a();
        if (j2 == null) {
            Log.i("FilePickerUtils", "Caching from URI: " + uri.toString());
            String f2 = f(uri, context);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(context.getCacheDir().getAbsolutePath());
            sb2.append("/file_picker/");
            sb2.append(f2 != null ? f2 : Long.valueOf(System.currentTimeMillis()));
            String sb3 = sb2.toString();
            file = new File(sb3);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                try {
                    fileOutputStream = new FileOutputStream(sb3);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                        InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read < 0) {
                                break;
                            }
                            bufferedOutputStream.write(bArr, 0, read);
                        }
                        bufferedOutputStream.flush();
                        fileOutputStream.getFD().sync();
                    } catch (Exception e2) {
                        e = e2;
                        try {
                            fileOutputStream.close();
                            sb = new StringBuilder();
                            str2 = "Failed to retrieve path: ";
                        } catch (IOException | NullPointerException unused) {
                            sb = new StringBuilder();
                            str2 = "Failed to close file streams: ";
                        }
                        sb.append(str2);
                        sb.append(e.getMessage());
                        Log.e("FilePickerUtils", sb.toString(), (Throwable) null);
                        return null;
                    } catch (Throwable th) {
                        fileOutputStream.getFD().sync();
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    fileOutputStream = null;
                    fileOutputStream.close();
                    sb = new StringBuilder();
                    str2 = "Failed to retrieve path: ";
                    sb.append(str2);
                    sb.append(e.getMessage());
                    Log.e("FilePickerUtils", sb.toString(), (Throwable) null);
                    return null;
                }
            }
            str = f2;
            j2 = sb3;
        } else {
            Log.i("FilePickerUtils", "Uncached file path: " + j2);
            str = f(uri, context);
            file = new File(j2);
        }
        if (z) {
            r(file, aVar);
        }
        aVar.d(j2);
        aVar.c(str);
        aVar.f(uri);
        aVar.e(Long.parseLong(String.valueOf(file.length())));
        return aVar.a();
    }
}
