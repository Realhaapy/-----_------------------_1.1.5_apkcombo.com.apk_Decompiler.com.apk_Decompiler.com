package com.facebook.internal;

import android.content.Context;
import com.facebook.g0;
import com.facebook.internal.b0;
import e.a.j;
import java.util.HashMap;
import java.util.Map;
import m.y.d.g;
import m.y.d.l;

public final class a0 {
    public static final a0 a = new a0();
    private static final Map<b, String[]> b = new HashMap();

    public interface a {
        void a(boolean z);
    }

    public enum b {
        Unknown(-1),
        Core(0),
        AppEvents(65536),
        CodelessEvents(65792),
        CloudBridge(67584),
        RestrictiveDataFiltering(66048),
        AAM(66304),
        PrivacyProtection(66560),
        SuggestedEvents(66561),
        IntelligentIntegrity(66562),
        ModelRequest(66563),
        EventDeactivation(66816),
        OnDeviceEventProcessing(67072),
        OnDevicePostInstallEventProcessing(67073),
        IapLogging(67328),
        IapLoggingLib2(67329),
        Instrument(131072),
        CrashReport(131328),
        CrashShield(131329),
        ThreadCheck(131330),
        ErrorReport(131584),
        AnrReport(131840),
        Monitoring(196608),
        ServiceUpdateCompliance(196864),
        Login(16777216),
        ChromeCustomTabsPrefetching(16842752),
        IgnoreAppSwitchToLoggedOut(16908288),
        BypassAppSwitch(16973824),
        Share(33554432);
        

        /* renamed from: f  reason: collision with root package name */
        public static final a f1400f = null;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final int f1414e;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(g gVar) {
                this();
            }

            public final b a(int i2) {
                b[] values = b.values();
                int length = values.length;
                int i3 = 0;
                while (i3 < length) {
                    b bVar = values[i3];
                    i3++;
                    if (bVar.f1414e == i2) {
                        return bVar;
                    }
                }
                return b.Unknown;
            }
        }

        /* renamed from: com.facebook.internal.a0$b$b  reason: collision with other inner class name */
        public /* synthetic */ class C0025b {
            public static final /* synthetic */ int[] a = null;

            static {
                int[] iArr = new int[b.values().length];
                iArr[b.Core.ordinal()] = 1;
                iArr[b.AppEvents.ordinal()] = 2;
                iArr[b.CodelessEvents.ordinal()] = 3;
                iArr[b.RestrictiveDataFiltering.ordinal()] = 4;
                iArr[b.Instrument.ordinal()] = 5;
                iArr[b.CrashReport.ordinal()] = 6;
                iArr[b.CrashShield.ordinal()] = 7;
                iArr[b.ThreadCheck.ordinal()] = 8;
                iArr[b.ErrorReport.ordinal()] = 9;
                iArr[b.AnrReport.ordinal()] = 10;
                iArr[b.AAM.ordinal()] = 11;
                iArr[b.CloudBridge.ordinal()] = 12;
                iArr[b.PrivacyProtection.ordinal()] = 13;
                iArr[b.SuggestedEvents.ordinal()] = 14;
                iArr[b.IntelligentIntegrity.ordinal()] = 15;
                iArr[b.ModelRequest.ordinal()] = 16;
                iArr[b.EventDeactivation.ordinal()] = 17;
                iArr[b.OnDeviceEventProcessing.ordinal()] = 18;
                iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 19;
                iArr[b.IapLogging.ordinal()] = 20;
                iArr[b.IapLoggingLib2.ordinal()] = 21;
                iArr[b.Monitoring.ordinal()] = 22;
                iArr[b.ServiceUpdateCompliance.ordinal()] = 23;
                iArr[b.Login.ordinal()] = 24;
                iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 25;
                iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 26;
                iArr[b.BypassAppSwitch.ordinal()] = 27;
                iArr[b.Share.ordinal()] = 28;
                a = iArr;
            }
        }

        static {
            f1400f = new a((g) null);
        }

        private b(int i2) {
            this.f1414e = i2;
        }

        public final b d() {
            a aVar;
            int i2;
            int i3;
            int i4 = this.f1414e;
            if ((i4 & 255) > 0) {
                aVar = f1400f;
                i3 = i4 & -256;
            } else {
                if ((65280 & i4) > 0) {
                    aVar = f1400f;
                    i2 = -65536;
                } else if ((16711680 & i4) <= 0) {
                    return f1400f.a(0);
                } else {
                    aVar = f1400f;
                    i2 = -16777216;
                }
                i3 = i4 & i2;
            }
            return aVar.a(i3);
        }

        public final String f() {
            return l.j("FBSDKFeature", this);
        }

        public String toString() {
            switch (C0025b.a[ordinal()]) {
                case 1:
                    return "CoreKit";
                case 2:
                    return "AppEvents";
                case 3:
                    return "CodelessEvents";
                case 4:
                    return "RestrictiveDataFiltering";
                case 5:
                    return "Instrument";
                case 6:
                    return "CrashReport";
                case 7:
                    return "CrashShield";
                case 8:
                    return "ThreadCheck";
                case 9:
                    return "ErrorReport";
                case 10:
                    return "AnrReport";
                case 11:
                    return "AAM";
                case 12:
                    return "AppEventsCloudbridge";
                case 13:
                    return "PrivacyProtection";
                case 14:
                    return "SuggestedEvents";
                case 15:
                    return "IntelligentIntegrity";
                case 16:
                    return "ModelRequest";
                case 17:
                    return "EventDeactivation";
                case 18:
                    return "OnDeviceEventProcessing";
                case 19:
                    return "OnDevicePostInstallEventProcessing";
                case 20:
                    return "IAPLogging";
                case 21:
                    return "IAPLoggingLib2";
                case 22:
                    return "Monitoring";
                case j.b3 /*23*/:
                    return "ServiceUpdateCompliance";
                case j.c3 /*24*/:
                    return "LoginKit";
                case 25:
                    return "ChromeCustomTabsPrefetching";
                case 26:
                    return "IgnoreAppSwitchToLoggedOut";
                case 27:
                    return "BypassAppSwitch";
                case 28:
                    return "ShareKit";
                default:
                    return "unknown";
            }
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            iArr[b.RestrictiveDataFiltering.ordinal()] = 1;
            iArr[b.Instrument.ordinal()] = 2;
            iArr[b.CrashReport.ordinal()] = 3;
            iArr[b.CrashShield.ordinal()] = 4;
            iArr[b.ThreadCheck.ordinal()] = 5;
            iArr[b.ErrorReport.ordinal()] = 6;
            iArr[b.AnrReport.ordinal()] = 7;
            iArr[b.AAM.ordinal()] = 8;
            iArr[b.CloudBridge.ordinal()] = 9;
            iArr[b.PrivacyProtection.ordinal()] = 10;
            iArr[b.SuggestedEvents.ordinal()] = 11;
            iArr[b.IntelligentIntegrity.ordinal()] = 12;
            iArr[b.ModelRequest.ordinal()] = 13;
            iArr[b.EventDeactivation.ordinal()] = 14;
            iArr[b.OnDeviceEventProcessing.ordinal()] = 15;
            iArr[b.OnDevicePostInstallEventProcessing.ordinal()] = 16;
            iArr[b.IapLogging.ordinal()] = 17;
            iArr[b.IapLoggingLib2.ordinal()] = 18;
            iArr[b.ChromeCustomTabsPrefetching.ordinal()] = 19;
            iArr[b.Monitoring.ordinal()] = 20;
            iArr[b.IgnoreAppSwitchToLoggedOut.ordinal()] = 21;
            iArr[b.BypassAppSwitch.ordinal()] = 22;
            a = iArr;
        }
    }

    public static final class d implements b0.a {
        final /* synthetic */ a a;
        final /* synthetic */ b b;

        d(a aVar, b bVar) {
            this.a = aVar;
            this.b = bVar;
        }

        public void a() {
            a aVar = this.a;
            a0 a0Var = a0.a;
            aVar.a(a0.g(this.b));
        }
    }

    private a0() {
    }

    public static final void a(b bVar, a aVar) {
        l.d(bVar, "feature");
        l.d(aVar, "callback");
        b0 b0Var = b0.a;
        b0.h(new d(aVar, bVar));
    }

    private final boolean b(b bVar) {
        switch (c.a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
                return false;
            default:
                return true;
        }
    }

    public static final void c(b bVar) {
        l.d(bVar, "feature");
        g0 g0Var = g0.a;
        g0.c().getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).edit().putString(bVar.f(), g0.r()).apply();
    }

    public static final b d(String str) {
        l.d(str, "className");
        a.f();
        for (Map.Entry next : b.entrySet()) {
            b bVar = (b) next.getKey();
            String[] strArr = (String[]) next.getValue();
            int length = strArr.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    String str2 = strArr[i2];
                    i2++;
                    if (p.t(str, str2, false, 2, (Object) null)) {
                        return bVar;
                    }
                }
            }
        }
        return b.Unknown;
    }

    private final boolean e(b bVar) {
        boolean b2 = b(bVar);
        b0 b0Var = b0.a;
        String f2 = bVar.f();
        g0 g0Var = g0.a;
        return b0.b(f2, g0.d(), b2);
    }

    private final synchronized void f() {
        Map<b, String[]> map = b;
        if (map.isEmpty()) {
            map.put(b.AAM, new String[]{"com.facebook.appevents.aam."});
            map.put(b.CodelessEvents, new String[]{"com.facebook.appevents.codeless."});
            map.put(b.CloudBridge, new String[]{"com.facebook.appevents.cloudbridge."});
            map.put(b.ErrorReport, new String[]{"com.facebook.internal.instrument.errorreport."});
            map.put(b.AnrReport, new String[]{"com.facebook.internal.instrument.anrreport."});
            map.put(b.PrivacyProtection, new String[]{"com.facebook.appevents.ml."});
            map.put(b.SuggestedEvents, new String[]{"com.facebook.appevents.suggestedevents."});
            map.put(b.RestrictiveDataFiltering, new String[]{"com.facebook.appevents.restrictivedatafilter.RestrictiveDataManager"});
            map.put(b.IntelligentIntegrity, new String[]{"com.facebook.appevents.integrity.IntegrityManager"});
            map.put(b.EventDeactivation, new String[]{"com.facebook.appevents.eventdeactivation."});
            map.put(b.OnDeviceEventProcessing, new String[]{"com.facebook.appevents.ondeviceprocessing."});
            map.put(b.IapLogging, new String[]{"com.facebook.appevents.iap."});
            map.put(b.Monitoring, new String[]{"com.facebook.internal.logging.monitor"});
        }
    }

    public static final boolean g(b bVar) {
        l.d(bVar, "feature");
        if (b.Unknown == bVar) {
            return false;
        }
        if (b.Core == bVar) {
            return true;
        }
        g0 g0Var = g0.a;
        Context c2 = g0.c();
        a0 a0Var = a;
        String string = c2.getSharedPreferences("com.facebook.internal.FEATURE_MANAGER", 0).getString(bVar.f(), (String) null);
        if (string != null && l.a(string, g0.r())) {
            return false;
        }
        b d2 = bVar.d();
        return d2 == bVar ? a0Var.e(bVar) : g(d2) && a0Var.e(bVar);
    }
}
