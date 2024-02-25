package com.facebook.share.a;

import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import com.facebook.c0;
import com.facebook.internal.o0;
import com.facebook.j0;
import com.facebook.n0;
import com.facebook.u;
import java.io.File;
import m.y.d.g;
import m.y.d.l;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public static final j0 a(u uVar, Uri uri, j0.b bVar) {
        l.d(uri, "imageUri");
        String path = uri.getPath();
        o0 o0Var = o0.a;
        if (o0.T(uri) && path != null) {
            return b(uVar, new File(path), bVar);
        }
        if (o0.Q(uri)) {
            j0.g gVar = new j0.g(uri, "image/png");
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", gVar);
            return new j0(uVar, "me/staging_resources", bundle, n0.POST, bVar, (String) null, 32, (g) null);
        }
        throw new c0("The image Uri must be either a file:// or content:// Uri");
    }

    public static final j0 b(u uVar, File file, j0.b bVar) {
        j0.g gVar = new j0.g(ParcelFileDescriptor.open(file, 268435456), "image/png");
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("file", gVar);
        return new j0(uVar, "me/staging_resources", bundle, n0.POST, bVar, (String) null, 32, (g) null);
    }
}
