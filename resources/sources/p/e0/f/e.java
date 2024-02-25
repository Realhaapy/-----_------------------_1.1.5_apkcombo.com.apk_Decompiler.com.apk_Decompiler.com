package p.e0.f;

import java.io.IOException;
import p.e0.c;

public final class e extends RuntimeException {

    /* renamed from: e  reason: collision with root package name */
    private IOException f5162e;

    /* renamed from: f  reason: collision with root package name */
    private IOException f5163f;

    public e(IOException iOException) {
        super(iOException);
        this.f5162e = iOException;
        this.f5163f = iOException;
    }

    public void a(IOException iOException) {
        c.a(this.f5162e, iOException);
        this.f5163f = iOException;
    }

    public IOException b() {
        return this.f5162e;
    }

    public IOException c() {
        return this.f5163f;
    }
}
