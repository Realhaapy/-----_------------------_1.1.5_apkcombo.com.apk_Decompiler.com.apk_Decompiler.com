package h.a.a.a;

import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.HashMap;

public class c {
    public String a;
    public String b;
    int c;

    public c(String str, String str2, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i2;
    }

    public static c a(HashMap<String, String> hashMap) {
        String str = hashMap.get("label");
        String str2 = hashMap.get("value");
        String str3 = hashMap.get("type");
        return new c(str, str2, str3 != null ? Integer.parseInt(str3) : -1);
    }

    public static String b(Resources resources, int i2, Cursor cursor, boolean z) {
        String string;
        if (z) {
            string = ContactsContract.CommonDataKinds.Email.getTypeLabel(resources, i2, "").toString();
        } else if (i2 != 0) {
            return i2 != 1 ? i2 != 2 ? i2 != 4 ? "other" : "mobile" : "work" : "home";
        } else {
            if (cursor.getString(cursor.getColumnIndex("data3")) == null) {
                return "";
            }
            string = cursor.getString(cursor.getColumnIndex("data3"));
        }
        return string.toLowerCase();
    }

    public static String c(Resources resources, int i2, Cursor cursor, boolean z) {
        String string;
        if (z) {
            string = ContactsContract.CommonDataKinds.Phone.getTypeLabel(resources, i2, "").toString();
        } else if (i2 == 10) {
            return "company";
        } else {
            if (i2 == 12) {
                return "main";
            }
            switch (i2) {
                case 0:
                    if (cursor.getString(cursor.getColumnIndex("data3")) != null) {
                        string = cursor.getString(cursor.getColumnIndex("data3"));
                        break;
                    } else {
                        return "";
                    }
                case 1:
                    return "home";
                case 2:
                    return "mobile";
                case 3:
                    return "work";
                case 4:
                    return "fax work";
                case 5:
                    return "fax home";
                case 6:
                    return "pager";
                default:
                    return "other";
            }
        }
        return string.toLowerCase();
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> d() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("label", this.a);
        hashMap.put("value", this.b);
        hashMap.put("type", String.valueOf(this.c));
        return hashMap;
    }
}
