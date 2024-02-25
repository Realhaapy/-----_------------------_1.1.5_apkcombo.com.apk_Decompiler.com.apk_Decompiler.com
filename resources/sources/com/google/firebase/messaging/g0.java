package com.google.firebase.messaging;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

final class g0 {

    private static final class a extends FilterInputStream {

        /* renamed from: e  reason: collision with root package name */
        private long f2745e;

        /* renamed from: f  reason: collision with root package name */
        private long f2746f = -1;

        a(InputStream inputStream, long j2) {
            super(inputStream);
            this.f2745e = j2;
        }

        public int available() {
            return (int) Math.min((long) this.in.available(), this.f2745e);
        }

        public synchronized void mark(int i2) {
            this.in.mark(i2);
            this.f2746f = this.f2745e;
        }

        public int read() {
            if (this.f2745e == 0) {
                return -1;
            }
            int read = this.in.read();
            if (read != -1) {
                this.f2745e--;
            }
            return read;
        }

        public int read(byte[] bArr, int i2, int i3) {
            long j2 = this.f2745e;
            if (j2 == 0) {
                return -1;
            }
            int read = this.in.read(bArr, i2, (int) Math.min((long) i3, j2));
            if (read != -1) {
                this.f2745e -= (long) read;
            }
            return read;
        }

        public synchronized void reset() {
            if (!this.in.markSupported()) {
                throw new IOException("Mark not supported");
            } else if (this.f2746f != -1) {
                this.in.reset();
                this.f2745e = this.f2746f;
            } else {
                throw new IOException("Mark not set");
            }
        }

        public long skip(long j2) {
            long skip = this.in.skip(Math.min(j2, this.f2745e));
            this.f2745e -= skip;
            return skip;
        }
    }

    private static byte[] a(Queue<byte[]> queue, int i2) {
        if (queue.isEmpty()) {
            return new byte[0];
        }
        byte[] remove = queue.remove();
        if (remove.length == i2) {
            return remove;
        }
        int length = i2 - remove.length;
        byte[] copyOf = Arrays.copyOf(remove, i2);
        while (length > 0) {
            byte[] remove2 = queue.remove();
            int min = Math.min(length, remove2.length);
            System.arraycopy(remove2, 0, copyOf, i2 - length, min);
            length -= min;
        }
        return copyOf;
    }

    public static InputStream b(InputStream inputStream, long j2) {
        return new a(inputStream, j2);
    }

    private static int c(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static byte[] d(InputStream inputStream) {
        return e(inputStream, new ArrayDeque(20), 0);
    }

    private static byte[] e(InputStream inputStream, Queue<byte[]> queue, int i2) {
        int min = Math.min(8192, Math.max(128, Integer.highestOneBit(i2) * 2));
        while (i2 < 2147483639) {
            int min2 = Math.min(min, 2147483639 - i2);
            byte[] bArr = new byte[min2];
            queue.add(bArr);
            int i3 = 0;
            while (i3 < min2) {
                int read = inputStream.read(bArr, i3, min2 - i3);
                if (read == -1) {
                    return a(queue, i2);
                }
                i3 += read;
                i2 += read;
            }
            min = c(((long) min) * ((long) (min < 4096 ? 4 : 2)));
        }
        if (inputStream.read() == -1) {
            return a(queue, 2147483639);
        }
        throw new OutOfMemoryError("input is too large to fit in a byte array");
    }
}
