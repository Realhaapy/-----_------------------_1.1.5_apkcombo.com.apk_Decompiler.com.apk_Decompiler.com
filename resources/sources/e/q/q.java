package e.q;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import e.q.m;
import java.util.ArrayList;
import java.util.Iterator;

public class q extends m {
    private ArrayList<m> N = new ArrayList<>();
    private boolean O = true;
    int P;
    boolean Q = false;
    private int R = 0;

    class a extends n {
        final /* synthetic */ m a;

        a(q qVar, m mVar) {
            this.a = mVar;
        }

        public void e(m mVar) {
            this.a.X();
            mVar.T(this);
        }
    }

    static class b extends n {
        q a;

        b(q qVar) {
            this.a = qVar;
        }

        public void a(m mVar) {
            q qVar = this.a;
            if (!qVar.Q) {
                qVar.e0();
                this.a.Q = true;
            }
        }

        public void e(m mVar) {
            q qVar = this.a;
            int i2 = qVar.P - 1;
            qVar.P = i2;
            if (i2 == 0) {
                qVar.Q = false;
                qVar.t();
            }
            mVar.T(this);
        }
    }

    private void j0(m mVar) {
        this.N.add(mVar);
        mVar.v = this;
    }

    private void s0() {
        b bVar = new b(this);
        Iterator<m> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.P = this.N.size();
    }

    public void R(View view) {
        super.R(view);
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).R(view);
        }
    }

    public void V(View view) {
        super.V(view);
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).V(view);
        }
    }

    /* access modifiers changed from: protected */
    public void X() {
        if (this.N.isEmpty()) {
            e0();
            t();
            return;
        }
        s0();
        if (!this.O) {
            for (int i2 = 1; i2 < this.N.size(); i2++) {
                this.N.get(i2 - 1).b(new a(this, this.N.get(i2)));
            }
            m mVar = this.N.get(0);
            if (mVar != null) {
                mVar.X();
                return;
            }
            return;
        }
        Iterator<m> it = this.N.iterator();
        while (it.hasNext()) {
            it.next().X();
        }
    }

    public /* bridge */ /* synthetic */ m Y(long j2) {
        o0(j2);
        return this;
    }

    public void Z(m.e eVar) {
        super.Z(eVar);
        this.R |= 8;
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).Z(eVar);
        }
    }

    public void b0(g gVar) {
        super.b0(gVar);
        this.R |= 4;
        if (this.N != null) {
            for (int i2 = 0; i2 < this.N.size(); i2++) {
                this.N.get(i2).b0(gVar);
            }
        }
    }

    public void c0(p pVar) {
        super.c0(pVar);
        this.R |= 2;
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).c0(pVar);
        }
    }

    /* access modifiers changed from: package-private */
    public String f0(String str) {
        String f0 = super.f0(str);
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f0);
            sb.append("\n");
            sb.append(this.N.get(i2).f0(str + "  "));
            f0 = sb.toString();
        }
        return f0;
    }

    /* renamed from: g0 */
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    /* renamed from: h0 */
    public q d(View view) {
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            this.N.get(i2).d(view);
        }
        super.d(view);
        return this;
    }

    /* access modifiers changed from: protected */
    public void i() {
        super.i();
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).i();
        }
    }

    public q i0(m mVar) {
        j0(mVar);
        long j2 = this.f3614g;
        if (j2 >= 0) {
            mVar.Y(j2);
        }
        if ((this.R & 1) != 0) {
            mVar.a0(w());
        }
        if ((this.R & 2) != 0) {
            mVar.c0(A());
        }
        if ((this.R & 4) != 0) {
            mVar.b0(z());
        }
        if ((this.R & 8) != 0) {
            mVar.Z(v());
        }
        return this;
    }

    public void j(s sVar) {
        if (K(sVar.b)) {
            Iterator<m> it = this.N.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.K(sVar.b)) {
                    next.j(sVar);
                    sVar.c.add(next);
                }
            }
        }
    }

    public m k0(int i2) {
        if (i2 < 0 || i2 >= this.N.size()) {
            return null;
        }
        return this.N.get(i2);
    }

    /* access modifiers changed from: package-private */
    public void l(s sVar) {
        super.l(sVar);
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.N.get(i2).l(sVar);
        }
    }

    public int l0() {
        return this.N.size();
    }

    public void m(s sVar) {
        if (K(sVar.b)) {
            Iterator<m> it = this.N.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.K(sVar.b)) {
                    next.m(sVar);
                    sVar.c.add(next);
                }
            }
        }
    }

    /* renamed from: m0 */
    public q T(m.f fVar) {
        super.T(fVar);
        return this;
    }

    /* renamed from: n0 */
    public q U(View view) {
        for (int i2 = 0; i2 < this.N.size(); i2++) {
            this.N.get(i2).U(view);
        }
        super.U(view);
        return this;
    }

    public q o0(long j2) {
        ArrayList<m> arrayList;
        super.Y(j2);
        if (this.f3614g >= 0 && (arrayList = this.N) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.N.get(i2).Y(j2);
            }
        }
        return this;
    }

    /* renamed from: p0 */
    public q a0(TimeInterpolator timeInterpolator) {
        this.R |= 1;
        ArrayList<m> arrayList = this.N;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.N.get(i2).a0(timeInterpolator);
            }
        }
        super.a0(timeInterpolator);
        return this;
    }

    /* renamed from: q */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.N = new ArrayList<>();
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            qVar.j0(this.N.get(i2).clone());
        }
        return qVar;
    }

    public q q0(int i2) {
        if (i2 == 0) {
            this.O = true;
        } else if (i2 == 1) {
            this.O = false;
        } else {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i2);
        }
        return this;
    }

    /* renamed from: r0 */
    public q d0(long j2) {
        super.d0(j2);
        return this;
    }

    /* access modifiers changed from: protected */
    public void s(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long C = C();
        int size = this.N.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.N.get(i2);
            if (C > 0 && (this.O || i2 == 0)) {
                long C2 = mVar.C();
                if (C2 > 0) {
                    mVar.d0(C2 + C);
                } else {
                    mVar.d0(C);
                }
            }
            mVar.s(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }
}
