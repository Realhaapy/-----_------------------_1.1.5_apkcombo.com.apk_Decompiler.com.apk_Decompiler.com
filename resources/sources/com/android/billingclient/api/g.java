package com.android.billingclient.api;

import android.text.TextUtils;
import f.e.a.c.d.d.b0;
import java.util.ArrayList;
import java.util.List;

public class g {
    /* access modifiers changed from: private */
    public boolean a;
    /* access modifiers changed from: private */
    public String b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f1292d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public b0 f1293e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1294f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f1295g;

    public static class a {
        private String a;
        private String b;
        private List c;

        /* renamed from: d  reason: collision with root package name */
        private ArrayList f1296d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1297e;

        /* renamed from: f  reason: collision with root package name */
        private c.a f1298f;

        /* synthetic */ a(k0 k0Var) {
            c.a a2 = c.a();
            c.a unused = a2.b = true;
            this.f1298f = a2;
        }

        public g a() {
            ArrayList arrayList;
            ArrayList arrayList2 = this.f1296d;
            boolean z = true;
            int i2 = 0;
            boolean z2 = arrayList2 != null && !arrayList2.isEmpty();
            List list = this.c;
            boolean z3 = list != null && !list.isEmpty();
            if (!z2 && !z3) {
                throw new IllegalArgumentException("Details of the products must be provided.");
            } else if (z2 && z3) {
                throw new IllegalArgumentException("Set SkuDetails or ProductDetailsParams, not both.");
            } else if (!z2) {
                b bVar = (b) this.c.get(0);
                while (i2 < this.c.size()) {
                    b bVar2 = (b) this.c.get(i2);
                    if (bVar2 == null) {
                        throw new IllegalArgumentException("ProductDetailsParams cannot be null.");
                    } else if (i2 == 0) {
                        i2++;
                    } else {
                        bVar2.a().b();
                        throw null;
                    }
                }
                bVar.a().c();
                throw null;
            } else if (!this.f1296d.contains((Object) null)) {
                if (this.f1296d.size() > 1) {
                    SkuDetails skuDetails = (SkuDetails) this.f1296d.get(0);
                    String o2 = skuDetails.o();
                    ArrayList arrayList3 = this.f1296d;
                    int size = arrayList3.size();
                    int i3 = 0;
                    while (i3 < size) {
                        SkuDetails skuDetails2 = (SkuDetails) arrayList3.get(i3);
                        if (o2.equals("play_pass_subs") || skuDetails2.o().equals("play_pass_subs") || o2.equals(skuDetails2.o())) {
                            i3++;
                        } else {
                            throw new IllegalArgumentException("SKUs should have the same type.");
                        }
                    }
                    String s2 = skuDetails.s();
                    ArrayList arrayList4 = this.f1296d;
                    int size2 = arrayList4.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        SkuDetails skuDetails3 = (SkuDetails) arrayList4.get(i4);
                        if (o2.equals("play_pass_subs") || skuDetails3.o().equals("play_pass_subs") || s2.equals(skuDetails3.s())) {
                            i4++;
                        } else {
                            throw new IllegalArgumentException("All SKUs must have the same package name.");
                        }
                    }
                }
                g gVar = new g((n0) null);
                if (!z2 || ((SkuDetails) this.f1296d.get(0)).s().isEmpty()) {
                    if (!z3) {
                        z = false;
                    } else {
                        ((b) this.c.get(0)).a().c();
                        throw null;
                    }
                }
                gVar.a = z;
                gVar.b = this.a;
                gVar.c = this.b;
                gVar.f1292d = this.f1298f.a();
                ArrayList arrayList5 = this.f1296d;
                if (arrayList5 == null) {
                    arrayList = new ArrayList();
                }
                gVar.f1294f = arrayList;
                gVar.f1295g = this.f1297e;
                List list2 = this.c;
                gVar.f1293e = list2 != null ? b0.r(list2) : b0.s();
                return gVar;
            } else {
                throw new IllegalArgumentException("SKU cannot be null.");
            }
        }

        public a b(String str) {
            this.a = str;
            return this;
        }

        public a c(String str) {
            this.b = str;
            return this;
        }

        @Deprecated
        public a d(SkuDetails skuDetails) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(skuDetails);
            this.f1296d = arrayList;
            return this;
        }

        public a e(c cVar) {
            this.f1298f = c.c(cVar);
            return this;
        }
    }

    public static final class b {
        private final m a;

        public final m a() {
            return this.a;
        }
    }

    public static class c {
        /* access modifiers changed from: private */
        public String a;
        /* access modifiers changed from: private */
        public int b = 0;

        public static class a {
            private String a;
            /* access modifiers changed from: private */
            public boolean b;
            private int c = 0;

            /* synthetic */ a(l0 l0Var) {
            }

            public c a() {
                boolean z = !TextUtils.isEmpty(this.a) || !TextUtils.isEmpty((CharSequence) null);
                boolean isEmpty = true ^ TextUtils.isEmpty((CharSequence) null);
                if (z && isEmpty) {
                    throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                } else if (this.b || z || isEmpty) {
                    c cVar = new c((m0) null);
                    cVar.a = this.a;
                    cVar.b = this.c;
                    return cVar;
                } else {
                    throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                }
            }

            public a b(String str) {
                this.a = str;
                return this;
            }

            @Deprecated
            public a c(String str) {
                this.a = str;
                return this;
            }

            public a d(int i2) {
                this.c = i2;
                return this;
            }

            @Deprecated
            public a e(int i2) {
                this.c = i2;
                return this;
            }
        }

        /* synthetic */ c(m0 m0Var) {
        }

        public static a a() {
            return new a((l0) null);
        }

        static /* bridge */ /* synthetic */ a c(c cVar) {
            a a2 = a();
            a2.c(cVar.a);
            a2.e(cVar.b);
            return a2;
        }

        /* access modifiers changed from: package-private */
        public final int b() {
            return this.b;
        }

        /* access modifiers changed from: package-private */
        public final String d() {
            return this.a;
        }
    }

    /* synthetic */ g(n0 n0Var) {
    }

    public static a a() {
        return new a((k0) null);
    }

    public final int b() {
        return this.f1292d.b();
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.f1292d.d();
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f1294f);
        return arrayList;
    }

    public final List g() {
        return this.f1293e;
    }

    public final boolean o() {
        return this.f1295g;
    }

    /* access modifiers changed from: package-private */
    public final boolean p() {
        return (this.b == null && this.c == null && this.f1292d.b() == 0 && !this.a && !this.f1295g) ? false : true;
    }
}
