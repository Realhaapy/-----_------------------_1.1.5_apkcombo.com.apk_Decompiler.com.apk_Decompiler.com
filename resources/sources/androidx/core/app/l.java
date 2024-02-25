package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.widget.RemoteViews;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class l {

    public static class a {
        final Bundle a;
        private IconCompat b;
        private final q[] c;

        /* renamed from: d  reason: collision with root package name */
        private final q[] f814d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f815e;

        /* renamed from: f  reason: collision with root package name */
        boolean f816f;

        /* renamed from: g  reason: collision with root package name */
        private final int f817g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f818h;
        @Deprecated

        /* renamed from: i  reason: collision with root package name */
        public int f819i;

        /* renamed from: j  reason: collision with root package name */
        public CharSequence f820j;

        /* renamed from: k  reason: collision with root package name */
        public PendingIntent f821k;

        /* renamed from: l  reason: collision with root package name */
        private boolean f822l;

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i2 != 0 ? IconCompat.l((Resources) null, "", i2) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (q[]) null, (q[]) null, true, 0, true, false, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, q[] qVarArr, q[] qVarArr2, boolean z, int i2, boolean z2, boolean z3, boolean z4) {
            this.f816f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.q() == 2) {
                this.f819i = iconCompat.n();
            }
            this.f820j = e.j(charSequence);
            this.f821k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = qVarArr;
            this.f814d = qVarArr2;
            this.f815e = z;
            this.f817g = i2;
            this.f816f = z2;
            this.f818h = z3;
            this.f822l = z4;
        }

        public PendingIntent a() {
            return this.f821k;
        }

        public boolean b() {
            return this.f815e;
        }

        public q[] c() {
            return this.f814d;
        }

        public Bundle d() {
            return this.a;
        }

        @Deprecated
        public int e() {
            return this.f819i;
        }

        public IconCompat f() {
            int i2;
            if (this.b == null && (i2 = this.f819i) != 0) {
                this.b = IconCompat.l((Resources) null, "", i2);
            }
            return this.b;
        }

        public q[] g() {
            return this.c;
        }

        public int h() {
            return this.f817g;
        }

        public boolean i() {
            return this.f816f;
        }

        public CharSequence j() {
            return this.f820j;
        }

        public boolean k() {
            return this.f822l;
        }

        public boolean l() {
            return this.f818h;
        }
    }

    public static class b extends i {

        /* renamed from: e  reason: collision with root package name */
        private Bitmap f823e;

        /* renamed from: f  reason: collision with root package name */
        private IconCompat f824f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f825g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f826h;

        /* renamed from: i  reason: collision with root package name */
        private boolean f827i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Bitmap bitmap) {
                bigPictureStyle.bigLargeIcon(bitmap);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setSummaryText(charSequence);
            }
        }

        /* renamed from: androidx.core.app.l$b$b  reason: collision with other inner class name */
        private static class C0015b {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        private static class c {
            static void a(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        private static IconCompat x(Parcelable parcelable) {
            if (parcelable == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 23 && (parcelable instanceof Icon)) {
                return IconCompat.c((Icon) parcelable);
            }
            if (parcelable instanceof Bitmap) {
                return IconCompat.g((Bitmap) parcelable);
            }
            return null;
        }

        public b A(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public b B(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f854d = true;
            return this;
        }

        public void b(k kVar) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(kVar.a()).setBigContentTitle(this.b).bigPicture(this.f823e);
                if (this.f825g) {
                    IconCompat iconCompat = this.f824f;
                    Context context = null;
                    if (iconCompat != null) {
                        if (i2 >= 23) {
                            if (kVar instanceof m) {
                                context = ((m) kVar).f();
                            }
                            C0015b.a(bigPicture, this.f824f.z(context));
                        } else if (iconCompat.q() == 1) {
                            a.a(bigPicture, this.f824f.m());
                        }
                    }
                    a.a(bigPicture, (Bitmap) null);
                }
                if (this.f854d) {
                    a.b(bigPicture, this.c);
                }
                if (i2 >= 31) {
                    c.b(bigPicture, this.f827i);
                    c.a(bigPicture, this.f826h);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            if (bundle.containsKey("android.largeIcon.big")) {
                this.f824f = x(bundle.getParcelable("android.largeIcon.big"));
                this.f825g = true;
            }
            this.f823e = (Bitmap) bundle.getParcelable("android.picture");
            this.f827i = bundle.getBoolean("android.showBigPictureWhenCollapsed");
        }

        public b y(Bitmap bitmap) {
            this.f824f = bitmap == null ? null : IconCompat.g(bitmap);
            this.f825g = true;
            return this;
        }

        public b z(Bitmap bitmap) {
            this.f823e = bitmap;
            return this;
        }
    }

    public static class c extends i {

        /* renamed from: e  reason: collision with root package name */
        private CharSequence f828e;

        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f828e);
            }
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(kVar.a()).setBigContentTitle(this.b).bigText(this.f828e);
                if (this.f854d) {
                    bigText.setSummaryText(this.c);
                }
            }
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            this.f828e = bundle.getCharSequence("android.bigText");
        }

        public c x(CharSequence charSequence) {
            this.f828e = e.j(charSequence);
            return this;
        }

        public c y(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public c z(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f854d = true;
            return this;
        }
    }

    public static final class d {

        private static class a {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.a();
                throw null;
            }
        }

        private static class b {
            static Notification.BubbleMetadata a(d dVar) {
                if (dVar == null) {
                    return null;
                }
                dVar.b();
                throw null;
            }
        }

        public static Notification.BubbleMetadata c(d dVar) {
            if (dVar == null) {
                return null;
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 30) {
                return b.a(dVar);
            }
            if (i2 == 29) {
                return a.a(dVar);
            }
            return null;
        }

        @SuppressLint({"InvalidNullConversion"})
        public PendingIntent a() {
            throw null;
        }

        public String b() {
            throw null;
        }
    }

    public static class e {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        e.f.j.c O;
        long P;
        int Q;
        int R;
        boolean S;
        d T;
        Notification U;
        boolean V;
        Icon W;
        @Deprecated
        public ArrayList<String> X;
        public Context a;
        public ArrayList<a> b;
        public ArrayList<p> c;

        /* renamed from: d  reason: collision with root package name */
        ArrayList<a> f829d;

        /* renamed from: e  reason: collision with root package name */
        CharSequence f830e;

        /* renamed from: f  reason: collision with root package name */
        CharSequence f831f;

        /* renamed from: g  reason: collision with root package name */
        PendingIntent f832g;

        /* renamed from: h  reason: collision with root package name */
        PendingIntent f833h;

        /* renamed from: i  reason: collision with root package name */
        RemoteViews f834i;

        /* renamed from: j  reason: collision with root package name */
        Bitmap f835j;

        /* renamed from: k  reason: collision with root package name */
        CharSequence f836k;

        /* renamed from: l  reason: collision with root package name */
        int f837l;

        /* renamed from: m  reason: collision with root package name */
        int f838m;

        /* renamed from: n  reason: collision with root package name */
        boolean f839n;

        /* renamed from: o  reason: collision with root package name */
        boolean f840o;

        /* renamed from: p  reason: collision with root package name */
        boolean f841p;

        /* renamed from: q  reason: collision with root package name */
        i f842q;

        /* renamed from: r  reason: collision with root package name */
        CharSequence f843r;

        /* renamed from: s  reason: collision with root package name */
        CharSequence f844s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;

        @Deprecated
        public e(Context context) {
            this(context, (String) null);
        }

        public e(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.f829d = new ArrayList<>();
            this.f839n = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.f838m = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        protected static CharSequence j(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private Bitmap k(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(e.f.c.b);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(e.f.c.a);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        private void v(int i2, boolean z2) {
            Notification notification;
            int i3;
            if (z2) {
                notification = this.U;
                i3 = i2 | notification.flags;
            } else {
                notification = this.U;
                i3 = (~i2) & notification.flags;
            }
            notification.flags = i3;
        }

        public e A(Bitmap bitmap) {
            this.f835j = k(bitmap);
            return this;
        }

        public e B(int i2, int i3, int i4) {
            Notification notification = this.U;
            notification.ledARGB = i2;
            notification.ledOnMS = i3;
            notification.ledOffMS = i4;
            notification.flags = ((i3 == 0 || i4 == 0) ? 0 : 1) | (notification.flags & -2);
            return this;
        }

        public e C(boolean z2) {
            this.A = z2;
            return this;
        }

        public e D(int i2) {
            this.f837l = i2;
            return this;
        }

        public e E(boolean z2) {
            v(2, z2);
            return this;
        }

        public e F(boolean z2) {
            v(8, z2);
            return this;
        }

        public e G(int i2) {
            this.f838m = i2;
            return this;
        }

        public e H(int i2, int i3, boolean z2) {
            this.u = i2;
            this.v = i3;
            this.w = z2;
            return this;
        }

        public e I(String str) {
            this.N = str;
            return this;
        }

        public e J(boolean z2) {
            this.f839n = z2;
            return this;
        }

        public e K(int i2) {
            this.U.icon = i2;
            return this;
        }

        public e L(Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public e M(i iVar) {
            if (this.f842q != iVar) {
                this.f842q = iVar;
                if (iVar != null) {
                    iVar.w(this);
                }
            }
            return this;
        }

        public e N(CharSequence charSequence) {
            this.f843r = j(charSequence);
            return this;
        }

        public e O(CharSequence charSequence) {
            this.U.tickerText = j(charSequence);
            return this;
        }

        public e P(long j2) {
            this.P = j2;
            return this;
        }

        public e Q(boolean z2) {
            this.f840o = z2;
            return this;
        }

        public e R(long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        public e S(int i2) {
            this.G = i2;
            return this;
        }

        public e T(long j2) {
            this.U.when = j2;
            return this;
        }

        public e a(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new a(i2, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new m(this).c();
        }

        public RemoteViews c() {
            return this.J;
        }

        public int d() {
            return this.F;
        }

        public RemoteViews e() {
            return this.I;
        }

        public Bundle f() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public RemoteViews g() {
            return this.K;
        }

        public int h() {
            return this.f838m;
        }

        public long i() {
            if (this.f839n) {
                return this.U.when;
            }
            return 0;
        }

        public e l(boolean z2) {
            v(16, z2);
            return this;
        }

        public e m(String str) {
            this.D = str;
            return this;
        }

        public e n(String str) {
            this.L = str;
            return this;
        }

        public e o(int i2) {
            this.F = i2;
            return this;
        }

        public e p(boolean z2) {
            this.B = z2;
            this.C = true;
            return this;
        }

        public e q(PendingIntent pendingIntent) {
            this.f832g = pendingIntent;
            return this;
        }

        public e r(CharSequence charSequence) {
            this.f831f = j(charSequence);
            return this;
        }

        public e s(CharSequence charSequence) {
            this.f830e = j(charSequence);
            return this;
        }

        public e t(int i2) {
            Notification notification = this.U;
            notification.defaults = i2;
            if ((i2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public e u(PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        public e w(PendingIntent pendingIntent, boolean z2) {
            this.f833h = pendingIntent;
            v(128, z2);
            return this;
        }

        public e x(String str) {
            this.x = str;
            return this;
        }

        public e y(int i2) {
            this.Q = i2;
            return this;
        }

        public e z(boolean z2) {
            this.y = z2;
            return this;
        }
    }

    public static class f extends i {
        private RemoteViews x(RemoteViews remoteViews, boolean z) {
            int min;
            boolean z2 = true;
            int i2 = 0;
            RemoteViews c = c(true, e.f.g.c, false);
            c.removeAllViews(e.f.e.f3301f);
            List<a> z3 = z(this.a.b);
            if (!z || z3 == null || (min = Math.min(z3.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int i3 = 0; i3 < min; i3++) {
                    c.addView(e.f.e.f3301f, y(z3.get(i3)));
                }
            }
            if (!z2) {
                i2 = 8;
            }
            c.setViewVisibility(e.f.e.f3301f, i2);
            c.setViewVisibility(e.f.e.c, i2);
            d(c, remoteViews);
            return c;
        }

        private RemoteViews y(a aVar) {
            boolean z = aVar.f821k == null;
            RemoteViews remoteViews = new RemoteViews(this.a.a.getPackageName(), z ? e.f.g.b : e.f.g.a);
            IconCompat f2 = aVar.f();
            if (f2 != null) {
                remoteViews.setImageViewBitmap(e.f.e.f3299d, m(f2, this.a.a.getResources().getColor(e.f.b.a)));
            }
            remoteViews.setTextViewText(e.f.e.f3300e, aVar.f820j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(e.f.e.b, aVar.f821k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(e.f.e.b, aVar.f820j);
            }
            return remoteViews;
        }

        private static List<a> z(List<a> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (a next : list) {
                if (!next.l()) {
                    arrayList.add(next);
                }
            }
            return arrayList;
        }

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                kVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        public RemoteViews s(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews c = this.a.c();
            if (c == null) {
                c = this.a.e();
            }
            if (c == null) {
                return null;
            }
            return x(c, true);
        }

        public RemoteViews t(k kVar) {
            if (Build.VERSION.SDK_INT < 24 && this.a.e() != null) {
                return x(this.a.e(), false);
            }
            return null;
        }

        public RemoteViews u(k kVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews g2 = this.a.g();
            RemoteViews e2 = g2 != null ? g2 : this.a.e();
            if (g2 == null) {
                return null;
            }
            return x(e2, true);
        }
    }

    public static class g extends i {

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<CharSequence> f845e = new ArrayList<>();

        public void b(k kVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(kVar.a()).setBigContentTitle(this.b);
                if (this.f854d) {
                    bigContentTitle.setSummaryText(this.c);
                }
                Iterator<CharSequence> it = this.f845e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            super.v(bundle);
            this.f845e.clear();
            if (bundle.containsKey("android.textLines")) {
                Collections.addAll(this.f845e, bundle.getCharSequenceArray("android.textLines"));
            }
        }

        public g x(CharSequence charSequence) {
            if (charSequence != null) {
                this.f845e.add(e.j(charSequence));
            }
            return this;
        }

        public g y(CharSequence charSequence) {
            this.b = e.j(charSequence);
            return this;
        }

        public g z(CharSequence charSequence) {
            this.c = e.j(charSequence);
            this.f854d = true;
            return this;
        }
    }

    public static class h extends i {

        /* renamed from: e  reason: collision with root package name */
        private final List<a> f846e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        private final List<a> f847f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        private p f848g;

        /* renamed from: h  reason: collision with root package name */
        private CharSequence f849h;

        /* renamed from: i  reason: collision with root package name */
        private Boolean f850i;

        public static final class a {
            private final CharSequence a;
            private final long b;
            private final p c;

            /* renamed from: d  reason: collision with root package name */
            private Bundle f851d = new Bundle();

            /* renamed from: e  reason: collision with root package name */
            private String f852e;

            /* renamed from: f  reason: collision with root package name */
            private Uri f853f;

            public a(CharSequence charSequence, long j2, p pVar) {
                this.a = charSequence;
                this.b = j2;
                this.c = pVar;
            }

            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    bundleArr[i2] = list.get(i2).l();
                }
                return bundleArr;
            }

            static a e(Bundle bundle) {
                p pVar;
                try {
                    if (bundle.containsKey("text")) {
                        if (bundle.containsKey("time")) {
                            if (bundle.containsKey("person")) {
                                pVar = p.b(bundle.getBundle("person"));
                            } else if (bundle.containsKey("sender_person") && Build.VERSION.SDK_INT >= 28) {
                                pVar = p.a((Person) bundle.getParcelable("sender_person"));
                            } else if (bundle.containsKey("sender")) {
                                p.b bVar = new p.b();
                                bVar.f(bundle.getCharSequence("sender"));
                                pVar = bVar.a();
                            } else {
                                pVar = null;
                            }
                            a aVar = new a(bundle.getCharSequence("text"), bundle.getLong("time"), pVar);
                            if (bundle.containsKey("type") && bundle.containsKey("uri")) {
                                aVar.j(bundle.getString("type"), (Uri) bundle.getParcelable("uri"));
                            }
                            if (bundle.containsKey("extras")) {
                                aVar.d().putAll(bundle.getBundle("extras"));
                            }
                            return aVar;
                        }
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            static List<a> f(Parcelable[] parcelableArr) {
                a e2;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int i2 = 0; i2 < parcelableArr.length; i2++) {
                    if ((parcelableArr[i2] instanceof Bundle) && (e2 = e(parcelableArr[i2])) != null) {
                        arrayList.add(e2);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.b);
                p pVar = this.c;
                if (pVar != null) {
                    bundle.putCharSequence("sender", pVar.e());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable("sender_person", this.c.j());
                    } else {
                        bundle.putBundle("person", this.c.k());
                    }
                }
                String str = this.f852e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f853f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.f851d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.f852e;
            }

            public Uri c() {
                return this.f853f;
            }

            public Bundle d() {
                return this.f851d;
            }

            public p g() {
                return this.c;
            }

            public CharSequence h() {
                return this.a;
            }

            public long i() {
                return this.b;
            }

            public a j(String str, Uri uri) {
                this.f852e = str;
                this.f853f = uri;
                return this;
            }

            /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: android.app.Person} */
            /* JADX WARNING: type inference failed for: r2v0 */
            /* JADX WARNING: type inference failed for: r2v2, types: [java.lang.CharSequence] */
            /* JADX WARNING: type inference failed for: r2v6 */
            /* JADX WARNING: type inference failed for: r2v7 */
            /* access modifiers changed from: package-private */
            /* JADX WARNING: Multi-variable type inference failed */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public android.app.Notification.MessagingStyle.Message k() {
                /*
                    r6 = this;
                    androidx.core.app.p r0 = r6.g()
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 0
                    r3 = 28
                    if (r1 < r3) goto L_0x0020
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.h()
                    long r4 = r6.i()
                    if (r0 != 0) goto L_0x0018
                    goto L_0x001c
                L_0x0018:
                    android.app.Person r2 = r0.j()
                L_0x001c:
                    r1.<init>(r3, r4, r2)
                    goto L_0x0034
                L_0x0020:
                    android.app.Notification$MessagingStyle$Message r1 = new android.app.Notification$MessagingStyle$Message
                    java.lang.CharSequence r3 = r6.h()
                    long r4 = r6.i()
                    if (r0 != 0) goto L_0x002d
                    goto L_0x0031
                L_0x002d:
                    java.lang.CharSequence r2 = r0.e()
                L_0x0031:
                    r1.<init>(r3, r4, r2)
                L_0x0034:
                    java.lang.String r0 = r6.b()
                    if (r0 == 0) goto L_0x0045
                    java.lang.String r0 = r6.b()
                    android.net.Uri r2 = r6.c()
                    r1.setData(r0, r2)
                L_0x0045:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.h.a.k():android.app.Notification$MessagingStyle$Message");
            }
        }

        h() {
        }

        public h(p pVar) {
            if (!TextUtils.isEmpty(pVar.e())) {
                this.f848g = pVar;
                return;
            }
            throw new IllegalArgumentException("User's name must not be empty.");
        }

        private boolean D() {
            for (int size = this.f846e.size() - 1; size >= 0; size--) {
                a aVar = this.f846e.get(size);
                if (aVar.g() != null && aVar.g().e() == null) {
                    return true;
                }
            }
            return false;
        }

        private TextAppearanceSpan F(int i2) {
            return new TextAppearanceSpan((String) null, 0, 0, ColorStateList.valueOf(i2), (ColorStateList) null);
        }

        private CharSequence G(a aVar) {
            e.f.p.a c = e.f.p.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int i2 = z ? -16777216 : -1;
            CharSequence charSequence = "";
            CharSequence e2 = aVar.g() == null ? charSequence : aVar.g().e();
            if (TextUtils.isEmpty(e2)) {
                e2 = this.f848g.e();
                if (z && this.a.d() != 0) {
                    i2 = this.a.d();
                }
            }
            CharSequence h2 = c.h(e2);
            spannableStringBuilder.append(h2);
            spannableStringBuilder.setSpan(F(i2), spannableStringBuilder.length() - h2.length(), spannableStringBuilder.length(), 33);
            if (aVar.h() != null) {
                charSequence = aVar.h();
            }
            spannableStringBuilder.append("  ").append(c.h(charSequence));
            return spannableStringBuilder;
        }

        public static h y(Notification notification) {
            i p2 = i.p(notification);
            if (p2 instanceof h) {
                return (h) p2;
            }
            return null;
        }

        private a z() {
            for (int size = this.f846e.size() - 1; size >= 0; size--) {
                a aVar = this.f846e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().e())) {
                    return aVar;
                }
            }
            if (this.f846e.isEmpty()) {
                return null;
            }
            List<a> list = this.f846e;
            return list.get(list.size() - 1);
        }

        public CharSequence A() {
            return this.f849h;
        }

        public List<a> B() {
            return this.f846e;
        }

        public p C() {
            return this.f848g;
        }

        public boolean E() {
            e eVar = this.a;
            if (eVar != null && eVar.a.getApplicationInfo().targetSdkVersion < 28 && this.f850i == null) {
                return this.f849h != null;
            }
            Boolean bool = this.f850i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public h H(CharSequence charSequence) {
            this.f849h = charSequence;
            return this;
        }

        public h I(boolean z) {
            this.f850i = Boolean.valueOf(z);
            return this;
        }

        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.f848g.e());
            bundle.putBundle("android.messagingStyleUser", this.f848g.k());
            bundle.putCharSequence("android.hiddenConversationTitle", this.f849h);
            if (this.f849h != null && this.f850i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.f849h);
            }
            if (!this.f846e.isEmpty()) {
                bundle.putParcelableArray("android.messages", a.a(this.f846e));
            }
            if (!this.f847f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", a.a(this.f847f));
            }
            Boolean bool = this.f850i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:34:0x00b9  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
        /* JADX WARNING: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void b(androidx.core.app.k r8) {
            /*
                r7 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                boolean r1 = r7.E()
                r7.I(r1)
                r1 = 24
                if (r0 < r1) goto L_0x007f
                r1 = 28
                android.app.Notification$MessagingStyle r2 = new android.app.Notification$MessagingStyle
                androidx.core.app.p r3 = r7.f848g
                if (r0 < r1) goto L_0x001d
                android.app.Person r3 = r3.j()
                r2.<init>(r3)
                goto L_0x0024
            L_0x001d:
                java.lang.CharSequence r3 = r3.e()
                r2.<init>(r3)
            L_0x0024:
                java.util.List<androidx.core.app.l$h$a> r3 = r7.f846e
                java.util.Iterator r3 = r3.iterator()
            L_0x002a:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x003e
                java.lang.Object r4 = r3.next()
                androidx.core.app.l$h$a r4 = (androidx.core.app.l.h.a) r4
                android.app.Notification$MessagingStyle$Message r4 = r4.k()
                r2.addMessage(r4)
                goto L_0x002a
            L_0x003e:
                r3 = 26
                if (r0 < r3) goto L_0x005c
                java.util.List<androidx.core.app.l$h$a> r3 = r7.f847f
                java.util.Iterator r3 = r3.iterator()
            L_0x0048:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x005c
                java.lang.Object r4 = r3.next()
                androidx.core.app.l$h$a r4 = (androidx.core.app.l.h.a) r4
                android.app.Notification$MessagingStyle$Message r4 = r4.k()
                r2.addHistoricMessage(r4)
                goto L_0x0048
            L_0x005c:
                java.lang.Boolean r3 = r7.f850i
                boolean r3 = r3.booleanValue()
                if (r3 != 0) goto L_0x0066
                if (r0 < r1) goto L_0x006b
            L_0x0066:
                java.lang.CharSequence r3 = r7.f849h
                r2.setConversationTitle(r3)
            L_0x006b:
                if (r0 < r1) goto L_0x0076
                java.lang.Boolean r0 = r7.f850i
                boolean r0 = r0.booleanValue()
                r2.setGroupConversation(r0)
            L_0x0076:
                android.app.Notification$Builder r8 = r8.a()
                r2.setBuilder(r8)
                goto L_0x0127
            L_0x007f:
                androidx.core.app.l$h$a r1 = r7.z()
                java.lang.CharSequence r2 = r7.f849h
                if (r2 == 0) goto L_0x0099
                java.lang.Boolean r2 = r7.f850i
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L_0x0099
                android.app.Notification$Builder r2 = r8.a()
                java.lang.CharSequence r3 = r7.f849h
            L_0x0095:
                r2.setContentTitle(r3)
                goto L_0x00b7
            L_0x0099:
                if (r1 == 0) goto L_0x00b7
                android.app.Notification$Builder r2 = r8.a()
                java.lang.String r3 = ""
                r2.setContentTitle(r3)
                androidx.core.app.p r2 = r1.g()
                if (r2 == 0) goto L_0x00b7
                android.app.Notification$Builder r2 = r8.a()
                androidx.core.app.p r3 = r1.g()
                java.lang.CharSequence r3 = r3.e()
                goto L_0x0095
            L_0x00b7:
                if (r1 == 0) goto L_0x00cd
                android.app.Notification$Builder r2 = r8.a()
                java.lang.CharSequence r3 = r7.f849h
                if (r3 == 0) goto L_0x00c6
                java.lang.CharSequence r1 = r7.G(r1)
                goto L_0x00ca
            L_0x00c6:
                java.lang.CharSequence r1 = r1.h()
            L_0x00ca:
                r2.setContentText(r1)
            L_0x00cd:
                r1 = 16
                if (r0 < r1) goto L_0x0127
                android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
                r0.<init>()
                java.lang.CharSequence r1 = r7.f849h
                r2 = 0
                r3 = 1
                if (r1 != 0) goto L_0x00e5
                boolean r1 = r7.D()
                if (r1 == 0) goto L_0x00e3
                goto L_0x00e5
            L_0x00e3:
                r1 = 0
                goto L_0x00e6
            L_0x00e5:
                r1 = 1
            L_0x00e6:
                java.util.List<androidx.core.app.l$h$a> r4 = r7.f846e
                int r4 = r4.size()
                int r4 = r4 - r3
            L_0x00ed:
                if (r4 < 0) goto L_0x0116
                java.util.List<androidx.core.app.l$h$a> r5 = r7.f846e
                java.lang.Object r5 = r5.get(r4)
                androidx.core.app.l$h$a r5 = (androidx.core.app.l.h.a) r5
                if (r1 == 0) goto L_0x00fe
                java.lang.CharSequence r5 = r7.G(r5)
                goto L_0x0102
            L_0x00fe:
                java.lang.CharSequence r5 = r5.h()
            L_0x0102:
                java.util.List<androidx.core.app.l$h$a> r6 = r7.f846e
                int r6 = r6.size()
                int r6 = r6 - r3
                if (r4 == r6) goto L_0x0110
                java.lang.String r6 = "\n"
                r0.insert(r2, r6)
            L_0x0110:
                r0.insert(r2, r5)
                int r4 = r4 + -1
                goto L_0x00ed
            L_0x0116:
                android.app.Notification$BigTextStyle r1 = new android.app.Notification$BigTextStyle
                android.app.Notification$Builder r8 = r8.a()
                r1.<init>(r8)
                r8 = 0
                android.app.Notification$BigTextStyle r8 = r1.setBigContentTitle(r8)
                r8.bigText(r0)
            L_0x0127:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.h.b(androidx.core.app.k):void");
        }

        /* access modifiers changed from: protected */
        public String q() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            p pVar;
            super.v(bundle);
            this.f846e.clear();
            if (bundle.containsKey("android.messagingStyleUser")) {
                pVar = p.b(bundle.getBundle("android.messagingStyleUser"));
            } else {
                p.b bVar = new p.b();
                bVar.f(bundle.getString("android.selfDisplayName"));
                pVar = bVar.a();
            }
            this.f848g = pVar;
            CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
            this.f849h = charSequence;
            if (charSequence == null) {
                this.f849h = bundle.getCharSequence("android.hiddenConversationTitle");
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
            if (parcelableArray != null) {
                this.f846e.addAll(a.f(parcelableArray));
            }
            Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
            if (parcelableArray2 != null) {
                this.f847f.addAll(a.f(parcelableArray2));
            }
            if (bundle.containsKey("android.isGroupConversation")) {
                this.f850i = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
            }
        }

        public h x(a aVar) {
            if (aVar != null) {
                this.f846e.add(aVar);
                if (this.f846e.size() > 25) {
                    this.f846e.remove(0);
                }
            }
            return this;
        }
    }

    public static abstract class i {
        protected e a;
        CharSequence b;
        CharSequence c;

        /* renamed from: d  reason: collision with root package name */
        boolean f854d = false;

        private int e() {
            Resources resources = this.a.a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(e.f.c.f3295i);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(e.f.c.f3296j);
            float f2 = (f(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - f2) * ((float) dimensionPixelSize)) + (f2 * ((float) dimensionPixelSize2)));
        }

        private static float f(float f2, float f3, float f4) {
            return f2 < f3 ? f3 : f2 > f4 ? f4 : f2;
        }

        static i g(String str) {
            if (str == null) {
                return null;
            }
            str.hashCode();
            char c2 = 65535;
            switch (str.hashCode()) {
                case -716705180:
                    if (str.equals("androidx.core.app.NotificationCompat$DecoratedCustomViewStyle")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -171946061:
                    if (str.equals("androidx.core.app.NotificationCompat$BigPictureStyle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 912942987:
                    if (str.equals("androidx.core.app.NotificationCompat$InboxStyle")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 919595044:
                    if (str.equals("androidx.core.app.NotificationCompat$BigTextStyle")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 2090799565:
                    if (str.equals("androidx.core.app.NotificationCompat$MessagingStyle")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new f();
                case 1:
                    return new b();
                case 2:
                    return new g();
                case 3:
                    return new c();
                case 4:
                    return new h();
                default:
                    return null;
            }
        }

        private static i h(String str) {
            int i2;
            if (str != null && (i2 = Build.VERSION.SDK_INT) >= 16) {
                if (str.equals(Notification.BigPictureStyle.class.getName())) {
                    return new b();
                }
                if (str.equals(Notification.BigTextStyle.class.getName())) {
                    return new c();
                }
                if (str.equals(Notification.InboxStyle.class.getName())) {
                    return new g();
                }
                if (i2 >= 24) {
                    if (str.equals(Notification.MessagingStyle.class.getName())) {
                        return new h();
                    }
                    if (str.equals(Notification.DecoratedCustomViewStyle.class.getName())) {
                        return new f();
                    }
                }
            }
            return null;
        }

        static i i(Bundle bundle) {
            i g2 = g(bundle.getString("androidx.core.app.extra.COMPAT_TEMPLATE"));
            return g2 != null ? g2 : (bundle.containsKey("android.selfDisplayName") || bundle.containsKey("android.messagingStyleUser")) ? new h() : bundle.containsKey("android.picture") ? new b() : bundle.containsKey("android.bigText") ? new c() : bundle.containsKey("android.textLines") ? new g() : h(bundle.getString("android.template"));
        }

        static i j(Bundle bundle) {
            i i2 = i(bundle);
            if (i2 == null) {
                return null;
            }
            try {
                i2.v(bundle);
                return i2;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        private Bitmap l(int i2, int i3, int i4) {
            return n(IconCompat.k(this.a.a, i2), i3, i4);
        }

        private Bitmap n(IconCompat iconCompat, int i2, int i3) {
            Drawable t = iconCompat.t(this.a.a);
            int intrinsicWidth = i3 == 0 ? t.getIntrinsicWidth() : i3;
            if (i3 == 0) {
                i3 = t.getIntrinsicHeight();
            }
            Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, i3, Bitmap.Config.ARGB_8888);
            t.setBounds(0, 0, intrinsicWidth, i3);
            if (i2 != 0) {
                t.mutate().setColorFilter(new PorterDuffColorFilter(i2, PorterDuff.Mode.SRC_IN));
            }
            t.draw(new Canvas(createBitmap));
            return createBitmap;
        }

        private Bitmap o(int i2, int i3, int i4, int i5) {
            int i6 = e.f.d.c;
            if (i5 == 0) {
                i5 = 0;
            }
            Bitmap l2 = l(i6, i5, i3);
            Canvas canvas = new Canvas(l2);
            Drawable mutate = this.a.a.getResources().getDrawable(i2).mutate();
            mutate.setFilterBitmap(true);
            int i7 = (i3 - i4) / 2;
            int i8 = i4 + i7;
            mutate.setBounds(i7, i7, i8, i8);
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            mutate.draw(canvas);
            return l2;
        }

        public static i p(Notification notification) {
            Bundle a2 = l.a(notification);
            if (a2 == null) {
                return null;
            }
            return j(a2);
        }

        private void r(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(e.f.e.G, 8);
            remoteViews.setViewVisibility(e.f.e.E, 8);
            remoteViews.setViewVisibility(e.f.e.D, 8);
        }

        public void a(Bundle bundle) {
            if (this.f854d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String q2 = q();
            if (q2 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", q2);
            }
        }

        public abstract void b(k kVar);

        /* JADX WARNING: Removed duplicated region for block: B:63:0x016c  */
        /* JADX WARNING: Removed duplicated region for block: B:64:0x0176  */
        /* JADX WARNING: Removed duplicated region for block: B:69:0x0182  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x01a4  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x01ea  */
        /* JADX WARNING: Removed duplicated region for block: B:85:0x01ef  */
        /* JADX WARNING: Removed duplicated region for block: B:86:0x01f1  */
        /* JADX WARNING: Removed duplicated region for block: B:89:0x01fb  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public android.widget.RemoteViews c(boolean r17, int r18, boolean r19) {
            /*
                r16 = this;
                r0 = r16
                androidx.core.app.l$e r1 = r0.a
                android.content.Context r1 = r1.a
                android.content.res.Resources r1 = r1.getResources()
                android.widget.RemoteViews r8 = new android.widget.RemoteViews
                androidx.core.app.l$e r2 = r0.a
                android.content.Context r2 = r2.a
                java.lang.String r2 = r2.getPackageName()
                r3 = r18
                r8.<init>(r2, r3)
                androidx.core.app.l$e r2 = r0.a
                int r2 = r2.h()
                r3 = -1
                r9 = 1
                r10 = 0
                if (r2 >= r3) goto L_0x0026
                r2 = 1
                goto L_0x0027
            L_0x0026:
                r2 = 0
            L_0x0027:
                int r11 = android.os.Build.VERSION.SDK_INT
                r4 = 21
                r12 = 16
                if (r11 < r12) goto L_0x004f
                if (r11 >= r4) goto L_0x004f
                java.lang.String r5 = "setBackgroundResource"
                if (r2 == 0) goto L_0x0041
                int r2 = e.f.e.f3307l
                int r6 = e.f.d.b
                r8.setInt(r2, r5, r6)
                int r2 = e.f.e.f3303h
                int r6 = e.f.d.f3298e
                goto L_0x004c
            L_0x0041:
                int r2 = e.f.e.f3307l
                int r6 = e.f.d.a
                r8.setInt(r2, r5, r6)
                int r2 = e.f.e.f3303h
                int r6 = e.f.d.f3297d
            L_0x004c:
                r8.setInt(r2, r5, r6)
            L_0x004f:
                androidx.core.app.l$e r2 = r0.a
                android.graphics.Bitmap r5 = r2.f835j
                r13 = 8
                if (r5 == 0) goto L_0x00ae
                int r2 = e.f.e.f3303h
                if (r11 < r12) goto L_0x0066
                r8.setViewVisibility(r2, r10)
                androidx.core.app.l$e r5 = r0.a
                android.graphics.Bitmap r5 = r5.f835j
                r8.setImageViewBitmap(r2, r5)
                goto L_0x0069
            L_0x0066:
                r8.setViewVisibility(r2, r13)
            L_0x0069:
                if (r17 == 0) goto L_0x00ec
                androidx.core.app.l$e r2 = r0.a
                android.app.Notification r2 = r2.U
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00ec
                int r2 = e.f.c.f3291e
                int r2 = r1.getDimensionPixelSize(r2)
                int r5 = e.f.c.f3292f
                int r5 = r1.getDimensionPixelSize(r5)
                int r5 = r5 * 2
                int r5 = r2 - r5
                if (r11 < r4) goto L_0x0099
                androidx.core.app.l$e r3 = r0.a
                android.app.Notification r6 = r3.U
                int r6 = r6.icon
                int r3 = r3.d()
                android.graphics.Bitmap r2 = r0.o(r6, r2, r5, r3)
                int r3 = e.f.e.f3310o
                r8.setImageViewBitmap(r3, r2)
                goto L_0x00a8
            L_0x0099:
                int r2 = e.f.e.f3310o
                androidx.core.app.l$e r5 = r0.a
                android.app.Notification r5 = r5.U
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.k(r5, r3)
                r8.setImageViewBitmap(r2, r3)
            L_0x00a8:
                int r2 = e.f.e.f3310o
                r8.setViewVisibility(r2, r10)
                goto L_0x00ec
            L_0x00ae:
                if (r17 == 0) goto L_0x00ec
                android.app.Notification r2 = r2.U
                int r2 = r2.icon
                if (r2 == 0) goto L_0x00ec
                int r2 = e.f.e.f3303h
                r8.setViewVisibility(r2, r10)
                if (r11 < r4) goto L_0x00df
                int r3 = e.f.c.f3290d
                int r3 = r1.getDimensionPixelSize(r3)
                int r5 = e.f.c.c
                int r5 = r1.getDimensionPixelSize(r5)
                int r3 = r3 - r5
                int r5 = e.f.c.f3293g
                int r5 = r1.getDimensionPixelSize(r5)
                androidx.core.app.l$e r6 = r0.a
                android.app.Notification r7 = r6.U
                int r7 = r7.icon
                int r6 = r6.d()
                android.graphics.Bitmap r3 = r0.o(r7, r3, r5, r6)
                goto L_0x00e9
            L_0x00df:
                androidx.core.app.l$e r5 = r0.a
                android.app.Notification r5 = r5.U
                int r5 = r5.icon
                android.graphics.Bitmap r3 = r0.k(r5, r3)
            L_0x00e9:
                r8.setImageViewBitmap(r2, r3)
            L_0x00ec:
                androidx.core.app.l$e r2 = r0.a
                java.lang.CharSequence r2 = r2.f830e
                if (r2 == 0) goto L_0x00f7
                int r3 = e.f.e.G
                r8.setTextViewText(r3, r2)
            L_0x00f7:
                androidx.core.app.l$e r2 = r0.a
                java.lang.CharSequence r2 = r2.f831f
                if (r2 == 0) goto L_0x0104
                int r3 = e.f.e.D
                r8.setTextViewText(r3, r2)
                r2 = 1
                goto L_0x0105
            L_0x0104:
                r2 = 0
            L_0x0105:
                if (r11 >= r4) goto L_0x010f
                androidx.core.app.l$e r3 = r0.a
                android.graphics.Bitmap r3 = r3.f835j
                if (r3 == 0) goto L_0x010f
                r3 = 1
                goto L_0x0110
            L_0x010f:
                r3 = 0
            L_0x0110:
                androidx.core.app.l$e r4 = r0.a
                java.lang.CharSequence r5 = r4.f836k
                if (r5 == 0) goto L_0x0121
                int r2 = e.f.e.f3304i
                r8.setTextViewText(r2, r5)
            L_0x011b:
                r8.setViewVisibility(r2, r10)
                r14 = 1
                r15 = 1
                goto L_0x0159
            L_0x0121:
                int r4 = r4.f837l
                if (r4 <= 0) goto L_0x0152
                int r2 = e.f.f.a
                int r2 = r1.getInteger(r2)
                androidx.core.app.l$e r3 = r0.a
                int r3 = r3.f837l
                if (r3 <= r2) goto L_0x013d
                int r2 = e.f.e.f3304i
                int r3 = e.f.h.a
                java.lang.String r3 = r1.getString(r3)
                r8.setTextViewText(r2, r3)
                goto L_0x014f
            L_0x013d:
                java.text.NumberFormat r2 = java.text.NumberFormat.getIntegerInstance()
                int r3 = e.f.e.f3304i
                androidx.core.app.l$e r4 = r0.a
                int r4 = r4.f837l
                long r4 = (long) r4
                java.lang.String r2 = r2.format(r4)
                r8.setTextViewText(r3, r2)
            L_0x014f:
                int r2 = e.f.e.f3304i
                goto L_0x011b
            L_0x0152:
                int r4 = e.f.e.f3304i
                r8.setViewVisibility(r4, r13)
                r14 = r2
                r15 = r3
            L_0x0159:
                androidx.core.app.l$e r2 = r0.a
                java.lang.CharSequence r2 = r2.f843r
                if (r2 == 0) goto L_0x017b
                if (r11 < r12) goto L_0x017b
                int r3 = e.f.e.D
                r8.setTextViewText(r3, r2)
                androidx.core.app.l$e r2 = r0.a
                java.lang.CharSequence r2 = r2.f831f
                if (r2 == 0) goto L_0x0176
                int r3 = e.f.e.E
                r8.setTextViewText(r3, r2)
                r8.setViewVisibility(r3, r10)
                r2 = 1
                goto L_0x017c
            L_0x0176:
                int r2 = e.f.e.E
                r8.setViewVisibility(r2, r13)
            L_0x017b:
                r2 = 0
            L_0x017c:
                if (r2 == 0) goto L_0x0198
                if (r11 < r12) goto L_0x0198
                if (r19 == 0) goto L_0x018e
                int r2 = e.f.c.f3294h
                int r1 = r1.getDimensionPixelSize(r2)
                float r1 = (float) r1
                int r2 = e.f.e.D
                r8.setTextViewTextSize(r2, r10, r1)
            L_0x018e:
                int r3 = e.f.e.f3305j
                r4 = 0
                r5 = 0
                r6 = 0
                r7 = 0
                r2 = r8
                r2.setViewPadding(r3, r4, r5, r6, r7)
            L_0x0198:
                androidx.core.app.l$e r1 = r0.a
                long r1 = r1.i()
                r3 = 0
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 == 0) goto L_0x01ea
                androidx.core.app.l$e r1 = r0.a
                boolean r1 = r1.f840o
                if (r1 == 0) goto L_0x01d9
                if (r11 < r12) goto L_0x01d9
                int r1 = e.f.e.f3302g
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.a
                long r2 = r2.i()
                long r4 = android.os.SystemClock.elapsedRealtime()
                long r6 = java.lang.System.currentTimeMillis()
                long r4 = r4 - r6
                long r2 = r2 + r4
                java.lang.String r4 = "setBase"
                r8.setLong(r1, r4, r2)
                java.lang.String r2 = "setStarted"
                r8.setBoolean(r1, r2, r9)
                androidx.core.app.l$e r2 = r0.a
                boolean r2 = r2.f841p
                if (r2 == 0) goto L_0x01eb
                r3 = 24
                if (r11 < r3) goto L_0x01eb
                r8.setChronometerCountDown(r1, r2)
                goto L_0x01eb
            L_0x01d9:
                int r1 = e.f.e.F
                r8.setViewVisibility(r1, r10)
                androidx.core.app.l$e r2 = r0.a
                long r2 = r2.i()
                java.lang.String r4 = "setTime"
                r8.setLong(r1, r4, r2)
                goto L_0x01eb
            L_0x01ea:
                r9 = r15
            L_0x01eb:
                int r1 = e.f.e.f3311p
                if (r9 == 0) goto L_0x01f1
                r2 = 0
                goto L_0x01f3
            L_0x01f1:
                r2 = 8
            L_0x01f3:
                r8.setViewVisibility(r1, r2)
                int r1 = e.f.e.f3306k
                if (r14 == 0) goto L_0x01fb
                goto L_0x01fd
            L_0x01fb:
                r10 = 8
            L_0x01fd:
                r8.setViewVisibility(r1, r10)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.l.i.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public void d(RemoteViews remoteViews, RemoteViews remoteViews2) {
            r(remoteViews);
            int i2 = e.f.e.f3308m;
            remoteViews.removeAllViews(i2);
            remoteViews.addView(i2, remoteViews2.clone());
            remoteViews.setViewVisibility(i2, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(e.f.e.f3309n, 0, e(), 0, 0);
            }
        }

        public Bitmap k(int i2, int i3) {
            return l(i2, i3, 0);
        }

        /* access modifiers changed from: package-private */
        public Bitmap m(IconCompat iconCompat, int i2) {
            return n(iconCompat, i2, 0);
        }

        /* access modifiers changed from: protected */
        public String q() {
            return null;
        }

        public RemoteViews s(k kVar) {
            return null;
        }

        public RemoteViews t(k kVar) {
            return null;
        }

        public RemoteViews u(k kVar) {
            return null;
        }

        /* access modifiers changed from: protected */
        public void v(Bundle bundle) {
            if (bundle.containsKey("android.summaryText")) {
                this.c = bundle.getCharSequence("android.summaryText");
                this.f854d = true;
            }
            this.b = bundle.getCharSequence("android.title.big");
        }

        public void w(e eVar) {
            if (this.a != eVar) {
                this.a = eVar;
                if (eVar != null) {
                    eVar.M(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 19) {
            return notification.extras;
        }
        if (i2 >= 16) {
            return n.c(notification);
        }
        return null;
    }
}
