package s.a.a.a.a;

import android.annotation.SuppressLint;
import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import java.io.InputStream;
import java.io.OutputStream;

class a {
    a() {
    }

    private static void a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                outputStream.flush();
                return;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String b(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0032 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0032 }
            if (r8 == 0) goto L_0x002c
            boolean r9 = r8.moveToFirst()     // Catch:{ all -> 0x0029 }
            if (r9 == 0) goto L_0x002c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0029 }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ all -> 0x0029 }
            if (r8 == 0) goto L_0x0028
            r8.close()
        L_0x0028:
            return r9
        L_0x0029:
            r9 = move-exception
            r7 = r8
            goto L_0x0033
        L_0x002c:
            if (r8 == 0) goto L_0x0031
            r8.close()
        L_0x0031:
            return r7
        L_0x0032:
            r9 = move-exception
        L_0x0033:
            if (r7 == 0) goto L_0x0038
            r7.close()
        L_0x0038:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s.a.a.a.a.a.b(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    @SuppressLint({"NewApi"})
    private String c(Context context, Uri uri) {
        Uri uri2 = null;
        if (!(Build.VERSION.SDK_INT >= 19) || !DocumentsContract.isDocumentUri(context, uri)) {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return h(uri) ? uri.getLastPathSegment() : b(context, uri, (String) null, (String[]) null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        } else if (g(uri)) {
            String[] split = DocumentsContract.getDocumentId(uri).split(":");
            if ("primary".equalsIgnoreCase(split[0])) {
                return Environment.getExternalStorageDirectory() + "/" + split[1];
            }
        } else if (f(uri)) {
            String documentId = DocumentsContract.getDocumentId(uri);
            if (!TextUtils.isEmpty(documentId)) {
                try {
                    return b(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), (String) null, (String[]) null);
                } catch (NumberFormatException unused) {
                    return null;
                }
            }
        } else if (i(uri)) {
            String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
            String str = split2[0];
            if ("image".equals(str)) {
                uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            } else if ("video".equals(str)) {
                uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
            } else if ("audio".equals(str)) {
                uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
            }
            return b(context, uri2, "_id=?", new String[]{split2[1]});
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0033, code lost:
        r4 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
        r2 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x002a */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0033 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:4:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x003e A[SYNTHETIC, Splitter:B:31:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0045 A[SYNTHETIC, Splitter:B:35:0x0045] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x004e A[SYNTHETIC, Splitter:B:43:0x004e] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0055 A[SYNTHETIC, Splitter:B:47:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String d(android.content.Context r4, android.net.Uri r5) {
        /*
            r0 = 0
            r1 = 0
            android.content.ContentResolver r2 = r4.getContentResolver()     // Catch:{ IOException -> 0x0049, all -> 0x003a }
            java.io.InputStream r5 = r2.openInputStream(r5)     // Catch:{ IOException -> 0x0049, all -> 0x003a }
            java.lang.String r2 = "image_picker"
            java.lang.String r3 = "jpg"
            java.io.File r4 = r4.getCacheDir()     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            java.io.File r4 = java.io.File.createTempFile(r2, r3, r4)     // Catch:{ IOException -> 0x0037, all -> 0x0033 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0031, all -> 0x0033 }
            r2.<init>(r4)     // Catch:{ IOException -> 0x0031, all -> 0x0033 }
            if (r5 == 0) goto L_0x0024
            a(r5, r2)     // Catch:{ IOException -> 0x004c, all -> 0x0022 }
            r3 = 1
            goto L_0x0025
        L_0x0022:
            r4 = move-exception
            goto L_0x0035
        L_0x0024:
            r3 = 0
        L_0x0025:
            if (r5 == 0) goto L_0x002a
            r5.close()     // Catch:{ IOException -> 0x002a }
        L_0x002a:
            r2.close()     // Catch:{ IOException -> 0x002f }
            r0 = r3
            goto L_0x0058
        L_0x002f:
            goto L_0x0058
        L_0x0031:
            r2 = r1
            goto L_0x004c
        L_0x0033:
            r4 = move-exception
            r2 = r1
        L_0x0035:
            r1 = r5
            goto L_0x003c
        L_0x0037:
            r4 = r1
            r2 = r4
            goto L_0x004c
        L_0x003a:
            r4 = move-exception
            r2 = r1
        L_0x003c:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r2 == 0) goto L_0x0048
            r2.close()     // Catch:{ IOException -> 0x0048 }
        L_0x0048:
            throw r4
        L_0x0049:
            r4 = r1
            r5 = r4
            r2 = r5
        L_0x004c:
            if (r5 == 0) goto L_0x0053
            r5.close()     // Catch:{ IOException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r2 == 0) goto L_0x0058
            r2.close()     // Catch:{ IOException -> 0x002f }
        L_0x0058:
            if (r0 == 0) goto L_0x005e
            java.lang.String r1 = r4.getPath()
        L_0x005e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: s.a.a.a.a.a.d(android.content.Context, android.net.Uri):java.lang.String");
    }

    private static boolean f(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    private static boolean g(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    private static boolean h(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    private static boolean i(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    /* access modifiers changed from: package-private */
    public String e(Context context, Uri uri) {
        String c = c(context, uri);
        return c == null ? d(context, uri) : c;
    }
}
