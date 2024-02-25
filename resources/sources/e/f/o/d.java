package e.f.o;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import e.f.j.f.g;
import e.f.o.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class d {
    private static final Comparator<byte[]> a = a.a;

    static class a {
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, Object obj) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, (CancellationSignal) obj);
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature byteArray : signatureArr) {
            arrayList.add(byteArray.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            if (!Arrays.equals(list.get(i2), list2.get(i2))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> c(e eVar, Resources resources) {
        return eVar.b() != null ? eVar.b() : g.c(resources, eVar.c());
    }

    static g.a d(Context context, e eVar, CancellationSignal cancellationSignal) {
        ProviderInfo e2 = e(context.getPackageManager(), eVar, context.getResources());
        return e2 == null ? g.a.a(1, (g.b[]) null) : g.a.a(0, g(context, eVar, e2.authority, cancellationSignal));
    }

    static ProviderInfo e(PackageManager packageManager, e eVar, Resources resources) {
        String e2 = eVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e2, 0);
        if (resolveContentProvider == null) {
            throw new PackageManager.NameNotFoundException("No package found for authority: " + e2);
        } else if (resolveContentProvider.packageName.equals(eVar.f())) {
            List<byte[]> a2 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
            Collections.sort(a2, a);
            List<List<byte[]>> c = c(eVar, resources);
            for (int i2 = 0; i2 < c.size(); i2++) {
                ArrayList arrayList = new ArrayList(c.get(i2));
                Collections.sort(arrayList, a);
                if (b(a2, arrayList)) {
                    return resolveContentProvider;
                }
            }
            return null;
        } else {
            throw new PackageManager.NameNotFoundException("Found content provider " + e2 + ", but package was not " + eVar.f());
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static /* synthetic */ int f(byte[] r4, byte[] r5) {
        /*
            int r0 = r4.length
            int r1 = r5.length
            if (r0 == r1) goto L_0x0008
            int r4 = r4.length
            int r5 = r5.length
        L_0x0006:
            int r4 = r4 - r5
            return r4
        L_0x0008:
            r0 = 0
            r1 = 0
        L_0x000a:
            int r2 = r4.length
            if (r1 >= r2) goto L_0x001b
            byte r2 = r4[r1]
            byte r3 = r5[r1]
            if (r2 == r3) goto L_0x0018
            byte r4 = r4[r1]
            byte r5 = r5[r1]
            goto L_0x0006
        L_0x0018:
            int r1 = r1 + 1
            goto L_0x000a
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e.f.o.d.f(byte[], byte[]):int");
    }

    static g.b[] g(Context context, e eVar, String str, CancellationSignal cancellationSignal) {
        boolean z;
        int i2;
        String str2 = str;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str2).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str2).appendPath("file").build();
        Cursor cursor = null;
        try {
            String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            ContentResolver contentResolver = context.getContentResolver();
            cursor = Build.VERSION.SDK_INT > 16 ? a.a(contentResolver, build, strArr, "query = ?", new String[]{eVar.g()}, (String) null, cancellationSignal) : contentResolver.query(build, strArr, "query = ?", new String[]{eVar.g()}, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex("_id");
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i3 = columnIndex != -1 ? cursor.getInt(columnIndex) : 0;
                    int i4 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : 0;
                    int i5 = i3;
                    Uri withAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(build, cursor.getLong(columnIndex2)) : ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    int i6 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        i2 = i5;
                        z = false;
                    } else {
                        i2 = i5;
                        z = true;
                    }
                    arrayList2.add(g.b.a(withAppendedId, i4, i6, z, i2));
                }
                arrayList = arrayList2;
            }
            return (g.b[]) arrayList.toArray(new g.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
