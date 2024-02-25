package e.k;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.view.Surface;
import java.util.Objects;

public class b {
    private EGLDisplay a = EGL14.EGL_NO_DISPLAY;
    private EGLContext b = EGL14.EGL_NO_CONTEXT;
    private EGLSurface c = EGL14.EGL_NO_SURFACE;

    /* renamed from: d  reason: collision with root package name */
    private EGLConfig[] f3494d = new EGLConfig[1];

    /* renamed from: e  reason: collision with root package name */
    private Surface f3495e;

    public b(Surface surface) {
        Objects.requireNonNull(surface);
        this.f3495e = surface;
        c();
    }

    private void a(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new RuntimeException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    private void b() {
        this.c = EGL14.eglCreateWindowSurface(this.a, this.f3494d[0], this.f3495e, new int[]{12344}, 0);
        a("eglCreateWindowSurface");
        if (this.c == null) {
            throw new RuntimeException("surface was null");
        }
    }

    private void c() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        this.a = eglGetDisplay;
        if (!Objects.equals(eglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            int[] iArr = new int[2];
            if (EGL14.eglInitialize(this.a, iArr, 0, iArr, 1)) {
                EGLDisplay eGLDisplay = this.a;
                EGLConfig[] eGLConfigArr = this.f3494d;
                if (EGL14.eglChooseConfig(eGLDisplay, new int[]{12324, 8, 12323, 8, 12322, 8, 12352, 4, 12610, 1, 12344}, 0, eGLConfigArr, 0, eGLConfigArr.length, new int[1], 0)) {
                    this.b = EGL14.eglCreateContext(this.a, this.f3494d[0], EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
                    a("eglCreateContext");
                    if (this.b != null) {
                        b();
                        e();
                        d();
                        return;
                    }
                    throw new RuntimeException("null context");
                }
                throw new RuntimeException("unable to find RGB888+recordable ES2 EGL config");
            }
            this.a = null;
            throw new RuntimeException("unable to initialize EGL14");
        }
        throw new RuntimeException("unable to get EGL14 display");
    }

    public int d() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.a, this.c, 12374, iArr, 0);
        return iArr[0];
    }

    public int e() {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(this.a, this.c, 12375, iArr, 0);
        return iArr[0];
    }

    public void f() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = this.c;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, this.b)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void g() {
        EGLDisplay eGLDisplay = this.a;
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        if (!EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        }
    }

    public void h() {
        if (!Objects.equals(this.a, EGL14.EGL_NO_DISPLAY)) {
            EGL14.eglDestroySurface(this.a, this.c);
            EGL14.eglDestroyContext(this.a, this.b);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.a);
        }
        this.f3495e.release();
        this.a = EGL14.EGL_NO_DISPLAY;
        this.b = EGL14.EGL_NO_CONTEXT;
        this.c = EGL14.EGL_NO_SURFACE;
        this.f3495e = null;
    }

    public void i(long j2) {
        EGLExt.eglPresentationTimeANDROID(this.a, this.c, j2);
    }

    public boolean j() {
        return EGL14.eglSwapBuffers(this.a, this.c);
    }
}
