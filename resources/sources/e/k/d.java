package e.k;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import e.k.c;
import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class d implements AutoCloseable {

    /* renamed from: e  reason: collision with root package name */
    private final int f3519e;

    /* renamed from: f  reason: collision with root package name */
    private final HandlerThread f3520f;

    /* renamed from: g  reason: collision with root package name */
    private final Handler f3521g;

    /* renamed from: h  reason: collision with root package name */
    int f3522h;

    /* renamed from: i  reason: collision with root package name */
    final int f3523i;

    /* renamed from: j  reason: collision with root package name */
    final int f3524j;

    /* renamed from: k  reason: collision with root package name */
    final int f3525k;

    /* renamed from: l  reason: collision with root package name */
    final C0089d f3526l = new C0089d();

    /* renamed from: m  reason: collision with root package name */
    MediaMuxer f3527m;

    /* renamed from: n  reason: collision with root package name */
    private c f3528n;

    /* renamed from: o  reason: collision with root package name */
    final AtomicBoolean f3529o = new AtomicBoolean(false);

    /* renamed from: p  reason: collision with root package name */
    int[] f3530p;

    /* renamed from: q  reason: collision with root package name */
    int f3531q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3532r;

    /* renamed from: s  reason: collision with root package name */
    private final List<Pair<Integer, ByteBuffer>> f3533s = new ArrayList();

    class a implements Runnable {
        a() {
        }

        public void run() {
            try {
                d.this.v();
            } catch (Exception unused) {
            }
        }
    }

    public static final class b {
        private final String a;
        private final FileDescriptor b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3535d;

        /* renamed from: e  reason: collision with root package name */
        private final int f3536e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f3537f;

        /* renamed from: g  reason: collision with root package name */
        private int f3538g;

        /* renamed from: h  reason: collision with root package name */
        private int f3539h;

        /* renamed from: i  reason: collision with root package name */
        private int f3540i;

        /* renamed from: j  reason: collision with root package name */
        private int f3541j;

        /* renamed from: k  reason: collision with root package name */
        private Handler f3542k;

        public b(String str, int i2, int i3, int i4) {
            this(str, (FileDescriptor) null, i2, i3, i4);
        }

        private b(String str, FileDescriptor fileDescriptor, int i2, int i3, int i4) {
            this.f3537f = true;
            this.f3538g = 100;
            this.f3539h = 1;
            this.f3540i = 0;
            this.f3541j = 0;
            if (i2 <= 0 || i3 <= 0) {
                throw new IllegalArgumentException("Invalid image size: " + i2 + "x" + i3);
            }
            this.a = str;
            this.b = fileDescriptor;
            this.c = i2;
            this.f3535d = i3;
            this.f3536e = i4;
        }

        public d a() {
            return new d(this.a, this.b, this.c, this.f3535d, this.f3541j, this.f3537f, this.f3538g, this.f3539h, this.f3540i, this.f3536e, this.f3542k);
        }

        public b b(int i2) {
            if (i2 > 0) {
                this.f3539h = i2;
                return this;
            }
            throw new IllegalArgumentException("Invalid maxImage: " + i2);
        }

        public b c(int i2) {
            if (i2 < 0 || i2 > 100) {
                throw new IllegalArgumentException("Invalid quality: " + i2);
            }
            this.f3538g = i2;
            return this;
        }
    }

    class c extends c.C0088c {
        private boolean a;

        c() {
        }

        private void e(Exception exc) {
            if (!this.a) {
                this.a = true;
                d.this.f3526l.a(exc);
            }
        }

        public void a(c cVar) {
            e((Exception) null);
        }

        public void b(c cVar, ByteBuffer byteBuffer) {
            if (!this.a) {
                d dVar = d.this;
                if (dVar.f3530p == null) {
                    e(new IllegalStateException("Output buffer received before format info"));
                    return;
                }
                if (dVar.f3531q < dVar.f3524j * dVar.f3522h) {
                    MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                    bufferInfo.set(byteBuffer.position(), byteBuffer.remaining(), 0, 0);
                    d dVar2 = d.this;
                    dVar2.f3527m.writeSampleData(dVar2.f3530p[dVar2.f3531q / dVar2.f3522h], byteBuffer, bufferInfo);
                }
                d dVar3 = d.this;
                int i2 = dVar3.f3531q + 1;
                dVar3.f3531q = i2;
                if (i2 == dVar3.f3524j * dVar3.f3522h) {
                    e((Exception) null);
                }
            }
        }

        public void c(c cVar, MediaCodec.CodecException codecException) {
            e(codecException);
        }

        public void d(c cVar, MediaFormat mediaFormat) {
            if (!this.a) {
                if (d.this.f3530p != null) {
                    e(new IllegalStateException("Output format changed after muxer started"));
                    return;
                }
                try {
                    d.this.f3522h = mediaFormat.getInteger("grid-rows") * mediaFormat.getInteger("grid-cols");
                } catch (ClassCastException | NullPointerException unused) {
                    d.this.f3522h = 1;
                }
                d dVar = d.this;
                dVar.f3530p = new int[dVar.f3524j];
                if (dVar.f3523i > 0) {
                    Log.d("HeifWriter", "setting rotation: " + d.this.f3523i);
                    d dVar2 = d.this;
                    dVar2.f3527m.setOrientationHint(dVar2.f3523i);
                }
                int i2 = 0;
                while (true) {
                    d dVar3 = d.this;
                    if (i2 < dVar3.f3530p.length) {
                        mediaFormat.setInteger("is-default", i2 == dVar3.f3525k ? 1 : 0);
                        d dVar4 = d.this;
                        dVar4.f3530p[i2] = dVar4.f3527m.addTrack(mediaFormat);
                        i2++;
                    } else {
                        dVar3.f3527m.start();
                        d.this.f3529o.set(true);
                        d.this.z();
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: e.k.d$d  reason: collision with other inner class name */
    static class C0089d {
        private boolean a;
        private Exception b;

        C0089d() {
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(Exception exc) {
            if (!this.a) {
                this.a = true;
                this.b = exc;
                notifyAll();
            }
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|11) */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0020 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x0009 */
        /* JADX WARNING: Removed duplicated region for block: B:4:0x0009 A[LOOP:0: B:4:0x0009->B:33:0x0009, LOOP_START, SYNTHETIC] */
        /* JADX WARNING: Unknown top exception splitter block from list: {B:17:0x0020=Splitter:B:17:0x0020, B:4:0x0009=Splitter:B:4:0x0009} */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public synchronized void b(long r7) {
            /*
                r6 = this;
                monitor-enter(r6)
                r0 = 0
                int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x003e
                if (r2 != 0) goto L_0x0011
            L_0x0009:
                boolean r7 = r6.a     // Catch:{ all -> 0x0046 }
                if (r7 != 0) goto L_0x0027
                r6.wait()     // Catch:{ InterruptedException -> 0x0009 }
                goto L_0x0009
            L_0x0011:
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0046 }
            L_0x0015:
                boolean r4 = r6.a     // Catch:{ all -> 0x0046 }
                if (r4 != 0) goto L_0x0027
                int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r4 <= 0) goto L_0x0027
                r6.wait(r7)     // Catch:{ InterruptedException -> 0x0020 }
            L_0x0020:
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0046 }
                long r4 = r4 - r2
                long r7 = r7 - r4
                goto L_0x0015
            L_0x0027:
                boolean r7 = r6.a     // Catch:{ all -> 0x0046 }
                if (r7 != 0) goto L_0x0037
                r7 = 1
                r6.a = r7     // Catch:{ all -> 0x0046 }
                java.util.concurrent.TimeoutException r7 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0046 }
                java.lang.String r8 = "timed out waiting for result"
                r7.<init>(r8)     // Catch:{ all -> 0x0046 }
                r6.b = r7     // Catch:{ all -> 0x0046 }
            L_0x0037:
                java.lang.Exception r7 = r6.b     // Catch:{ all -> 0x0046 }
                if (r7 != 0) goto L_0x003d
                monitor-exit(r6)
                return
            L_0x003d:
                throw r7     // Catch:{ all -> 0x0046 }
            L_0x003e:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0046 }
                java.lang.String r8 = "timeoutMs is negative"
                r7.<init>(r8)     // Catch:{ all -> 0x0046 }
                throw r7     // Catch:{ all -> 0x0046 }
            L_0x0046:
                r7 = move-exception
                monitor-exit(r6)
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: e.k.d.C0089d.b(long):void");
        }
    }

    @SuppressLint({"WrongConstant"})
    d(String str, FileDescriptor fileDescriptor, int i2, int i3, int i4, boolean z, int i5, int i6, int i7, int i8, Handler handler) {
        MediaMuxer mediaMuxer;
        String str2 = str;
        int i9 = i6;
        int i10 = i7;
        if (i10 < i9) {
            MediaFormat.createVideoFormat("image/vnd.android.heic", i2, i3);
            this.f3522h = 1;
            this.f3523i = i4;
            this.f3519e = i8;
            this.f3524j = i9;
            this.f3525k = i10;
            Looper looper = handler != null ? handler.getLooper() : null;
            if (looper == null) {
                HandlerThread handlerThread = new HandlerThread("HeifEncoderThread", -2);
                this.f3520f = handlerThread;
                handlerThread.start();
                looper = handlerThread.getLooper();
            } else {
                this.f3520f = null;
            }
            Handler handler2 = new Handler(looper);
            this.f3521g = handler2;
            if (str2 == null) {
                FileDescriptor fileDescriptor2 = fileDescriptor;
                mediaMuxer = new MediaMuxer(fileDescriptor, 3);
            }
            this.f3527m = mediaMuxer;
            this.f3528n = new c(i2, i3, z, i5, i8, handler2, new c());
            return;
        }
        throw new IllegalArgumentException("Invalid maxImages (" + i9 + ") or primaryIndex (" + i10 + ")");
    }

    private void c(int i2) {
        if (this.f3519e != i2) {
            throw new IllegalStateException("Not valid in input mode " + this.f3519e);
        }
    }

    private void g(boolean z) {
        if (this.f3532r != z) {
            throw new IllegalStateException("Already started");
        }
    }

    private void o(int i2) {
        g(true);
        c(i2);
    }

    public void B() {
        g(false);
        this.f3532r = true;
        this.f3528n.L();
    }

    public void E(long j2) {
        g(true);
        synchronized (this) {
            c cVar = this.f3528n;
            if (cVar != null) {
                cVar.O();
            }
        }
        this.f3526l.b(j2);
        z();
        v();
    }

    public void a(Bitmap bitmap) {
        o(2);
        synchronized (this) {
            c cVar = this.f3528n;
            if (cVar != null) {
                cVar.c(bitmap);
            }
        }
    }

    public void close() {
        this.f3521g.postAtFrontOfQueue(new a());
    }

    /* access modifiers changed from: package-private */
    public void v() {
        MediaMuxer mediaMuxer = this.f3527m;
        if (mediaMuxer != null) {
            mediaMuxer.stop();
            this.f3527m.release();
            this.f3527m = null;
        }
        c cVar = this.f3528n;
        if (cVar != null) {
            cVar.close();
            synchronized (this) {
                this.f3528n = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"WrongConstant"})
    public void z() {
        Pair remove;
        if (this.f3529o.get()) {
            while (true) {
                synchronized (this.f3533s) {
                    if (!this.f3533s.isEmpty()) {
                        remove = this.f3533s.remove(0);
                    } else {
                        return;
                    }
                }
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                bufferInfo.set(((ByteBuffer) remove.second).position(), ((ByteBuffer) remove.second).remaining(), 0, 16);
                this.f3527m.writeSampleData(this.f3530p[((Integer) remove.first).intValue()], (ByteBuffer) remove.second, bufferInfo);
            }
            while (true) {
            }
        }
    }
}
