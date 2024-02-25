package e.k;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.Image;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class c implements AutoCloseable, SurfaceTexture.OnFrameAvailableListener {
    private SurfaceTexture A;
    private Surface B;
    private b C;
    private a D;
    private int E;
    private final float[] F = new float[16];

    /* renamed from: e  reason: collision with root package name */
    MediaCodec f3496e;

    /* renamed from: f  reason: collision with root package name */
    final C0088c f3497f;

    /* renamed from: g  reason: collision with root package name */
    private final HandlerThread f3498g;

    /* renamed from: h  reason: collision with root package name */
    final Handler f3499h;

    /* renamed from: i  reason: collision with root package name */
    private final int f3500i;

    /* renamed from: j  reason: collision with root package name */
    final int f3501j;

    /* renamed from: k  reason: collision with root package name */
    final int f3502k;

    /* renamed from: l  reason: collision with root package name */
    final int f3503l;

    /* renamed from: m  reason: collision with root package name */
    final int f3504m;

    /* renamed from: n  reason: collision with root package name */
    final int f3505n;

    /* renamed from: o  reason: collision with root package name */
    final int f3506o;

    /* renamed from: p  reason: collision with root package name */
    private final int f3507p;

    /* renamed from: q  reason: collision with root package name */
    final boolean f3508q;

    /* renamed from: r  reason: collision with root package name */
    private int f3509r;

    /* renamed from: s  reason: collision with root package name */
    boolean f3510s;
    private final Rect t;
    private final Rect u;
    private ByteBuffer v;
    private final ArrayList<ByteBuffer> w = new ArrayList<>();
    private final ArrayList<ByteBuffer> x = new ArrayList<>();
    final ArrayList<Integer> y = new ArrayList<>();
    e z;

    class a implements Runnable {
        a() {
        }

        public void run() {
            c.this.E();
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            c.this.P();
        }
    }

    /* renamed from: e.k.c$c  reason: collision with other inner class name */
    public static abstract class C0088c {
        public abstract void a(c cVar);

        public abstract void b(c cVar, ByteBuffer byteBuffer);

        public abstract void c(c cVar, MediaCodec.CodecException codecException);

        public abstract void d(c cVar, MediaFormat mediaFormat);
    }

    class d extends MediaCodec.Callback {
        private boolean a;

        d() {
        }

        private void a(MediaCodec.CodecException codecException) {
            c.this.P();
            if (codecException == null) {
                c cVar = c.this;
                cVar.f3497f.a(cVar);
                return;
            }
            c cVar2 = c.this;
            cVar2.f3497f.c(cVar2, codecException);
        }

        public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
            if (mediaCodec == c.this.f3496e) {
                Log.e("HeifEncoder", "onError: " + codecException);
                a(codecException);
            }
        }

        public void onInputBufferAvailable(MediaCodec mediaCodec, int i2) {
            c cVar = c.this;
            if (mediaCodec == cVar.f3496e && !cVar.f3510s) {
                cVar.y.add(Integer.valueOf(i2));
                c.this.E();
            }
        }

        public void onOutputBufferAvailable(MediaCodec mediaCodec, int i2, MediaCodec.BufferInfo bufferInfo) {
            if (mediaCodec == c.this.f3496e && !this.a) {
                if (bufferInfo.size > 0 && (bufferInfo.flags & 2) == 0) {
                    ByteBuffer outputBuffer = mediaCodec.getOutputBuffer(i2);
                    outputBuffer.position(bufferInfo.offset);
                    outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    e eVar = c.this.z;
                    if (eVar != null) {
                        eVar.e(bufferInfo.presentationTimeUs);
                    }
                    c cVar = c.this;
                    cVar.f3497f.b(cVar, outputBuffer);
                }
                this.a = ((bufferInfo.flags & 4) != 0) | this.a;
                mediaCodec.releaseOutputBuffer(i2, false);
                if (this.a) {
                    a((MediaCodec.CodecException) null);
                }
            }
        }

        public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
            if (mediaCodec == c.this.f3496e) {
                if (!"image/vnd.android.heic".equals(mediaFormat.getString("mime"))) {
                    mediaFormat.setString("mime", "image/vnd.android.heic");
                    mediaFormat.setInteger("width", c.this.f3501j);
                    mediaFormat.setInteger("height", c.this.f3502k);
                    c cVar = c.this;
                    if (cVar.f3508q) {
                        mediaFormat.setInteger("tile-width", cVar.f3503l);
                        mediaFormat.setInteger("tile-height", c.this.f3504m);
                        mediaFormat.setInteger("grid-rows", c.this.f3505n);
                        mediaFormat.setInteger("grid-cols", c.this.f3506o);
                    }
                }
                c cVar2 = c.this;
                cVar2.f3497f.d(cVar2, mediaFormat);
            }
        }
    }

    private class e {
        final boolean a;
        long b = -1;
        long c = -1;

        /* renamed from: d  reason: collision with root package name */
        long f3513d = -1;

        /* renamed from: e  reason: collision with root package name */
        long f3514e = -1;

        /* renamed from: f  reason: collision with root package name */
        long f3515f = -1;

        /* renamed from: g  reason: collision with root package name */
        boolean f3516g;

        class a implements Runnable {
            a() {
            }

            public void run() {
                MediaCodec mediaCodec = c.this.f3496e;
                if (mediaCodec != null) {
                    mediaCodec.signalEndOfInputStream();
                }
            }
        }

        e(boolean z) {
            this.a = z;
        }

        private void a() {
            c.this.f3499h.post(new a());
            this.f3516g = true;
        }

        private void b() {
            if (!this.f3516g) {
                if (this.f3513d < 0) {
                    long j2 = this.b;
                    if (j2 >= 0 && this.c >= j2) {
                        long j3 = this.f3514e;
                        if (j3 < 0) {
                            a();
                            return;
                        }
                        this.f3513d = j3;
                    }
                }
                long j4 = this.f3513d;
                if (j4 >= 0 && j4 <= this.f3515f) {
                    a();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public synchronized void c(long j2) {
            if (this.a) {
                if (this.b < 0) {
                    this.b = j2;
                }
            } else if (this.f3513d < 0) {
                this.f3513d = j2 / 1000;
            }
            b();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:10:0x0013  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized boolean d(long r6, long r8) {
            /*
                r5 = this;
                monitor-enter(r5)
                long r0 = r5.b     // Catch:{ all -> 0x001c }
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 < 0) goto L_0x0010
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 > 0) goto L_0x000e
                goto L_0x0010
            L_0x000e:
                r0 = 0
                goto L_0x0011
            L_0x0010:
                r0 = 1
            L_0x0011:
                if (r0 == 0) goto L_0x0015
                r5.f3514e = r8     // Catch:{ all -> 0x001c }
            L_0x0015:
                r5.c = r6     // Catch:{ all -> 0x001c }
                r5.b()     // Catch:{ all -> 0x001c }
                monitor-exit(r5)
                return r0
            L_0x001c:
                r6 = move-exception
                monitor-exit(r5)
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: e.k.c.e.d(long, long):boolean");
        }

        /* access modifiers changed from: package-private */
        public synchronized void e(long j2) {
            this.f3515f = j2;
            b();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x01f7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(int r20, int r21, boolean r22, int r23, int r24, android.os.Handler r25, e.k.c.C0088c r26) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            r3 = r23
            r4 = r24
            java.lang.String r5 = "video/hevc"
            java.lang.String r6 = "image/vnd.android.heic"
            r19.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.w = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.x = r7
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r0.y = r7
            r7 = 16
            float[] r7 = new float[r7]
            r0.F = r7
            if (r1 < 0) goto L_0x0267
            if (r2 < 0) goto L_0x0267
            if (r3 < 0) goto L_0x0267
            r7 = 100
            if (r3 > r7) goto L_0x0267
            r7 = 512(0x200, float:7.175E-43)
            r9 = 1
            if (r1 > r7) goto L_0x0040
            if (r2 <= r7) goto L_0x003e
            goto L_0x0040
        L_0x003e:
            r10 = 0
            goto L_0x0041
        L_0x0040:
            r10 = 1
        L_0x0041:
            r10 = r22 & r10
            r11 = 0
            android.media.MediaCodec r12 = android.media.MediaCodec.createEncoderByType(r6)     // Catch:{ Exception -> 0x006b }
            r0.f3496e = r12     // Catch:{ Exception -> 0x006b }
            android.media.MediaCodecInfo r12 = r12.getCodecInfo()     // Catch:{ Exception -> 0x006b }
            android.media.MediaCodecInfo$CodecCapabilities r12 = r12.getCapabilitiesForType(r6)     // Catch:{ Exception -> 0x006b }
            android.media.MediaCodecInfo$VideoCapabilities r13 = r12.getVideoCapabilities()     // Catch:{ Exception -> 0x006b }
            boolean r13 = r13.isSizeSupported(r1, r2)     // Catch:{ Exception -> 0x006b }
            if (r13 == 0) goto L_0x005e
            r13 = 1
            goto L_0x0084
        L_0x005e:
            android.media.MediaCodec r12 = r0.f3496e     // Catch:{ Exception -> 0x006b }
            r12.release()     // Catch:{ Exception -> 0x006b }
            r0.f3496e = r11     // Catch:{ Exception -> 0x006b }
            java.lang.Exception r12 = new java.lang.Exception     // Catch:{ Exception -> 0x006b }
            r12.<init>()     // Catch:{ Exception -> 0x006b }
            throw r12     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            android.media.MediaCodec r12 = android.media.MediaCodec.createEncoderByType(r5)
            r0.f3496e = r12
            android.media.MediaCodecInfo r12 = r12.getCodecInfo()
            android.media.MediaCodecInfo$CodecCapabilities r12 = r12.getCapabilitiesForType(r5)
            android.media.MediaCodecInfo$VideoCapabilities r13 = r12.getVideoCapabilities()
            boolean r13 = r13.isSizeSupported(r1, r2)
            r13 = r13 ^ r9
            r10 = r10 | r13
            r13 = 0
        L_0x0084:
            r0.f3500i = r4
            r14 = r26
            r0.f3497f = r14
            if (r25 == 0) goto L_0x0091
            android.os.Looper r14 = r25.getLooper()
            goto L_0x0092
        L_0x0091:
            r14 = r11
        L_0x0092:
            if (r14 != 0) goto L_0x00a6
            android.os.HandlerThread r14 = new android.os.HandlerThread
            r15 = -2
            java.lang.String r8 = "HeifEncoderThread"
            r14.<init>(r8, r15)
            r0.f3498g = r14
            r14.start()
            android.os.Looper r14 = r14.getLooper()
            goto L_0x00a8
        L_0x00a6:
            r0.f3498g = r11
        L_0x00a8:
            android.os.Handler r8 = new android.os.Handler
            r8.<init>(r14)
            r0.f3499h = r8
            r14 = 2
            if (r4 == r9) goto L_0x00b7
            if (r4 != r14) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r15 = 0
            goto L_0x00b8
        L_0x00b7:
            r15 = 1
        L_0x00b8:
            if (r15 == 0) goto L_0x00c1
            r16 = 2130708361(0x7f000789, float:1.701803E38)
            r11 = 2130708361(0x7f000789, float:1.701803E38)
            goto L_0x00c7
        L_0x00c1:
            r16 = 2135033992(0x7f420888, float:2.5791453E38)
            r11 = 2135033992(0x7f420888, float:2.5791453E38)
        L_0x00c7:
            r0.f3501j = r1
            r0.f3502k = r2
            r0.f3508q = r10
            if (r10 == 0) goto L_0x00df
            int r14 = r2 + 512
            int r14 = r14 - r9
            int r14 = r14 / r7
            r16 = r14
            int r14 = r1 + 512
            int r14 = r14 - r9
            int r14 = r14 / r7
            r9 = r14
            r4 = r16
            r14 = 512(0x200, float:7.175E-43)
            goto L_0x00e2
        L_0x00df:
            r7 = r1
            r14 = r2
            r4 = 1
        L_0x00e2:
            if (r13 == 0) goto L_0x00e9
            android.media.MediaFormat r5 = android.media.MediaFormat.createVideoFormat(r6, r1, r2)
            goto L_0x00ed
        L_0x00e9:
            android.media.MediaFormat r5 = android.media.MediaFormat.createVideoFormat(r5, r7, r14)
        L_0x00ed:
            if (r10 == 0) goto L_0x0103
            java.lang.String r6 = "tile-width"
            r5.setInteger(r6, r7)
            java.lang.String r6 = "tile-height"
            r5.setInteger(r6, r14)
            java.lang.String r6 = "grid-cols"
            r5.setInteger(r6, r9)
            java.lang.String r6 = "grid-rows"
            r5.setInteger(r6, r4)
        L_0x0103:
            if (r13 == 0) goto L_0x010f
            r0.f3503l = r1
            r0.f3504m = r2
            r4 = 1
            r0.f3505n = r4
            r0.f3506o = r4
            goto L_0x0117
        L_0x010f:
            r0.f3503l = r7
            r0.f3504m = r14
            r0.f3505n = r4
            r0.f3506o = r9
        L_0x0117:
            int r4 = r0.f3505n
            int r6 = r0.f3506o
            int r4 = r4 * r6
            r0.f3507p = r4
            java.lang.String r6 = "i-frame-interval"
            r7 = 0
            r5.setInteger(r6, r7)
            java.lang.String r6 = "color-format"
            r5.setInteger(r6, r11)
            java.lang.String r6 = "frame-rate"
            r5.setInteger(r6, r4)
            int r4 = r4 * 30
            java.lang.String r6 = "capture-rate"
            r5.setInteger(r6, r4)
            android.media.MediaCodecInfo$EncoderCapabilities r4 = r12.getEncoderCapabilities()
            boolean r6 = r4.isBitrateModeSupported(r7)
            r11 = 4636737291354636288(0x4059000000000000, double:100.0)
            java.lang.String r7 = "bitrate-mode"
            java.lang.String r9 = "HeifEncoder"
            if (r6 == 0) goto L_0x0193
            java.lang.String r6 = "Setting bitrate mode to constant quality"
            android.util.Log.d(r9, r6)
            android.util.Range r4 = r4.getQualityRange()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r14 = "Quality range: "
            r6.append(r14)
            r6.append(r4)
            java.lang.String r6 = r6.toString()
            android.util.Log.d(r9, r6)
            r6 = 0
            r5.setInteger(r7, r6)
            java.lang.Comparable r6 = r4.getLower()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            double r6 = (double) r6
            java.lang.Comparable r9 = r4.getUpper()
            java.lang.Integer r9 = (java.lang.Integer) r9
            int r9 = r9.intValue()
            java.lang.Comparable r4 = r4.getLower()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            int r9 = r9 - r4
            int r9 = r9 * r3
            double r3 = (double) r9
            double r3 = r3 / r11
            double r6 = r6 + r3
            int r3 = (int) r6
            java.lang.String r4 = "quality"
        L_0x018f:
            r5.setInteger(r4, r3)
            goto L_0x01c3
        L_0x0193:
            r6 = 2
            boolean r4 = r4.isBitrateModeSupported(r6)
            if (r4 == 0) goto L_0x01a3
            java.lang.String r4 = "Setting bitrate mode to constant bitrate"
            android.util.Log.d(r9, r4)
            r5.setInteger(r7, r6)
            goto L_0x01ac
        L_0x01a3:
            java.lang.String r4 = "Setting bitrate mode to variable bitrate"
            android.util.Log.d(r9, r4)
            r4 = 1
            r5.setInteger(r7, r4)
        L_0x01ac:
            int r4 = r1 * r2
            double r6 = (double) r4
            r17 = 4609434218613702656(0x3ff8000000000000, double:1.5)
            double r6 = r6 * r17
            r17 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r6 = r6 * r17
            r17 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            double r6 = r6 * r17
            double r3 = (double) r3
            double r6 = r6 * r3
            double r6 = r6 / r11
            int r3 = (int) r6
            java.lang.String r4 = "bitrate"
            goto L_0x018f
        L_0x01c3:
            android.media.MediaCodec r3 = r0.f3496e
            e.k.c$d r4 = new e.k.c$d
            r4.<init>()
            r3.setCallback(r4, r8)
            android.media.MediaCodec r3 = r0.f3496e
            r4 = 0
            r6 = 1
            r3.configure(r5, r4, r4, r6)
            if (r15 == 0) goto L_0x023a
            android.media.MediaCodec r3 = r0.f3496e
            android.view.Surface r3 = r3.createInputSurface()
            r0.B = r3
            if (r10 == 0) goto L_0x01e6
            if (r13 == 0) goto L_0x01e3
            goto L_0x01e6
        L_0x01e3:
            r4 = r24
            goto L_0x01eb
        L_0x01e6:
            r4 = r24
            r5 = 2
            if (r4 != r5) goto L_0x01ed
        L_0x01eb:
            r5 = 1
            goto L_0x01ee
        L_0x01ed:
            r5 = 0
        L_0x01ee:
            e.k.c$e r6 = new e.k.c$e
            r6.<init>(r5)
            r0.z = r6
            if (r5 == 0) goto L_0x0253
            e.k.b r5 = new e.k.b
            r5.<init>(r3)
            r0.C = r5
            r5.f()
            e.k.a r3 = new e.k.a
            e.k.e r5 = new e.k.e
            r6 = 2
            if (r4 != r6) goto L_0x020a
            r6 = 0
            goto L_0x020b
        L_0x020a:
            r6 = 1
        L_0x020b:
            r5.<init>(r6)
            r3.<init>(r5, r1, r2)
            r0.D = r3
            int r3 = r3.c()
            r0.E = r3
            r3 = 1
            if (r4 != r3) goto L_0x0234
            android.graphics.SurfaceTexture r4 = new android.graphics.SurfaceTexture
            int r5 = r0.E
            r4.<init>(r5, r3)
            r0.A = r4
            r4.setOnFrameAvailableListener(r0)
            android.graphics.SurfaceTexture r3 = r0.A
            r3.setDefaultBufferSize(r1, r2)
            android.view.Surface r1 = new android.view.Surface
            android.graphics.SurfaceTexture r2 = r0.A
            r1.<init>(r2)
        L_0x0234:
            e.k.b r1 = r0.C
            r1.g()
            goto L_0x0253
        L_0x023a:
            r1 = 2
            r7 = 0
        L_0x023c:
            if (r7 >= r1) goto L_0x0253
            java.util.ArrayList<java.nio.ByteBuffer> r2 = r0.w
            int r3 = r0.f3501j
            int r4 = r0.f3502k
            int r3 = r3 * r4
            int r3 = r3 * 3
            int r3 = r3 / r1
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocateDirect(r3)
            r2.add(r3)
            int r7 = r7 + 1
            goto L_0x023c
        L_0x0253:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.f3503l
            int r3 = r0.f3504m
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            r0.u = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r0.t = r1
            return
        L_0x0267:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "invalid encoder inputs"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.c.<init>(int, int, boolean, int, int, android.os.Handler, e.k.c$c):void");
    }

    private ByteBuffer B() {
        if (!this.f3510s && this.v == null) {
            synchronized (this.x) {
                this.v = this.x.isEmpty() ? null : this.x.remove(0);
            }
        }
        if (this.f3510s) {
            return null;
        }
        return this.v;
    }

    private void J(boolean z2) {
        synchronized (this.w) {
            this.f3510s = z2 | this.f3510s;
            this.w.add(this.v);
            this.w.notifyAll();
        }
        this.v = null;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:19:0x0003, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.nio.ByteBuffer a() {
        /*
            r3 = this;
            java.util.ArrayList<java.nio.ByteBuffer> r0 = r3.w
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r3.f3510s     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x0015
            java.util.ArrayList<java.nio.ByteBuffer> r1 = r3.w     // Catch:{ all -> 0x0026 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0015
            java.util.ArrayList<java.nio.ByteBuffer> r1 = r3.w     // Catch:{ InterruptedException -> 0x0003 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0003 }
            goto L_0x0003
        L_0x0015:
            boolean r1 = r3.f3510s     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x001b
            r1 = 0
            goto L_0x0024
        L_0x001b:
            java.util.ArrayList<java.nio.ByteBuffer> r1 = r3.w     // Catch:{ all -> 0x0026 }
            r2 = 0
            java.lang.Object r1 = r1.remove(r2)     // Catch:{ all -> 0x0026 }
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r1
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: e.k.c.a():java.nio.ByteBuffer");
    }

    private void g(byte[] bArr) {
        ByteBuffer a2 = a();
        if (a2 != null) {
            a2.clear();
            if (bArr != null) {
                a2.put(bArr);
            }
            a2.flip();
            synchronized (this.x) {
                this.x.add(a2);
            }
            this.f3499h.post(new a());
        }
    }

    private long o(int i2) {
        return ((((long) i2) * 1000000) / ((long) this.f3507p)) + 132;
    }

    private static void v(ByteBuffer byteBuffer, Image image, int i2, int i3, Rect rect, Rect rect2) {
        int i4;
        int i5;
        Rect rect3 = rect;
        Rect rect4 = rect2;
        if (rect.width() != rect2.width() || rect.height() != rect2.height()) {
            throw new IllegalArgumentException("src and dst rect size are different!");
        } else if (i2 % 2 == 0 && i3 % 2 == 0 && rect3.left % 2 == 0 && rect3.top % 2 == 0 && rect3.right % 2 == 0 && rect3.bottom % 2 == 0 && rect4.left % 2 == 0 && rect4.top % 2 == 0 && rect4.right % 2 == 0 && rect4.bottom % 2 == 0) {
            Image.Plane[] planes = image.getPlanes();
            for (int i6 = 0; i6 < planes.length; i6++) {
                ByteBuffer buffer = planes[i6].getBuffer();
                int pixelStride = planes[i6].getPixelStride();
                int min = Math.min(rect.width(), i2 - rect3.left);
                int min2 = Math.min(rect.height(), i3 - rect3.top);
                if (i6 > 0) {
                    i5 = ((i2 * i3) * (i6 + 3)) / 4;
                    i4 = 2;
                } else {
                    i5 = 0;
                    i4 = 1;
                }
                for (int i7 = 0; i7 < min2 / i4; i7++) {
                    byteBuffer.position(((((rect3.top / i4) + i7) * i2) / i4) + i5 + (rect3.left / i4));
                    buffer.position((((rect4.top / i4) + i7) * planes[i6].getRowStride()) + ((rect4.left * pixelStride) / i4));
                    int i8 = 0;
                    while (true) {
                        int i9 = min / i4;
                        if (i8 >= i9) {
                            break;
                        }
                        buffer.put(byteBuffer.get());
                        if (pixelStride > 1 && i8 != i9 - 1) {
                            buffer.position((buffer.position() + pixelStride) - 1);
                        }
                        i8++;
                    }
                }
                ByteBuffer byteBuffer2 = byteBuffer;
            }
        } else {
            throw new IllegalArgumentException("src or dst are not aligned!");
        }
    }

    private void z() {
        GLES20.glViewport(0, 0, this.f3503l, this.f3504m);
        for (int i2 = 0; i2 < this.f3505n; i2++) {
            for (int i3 = 0; i3 < this.f3506o; i3++) {
                int i4 = this.f3503l;
                int i5 = i3 * i4;
                int i6 = this.f3504m;
                int i7 = i2 * i6;
                this.t.set(i5, i7, i4 + i5, i6 + i7);
                this.D.a(this.E, e.f3544h, this.t);
                b bVar = this.C;
                int i8 = this.f3509r;
                this.f3509r = i8 + 1;
                bVar.i(o(i8) * 1000);
                this.C.j();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void E() {
        while (true) {
            ByteBuffer B2 = B();
            if (B2 != null && !this.y.isEmpty()) {
                int intValue = this.y.remove(0).intValue();
                boolean z2 = this.f3509r % this.f3507p == 0 && B2.remaining() == 0;
                if (!z2) {
                    Image inputImage = this.f3496e.getInputImage(intValue);
                    int i2 = this.f3503l;
                    int i3 = this.f3509r;
                    int i4 = this.f3506o;
                    int i5 = (i3 % i4) * i2;
                    int i6 = this.f3504m;
                    int i7 = ((i3 / i4) % this.f3505n) * i6;
                    this.t.set(i5, i7, i2 + i5, i6 + i7);
                    v(B2, inputImage, this.f3501j, this.f3502k, this.t, this.u);
                }
                MediaCodec mediaCodec = this.f3496e;
                int capacity = z2 ? 0 : mediaCodec.getInputBuffer(intValue).capacity();
                int i8 = this.f3509r;
                this.f3509r = i8 + 1;
                mediaCodec.queueInputBuffer(intValue, 0, capacity, o(i8), z2 ? 4 : 0);
                if (z2 || this.f3509r % this.f3507p == 0) {
                    J(z2);
                }
            } else {
                return;
            }
        }
    }

    public void L() {
        this.f3496e.start();
    }

    public void O() {
        int i2 = this.f3500i;
        if (i2 == 2) {
            this.z.c(0);
        } else if (i2 == 0) {
            g((byte[]) null);
        }
    }

    /* access modifiers changed from: package-private */
    public void P() {
        MediaCodec mediaCodec = this.f3496e;
        if (mediaCodec != null) {
            mediaCodec.stop();
            this.f3496e.release();
            this.f3496e = null;
        }
        synchronized (this.w) {
            this.f3510s = true;
            this.w.notifyAll();
        }
        synchronized (this) {
            a aVar = this.D;
            if (aVar != null) {
                aVar.e(false);
                this.D = null;
            }
            b bVar = this.C;
            if (bVar != null) {
                bVar.h();
                this.C = null;
            }
            SurfaceTexture surfaceTexture = this.A;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                this.A = null;
            }
        }
    }

    public void c(Bitmap bitmap) {
        if (this.f3500i != 2) {
            throw new IllegalStateException("addBitmap is only allowed in bitmap input mode");
        } else if (this.z.d(o(this.f3509r) * 1000, o((this.f3509r + this.f3507p) - 1))) {
            synchronized (this) {
                b bVar = this.C;
                if (bVar != null) {
                    bVar.f();
                    this.D.d(this.E, bitmap);
                    z();
                    this.C.g();
                }
            }
        }
    }

    public void close() {
        synchronized (this.w) {
            this.f3510s = true;
            this.w.notifyAll();
        }
        this.f3499h.postAtFrontOfQueue(new b());
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        synchronized (this) {
            b bVar = this.C;
            if (bVar != null) {
                bVar.f();
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.F);
                if (this.z.d(surfaceTexture.getTimestamp(), o((this.f3509r + this.f3507p) - 1))) {
                    z();
                }
                surfaceTexture.releaseTexImage();
                this.C.g();
            }
        }
    }
}
