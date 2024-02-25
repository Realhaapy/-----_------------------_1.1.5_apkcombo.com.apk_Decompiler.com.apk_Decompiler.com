package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.app.l;
import androidx.core.graphics.drawable.IconCompat;
import e.e.b;
import e.f.j.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class m implements k {
    private final Context a;
    private final Notification.Builder b;
    private final l.e c;

    /* renamed from: d  reason: collision with root package name */
    private RemoteViews f855d;

    /* renamed from: e  reason: collision with root package name */
    private RemoteViews f856e;

    /* renamed from: f  reason: collision with root package name */
    private final List<Bundle> f857f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final Bundle f858g = new Bundle();

    /* renamed from: h  reason: collision with root package name */
    private int f859h;

    /* renamed from: i  reason: collision with root package name */
    private RemoteViews f860i;

    m(l.e eVar) {
        Notification.Builder builder;
        int i2;
        Icon icon;
        List<String> e2;
        String str;
        Bundle bundle;
        int i3 = Build.VERSION.SDK_INT;
        this.c = eVar;
        this.a = eVar.a;
        Context context = eVar.a;
        if (i3 >= 26) {
            String str2 = eVar.L;
        } else {
            builder = new Notification.Builder(context);
        }
        this.b = builder;
        Notification notification = eVar.U;
        this.b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, eVar.f834i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(eVar.f830e).setContentText(eVar.f831f).setContentInfo(eVar.f836k).setContentIntent(eVar.f832g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(eVar.f833h, (notification.flags & 128) != 0).setLargeIcon(eVar.f835j).setNumber(eVar.f837l).setProgress(eVar.u, eVar.v, eVar.w);
        if (i3 < 21) {
            this.b.setSound(notification.sound, notification.audioStreamType);
        }
        if (i3 >= 16) {
            this.b.setSubText(eVar.f843r).setUsesChronometer(eVar.f840o).setPriority(eVar.f838m);
            Iterator<l.a> it = eVar.b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = eVar.E;
            if (bundle2 != null) {
                this.f858g.putAll(bundle2);
            }
            if (i3 < 20) {
                if (eVar.A) {
                    this.f858g.putBoolean("android.support.localOnly", true);
                }
                String str3 = eVar.x;
                if (str3 != null) {
                    this.f858g.putString("android.support.groupKey", str3);
                    if (eVar.y) {
                        bundle = this.f858g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f858g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str4 = eVar.z;
                if (str4 != null) {
                    this.f858g.putString("android.support.sortKey", str4);
                }
            }
            this.f855d = eVar.I;
            this.f856e = eVar.J;
        }
        if (i3 >= 17) {
            this.b.setShowWhen(eVar.f839n);
        }
        if (i3 >= 19 && i3 < 21 && (e2 = e(g(eVar.c), eVar.X)) != null && !e2.isEmpty()) {
            this.f858g.putStringArray("android.people", (String[]) e2.toArray(new String[e2.size()]));
        }
        if (i3 >= 20) {
            this.b.setLocalOnly(eVar.A).setGroup(eVar.x).setGroupSummary(eVar.y).setSortKey(eVar.z);
            this.f859h = eVar.Q;
        }
        if (i3 >= 21) {
            this.b.setCategory(eVar.D).setColor(eVar.F).setVisibility(eVar.G).setPublicVersion(eVar.H).setSound(notification.sound, notification.audioAttributes);
            List<String> e3 = i3 < 28 ? e(g(eVar.c), eVar.X) : eVar.X;
            if (e3 != null && !e3.isEmpty()) {
                for (String addPerson : e3) {
                    this.b.addPerson(addPerson);
                }
            }
            this.f860i = eVar.K;
            if (eVar.f829d.size() > 0) {
                Bundle bundle3 = eVar.f().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int i4 = 0; i4 < eVar.f829d.size(); i4++) {
                    bundle5.putBundle(Integer.toString(i4), n.b(eVar.f829d.get(i4)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                eVar.f().putBundle("android.car.EXTENSIONS", bundle3);
                this.f858g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (i3 >= 23 && (icon = eVar.W) != null) {
            this.b.setSmallIcon(icon);
        }
        if (i3 >= 24) {
            this.b.setExtras(eVar.E).setRemoteInputHistory(eVar.t);
            RemoteViews remoteViews = eVar.I;
            if (remoteViews != null) {
                this.b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = eVar.J;
            if (remoteViews2 != null) {
                this.b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = eVar.K;
            if (remoteViews3 != null) {
                this.b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (i3 >= 26) {
            this.b.setBadgeIconType(eVar.M).setSettingsText(eVar.f844s).setShortcutId(eVar.N).setTimeoutAfter(eVar.P).setGroupAlertBehavior(eVar.Q);
            if (eVar.C) {
                this.b.setColorized(eVar.B);
            }
            if (!TextUtils.isEmpty(eVar.L)) {
                this.b.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
        if (i3 >= 28) {
            Iterator<p> it2 = eVar.c.iterator();
            while (it2.hasNext()) {
                this.b.addPerson(it2.next().j());
            }
        }
        if (i3 >= 29) {
            this.b.setAllowSystemGeneratedContextualActions(eVar.S);
            this.b.setBubbleMetadata(l.d.c(eVar.T));
            c cVar = eVar.O;
            if (cVar != null) {
                cVar.a();
                throw null;
            }
        }
        if (i3 >= 31 && (i2 = eVar.R) != 0) {
            this.b.setForegroundServiceBehavior(i2);
        }
        if (eVar.V) {
            if (this.c.y) {
                this.f859h = 2;
            } else {
                this.f859h = 1;
            }
            this.b.setVibrate((long[]) null);
            this.b.setSound((Uri) null);
            int i5 = notification.defaults & -2;
            notification.defaults = i5;
            int i6 = i5 & -3;
            notification.defaults = i6;
            this.b.setDefaults(i6);
            if (i3 >= 26) {
                if (TextUtils.isEmpty(this.c.x)) {
                    this.b.setGroup("silent");
                }
                this.b.setGroupAlertBehavior(this.f859h);
            }
        }
    }

    private void b(l.a aVar) {
        Notification.Action.Builder builder;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 20) {
            IconCompat f2 = aVar.f();
            if (i2 >= 23) {
                builder = new Notification.Action.Builder(f2 != null ? f2.y() : null, aVar.j(), aVar.a());
            } else {
                builder = new Notification.Action.Builder(f2 != null ? f2.n() : 0, aVar.j(), aVar.a());
            }
            if (aVar.g() != null) {
                for (RemoteInput addRemoteInput : q.b(aVar.g())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
            if (i2 >= 24) {
                builder.setAllowGeneratedReplies(aVar.b());
            }
            bundle.putInt("android.support.action.semanticAction", aVar.h());
            if (i2 >= 28) {
                builder.setSemanticAction(aVar.h());
            }
            if (i2 >= 29) {
                builder.setContextual(aVar.l());
            }
            if (i2 >= 31) {
                builder.setAuthenticationRequired(aVar.k());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", aVar.i());
            builder.addExtras(bundle);
            this.b.addAction(builder.build());
        } else if (i2 >= 16) {
            this.f857f.add(n.f(this.b, aVar));
        }
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        b bVar = new b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> g(List<p> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (p i2 : list) {
            arrayList.add(i2.i());
        }
        return arrayList;
    }

    private void h(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int i2 = notification.defaults & -2;
        notification.defaults = i2;
        notification.defaults = i2 & -3;
    }

    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle a2;
        RemoteViews u;
        RemoteViews s2;
        l.i iVar = this.c.f842q;
        if (iVar != null) {
            iVar.b(this);
        }
        RemoteViews t = iVar != null ? iVar.t(this) : null;
        Notification d2 = d();
        if (!(t == null && (t = this.c.I) == null)) {
            d2.contentView = t;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (!(i2 < 16 || iVar == null || (s2 = iVar.s(this)) == null)) {
            d2.bigContentView = s2;
        }
        if (!(i2 < 21 || iVar == null || (u = this.c.f842q.u(this)) == null)) {
            d2.headsUpContentView = u;
        }
        if (!(i2 < 16 || iVar == null || (a2 = l.a(d2)) == null)) {
            iVar.a(a2);
        }
        return d2;
    }

    /* access modifiers changed from: protected */
    public Notification d() {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            return this.b.build();
        }
        if (i2 >= 24) {
            Notification build = this.b.build();
            if (this.f859h != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.f859h != 2)) {
                    h(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f859h == 1) {
                    h(build);
                }
            }
            return build;
        } else if (i2 >= 21) {
            this.b.setExtras(this.f858g);
            Notification build2 = this.b.build();
            RemoteViews remoteViews = this.f855d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f856e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f860i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f859h != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.f859h != 2)) {
                    h(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f859h == 1) {
                    h(build2);
                }
            }
            return build2;
        } else if (i2 >= 20) {
            this.b.setExtras(this.f858g);
            Notification build3 = this.b.build();
            RemoteViews remoteViews4 = this.f855d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f856e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f859h != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.f859h != 2)) {
                    h(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f859h == 1) {
                    h(build3);
                }
            }
            return build3;
        } else if (i2 >= 19) {
            SparseArray<Bundle> a2 = n.a(this.f857f);
            if (a2 != null) {
                this.f858g.putSparseParcelableArray("android.support.actionExtras", a2);
            }
            this.b.setExtras(this.f858g);
            Notification build4 = this.b.build();
            RemoteViews remoteViews6 = this.f855d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f856e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (i2 < 16) {
            return this.b.getNotification();
        } else {
            Notification build5 = this.b.build();
            Bundle a3 = l.a(build5);
            Bundle bundle = new Bundle(this.f858g);
            for (String str : this.f858g.keySet()) {
                if (a3.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            a3.putAll(bundle);
            SparseArray<Bundle> a4 = n.a(this.f857f);
            if (a4 != null) {
                l.a(build5).putSparseParcelableArray("android.support.actionExtras", a4);
            }
            RemoteViews remoteViews8 = this.f855d;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.f856e;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    /* access modifiers changed from: package-private */
    public Context f() {
        return this.a;
    }
}
