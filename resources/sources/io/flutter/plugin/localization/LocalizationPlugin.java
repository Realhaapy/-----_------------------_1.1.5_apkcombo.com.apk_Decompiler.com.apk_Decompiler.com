package io.flutter.plugin.localization;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class LocalizationPlugin {
    /* access modifiers changed from: private */
    public final Context context;
    private final LocalizationChannel localizationChannel;
    @SuppressLint({"AppBundleLocaleChanges"})
    final LocalizationChannel.LocalizationMessageHandler localizationMessageHandler;

    public LocalizationPlugin(Context context2, LocalizationChannel localizationChannel2) {
        AnonymousClass1 r0 = new LocalizationChannel.LocalizationMessageHandler() {
            /* JADX WARNING: Removed duplicated region for block: B:10:0x006a  */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0061  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public java.lang.String getStringResource(java.lang.String r9, java.lang.String r10) {
                /*
                    r8 = this;
                    int r0 = android.os.Build.VERSION.SDK_INT
                    io.flutter.plugin.localization.LocalizationPlugin r1 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r1 = r1.context
                    r2 = 17
                    r3 = 0
                    if (r10 == 0) goto L_0x004a
                    java.util.Locale r4 = io.flutter.plugin.localization.LocalizationPlugin.localeFromString(r10)
                    if (r0 < r2) goto L_0x0034
                    android.content.res.Configuration r1 = new android.content.res.Configuration
                    io.flutter.plugin.localization.LocalizationPlugin r5 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r5 = r5.context
                    android.content.res.Resources r5 = r5.getResources()
                    android.content.res.Configuration r5 = r5.getConfiguration()
                    r1.<init>(r5)
                    r1.setLocale(r4)
                    io.flutter.plugin.localization.LocalizationPlugin r4 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r4 = r4.context
                    android.content.Context r1 = r4.createConfigurationContext(r1)
                    goto L_0x004a
                L_0x0034:
                    io.flutter.plugin.localization.LocalizationPlugin r5 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r5 = r5.context
                    android.content.res.Resources r5 = r5.getResources()
                    android.content.res.Configuration r6 = r5.getConfiguration()
                    java.util.Locale r7 = r6.locale
                    r6.locale = r4
                    r5.updateConfiguration(r6, r3)
                    goto L_0x004b
                L_0x004a:
                    r7 = r3
                L_0x004b:
                    io.flutter.plugin.localization.LocalizationPlugin r4 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r4 = r4.context
                    java.lang.String r4 = r4.getPackageName()
                    android.content.res.Resources r5 = r1.getResources()
                    java.lang.String r6 = "string"
                    int r9 = r5.getIdentifier(r9, r6, r4)
                    if (r9 == 0) goto L_0x006a
                    android.content.res.Resources r1 = r1.getResources()
                    java.lang.String r9 = r1.getString(r9)
                    goto L_0x006b
                L_0x006a:
                    r9 = r3
                L_0x006b:
                    if (r10 == 0) goto L_0x0082
                    if (r0 >= r2) goto L_0x0082
                    io.flutter.plugin.localization.LocalizationPlugin r10 = io.flutter.plugin.localization.LocalizationPlugin.this
                    android.content.Context r10 = r10.context
                    android.content.res.Resources r10 = r10.getResources()
                    android.content.res.Configuration r0 = r10.getConfiguration()
                    r0.locale = r7
                    r10.updateConfiguration(r0, r3)
                L_0x0082:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.plugin.localization.LocalizationPlugin.AnonymousClass1.getStringResource(java.lang.String, java.lang.String):java.lang.String");
            }
        };
        this.localizationMessageHandler = r0;
        this.context = context2;
        this.localizationChannel = localizationChannel2;
        localizationChannel2.setLocalizationMessageHandler(r0);
    }

    public static Locale localeFromString(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i2 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i2 = 2;
        }
        if (split.length > i2 && split[i2].length() >= 2 && split[i2].length() <= 3) {
            str4 = split[i2];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale resolveNativeLocale(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList locales = this.context.getResources().getConfiguration().getLocales();
            int size = locales.size();
            for (int i3 = 0; i3 < size; i3++) {
                Locale locale = locales.get(i3);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale lookup = Locale.lookup(arrayList, list);
            if (lookup != null) {
                return lookup;
            }
        } else if (i2 >= 24) {
            LocaleList locales2 = this.context.getResources().getConfiguration().getLocales();
            for (int i4 = 0; i4 < locales2.size(); i4++) {
                Locale locale2 = locales2.get(i4);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
        } else {
            Locale locale3 = this.context.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void sendLocalesToFlutter(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList locales = configuration.getLocales();
            int size = locales.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(locales.get(i2));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.localizationChannel.sendLocales(arrayList);
    }
}
