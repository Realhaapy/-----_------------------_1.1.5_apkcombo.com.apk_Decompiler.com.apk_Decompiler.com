package com.facebook.y0.l0;

import m.y.d.g;
import m.y.d.l;

public enum m {
    EVENT_TIME("_logTime"),
    EVENT_NAME("_eventName"),
    VALUE_TO_SUM("_valueToSum"),
    CONTENT_IDS("fb_content_id"),
    CONTENTS("fb_content"),
    CONTENT_TYPE("fb_content_type"),
    DESCRIPTION("fb_description"),
    LEVEL("fb_level"),
    MAX_RATING_VALUE("fb_max_rating_value"),
    NUM_ITEMS("fb_num_items"),
    PAYMENT_INFO_AVAILABLE("fb_payment_info_available"),
    REGISTRATION_METHOD("fb_registration_method"),
    SEARCH_STRING("fb_search_string"),
    SUCCESS("fb_success"),
    ORDER_ID("fb_order_id"),
    AD_TYPE("ad_type"),
    CURRENCY("fb_currency");
    

    /* renamed from: f  reason: collision with root package name */
    public static final a f1952f = null;

    /* renamed from: e  reason: collision with root package name */
    private final String f1966e;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final m a(String str) {
            l.d(str, "rawValue");
            for (m mVar : m.values()) {
                if (l.a(mVar.c(), str)) {
                    return mVar;
                }
            }
            return null;
        }
    }

    static {
        f1952f = new a((g) null);
    }

    private m(String str) {
        this.f1966e = str;
    }

    public final String c() {
        return this.f1966e;
    }
}
