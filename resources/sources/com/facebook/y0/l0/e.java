package com.facebook.y0.l0;

import m.y.d.g;
import m.y.d.l;

public enum e {
    ANON_ID("anon_id"),
    APP_USER_ID("app_user_id"),
    ADVERTISER_ID("advertiser_id"),
    PAGE_ID("page_id"),
    PAGE_SCOPED_USER_ID("page_scoped_user_id"),
    USER_DATA("ud"),
    ADV_TE("advertiser_tracking_enabled"),
    APP_TE("application_tracking_enabled"),
    CONSIDER_VIEWS("consider_views"),
    DEVICE_TOKEN("device_token"),
    EXT_INFO("extInfo"),
    INCLUDE_DWELL_DATA("include_dwell_data"),
    INCLUDE_VIDEO_DATA("include_video_data"),
    INSTALL_REFERRER("install_referrer"),
    INSTALLER_PACKAGE("installer_package"),
    RECEIPT_DATA("receipt_data"),
    URL_SCHEMES("url_schemes");
    

    /* renamed from: f  reason: collision with root package name */
    public static final a f1870f = null;

    /* renamed from: e  reason: collision with root package name */
    private final String f1884e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final e a(String str) {
            l.d(str, "rawValue");
            for (e eVar : e.values()) {
                if (l.a(eVar.c(), str)) {
                    return eVar;
                }
            }
            return null;
        }
    }

    static {
        f1870f = new a((g) null);
    }

    private e(String str) {
        this.f1884e = str;
    }

    public final String c() {
        return this.f1884e;
    }
}
