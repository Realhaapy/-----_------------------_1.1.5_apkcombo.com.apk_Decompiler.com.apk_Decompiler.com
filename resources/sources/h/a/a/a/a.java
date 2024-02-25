package h.a.a.a;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class a implements Comparable<a> {

    /* renamed from: e  reason: collision with root package name */
    String f4648e;

    /* renamed from: f  reason: collision with root package name */
    String f4649f;

    /* renamed from: g  reason: collision with root package name */
    String f4650g;

    /* renamed from: h  reason: collision with root package name */
    String f4651h;

    /* renamed from: i  reason: collision with root package name */
    String f4652i;

    /* renamed from: j  reason: collision with root package name */
    String f4653j;

    /* renamed from: k  reason: collision with root package name */
    String f4654k;

    /* renamed from: l  reason: collision with root package name */
    String f4655l;

    /* renamed from: m  reason: collision with root package name */
    String f4656m;

    /* renamed from: n  reason: collision with root package name */
    String f4657n;

    /* renamed from: o  reason: collision with root package name */
    String f4658o;

    /* renamed from: p  reason: collision with root package name */
    String f4659p;

    /* renamed from: q  reason: collision with root package name */
    String f4660q;

    /* renamed from: r  reason: collision with root package name */
    ArrayList<c> f4661r = new ArrayList<>();

    /* renamed from: s  reason: collision with root package name */
    ArrayList<c> f4662s = new ArrayList<>();
    ArrayList<d> t = new ArrayList<>();
    byte[] u = new byte[0];

    private a() {
    }

    a(String str) {
        this.f4648e = str;
    }

    static a c(HashMap hashMap) {
        a aVar = new a();
        aVar.f4648e = (String) hashMap.get("identifier");
        aVar.f4650g = (String) hashMap.get("givenName");
        aVar.f4651h = (String) hashMap.get("middleName");
        aVar.f4652i = (String) hashMap.get("familyName");
        aVar.f4653j = (String) hashMap.get("prefix");
        aVar.f4654k = (String) hashMap.get("suffix");
        aVar.f4655l = (String) hashMap.get("company");
        aVar.f4656m = (String) hashMap.get("jobTitle");
        aVar.u = (byte[]) hashMap.get("avatar");
        aVar.f4657n = (String) hashMap.get("note");
        aVar.f4658o = (String) hashMap.get("birthday");
        aVar.f4659p = (String) hashMap.get("androidAccountType");
        aVar.f4660q = (String) hashMap.get("androidAccountName");
        ArrayList arrayList = (ArrayList) hashMap.get("emails");
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                aVar.f4661r.add(c.a((HashMap) it.next()));
            }
        }
        ArrayList arrayList2 = (ArrayList) hashMap.get("phones");
        if (arrayList2 != null) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                aVar.f4662s.add(c.a((HashMap) it2.next()));
            }
        }
        ArrayList arrayList3 = (ArrayList) hashMap.get("postalAddresses");
        if (arrayList3 != null) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                aVar.t.add(d.a((HashMap) it3.next()));
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public int compareTo(a aVar) {
        String str;
        String str2 = this.f4650g;
        String str3 = "";
        String lowerCase = str2 == null ? str3 : str2.toLowerCase();
        if (!(aVar == null || (str = aVar.f4650g) == null)) {
            str3 = str.toLowerCase();
        }
        return lowerCase.compareTo(str3);
    }

    /* access modifiers changed from: package-private */
    public HashMap<String, Object> d() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("identifier", this.f4648e);
        hashMap.put("displayName", this.f4649f);
        hashMap.put("givenName", this.f4650g);
        hashMap.put("middleName", this.f4651h);
        hashMap.put("familyName", this.f4652i);
        hashMap.put("prefix", this.f4653j);
        hashMap.put("suffix", this.f4654k);
        hashMap.put("company", this.f4655l);
        hashMap.put("jobTitle", this.f4656m);
        hashMap.put("avatar", this.u);
        hashMap.put("note", this.f4657n);
        hashMap.put("birthday", this.f4658o);
        hashMap.put("androidAccountType", this.f4659p);
        hashMap.put("androidAccountName", this.f4660q);
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = this.f4661r.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().d());
        }
        hashMap.put("emails", arrayList);
        ArrayList arrayList2 = new ArrayList();
        Iterator<c> it2 = this.f4662s.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().d());
        }
        hashMap.put("phones", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator<d> it3 = this.t.iterator();
        while (it3.hasNext()) {
            arrayList3.add(it3.next().c());
        }
        hashMap.put("postalAddresses", arrayList3);
        return hashMap;
    }
}
