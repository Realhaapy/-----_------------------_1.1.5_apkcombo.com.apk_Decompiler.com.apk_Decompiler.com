package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.n;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class p0 implements Closeable {

    /* renamed from: e  reason: collision with root package name */
    private final URL f2818e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Future<?> f2819f;

    /* renamed from: g  reason: collision with root package name */
    private i<Bitmap> f2820g;

    private p0(URL url) {
        this.f2818e = url;
    }

    private byte[] c() {
        URLConnection openConnection = this.f2818e.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] d2 = g0.d(g0.b(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    Log.v("FirebaseMessaging", "Downloaded " + d2.length + " bytes from " + this.f2818e);
                }
                if (d2.length <= 1048576) {
                    return d2;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public static p0 g(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new p0(new URL(str));
        } catch (MalformedURLException unused) {
            Log.w("FirebaseMessaging", "Not downloading image, bad URL: " + str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public /* synthetic */ void z(j jVar) {
        try {
            jVar.c(a());
        } catch (Exception e2) {
            jVar.b(e2);
        }
    }

    public void B(ExecutorService executorService) {
        j jVar = new j();
        this.f2819f = executorService.submit(new w(this, jVar));
        this.f2820g = jVar.a();
    }

    public Bitmap a() {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            Log.i("FirebaseMessaging", "Starting download of: " + this.f2818e);
        }
        byte[] c = c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Successfully downloaded image: " + this.f2818e);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f2818e);
    }

    public void close() {
        this.f2819f.cancel(true);
    }

    public i<Bitmap> o() {
        i<Bitmap> iVar = this.f2820g;
        n.h(iVar);
        return iVar;
    }
}
