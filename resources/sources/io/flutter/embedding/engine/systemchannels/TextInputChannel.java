package io.flutter.embedding.engine.systemchannels;

import android.os.Bundle;
import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.editing.TextEditingDelta;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TextInputChannel {
    private static final String TAG = "TextInputChannel";
    public final MethodChannel channel;
    final MethodChannel.MethodCallHandler parsingMethodHandler;
    /* access modifiers changed from: private */
    public TextInputMethodHandler textInputMethodHandler;

    public static class Configuration {
        public final String actionLabel;
        public final boolean autocorrect;
        public final Autofill autofill;
        public final boolean enableDeltaModel;
        public final boolean enableIMEPersonalizedLearning;
        public final boolean enableSuggestions;
        public final Configuration[] fields;
        public final Integer inputAction;
        public final InputType inputType;
        public final boolean obscureText;
        public final TextCapitalization textCapitalization;

        public static class Autofill {
            public final TextEditState editState;
            public final String hintText;
            public final String[] hints;
            public final String uniqueIdentifier;

            public Autofill(String str, String[] strArr, String str2, TextEditState textEditState) {
                this.uniqueIdentifier = str;
                this.hints = strArr;
                this.hintText = str2;
                this.editState = textEditState;
            }

            public static Autofill fromJson(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = translateAutofillHint(jSONArray.getString(i2));
                }
                return new Autofill(string, strArr, string2, TextEditState.fromJson(jSONObject2));
            }

            /* JADX WARNING: Can't fix incorrect switch cases order */
            /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a3, code lost:
                if (r0.equals("familyName") == false) goto L_0x002d;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            private static java.lang.String translateAutofillHint(java.lang.String r16) {
                /*
                    r0 = r16
                    int r1 = android.os.Build.VERSION.SDK_INT
                    r2 = 26
                    if (r1 >= r2) goto L_0x0009
                    return r0
                L_0x0009:
                    r16.hashCode()
                    int r3 = r16.hashCode()
                    java.lang.String r4 = "postalCode"
                    java.lang.String r5 = "postalAddress"
                    java.lang.String r6 = "password"
                    java.lang.String r7 = "newUsername"
                    java.lang.String r8 = "username"
                    java.lang.String r9 = "creditCardExpirationYear"
                    java.lang.String r10 = "creditCardExpirationDate"
                    java.lang.String r11 = "creditCardNumber"
                    java.lang.String r12 = "gender"
                    java.lang.String r13 = "creditCardExpirationDay"
                    java.lang.String r14 = "creditCardSecurityCode"
                    java.lang.String r15 = "newPassword"
                    java.lang.String r1 = "creditCardExpirationMonth"
                    switch(r3) {
                        case -2058889126: goto L_0x01e3;
                        case -1917283616: goto L_0x01d7;
                        case -1844815832: goto L_0x01cd;
                        case -1825589953: goto L_0x01c1;
                        case -1821235109: goto L_0x01b7;
                        case -1757573738: goto L_0x01ad;
                        case -1682373820: goto L_0x01a3;
                        case -1658955742: goto L_0x0197;
                        case -1567118045: goto L_0x018a;
                        case -1476752575: goto L_0x017c;
                        case -1413737489: goto L_0x016e;
                        case -1377792129: goto L_0x0160;
                        case -1249512767: goto L_0x0154;
                        case -1186060294: goto L_0x0146;
                        case -1151034798: goto L_0x013a;
                        case -835992323: goto L_0x012c;
                        case -818219584: goto L_0x011e;
                        case -747304516: goto L_0x0110;
                        case -613980922: goto L_0x0104;
                        case -613352043: goto L_0x00f8;
                        case -549230602: goto L_0x00ea;
                        case -265713450: goto L_0x00de;
                        case 3373707: goto L_0x00d0;
                        case 96619420: goto L_0x00c2;
                        case 253202685: goto L_0x00b4;
                        case 588174851: goto L_0x00a6;
                        case 798554127: goto L_0x009d;
                        case 892233837: goto L_0x0090;
                        case 991032982: goto L_0x0085;
                        case 1069376125: goto L_0x0078;
                        case 1216985755: goto L_0x006d;
                        case 1469046696: goto L_0x0060;
                        case 1662667945: goto L_0x0055;
                        case 1921869058: goto L_0x0048;
                        case 2011152728: goto L_0x003d;
                        case 2011773919: goto L_0x0030;
                        default: goto L_0x002d;
                    }
                L_0x002d:
                    r2 = -1
                    goto L_0x01ee
                L_0x0030:
                    java.lang.String r2 = "birthdayDay"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0039
                    goto L_0x002d
                L_0x0039:
                    r2 = 35
                    goto L_0x01ee
                L_0x003d:
                    boolean r2 = r0.equals(r4)
                    if (r2 != 0) goto L_0x0044
                    goto L_0x002d
                L_0x0044:
                    r2 = 34
                    goto L_0x01ee
                L_0x0048:
                    java.lang.String r2 = "postalAddressExtended"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0051
                    goto L_0x002d
                L_0x0051:
                    r2 = 33
                    goto L_0x01ee
                L_0x0055:
                    boolean r2 = r0.equals(r5)
                    if (r2 != 0) goto L_0x005c
                    goto L_0x002d
                L_0x005c:
                    r2 = 32
                    goto L_0x01ee
                L_0x0060:
                    java.lang.String r2 = "givenName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0069
                    goto L_0x002d
                L_0x0069:
                    r2 = 31
                    goto L_0x01ee
                L_0x006d:
                    boolean r2 = r0.equals(r6)
                    if (r2 != 0) goto L_0x0074
                    goto L_0x002d
                L_0x0074:
                    r2 = 30
                    goto L_0x01ee
                L_0x0078:
                    java.lang.String r2 = "birthday"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0081
                    goto L_0x002d
                L_0x0081:
                    r2 = 29
                    goto L_0x01ee
                L_0x0085:
                    boolean r2 = r0.equals(r7)
                    if (r2 != 0) goto L_0x008c
                    goto L_0x002d
                L_0x008c:
                    r2 = 28
                    goto L_0x01ee
                L_0x0090:
                    java.lang.String r2 = "telephoneNumber"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0099
                    goto L_0x002d
                L_0x0099:
                    r2 = 27
                    goto L_0x01ee
                L_0x009d:
                    java.lang.String r3 = "familyName"
                    boolean r3 = r0.equals(r3)
                    if (r3 != 0) goto L_0x01ee
                    goto L_0x002d
                L_0x00a6:
                    java.lang.String r2 = "birthdayMonth"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00b0
                    goto L_0x002d
                L_0x00b0:
                    r2 = 25
                    goto L_0x01ee
                L_0x00b4:
                    java.lang.String r2 = "addressState"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00be
                    goto L_0x002d
                L_0x00be:
                    r2 = 24
                    goto L_0x01ee
                L_0x00c2:
                    java.lang.String r2 = "email"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00cc
                    goto L_0x002d
                L_0x00cc:
                    r2 = 23
                    goto L_0x01ee
                L_0x00d0:
                    java.lang.String r2 = "name"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00da
                    goto L_0x002d
                L_0x00da:
                    r2 = 22
                    goto L_0x01ee
                L_0x00de:
                    boolean r2 = r0.equals(r8)
                    if (r2 != 0) goto L_0x00e6
                    goto L_0x002d
                L_0x00e6:
                    r2 = 21
                    goto L_0x01ee
                L_0x00ea:
                    java.lang.String r2 = "telephoneNumberCountryCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x00f4
                    goto L_0x002d
                L_0x00f4:
                    r2 = 20
                    goto L_0x01ee
                L_0x00f8:
                    boolean r2 = r0.equals(r9)
                    if (r2 != 0) goto L_0x0100
                    goto L_0x002d
                L_0x0100:
                    r2 = 19
                    goto L_0x01ee
                L_0x0104:
                    boolean r2 = r0.equals(r10)
                    if (r2 != 0) goto L_0x010c
                    goto L_0x002d
                L_0x010c:
                    r2 = 18
                    goto L_0x01ee
                L_0x0110:
                    java.lang.String r2 = "nameSuffix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x011a
                    goto L_0x002d
                L_0x011a:
                    r2 = 17
                    goto L_0x01ee
                L_0x011e:
                    java.lang.String r2 = "middleName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0128
                    goto L_0x002d
                L_0x0128:
                    r2 = 16
                    goto L_0x01ee
                L_0x012c:
                    java.lang.String r2 = "namePrefix"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0136
                    goto L_0x002d
                L_0x0136:
                    r2 = 15
                    goto L_0x01ee
                L_0x013a:
                    boolean r2 = r0.equals(r11)
                    if (r2 != 0) goto L_0x0142
                    goto L_0x002d
                L_0x0142:
                    r2 = 14
                    goto L_0x01ee
                L_0x0146:
                    java.lang.String r2 = "postalAddressExtendedPostalCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0150
                    goto L_0x002d
                L_0x0150:
                    r2 = 13
                    goto L_0x01ee
                L_0x0154:
                    boolean r2 = r0.equals(r12)
                    if (r2 != 0) goto L_0x015c
                    goto L_0x002d
                L_0x015c:
                    r2 = 12
                    goto L_0x01ee
                L_0x0160:
                    java.lang.String r2 = "addressCity"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x016a
                    goto L_0x002d
                L_0x016a:
                    r2 = 11
                    goto L_0x01ee
                L_0x016e:
                    java.lang.String r2 = "middleInitial"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0178
                    goto L_0x002d
                L_0x0178:
                    r2 = 10
                    goto L_0x01ee
                L_0x017c:
                    java.lang.String r2 = "countryName"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0186
                    goto L_0x002d
                L_0x0186:
                    r2 = 9
                    goto L_0x01ee
                L_0x018a:
                    java.lang.String r2 = "telephoneNumberDevice"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x0194
                    goto L_0x002d
                L_0x0194:
                    r2 = 8
                    goto L_0x01ee
                L_0x0197:
                    java.lang.String r2 = "fullStreetAddress"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01a1
                    goto L_0x002d
                L_0x01a1:
                    r2 = 7
                    goto L_0x01ee
                L_0x01a3:
                    boolean r2 = r0.equals(r13)
                    if (r2 != 0) goto L_0x01ab
                    goto L_0x002d
                L_0x01ab:
                    r2 = 6
                    goto L_0x01ee
                L_0x01ad:
                    boolean r2 = r0.equals(r14)
                    if (r2 != 0) goto L_0x01b5
                    goto L_0x002d
                L_0x01b5:
                    r2 = 5
                    goto L_0x01ee
                L_0x01b7:
                    boolean r2 = r0.equals(r15)
                    if (r2 != 0) goto L_0x01bf
                    goto L_0x002d
                L_0x01bf:
                    r2 = 4
                    goto L_0x01ee
                L_0x01c1:
                    java.lang.String r2 = "telephoneNumberNational"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01cb
                    goto L_0x002d
                L_0x01cb:
                    r2 = 3
                    goto L_0x01ee
                L_0x01cd:
                    boolean r2 = r0.equals(r1)
                    if (r2 != 0) goto L_0x01d5
                    goto L_0x002d
                L_0x01d5:
                    r2 = 2
                    goto L_0x01ee
                L_0x01d7:
                    java.lang.String r2 = "oneTimeCode"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01e1
                    goto L_0x002d
                L_0x01e1:
                    r2 = 1
                    goto L_0x01ee
                L_0x01e3:
                    java.lang.String r2 = "birthdayYear"
                    boolean r2 = r0.equals(r2)
                    if (r2 != 0) goto L_0x01ed
                    goto L_0x002d
                L_0x01ed:
                    r2 = 0
                L_0x01ee:
                    switch(r2) {
                        case 0: goto L_0x0241;
                        case 1: goto L_0x023e;
                        case 2: goto L_0x023d;
                        case 3: goto L_0x023a;
                        case 4: goto L_0x0239;
                        case 5: goto L_0x0238;
                        case 6: goto L_0x0237;
                        case 7: goto L_0x0234;
                        case 8: goto L_0x0231;
                        case 9: goto L_0x022e;
                        case 10: goto L_0x022b;
                        case 11: goto L_0x0228;
                        case 12: goto L_0x0227;
                        case 13: goto L_0x0224;
                        case 14: goto L_0x0223;
                        case 15: goto L_0x0220;
                        case 16: goto L_0x021d;
                        case 17: goto L_0x021a;
                        case 18: goto L_0x0219;
                        case 19: goto L_0x0218;
                        case 20: goto L_0x0215;
                        case 21: goto L_0x0214;
                        case 22: goto L_0x0211;
                        case 23: goto L_0x020e;
                        case 24: goto L_0x020b;
                        case 25: goto L_0x0208;
                        case 26: goto L_0x0205;
                        case 27: goto L_0x0202;
                        case 28: goto L_0x0201;
                        case 29: goto L_0x01fe;
                        case 30: goto L_0x01fd;
                        case 31: goto L_0x01fa;
                        case 32: goto L_0x01f9;
                        case 33: goto L_0x01f6;
                        case 34: goto L_0x01f5;
                        case 35: goto L_0x01f2;
                        default: goto L_0x01f1;
                    }
                L_0x01f1:
                    return r0
                L_0x01f2:
                    java.lang.String r0 = "birthDateDay"
                    return r0
                L_0x01f5:
                    return r4
                L_0x01f6:
                    java.lang.String r0 = "extendedAddress"
                    return r0
                L_0x01f9:
                    return r5
                L_0x01fa:
                    java.lang.String r0 = "personGivenName"
                    return r0
                L_0x01fd:
                    return r6
                L_0x01fe:
                    java.lang.String r0 = "birthDateFull"
                    return r0
                L_0x0201:
                    return r7
                L_0x0202:
                    java.lang.String r0 = "phoneNumber"
                    return r0
                L_0x0205:
                    java.lang.String r0 = "personFamilyName"
                    return r0
                L_0x0208:
                    java.lang.String r0 = "birthDateMonth"
                    return r0
                L_0x020b:
                    java.lang.String r0 = "addressRegion"
                    return r0
                L_0x020e:
                    java.lang.String r0 = "emailAddress"
                    return r0
                L_0x0211:
                    java.lang.String r0 = "personName"
                    return r0
                L_0x0214:
                    return r8
                L_0x0215:
                    java.lang.String r0 = "phoneCountryCode"
                    return r0
                L_0x0218:
                    return r9
                L_0x0219:
                    return r10
                L_0x021a:
                    java.lang.String r0 = "personNameSuffix"
                    return r0
                L_0x021d:
                    java.lang.String r0 = "personMiddleName"
                    return r0
                L_0x0220:
                    java.lang.String r0 = "personNamePrefix"
                    return r0
                L_0x0223:
                    return r11
                L_0x0224:
                    java.lang.String r0 = "extendedPostalCode"
                    return r0
                L_0x0227:
                    return r12
                L_0x0228:
                    java.lang.String r0 = "addressLocality"
                    return r0
                L_0x022b:
                    java.lang.String r0 = "personMiddleInitial"
                    return r0
                L_0x022e:
                    java.lang.String r0 = "addressCountry"
                    return r0
                L_0x0231:
                    java.lang.String r0 = "phoneNumberDevice"
                    return r0
                L_0x0234:
                    java.lang.String r0 = "streetAddress"
                    return r0
                L_0x0237:
                    return r13
                L_0x0238:
                    return r14
                L_0x0239:
                    return r15
                L_0x023a:
                    java.lang.String r0 = "phoneNational"
                    return r0
                L_0x023d:
                    return r1
                L_0x023e:
                    java.lang.String r0 = "smsOTPCode"
                    return r0
                L_0x0241:
                    java.lang.String r0 = "birthDateYear"
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.Autofill.translateAutofillHint(java.lang.String):java.lang.String");
            }
        }

        public Configuration(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, TextCapitalization textCapitalization2, InputType inputType2, Integer num, String str, Autofill autofill2, Configuration[] configurationArr) {
            this.obscureText = z;
            this.autocorrect = z2;
            this.enableSuggestions = z3;
            this.enableIMEPersonalizedLearning = z4;
            this.enableDeltaModel = z5;
            this.textCapitalization = textCapitalization2;
            this.inputType = inputType2;
            this.inputAction = num;
            this.actionLabel = str;
            this.autofill = autofill2;
            this.fields = configurationArr;
        }

        public static Configuration fromJson(JSONObject jSONObject) {
            Configuration[] configurationArr;
            JSONObject jSONObject2 = jSONObject;
            String string = jSONObject2.getString("inputAction");
            if (string != null) {
                Autofill autofill2 = null;
                if (!jSONObject2.isNull("fields")) {
                    JSONArray jSONArray = jSONObject2.getJSONArray("fields");
                    int length = jSONArray.length();
                    Configuration[] configurationArr2 = new Configuration[length];
                    for (int i2 = 0; i2 < length; i2++) {
                        configurationArr2[i2] = fromJson(jSONArray.getJSONObject(i2));
                    }
                    configurationArr = configurationArr2;
                } else {
                    configurationArr = null;
                }
                Integer inputActionFromTextInputAction = inputActionFromTextInputAction(string);
                boolean optBoolean = jSONObject2.optBoolean("obscureText");
                boolean optBoolean2 = jSONObject2.optBoolean("autocorrect", true);
                boolean optBoolean3 = jSONObject2.optBoolean("enableSuggestions");
                boolean optBoolean4 = jSONObject2.optBoolean("enableIMEPersonalizedLearning");
                boolean optBoolean5 = jSONObject2.optBoolean("enableDeltaModel");
                TextCapitalization fromValue = TextCapitalization.fromValue(jSONObject2.getString("textCapitalization"));
                InputType fromJson = InputType.fromJson(jSONObject2.getJSONObject("inputType"));
                String string2 = jSONObject2.isNull("actionLabel") ? null : jSONObject2.getString("actionLabel");
                if (!jSONObject2.isNull("autofill")) {
                    autofill2 = Autofill.fromJson(jSONObject2.getJSONObject("autofill"));
                }
                return new Configuration(optBoolean, optBoolean2, optBoolean3, optBoolean4, optBoolean5, fromValue, fromJson, inputActionFromTextInputAction, string2, autofill2, configurationArr);
            }
            throw new JSONException("Configuration JSON missing 'inputAction' property.");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0072, code lost:
            if (r12.equals("TextInputAction.done") == false) goto L_0x001b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static java.lang.Integer inputActionFromTextInputAction(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L_0x0075;
                    case -737377923: goto L_0x006c;
                    case -737089298: goto L_0x0061;
                    case -737080013: goto L_0x0056;
                    case -736940669: goto L_0x004b;
                    case 469250275: goto L_0x0040;
                    case 1241689507: goto L_0x0035;
                    case 1539450297: goto L_0x002a;
                    case 2110497650: goto L_0x001e;
                    default: goto L_0x001b;
                }
            L_0x001b:
                r7 = -1
                goto L_0x007f
            L_0x001e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0027
                goto L_0x001b
            L_0x0027:
                r7 = 8
                goto L_0x007f
            L_0x002a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0033
                goto L_0x001b
            L_0x0033:
                r7 = 7
                goto L_0x007f
            L_0x0035:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x003e
                goto L_0x001b
            L_0x003e:
                r7 = 6
                goto L_0x007f
            L_0x0040:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0049
                goto L_0x001b
            L_0x0049:
                r7 = 5
                goto L_0x007f
            L_0x004b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x0054
                goto L_0x001b
            L_0x0054:
                r7 = 4
                goto L_0x007f
            L_0x0056:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x005f
                goto L_0x001b
            L_0x005f:
                r7 = 3
                goto L_0x007f
            L_0x0061:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x006a
                goto L_0x001b
            L_0x006a:
                r7 = 2
                goto L_0x007f
            L_0x006c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007f
                goto L_0x001b
            L_0x0075:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L_0x007e
                goto L_0x001b
            L_0x007e:
                r7 = 0
            L_0x007f:
                switch(r7) {
                    case 0: goto L_0x00a3;
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0099;
                    case 3: goto L_0x0098;
                    case 4: goto L_0x0093;
                    case 5: goto L_0x008e;
                    case 6: goto L_0x0089;
                    case 7: goto L_0x0088;
                    case 8: goto L_0x0083;
                    default: goto L_0x0082;
                }
            L_0x0082:
                return r10
            L_0x0083:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L_0x0088:
                return r8
            L_0x0089:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L_0x008e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L_0x0093:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L_0x0098:
                return r8
            L_0x0099:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L_0x009e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            L_0x00a3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.inputActionFromTextInputAction(java.lang.String):java.lang.Integer");
        }
    }

    public static class InputType {
        public final boolean isDecimal;
        public final boolean isSigned;
        public final TextInputType type;

        public InputType(TextInputType textInputType, boolean z, boolean z2) {
            this.type = textInputType;
            this.isSigned = z;
            this.isDecimal = z2;
        }

        public static InputType fromJson(JSONObject jSONObject) {
            return new InputType(TextInputType.fromValue(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum TextCapitalization {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");
        
        private final String encodedName;

        private TextCapitalization(String str) {
            this.encodedName = str;
        }

        static TextCapitalization fromValue(String str) {
            for (TextCapitalization textCapitalization : values()) {
                if (textCapitalization.encodedName.equals(str)) {
                    return textCapitalization;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class TextEditState {
        public final int composingEnd;
        public final int composingStart;
        public final int selectionEnd;
        public final int selectionStart;
        public final String text;

        public TextEditState(String str, int i2, int i3, int i4, int i5) {
            if (!(i2 == -1 && i3 == -1) && (i2 < 0 || i3 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(i2) + ", " + String.valueOf(i3) + ")");
            } else if (!(i4 == -1 && i5 == -1) && (i4 < 0 || i4 > i5)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(i4) + ", " + String.valueOf(i5) + ")");
            } else if (i5 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(i4));
            } else if (i2 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(i2));
            } else if (i3 <= str.length()) {
                this.text = str;
                this.selectionStart = i2;
                this.selectionEnd = i3;
                this.composingStart = i4;
                this.composingEnd = i5;
            } else {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(i3));
            }
        }

        public static TextEditState fromJson(JSONObject jSONObject) {
            return new TextEditState(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean hasComposing() {
            int i2 = this.composingStart;
            return i2 >= 0 && this.composingEnd > i2;
        }

        public boolean hasSelection() {
            return this.selectionStart >= 0;
        }
    }

    public interface TextInputMethodHandler {
        void clearClient();

        void finishAutofillContext(boolean z);

        void hide();

        void requestAutofill();

        void sendAppPrivateCommand(String str, Bundle bundle);

        void setClient(int i2, Configuration configuration);

        void setEditableSizeAndTransform(double d2, double d3, double[] dArr);

        void setEditingState(TextEditState textEditState);

        void setPlatformViewClient(int i2, boolean z);

        void show();
    }

    public enum TextInputType {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");
        
        private final String encodedName;

        private TextInputType(String str) {
            this.encodedName = str;
        }

        static TextInputType fromValue(String str) {
            for (TextInputType textInputType : values()) {
                if (textInputType.encodedName.equals(str)) {
                    return textInputType;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public TextInputChannel(DartExecutor dartExecutor) {
        AnonymousClass1 r0 = new MethodChannel.MethodCallHandler() {
            /* JADX WARNING: Code restructure failed: missing block: B:54:0x0149, code lost:
                r2.success((java.lang.Object) null);
             */
            /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
                return;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void onMethodCall(io.flutter.plugin.common.MethodCall r18, io.flutter.plugin.common.MethodChannel.Result r19) {
                /*
                    r17 = this;
                    r1 = r17
                    r0 = r18
                    r2 = r19
                    java.lang.String r3 = "data"
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r4 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r4 = r4.textInputMethodHandler
                    if (r4 != 0) goto L_0x0011
                    return
                L_0x0011:
                    java.lang.String r4 = r0.method
                    java.lang.Object r0 = r0.arguments
                    java.lang.StringBuilder r5 = new java.lang.StringBuilder
                    r5.<init>()
                    java.lang.String r6 = "Received '"
                    r5.append(r6)
                    r5.append(r4)
                    java.lang.String r6 = "' message."
                    r5.append(r6)
                    java.lang.String r5 = r5.toString()
                    java.lang.String r6 = "TextInputChannel"
                    io.flutter.Log.v(r6, r5)
                    r4.hashCode()
                    r5 = -1
                    int r6 = r4.hashCode()
                    r7 = 1
                    r8 = 0
                    switch(r6) {
                        case -1779068172: goto L_0x00a8;
                        case -1015421462: goto L_0x009d;
                        case -37561188: goto L_0x0092;
                        case 270476819: goto L_0x0087;
                        case 270803918: goto L_0x007c;
                        case 649192816: goto L_0x0071;
                        case 1204752139: goto L_0x0066;
                        case 1727570905: goto L_0x005b;
                        case 1904427655: goto L_0x004d;
                        case 2113369584: goto L_0x003f;
                        default: goto L_0x003d;
                    }
                L_0x003d:
                    goto L_0x00b2
                L_0x003f:
                    java.lang.String r6 = "TextInput.requestAutofill"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x0049
                    goto L_0x00b2
                L_0x0049:
                    r5 = 9
                    goto L_0x00b2
                L_0x004d:
                    java.lang.String r6 = "TextInput.clearClient"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x0057
                    goto L_0x00b2
                L_0x0057:
                    r5 = 8
                    goto L_0x00b2
                L_0x005b:
                    java.lang.String r6 = "TextInput.finishAutofillContext"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x0064
                    goto L_0x00b2
                L_0x0064:
                    r5 = 7
                    goto L_0x00b2
                L_0x0066:
                    java.lang.String r6 = "TextInput.setEditableSizeAndTransform"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x006f
                    goto L_0x00b2
                L_0x006f:
                    r5 = 6
                    goto L_0x00b2
                L_0x0071:
                    java.lang.String r6 = "TextInput.sendAppPrivateCommand"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x007a
                    goto L_0x00b2
                L_0x007a:
                    r5 = 5
                    goto L_0x00b2
                L_0x007c:
                    java.lang.String r6 = "TextInput.show"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x0085
                    goto L_0x00b2
                L_0x0085:
                    r5 = 4
                    goto L_0x00b2
                L_0x0087:
                    java.lang.String r6 = "TextInput.hide"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x0090
                    goto L_0x00b2
                L_0x0090:
                    r5 = 3
                    goto L_0x00b2
                L_0x0092:
                    java.lang.String r6 = "TextInput.setClient"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x009b
                    goto L_0x00b2
                L_0x009b:
                    r5 = 2
                    goto L_0x00b2
                L_0x009d:
                    java.lang.String r6 = "TextInput.setEditingState"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x00a6
                    goto L_0x00b2
                L_0x00a6:
                    r5 = 1
                    goto L_0x00b2
                L_0x00a8:
                    java.lang.String r6 = "TextInput.setPlatformViewClient"
                    boolean r4 = r4.equals(r6)
                    if (r4 != 0) goto L_0x00b1
                    goto L_0x00b2
                L_0x00b1:
                    r5 = 0
                L_0x00b2:
                    java.lang.String r4 = "error"
                    r6 = 0
                    switch(r5) {
                        case 0: goto L_0x0190;
                        case 1: goto L_0x017d;
                        case 2: goto L_0x0157;
                        case 3: goto L_0x014d;
                        case 4: goto L_0x0140;
                        case 5: goto L_0x0114;
                        case 6: goto L_0x00e3;
                        case 7: goto L_0x00d3;
                        case 8: goto L_0x00c8;
                        case 9: goto L_0x00bd;
                        default: goto L_0x00b8;
                    }
                L_0x00b8:
                    r19.notImplemented()
                    goto L_0x01b1
                L_0x00bd:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r0 = r0.textInputMethodHandler
                    r0.requestAutofill()
                    goto L_0x0149
                L_0x00c8:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r0 = r0.textInputMethodHandler
                    r0.clearClient()
                    goto L_0x0149
                L_0x00d3:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r3 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r3 = r3.textInputMethodHandler
                    java.lang.Boolean r0 = (java.lang.Boolean) r0
                    boolean r0 = r0.booleanValue()
                    r3.finishAutofillContext(r0)
                    goto L_0x0149
                L_0x00e3:
                    org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r3 = "width"
                    double r10 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r3 = "height"
                    double r12 = r0.getDouble(r3)     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r3 = "transform"
                    org.json.JSONArray r0 = r0.getJSONArray(r3)     // Catch:{ JSONException -> 0x01ab }
                    r3 = 16
                    double[] r14 = new double[r3]     // Catch:{ JSONException -> 0x01ab }
                L_0x00fb:
                    if (r8 >= r3) goto L_0x0106
                    double r15 = r0.getDouble(r8)     // Catch:{ JSONException -> 0x01ab }
                    r14[r8] = r15     // Catch:{ JSONException -> 0x01ab }
                    int r8 = r8 + 1
                    goto L_0x00fb
                L_0x0106:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r9 = r0.textInputMethodHandler     // Catch:{ JSONException -> 0x01ab }
                    r9.setEditableSizeAndTransform(r10, r12, r14)     // Catch:{ JSONException -> 0x01ab }
                    r2.success(r6)     // Catch:{ JSONException -> 0x01ab }
                    goto L_0x01b1
                L_0x0114:
                    org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r5 = "action"
                    java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r0 = r0.getString(r3)     // Catch:{ JSONException -> 0x01ab }
                    if (r0 == 0) goto L_0x0131
                    boolean r7 = r0.isEmpty()     // Catch:{ JSONException -> 0x01ab }
                    if (r7 != 0) goto L_0x0131
                    android.os.Bundle r7 = new android.os.Bundle     // Catch:{ JSONException -> 0x01ab }
                    r7.<init>()     // Catch:{ JSONException -> 0x01ab }
                    r7.putString(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                    goto L_0x0132
                L_0x0131:
                    r7 = r6
                L_0x0132:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r0 = r0.textInputMethodHandler     // Catch:{ JSONException -> 0x01ab }
                    r0.sendAppPrivateCommand(r5, r7)     // Catch:{ JSONException -> 0x01ab }
                    r2.success(r6)     // Catch:{ JSONException -> 0x01ab }
                    goto L_0x01b1
                L_0x0140:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r0 = r0.textInputMethodHandler
                    r0.show()
                L_0x0149:
                    r2.success(r6)
                    goto L_0x01b1
                L_0x014d:
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r0 = r0.textInputMethodHandler
                    r0.hide()
                    goto L_0x0149
                L_0x0157:
                    org.json.JSONArray r0 = (org.json.JSONArray) r0     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    int r3 = r0.getInt(r8)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    org.json.JSONObject r0 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r5 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r5 = r5.textInputMethodHandler     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$Configuration r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.Configuration.fromJson(r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    r5.setClient(r3, r0)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    r2.success(r6)     // Catch:{ JSONException -> 0x0174, NoSuchFieldException -> 0x0172 }
                    goto L_0x01b1
                L_0x0172:
                    r0 = move-exception
                    goto L_0x0175
                L_0x0174:
                    r0 = move-exception
                L_0x0175:
                    java.lang.String r0 = r0.getMessage()
                L_0x0179:
                    r2.error(r4, r0, r6)
                    goto L_0x01b1
                L_0x017d:
                    org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r3 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r3 = r3.textInputMethodHandler     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextEditState r0 = io.flutter.embedding.engine.systemchannels.TextInputChannel.TextEditState.fromJson(r0)     // Catch:{ JSONException -> 0x01ab }
                    r3.setEditingState(r0)     // Catch:{ JSONException -> 0x01ab }
                    r2.success(r6)     // Catch:{ JSONException -> 0x01ab }
                    goto L_0x01b1
                L_0x0190:
                    org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r3 = "platformViewId"
                    int r3 = r0.getInt(r3)     // Catch:{ JSONException -> 0x01ab }
                    java.lang.String r5 = "usesVirtualDisplay"
                    boolean r0 = r0.optBoolean(r5, r8)     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel r5 = io.flutter.embedding.engine.systemchannels.TextInputChannel.this     // Catch:{ JSONException -> 0x01ab }
                    io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputMethodHandler r5 = r5.textInputMethodHandler     // Catch:{ JSONException -> 0x01ab }
                    r5.setPlatformViewClient(r3, r0)     // Catch:{ JSONException -> 0x01ab }
                    r2.success(r6)     // Catch:{ JSONException -> 0x01ab }
                    goto L_0x01b1
                L_0x01ab:
                    r0 = move-exception
                    java.lang.String r0 = r0.getMessage()
                    goto L_0x0179
                L_0x01b1:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.engine.systemchannels.TextInputChannel.AnonymousClass1.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
            }
        };
        this.parsingMethodHandler = r0;
        MethodChannel methodChannel = new MethodChannel(dartExecutor, "flutter/textinput", JSONMethodCodec.INSTANCE);
        this.channel = methodChannel;
        methodChannel.setMethodCallHandler(r0);
    }

    private static HashMap<Object, Object> createEditingDeltaJSON(ArrayList<TextEditingDelta> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<TextEditingDelta> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().toJSON());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> createEditingStateJSON(String str, int i2, int i3, int i4, int i5) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(i2));
        hashMap.put("selectionExtent", Integer.valueOf(i3));
        hashMap.put("composingBase", Integer.valueOf(i4));
        hashMap.put("composingExtent", Integer.valueOf(i5));
        return hashMap;
    }

    public void done(int i2) {
        Log.v(TAG, "Sending 'done' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.done"}));
    }

    public void go(int i2) {
        Log.v(TAG, "Sending 'go' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.go"}));
    }

    public void newline(int i2) {
        Log.v(TAG, "Sending 'newline' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.newline"}));
    }

    public void next(int i2) {
        Log.v(TAG, "Sending 'next' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.next"}));
    }

    public void performPrivateCommand(int i2, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.channel.invokeMethod("TextInputClient.performPrivateCommand", Arrays.asList(new Serializable[]{Integer.valueOf(i2), hashMap}));
    }

    public void previous(int i2) {
        Log.v(TAG, "Sending 'previous' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.previous"}));
    }

    public void requestExistingInputState() {
        this.channel.invokeMethod("TextInputClient.requestExistingInputState", (Object) null);
    }

    public void search(int i2) {
        Log.v(TAG, "Sending 'search' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.search"}));
    }

    public void send(int i2) {
        Log.v(TAG, "Sending 'send' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.send"}));
    }

    public void setTextInputMethodHandler(TextInputMethodHandler textInputMethodHandler2) {
        this.textInputMethodHandler = textInputMethodHandler2;
    }

    public void unspecifiedAction(int i2) {
        Log.v(TAG, "Sending 'unspecified' message.");
        this.channel.invokeMethod("TextInputClient.performAction", Arrays.asList(new Serializable[]{Integer.valueOf(i2), "TextInputAction.unspecified"}));
    }

    public void updateEditingState(int i2, String str, int i3, int i4, int i5, int i6) {
        Log.v(TAG, "Sending message to update editing state: \nText: " + str + "\nSelection start: " + i3 + "\nSelection end: " + i4 + "\nComposing start: " + i5 + "\nComposing end: " + i6);
        HashMap<Object, Object> createEditingStateJSON = createEditingStateJSON(str, i3, i4, i5, i6);
        this.channel.invokeMethod("TextInputClient.updateEditingState", Arrays.asList(new Serializable[]{Integer.valueOf(i2), createEditingStateJSON}));
    }

    public void updateEditingStateWithDeltas(int i2, ArrayList<TextEditingDelta> arrayList) {
        Log.v(TAG, "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        HashMap<Object, Object> createEditingDeltaJSON = createEditingDeltaJSON(arrayList);
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(new Serializable[]{Integer.valueOf(i2), createEditingDeltaJSON}));
    }

    public void updateEditingStateWithTag(int i2, HashMap<String, TextEditState> hashMap) {
        Log.v(TAG, "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry next : hashMap.entrySet()) {
            TextEditState textEditState = (TextEditState) next.getValue();
            hashMap2.put((String) next.getKey(), createEditingStateJSON(textEditState.text, textEditState.selectionStart, textEditState.selectionEnd, -1, -1));
        }
        this.channel.invokeMethod("TextInputClient.updateEditingStateWithTag", Arrays.asList(new Serializable[]{Integer.valueOf(i2), hashMap2}));
    }
}
