package f.e.c.a.z.a;

import f.e.c.a.z.a.a;
import f.e.c.a.z.a.a.C0122a;
import f.e.c.a.z.a.i;
import f.e.c.a.z.a.s0;
import java.io.IOException;

public abstract class a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0122a<MessageType, BuilderType>> implements s0 {
    protected int memoizedHashCode = 0;

    /* renamed from: f.e.c.a.z.a.a$a  reason: collision with other inner class name */
    public static abstract class C0122a<MessageType extends a<MessageType, BuilderType>, BuilderType extends C0122a<MessageType, BuilderType>> implements s0.a {
        protected static n1 p(s0 s0Var) {
            return new n1(s0Var);
        }

        public /* bridge */ /* synthetic */ s0.a g(s0 s0Var) {
            n(s0Var);
            return this;
        }

        /* access modifiers changed from: protected */
        public abstract BuilderType m(MessageType messagetype);

        public BuilderType n(s0 s0Var) {
            if (d().getClass().isInstance(s0Var)) {
                m((a) s0Var);
                return this;
            }
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
    }

    private String n(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    /* access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    public byte[] f() {
        try {
            byte[] bArr = new byte[b()];
            l d0 = l.d0(bArr);
            h(d0);
            d0.c();
            return bArr;
        } catch (IOException e2) {
            throw new RuntimeException(n("byte array"), e2);
        }
    }

    public i j() {
        try {
            i.g r2 = i.r(b());
            h(r2.b());
            return r2.a();
        } catch (IOException e2) {
            throw new RuntimeException(n("ByteString"), e2);
        }
    }

    /* access modifiers changed from: package-private */
    public int m(h1 h1Var) {
        int c = c();
        if (c != -1) {
            return c;
        }
        int h2 = h1Var.h(this);
        q(h2);
        return h2;
    }

    /* access modifiers changed from: package-private */
    public n1 p() {
        return new n1(this);
    }

    /* access modifiers changed from: package-private */
    public void q(int i2) {
        throw new UnsupportedOperationException();
    }
}
