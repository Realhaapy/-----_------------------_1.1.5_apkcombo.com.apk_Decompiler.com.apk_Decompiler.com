package com.android.installreferrer.api;

import android.content.Context;

public abstract class InstallReferrerClient {

    public static final class b {
        private final Context a;

        private b(Context context) {
            this.a = context;
        }

        public InstallReferrerClient a() {
            Context context = this.a;
            if (context != null) {
                return new a(context);
            }
            throw new IllegalArgumentException("Please provide a valid Context.");
        }
    }

    public static b b(Context context) {
        return new b(context);
    }

    public abstract ReferrerDetails a();

    public abstract void c(InstallReferrerStateListener installReferrerStateListener);
}
