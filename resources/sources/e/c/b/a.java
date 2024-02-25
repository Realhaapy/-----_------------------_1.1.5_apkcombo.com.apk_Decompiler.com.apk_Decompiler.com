package e.c.b;

import android.os.Bundle;

public final class a {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    /* renamed from: e.c.b.a$a  reason: collision with other inner class name */
    public static final class C0065a {
        private Integer a;
        private Integer b;
        private Integer c;

        public a a() {
            return new a(this.a, this.b, this.c);
        }
    }

    a(Integer num, Integer num2, Integer num3) {
        this.a = num;
        this.b = num2;
        this.c = num3;
    }

    /* access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        return bundle;
    }
}
