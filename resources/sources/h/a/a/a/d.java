package h.a.a.a;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.database.Cursor;
import android.provider.ContactsContract;
import java.util.HashMap;

@TargetApi(5)
public class d {
    public String a;
    public String b;
    public String c;

    /* renamed from: d  reason: collision with root package name */
    public String f4679d;

    /* renamed from: e  reason: collision with root package name */
    public String f4680e;

    /* renamed from: f  reason: collision with root package name */
    public String f4681f;

    /* renamed from: g  reason: collision with root package name */
    int f4682g;

    public d(String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.f4679d = str4;
        this.f4680e = str5;
        this.f4681f = str6;
        this.f4682g = i2;
    }

    public static d a(HashMap<String, String> hashMap) {
        String str = hashMap.get("label");
        String str2 = hashMap.get("street");
        String str3 = hashMap.get("city");
        String str4 = hashMap.get("postcode");
        String str5 = hashMap.get("region");
        String str6 = hashMap.get("country");
        String str7 = hashMap.get("type");
        return new d(str, str2, str3, str4, str5, str6, str7 != null ? Integer.parseInt(str7) : -1);
    }

    public static String b(Resources resources, int i2, Cursor cursor, boolean z) {
        if (z) {
            return ContactsContract.CommonDataKinds.StructuredPostal.getTypeLabel(resources, i2, "").toString().toLowerCase();
        }
        int i3 = cursor.getInt(cursor.getColumnIndex("data2"));
        if (i3 != 0) {
            return i3 != 1 ? i3 != 2 ? "other" : "work" : "home";
        }
        String string = cursor.getString(cursor.getColumnIndex("data3"));
        return string != null ? string : "";
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, String> c() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("label", this.a);
        hashMap.put("street", this.b);
        hashMap.put("city", this.c);
        hashMap.put("postcode", this.f4679d);
        hashMap.put("region", this.f4680e);
        hashMap.put("country", this.f4681f);
        hashMap.put("type", String.valueOf(this.f4682g));
        return hashMap;
    }
}
