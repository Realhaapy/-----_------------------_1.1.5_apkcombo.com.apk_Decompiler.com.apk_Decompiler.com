package e.k;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

public class a {

    /* renamed from: f  reason: collision with root package name */
    private static final float[] f3490f;

    /* renamed from: g  reason: collision with root package name */
    private static final FloatBuffer f3491g;
    private final float[] a;
    private final FloatBuffer b;
    private final int c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3492d;

    /* renamed from: e  reason: collision with root package name */
    private e f3493e;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f3490f = fArr;
        f3491g = b(fArr);
    }

    public a(e eVar, int i2, int i3) {
        float[] fArr = new float[8];
        this.a = fArr;
        this.b = b(fArr);
        this.f3493e = eVar;
        this.c = i2;
        this.f3492d = i3;
    }

    public static FloatBuffer b(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public void a(int i2, float[] fArr, Rect rect) {
        f(rect);
        this.f3493e.e(e.f3543g, f3491g, 0, 4, 2, 8, fArr, this.b, i2, 8);
    }

    public int c() {
        return this.f3493e.d();
    }

    public void d(int i2, Bitmap bitmap) {
        this.f3493e.g(i2, bitmap);
    }

    public void e(boolean z) {
        e eVar = this.f3493e;
        if (eVar != null) {
            if (z) {
                eVar.h();
            }
            this.f3493e = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void f(Rect rect) {
        float[] fArr = this.a;
        int i2 = rect.left;
        int i3 = this.c;
        fArr[0] = ((float) i2) / ((float) i3);
        int i4 = rect.bottom;
        int i5 = this.f3492d;
        fArr[1] = 1.0f - (((float) i4) / ((float) i5));
        int i6 = rect.right;
        fArr[2] = ((float) i6) / ((float) i3);
        fArr[3] = 1.0f - (((float) i4) / ((float) i5));
        fArr[4] = ((float) i2) / ((float) i3);
        int i7 = rect.top;
        fArr[5] = 1.0f - (((float) i7) / ((float) i5));
        fArr[6] = ((float) i6) / ((float) i3);
        fArr[7] = 1.0f - (((float) i7) / ((float) i5));
        this.b.put(fArr);
        this.b.position(0);
    }
}
