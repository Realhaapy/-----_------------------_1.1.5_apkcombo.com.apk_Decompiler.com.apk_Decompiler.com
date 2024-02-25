package androidx.core.app;

import android.app.Person;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

public class p {
    CharSequence a;
    IconCompat b;
    String c;

    /* renamed from: d  reason: collision with root package name */
    String f871d;

    /* renamed from: e  reason: collision with root package name */
    boolean f872e;

    /* renamed from: f  reason: collision with root package name */
    boolean f873f;

    static class a {
        static p a(Person person) {
            b bVar = new b();
            bVar.f(person.getName());
            bVar.c(person.getIcon() != null ? IconCompat.c(person.getIcon()) : null);
            bVar.g(person.getUri());
            bVar.e(person.getKey());
            bVar.b(person.isBot());
            bVar.d(person.isImportant());
            return bVar.a();
        }

        static Person b(p pVar) {
            return new Person.Builder().setName(pVar.e()).setIcon(pVar.c() != null ? pVar.c().y() : null).setUri(pVar.f()).setKey(pVar.d()).setBot(pVar.g()).setImportant(pVar.h()).build();
        }
    }

    public static class b {
        CharSequence a;
        IconCompat b;
        String c;

        /* renamed from: d  reason: collision with root package name */
        String f874d;

        /* renamed from: e  reason: collision with root package name */
        boolean f875e;

        /* renamed from: f  reason: collision with root package name */
        boolean f876f;

        public p a() {
            return new p(this);
        }

        public b b(boolean z) {
            this.f875e = z;
            return this;
        }

        public b c(IconCompat iconCompat) {
            this.b = iconCompat;
            return this;
        }

        public b d(boolean z) {
            this.f876f = z;
            return this;
        }

        public b e(String str) {
            this.f874d = str;
            return this;
        }

        public b f(CharSequence charSequence) {
            this.a = charSequence;
            return this;
        }

        public b g(String str) {
            this.c = str;
            return this;
        }
    }

    p(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.c = bVar.c;
        this.f871d = bVar.f874d;
        this.f872e = bVar.f875e;
        this.f873f = bVar.f876f;
    }

    public static p a(Person person) {
        return a.a(person);
    }

    public static p b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("icon");
        b bVar = new b();
        bVar.f(bundle.getCharSequence("name"));
        bVar.c(bundle2 != null ? IconCompat.b(bundle2) : null);
        bVar.g(bundle.getString("uri"));
        bVar.e(bundle.getString("key"));
        bVar.b(bundle.getBoolean("isBot"));
        bVar.d(bundle.getBoolean("isImportant"));
        return bVar.a();
    }

    public IconCompat c() {
        return this.b;
    }

    public String d() {
        return this.f871d;
    }

    public CharSequence e() {
        return this.a;
    }

    public String f() {
        return this.c;
    }

    public boolean g() {
        return this.f872e;
    }

    public boolean h() {
        return this.f873f;
    }

    public String i() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        if (this.a == null) {
            return "";
        }
        return "name:" + this.a;
    }

    public Person j() {
        return a.b(this);
    }

    public Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("name", this.a);
        IconCompat iconCompat = this.b;
        bundle.putBundle("icon", iconCompat != null ? iconCompat.x() : null);
        bundle.putString("uri", this.c);
        bundle.putString("key", this.f871d);
        bundle.putBoolean("isBot", this.f872e);
        bundle.putBoolean("isImportant", this.f873f);
        return bundle;
    }
}
