package e.k;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import java.nio.FloatBuffer;

public class e {

    /* renamed from: g  reason: collision with root package name */
    public static final float[] f3543g;

    /* renamed from: h  reason: collision with root package name */
    public static final float[] f3544h;
    private int a;
    private int b;
    private int c;

    /* renamed from: d  reason: collision with root package name */
    private int f3545d;

    /* renamed from: e  reason: collision with root package name */
    private int f3546e;

    /* renamed from: f  reason: collision with root package name */
    private int f3547f;

    static {
        float[] fArr = new float[16];
        f3543g = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f3544h = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public e(int i2) {
        String str;
        if (i2 == 0) {
            this.f3547f = 3553;
            str = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        } else if (i2 == 1) {
            this.f3547f = 36197;
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        } else {
            throw new RuntimeException("Unhandled type " + i2);
        }
        this.a = c("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", str);
        int i3 = this.a;
        if (i3 != 0) {
            int glGetAttribLocation = GLES20.glGetAttribLocation(i3, "aPosition");
            this.f3545d = glGetAttribLocation;
            b(glGetAttribLocation, "aPosition");
            int glGetAttribLocation2 = GLES20.glGetAttribLocation(this.a, "aTextureCoord");
            this.f3546e = glGetAttribLocation2;
            b(glGetAttribLocation2, "aTextureCoord");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.a, "uMVPMatrix");
            this.b = glGetUniformLocation;
            b(glGetUniformLocation, "uMVPMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.a, "uTexMatrix");
            this.c = glGetUniformLocation2;
            b(glGetUniformLocation2, "uTexMatrix");
            return;
        }
        throw new RuntimeException("Unable to create program");
    }

    public static void a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            String str2 = str + ": glError 0x" + Integer.toHexString(glGetError);
            Log.e("Texture2dProgram", str2);
            throw new RuntimeException(str2);
        }
    }

    public static void b(int i2, String str) {
        if (i2 < 0) {
            throw new RuntimeException("Unable to locate '" + str + "' in program");
        }
    }

    public static int c(String str, String str2) {
        int f2;
        int f3 = f(35633, str);
        if (f3 == 0 || (f2 = f(35632, str2)) == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (glCreateProgram == 0) {
            Log.e("Texture2dProgram", "Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, f3);
        a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, f2);
        a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        Log.e("Texture2dProgram", "Could not link program: ");
        Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(glCreateProgram));
        GLES20.glDeleteProgram(glCreateProgram);
        return 0;
    }

    public static int f(int i2, String str) {
        int glCreateShader = GLES20.glCreateShader(i2);
        a("glCreateShader type=" + i2);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i2 + ":");
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.e("Texture2dProgram", sb.toString());
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    public int d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a("glGenTextures");
        int i2 = iArr[0];
        GLES20.glBindTexture(this.f3547f, i2);
        a("glBindTexture " + i2);
        float f2 = 9728.0f;
        GLES20.glTexParameterf(this.f3547f, 10241, 9728.0f);
        int i3 = this.f3547f;
        if (i3 != 3553) {
            f2 = 9729.0f;
        }
        GLES20.glTexParameterf(i3, 10240, f2);
        GLES20.glTexParameteri(this.f3547f, 10242, 33071);
        GLES20.glTexParameteri(this.f3547f, 10243, 33071);
        a("glTexParameter");
        return i2;
    }

    public void e(float[] fArr, FloatBuffer floatBuffer, int i2, int i3, int i4, int i5, float[] fArr2, FloatBuffer floatBuffer2, int i6, int i7) {
        a("draw start");
        GLES20.glUseProgram(this.a);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f3547f, i6);
        float[] fArr3 = fArr;
        GLES20.glUniformMatrix4fv(this.b, 1, false, fArr, 0);
        a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.c, 1, false, fArr2, 0);
        a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.f3545d);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3545d, i4, 5126, false, i5, floatBuffer);
        a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f3546e);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f3546e, 2, 5126, false, i7, floatBuffer2);
        a("glVertexAttribPointer");
        int i8 = i2;
        int i9 = i3;
        GLES20.glDrawArrays(5, i2, i3);
        a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f3545d);
        GLES20.glDisableVertexAttribArray(this.f3546e);
        GLES20.glBindTexture(this.f3547f, 0);
        GLES20.glUseProgram(0);
    }

    public void g(int i2, Bitmap bitmap) {
        GLES20.glBindTexture(this.f3547f, i2);
        GLUtils.texImage2D(this.f3547f, 0, bitmap, 0);
    }

    public void h() {
        Log.d("Texture2dProgram", "deleting program " + this.a);
        GLES20.glDeleteProgram(this.a);
        this.a = -1;
    }
}
