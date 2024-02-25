package e.f.p;

import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;

public class c implements Spannable {

    /* renamed from: e  reason: collision with root package name */
    private final Spannable f3393e;

    /* renamed from: f  reason: collision with root package name */
    private final a f3394f;

    /* renamed from: g  reason: collision with root package name */
    private final PrecomputedText f3395g;

    public static final class a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;

        /* renamed from: d  reason: collision with root package name */
        private final int f3396d;

        /* renamed from: e.f.p.c$a$a  reason: collision with other inner class name */
        public static class C0077a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;

            /* renamed from: d  reason: collision with root package name */
            private int f3397d;

            public C0077a(TextPaint textPaint) {
                this.a = textPaint;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 23) {
                    this.c = 1;
                    this.f3397d = 1;
                } else {
                    this.f3397d = 0;
                    this.c = 0;
                }
                this.b = i2 >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
            }

            public a a() {
                return new a(this.a, this.b, this.c, this.f3397d);
            }

            public C0077a b(int i2) {
                this.c = i2;
                return this;
            }

            public C0077a c(int i2) {
                this.f3397d = i2;
                return this;
            }

            public C0077a d(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }
        }

        public a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.f3396d = params.getHyphenationFrequency();
            int i2 = Build.VERSION.SDK_INT;
        }

        a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i2, int i3) {
            if (Build.VERSION.SDK_INT >= 29) {
                new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i2).setHyphenationFrequency(i3).setTextDirection(textDirectionHeuristic).build();
            }
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = i2;
            this.f3396d = i3;
        }

        public boolean a(a aVar) {
            int i2 = Build.VERSION.SDK_INT;
            if ((i2 >= 23 && (this.c != aVar.b() || this.f3396d != aVar.c())) || this.a.getTextSize() != aVar.e().getTextSize() || this.a.getTextScaleX() != aVar.e().getTextScaleX() || this.a.getTextSkewX() != aVar.e().getTextSkewX()) {
                return false;
            }
            if ((i2 >= 21 && (this.a.getLetterSpacing() != aVar.e().getLetterSpacing() || !TextUtils.equals(this.a.getFontFeatureSettings(), aVar.e().getFontFeatureSettings()))) || this.a.getFlags() != aVar.e().getFlags()) {
                return false;
            }
            if (i2 >= 24) {
                if (!this.a.getTextLocales().equals(aVar.e().getTextLocales())) {
                    return false;
                }
            } else if (i2 >= 17 && !this.a.getTextLocale().equals(aVar.e().getTextLocale())) {
                return false;
            }
            return this.a.getTypeface() == null ? aVar.e().getTypeface() == null : this.a.getTypeface().equals(aVar.e().getTypeface());
        }

        public int b() {
            return this.c;
        }

        public int c() {
            return this.f3396d;
        }

        public TextDirectionHeuristic d() {
            return this.b;
        }

        public TextPaint e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (!a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.b == aVar.d();
        }

        public int hashCode() {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                return e.f.q.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocales(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f3396d));
            } else if (i2 >= 21) {
                return e.f.q.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Float.valueOf(this.a.getLetterSpacing()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), Boolean.valueOf(this.a.isElegantTextHeight()), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f3396d));
            } else if (i2 >= 18) {
                return e.f.q.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f3396d));
            } else if (i2 >= 17) {
                return e.f.q.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTextLocale(), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f3396d));
            } else {
                return e.f.q.c.b(Float.valueOf(this.a.getTextSize()), Float.valueOf(this.a.getTextScaleX()), Float.valueOf(this.a.getTextSkewX()), Integer.valueOf(this.a.getFlags()), this.a.getTypeface(), this.b, Integer.valueOf(this.c), Integer.valueOf(this.f3396d));
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x00df  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.String toString() {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "{"
                r0.<init>(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "textSize="
                r1.append(r2)
                android.text.TextPaint r2 = r4.a
                float r2 = r2.getTextSize()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textScaleX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.a
                float r2 = r2.getTextScaleX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textSkewX="
                r1.append(r2)
                android.text.TextPaint r2 = r4.a
                float r2 = r2.getTextSkewX()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                int r1 = android.os.Build.VERSION.SDK_INT
                r2 = 21
                if (r1 < r2) goto L_0x008f
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", letterSpacing="
                r2.append(r3)
                android.text.TextPaint r3 = r4.a
                float r3 = r3.getLetterSpacing()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", elegantTextHeight="
                r2.append(r3)
                android.text.TextPaint r3 = r4.a
                boolean r3 = r3.isElegantTextHeight()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
            L_0x008f:
                r2 = 24
                java.lang.String r3 = ", textLocale="
                if (r1 < r2) goto L_0x00ae
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.a
                android.os.LocaleList r3 = r3.getTextLocales()
            L_0x00a3:
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                goto L_0x00c1
            L_0x00ae:
                r2 = 17
                if (r1 < r2) goto L_0x00c1
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                r2.append(r3)
                android.text.TextPaint r3 = r4.a
                java.util.Locale r3 = r3.getTextLocale()
                goto L_0x00a3
            L_0x00c1:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = ", typeface="
                r2.append(r3)
                android.text.TextPaint r3 = r4.a
                android.graphics.Typeface r3 = r3.getTypeface()
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                r0.append(r2)
                r2 = 26
                if (r1 < r2) goto L_0x00f9
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", variationSettings="
                r1.append(r2)
                android.text.TextPaint r2 = r4.a
                java.lang.String r2 = r2.getFontVariationSettings()
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
            L_0x00f9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", textDir="
                r1.append(r2)
                android.text.TextDirectionHeuristic r2 = r4.b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", breakStrategy="
                r1.append(r2)
                int r2 = r4.c
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = ", hyphenationFrequency="
                r1.append(r2)
                int r2 = r4.f3396d
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: e.f.p.c.a.toString():java.lang.String");
        }
    }

    public a a() {
        return this.f3394f;
    }

    public PrecomputedText b() {
        Spannable spannable = this.f3393e;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i2) {
        return this.f3393e.charAt(i2);
    }

    public int getSpanEnd(Object obj) {
        return this.f3393e.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f3393e.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f3393e.getSpanStart(obj);
    }

    public <T> T[] getSpans(int i2, int i3, Class<T> cls) {
        return Build.VERSION.SDK_INT >= 29 ? this.f3395g.getSpans(i2, i3, cls) : this.f3393e.getSpans(i2, i3, cls);
    }

    public int length() {
        return this.f3393e.length();
    }

    public int nextSpanTransition(int i2, int i3, Class cls) {
        return this.f3393e.nextSpanTransition(i2, i3, cls);
    }

    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3395g.removeSpan(obj);
        } else {
            this.f3393e.removeSpan(obj);
        }
    }

    public void setSpan(Object obj, int i2, int i3, int i4) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f3395g.setSpan(obj, i2, i3, i4);
        } else {
            this.f3393e.setSpan(obj, i2, i3, i4);
        }
    }

    public CharSequence subSequence(int i2, int i3) {
        return this.f3393e.subSequence(i2, i3);
    }

    public String toString() {
        return this.f3393e.toString();
    }
}
