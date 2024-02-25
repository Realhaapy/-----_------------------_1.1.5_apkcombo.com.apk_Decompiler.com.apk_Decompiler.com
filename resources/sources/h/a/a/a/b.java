package h.a.a.a;

import android.annotation.TargetApi;
import android.content.ContentProviderOperation;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.ContactsContract;
import android.text.TextUtils;
import android.util.Log;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

@TargetApi(5)
public class b implements MethodChannel.MethodCallHandler, FlutterPlugin, ActivityAware {
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public static final String[] f4663j = {"contact_id", "display_name", "mimetype", "account_type", "account_name", "data1", "data2", "data5", "data3", "data4", "data6", "data1", "data1", "data2", "data3", "data1", "data1", "data2", "data3", "data1", "data4", "data1", "data2", "data3", "data4", "data5", "data6", "data7", "data8", "data9", "data10"};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public ContentResolver f4664e;

    /* renamed from: f  reason: collision with root package name */
    private MethodChannel f4665f;

    /* renamed from: g  reason: collision with root package name */
    private C0136b f4666g;

    /* renamed from: h  reason: collision with root package name */
    private Resources f4667h;

    /* renamed from: i  reason: collision with root package name */
    private final ExecutorService f4668i = new ThreadPoolExecutor(0, 10, 60, TimeUnit.SECONDS, new ArrayBlockingQueue(1000));

    /* renamed from: h.a.a.a.b$b  reason: collision with other inner class name */
    private class C0136b implements PluginRegistry.ActivityResultListener {

        /* renamed from: e  reason: collision with root package name */
        private MethodChannel.Result f4669e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4670f;

        private C0136b() {
        }

        /* access modifiers changed from: package-private */
        public void a(Object obj) {
            MethodChannel.Result result = this.f4669e;
            if (result != null) {
                result.success(obj);
                this.f4669e = null;
            }
        }

        /* access modifiers changed from: package-private */
        public HashMap b(String str) {
            Cursor query = b.this.f4664e.query(ContactsContract.Data.CONTENT_URI, b.f4663j, "contact_id = ?", new String[]{str}, (String) null);
            try {
                ArrayList d2 = b.this.o(query, this.f4670f);
                if (d2.size() > 0) {
                    return ((a) d2.iterator().next()).d();
                }
                return null;
            } finally {
                if (query != null) {
                    query.close();
                }
            }
        }

        /* access modifiers changed from: package-private */
        public void c() {
            try {
                Intent intent = new Intent("android.intent.action.INSERT", ContactsContract.Contacts.CONTENT_URI);
                intent.putExtra("finishActivityOnSaveCompleted", true);
                h(intent, 52941);
            } catch (Exception unused) {
            }
        }

        /* access modifiers changed from: package-private */
        public void d() {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("vnd.android.cursor.dir/contact");
            h(intent, 52943);
        }

        /* access modifiers changed from: package-private */
        public void e(a aVar) {
            String str = aVar.f4648e;
            try {
                if (b(str) != null) {
                    Uri withAppendedPath = Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str);
                    Intent intent = new Intent("android.intent.action.EDIT");
                    intent.setDataAndType(withAppendedPath, "vnd.android.cursor.item/contact");
                    intent.putExtra("finishActivityOnSaveCompleted", true);
                    h(intent, 52942);
                    return;
                }
                a(2);
            } catch (Exception unused) {
                a(2);
            }
        }

        /* access modifiers changed from: package-private */
        public void f(boolean z) {
            this.f4670f = z;
        }

        /* access modifiers changed from: package-private */
        public void g(MethodChannel.Result result) {
            this.f4669e = result;
        }

        /* access modifiers changed from: package-private */
        public void h(Intent intent, int i2) {
            throw null;
        }

        public boolean onActivityResult(int i2, int i3, Intent intent) {
            if (i2 == 52942 || i2 == 52941) {
                try {
                    a(b(intent.getData().getLastPathSegment()));
                } catch (NullPointerException unused) {
                    a(1);
                }
                return true;
            } else if (i2 != 52943) {
                a(2);
                return false;
            } else if (i3 == 0) {
                a(1);
                return true;
            } else {
                Uri data = intent.getData();
                Cursor query = b.this.f4664e.query(data, (String[]) null, (String) null, (String[]) null, (String) null);
                if (query.moveToFirst()) {
                    b.this.l("openDeviceContactPicker", data.getLastPathSegment(), false, false, false, this.f4670f, this.f4669e);
                } else {
                    Log.e("flutter_contacts", "onActivityResult - cursor.moveToFirst() returns false");
                    a(1);
                }
                query.close();
                return true;
            }
        }
    }

    private class c extends C0136b {

        /* renamed from: h  reason: collision with root package name */
        private final Context f4672h;

        /* renamed from: i  reason: collision with root package name */
        private ActivityPluginBinding f4673i;

        c(b bVar, Context context) {
            super();
            this.f4672h = context;
        }

        /* access modifiers changed from: package-private */
        public void h(Intent intent, int i2) {
            if (this.f4673i == null) {
                this.f4672h.startActivity(intent);
            } else if (intent.resolveActivity(this.f4672h.getPackageManager()) != null) {
                this.f4673i.getActivity().startActivityForResult(intent, i2);
            } else {
                a(2);
            }
        }

        /* access modifiers changed from: package-private */
        public void i(ActivityPluginBinding activityPluginBinding) {
            this.f4673i = activityPluginBinding;
            activityPluginBinding.addActivityResultListener(this);
        }

        /* access modifiers changed from: package-private */
        public void j() {
            this.f4673i.removeActivityResultListener(this);
            this.f4673i = null;
        }
    }

    private static class d extends AsyncTask<Void, Void, byte[]> {
        final a a;
        final boolean b;
        final ContentResolver c;

        /* renamed from: d  reason: collision with root package name */
        final MethodChannel.Result f4674d;

        d(a aVar, boolean z, ContentResolver contentResolver, MethodChannel.Result result) {
            this.a = aVar;
            this.b = z;
            this.c = contentResolver;
            this.f4674d = result;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public byte[] doInBackground(Void... voidArr) {
            return b.t(this.a.f4648e, this.b, this.c);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(byte[] bArr) {
            this.f4674d.success(bArr);
        }
    }

    @TargetApi(3)
    private class e extends AsyncTask<Object, Void, ArrayList<HashMap>> {
        private String a;
        private MethodChannel.Result b;
        private boolean c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f4675d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f4676e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f4677f;

        class a implements Comparator<a> {
            a(e eVar) {
            }

            /* renamed from: a */
            public int compare(a aVar, a aVar2) {
                return aVar.compareTo(aVar2);
            }
        }

        public e(String str, MethodChannel.Result result, boolean z, boolean z2, boolean z3, boolean z4) {
            this.a = str;
            this.b = result;
            this.c = z;
            this.f4675d = z2;
            this.f4676e = z3;
            this.f4677f = z4;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0054, code lost:
            r7 = h.a.a.a.b.d(r0, r7, r6.f4677f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0070, code lost:
            r7 = h.a.a.a.b.d(r1, r7, r6.f4677f);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0078, code lost:
            if (r6.c == false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x007a, code lost:
            r0 = r7.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
            if (r0.hasNext() == false) goto L_0x00a2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
            r1 = (h.a.a.a.a) r0.next();
            r3 = h.a.a.a.b.h(r1.f4648e, r6.f4675d, h.a.a.a.b.a(r6.f4678g));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
            if (r3 == null) goto L_0x009d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
            r1.u = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x009d, code lost:
            r1.u = new byte[0];
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a4, code lost:
            if (r6.f4676e == false) goto L_0x00ae;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
            java.util.Collections.sort(r7, new h.a.a.a.b.e.a(r6));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
            r0 = new java.util.ArrayList<>();
            r7 = r7.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
            if (r7.hasNext() == false) goto L_0x00cb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bd, code lost:
            r0.add(((h.a.a.a.a) r7.next()).d());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cb, code lost:
            return r0;
         */
        @android.annotation.TargetApi(5)
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.util.ArrayList<java.util.HashMap> doInBackground(java.lang.Object... r7) {
            /*
                r6 = this;
                java.lang.String r0 = r6.a
                r0.hashCode()
                int r1 = r0.hashCode()
                r2 = 0
                r3 = -1
                switch(r1) {
                    case -1830951058: goto L_0x0030;
                    case -490500804: goto L_0x0025;
                    case -480477426: goto L_0x001a;
                    case 1510448585: goto L_0x000f;
                    default: goto L_0x000e;
                }
            L_0x000e:
                goto L_0x003a
            L_0x000f:
                java.lang.String r1 = "getContacts"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0018
                goto L_0x003a
            L_0x0018:
                r3 = 3
                goto L_0x003a
            L_0x001a:
                java.lang.String r1 = "getContactsForPhone"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0023
                goto L_0x003a
            L_0x0023:
                r3 = 2
                goto L_0x003a
            L_0x0025:
                java.lang.String r1 = "getContactsForEmail"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x002e
                goto L_0x003a
            L_0x002e:
                r3 = 1
                goto L_0x003a
            L_0x0030:
                java.lang.String r1 = "openDeviceContactPicker"
                boolean r0 = r0.equals(r1)
                if (r0 != 0) goto L_0x0039
                goto L_0x003a
            L_0x0039:
                r3 = 0
            L_0x003a:
                r0 = 0
                switch(r3) {
                    case 0: goto L_0x0066;
                    case 1: goto L_0x005b;
                    case 2: goto L_0x004a;
                    case 3: goto L_0x003f;
                    default: goto L_0x003e;
                }
            L_0x003e:
                return r0
            L_0x003f:
                h.a.a.a.b r1 = h.a.a.a.b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = r1.p(r7, r0)
                goto L_0x0070
            L_0x004a:
                h.a.a.a.b r0 = h.a.a.a.b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = r0.r(r7)
            L_0x0054:
                boolean r1 = r6.f4677f
                java.util.ArrayList r7 = r0.o(r7, r1)
                goto L_0x0076
            L_0x005b:
                h.a.a.a.b r0 = h.a.a.a.b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = r0.q(r7)
                goto L_0x0054
            L_0x0066:
                h.a.a.a.b r1 = h.a.a.a.b.this
                r7 = r7[r2]
                java.lang.String r7 = (java.lang.String) r7
                android.database.Cursor r7 = r1.p(r0, r7)
            L_0x0070:
                boolean r0 = r6.f4677f
                java.util.ArrayList r7 = r1.o(r7, r0)
            L_0x0076:
                boolean r0 = r6.c
                if (r0 == 0) goto L_0x00a2
                java.util.Iterator r0 = r7.iterator()
            L_0x007e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x00a2
                java.lang.Object r1 = r0.next()
                h.a.a.a.a r1 = (h.a.a.a.a) r1
                java.lang.String r3 = r1.f4648e
                boolean r4 = r6.f4675d
                h.a.a.a.b r5 = h.a.a.a.b.this
                android.content.ContentResolver r5 = r5.f4664e
                byte[] r3 = h.a.a.a.b.t(r3, r4, r5)
                if (r3 == 0) goto L_0x009d
                r1.u = r3
                goto L_0x007e
            L_0x009d:
                byte[] r3 = new byte[r2]
                r1.u = r3
                goto L_0x007e
            L_0x00a2:
                boolean r0 = r6.f4676e
                if (r0 == 0) goto L_0x00ae
                h.a.a.a.b$e$a r0 = new h.a.a.a.b$e$a
                r0.<init>(r6)
                java.util.Collections.sort(r7, r0)
            L_0x00ae:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                java.util.Iterator r7 = r7.iterator()
            L_0x00b7:
                boolean r1 = r7.hasNext()
                if (r1 == 0) goto L_0x00cb
                java.lang.Object r1 = r7.next()
                h.a.a.a.a r1 = (h.a.a.a.a) r1
                java.util.HashMap r1 = r1.d()
                r0.add(r1)
                goto L_0x00b7
            L_0x00cb:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: h.a.a.a.b.e.doInBackground(java.lang.Object[]):java.util.ArrayList");
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(ArrayList<HashMap> arrayList) {
            if (arrayList == null) {
                this.b.notImplemented();
            } else {
                this.b.success(arrayList);
            }
        }
    }

    private boolean i(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.RawContacts.CONTENT_URI).withValue("account_type", (Object) null).withValue("account_name", (Object) null).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/name").withValue("data2", aVar.f4650g).withValue("data5", aVar.f4651h).withValue("data3", aVar.f4652i).withValue("data4", aVar.f4653j).withValue("data6", aVar.f4654k).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/note").withValue("data1", aVar.f4657n).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("data1", aVar.f4655l).withValue("data4", aVar.f4656m).build());
        ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("is_super_primary", 1).withValue("data15", aVar.u).withValue("mimetype", "vnd.android.cursor.item/photo");
        arrayList.add(withValue.build());
        withValue.withYieldAllowed(true);
        Iterator<c> it = aVar.f4662s.iterator();
        while (it.hasNext()) {
            c next = it.next();
            ContentProviderOperation.Builder withValue2 = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("data1", next.b);
            int i2 = next.c;
            if (i2 == 0) {
                withValue2.withValue("data2", 0);
                withValue2.withValue("data3", next.a);
            } else {
                withValue2.withValue("data2", Integer.valueOf(i2));
            }
            arrayList.add(withValue2.build());
        }
        Iterator<c> it2 = aVar.f4661r.iterator();
        while (it2.hasNext()) {
            c next2 = it2.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("data1", next2.b).withValue("data2", Integer.valueOf(next2.c)).build());
        }
        Iterator<d> it3 = aVar.t.iterator();
        while (it3.hasNext()) {
            d next3 = it3.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("data2", Integer.valueOf(next3.f4682g)).withValue("data3", next3.a).withValue("data4", next3.b).withValue("data7", next3.c).withValue("data8", next3.f4680e).withValue("data9", next3.f4679d).withValue("data10", next3.f4681f).build());
        }
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValueBackReference("raw_contact_id", 0).withValue("mimetype", "vnd.android.cursor.item/contact_event").withValue("data2", 3).withValue("data1", aVar.f4658o).build());
        try {
            this.f4664e.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean j(a aVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.RawContacts.CONTENT_URI).withSelection("contact_id=?", new String[]{String.valueOf(aVar.f4648e)}).build());
        try {
            this.f4664e.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private void k(a aVar, boolean z, MethodChannel.Result result) {
        new d(aVar, z, this.f4664e, result).executeOnExecutor(this.f4668i, new Void[0]);
    }

    /* access modifiers changed from: private */
    @TargetApi(5)
    public void l(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, MethodChannel.Result result) {
        new e(str, result, z, z2, z3, z4).executeOnExecutor(this.f4668i, new Object[]{str2, Boolean.FALSE});
    }

    private void m(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, MethodChannel.Result result) {
        new e(str, result, z, z2, z3, z4).executeOnExecutor(this.f4668i, new Object[]{str2, Boolean.TRUE});
    }

    private void n(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, MethodChannel.Result result) {
        new e(str, result, z, z2, z3, z4).executeOnExecutor(this.f4668i, new Object[]{str2, Boolean.TRUE});
    }

    /* access modifiers changed from: private */
    public ArrayList<a> o(Cursor cursor, boolean z) {
        ArrayList<c> arrayList;
        c cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (cursor != null && cursor.moveToNext()) {
            String string = cursor.getString(cursor.getColumnIndex("contact_id"));
            if (!linkedHashMap.containsKey(string)) {
                linkedHashMap.put(string, new a(string));
            }
            a aVar = (a) linkedHashMap.get(string);
            String string2 = cursor.getString(cursor.getColumnIndex("mimetype"));
            aVar.f4649f = cursor.getString(cursor.getColumnIndex("display_name"));
            aVar.f4659p = cursor.getString(cursor.getColumnIndex("account_type"));
            aVar.f4660q = cursor.getString(cursor.getColumnIndex("account_name"));
            if (string2.equals("vnd.android.cursor.item/name")) {
                aVar.f4650g = cursor.getString(cursor.getColumnIndex("data2"));
                aVar.f4651h = cursor.getString(cursor.getColumnIndex("data5"));
                aVar.f4652i = cursor.getString(cursor.getColumnIndex("data3"));
                aVar.f4653j = cursor.getString(cursor.getColumnIndex("data4"));
                aVar.f4654k = cursor.getString(cursor.getColumnIndex("data6"));
            } else if (string2.equals("vnd.android.cursor.item/note")) {
                aVar.f4657n = cursor.getString(cursor.getColumnIndex("data1"));
            } else {
                if (string2.equals("vnd.android.cursor.item/phone_v2")) {
                    String string3 = cursor.getString(cursor.getColumnIndex("data1"));
                    if (!TextUtils.isEmpty(string3)) {
                        int i2 = cursor.getInt(cursor.getColumnIndex("data2"));
                        String c2 = c.c(this.f4667h, i2, cursor, z);
                        arrayList = aVar.f4662s;
                        cVar = new c(c2, string3, i2);
                    }
                } else if (string2.equals("vnd.android.cursor.item/email_v2")) {
                    String string4 = cursor.getString(cursor.getColumnIndex("data1"));
                    int i3 = cursor.getInt(cursor.getColumnIndex("data2"));
                    if (!TextUtils.isEmpty(string4)) {
                        String b = c.b(this.f4667h, i3, cursor, z);
                        arrayList = aVar.f4661r;
                        cVar = new c(b, string4, i3);
                    }
                } else if (string2.equals("vnd.android.cursor.item/organization")) {
                    aVar.f4655l = cursor.getString(cursor.getColumnIndex("data1"));
                    aVar.f4656m = cursor.getString(cursor.getColumnIndex("data4"));
                } else if (string2.equals("vnd.android.cursor.item/postal-address_v2")) {
                    int i4 = cursor.getInt(cursor.getColumnIndex("data2"));
                    aVar.t.add(new d(d.b(this.f4667h, i4, cursor, z), cursor.getString(cursor.getColumnIndex("data4")), cursor.getString(cursor.getColumnIndex("data7")), cursor.getString(cursor.getColumnIndex("data9")), cursor.getString(cursor.getColumnIndex("data8")), cursor.getString(cursor.getColumnIndex("data10")), i4));
                } else if (string2.equals("vnd.android.cursor.item/contact_event") && cursor.getInt(cursor.getColumnIndex("data2")) == 3) {
                    aVar.f4658o = cursor.getString(cursor.getColumnIndex("data1"));
                }
                arrayList.add(cVar);
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return new ArrayList<>(linkedHashMap.values());
    }

    /* access modifiers changed from: private */
    public Cursor p(String str, String str2) {
        String str3;
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"vnd.android.cursor.item/note", "vnd.android.cursor.item/email_v2", "vnd.android.cursor.item/phone_v2", "vnd.android.cursor.item/name", "vnd.android.cursor.item/organization", "vnd.android.cursor.item/postal-address_v2", "vnd.android.cursor.item/contact_event", "account_type"}));
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str + "%");
            str3 = "display_name LIKE ?";
        } else {
            str3 = "(mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR mimetype=? OR account_type=?)";
        }
        if (str2 != null) {
            arrayList.add(str2);
            str3 = str3 + " AND contact_id =?";
        }
        return this.f4664e.query(ContactsContract.Data.CONTENT_URI, f4663j, str3, (String[]) arrayList.toArray(new String[arrayList.size()]), (String) null);
    }

    /* access modifiers changed from: private */
    public Cursor q(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(new String[]{"%" + str + "%"}));
        return this.f4664e.query(ContactsContract.Data.CONTENT_URI, f4663j, "data1 LIKE ?", (String[]) arrayList.toArray(new String[arrayList.size()]), (String) null);
    }

    /* access modifiers changed from: private */
    public Cursor r(String str) {
        if (str.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Cursor query = this.f4664e.query(Uri.withAppendedPath(ContactsContract.PhoneLookup.CONTENT_FILTER_URI, Uri.encode(str)), new String[]{"_id"}, (String) null, (String[]) null, (String) null);
        while (query != null && query.moveToNext()) {
            arrayList.add(query.getString(query.getColumnIndex("_id")));
        }
        if (query != null) {
            query.close();
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        String replace = arrayList.toString().replace("[", "(").replace("]", ")");
        return this.f4664e.query(ContactsContract.Data.CONTENT_URI, f4663j, "contact_id IN " + replace, (String[]) null, (String) null);
    }

    private void s(BinaryMessenger binaryMessenger, Context context) {
        MethodChannel methodChannel = new MethodChannel(binaryMessenger, "github.com/clovisnicolas/flutter_contacts");
        this.f4665f = methodChannel;
        methodChannel.setMethodCallHandler(this);
        this.f4664e = context.getContentResolver();
    }

    /* access modifiers changed from: private */
    public static byte[] t(String str, boolean z, ContentResolver contentResolver) {
        try {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, ContentUris.withAppendedId(ContactsContract.Contacts.CONTENT_URI, Long.parseLong(str)), z);
            if (openContactPhotoInputStream == null) {
                return null;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(openContactPhotoInputStream);
            openContactPhotoInputStream.close();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            decodeStream.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException e2) {
            Log.e("flutter_contacts", e2.getMessage());
            return null;
        }
    }

    private void u(MethodChannel.Result result, boolean z) {
        C0136b bVar = this.f4666g;
        if (bVar != null) {
            bVar.g(result);
            this.f4666g.f(z);
            this.f4666g.d();
            return;
        }
        result.success(2);
    }

    private boolean v(a aVar) {
        a aVar2 = aVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/organization"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/phone_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/email_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/note"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/postal-address_v2"}).build());
        arrayList.add(ContentProviderOperation.newDelete(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/photo"}).build());
        arrayList.add(ContentProviderOperation.newUpdate(ContactsContract.Data.CONTENT_URI).withSelection("contact_id=? AND mimetype=?", new String[]{String.valueOf(aVar2.f4648e), "vnd.android.cursor.item/name"}).withValue("data2", aVar2.f4650g).withValue("data5", aVar2.f4651h).withValue("data3", aVar2.f4652i).withValue("data4", aVar2.f4653j).withValue("data6", aVar2.f4654k).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/organization").withValue("raw_contact_id", aVar2.f4648e).withValue("data2", 1).withValue("data1", aVar2.f4655l).withValue("data4", aVar2.f4656m).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/note").withValue("raw_contact_id", aVar2.f4648e).withValue("data1", aVar2.f4657n).build());
        arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("raw_contact_id", aVar2.f4648e).withValue("is_super_primary", 1).withValue("data15", aVar2.u).withValue("mimetype", "vnd.android.cursor.item/photo").build());
        Iterator<c> it = aVar2.f4662s.iterator();
        while (it.hasNext()) {
            c next = it.next();
            ContentProviderOperation.Builder withValue = ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/phone_v2").withValue("raw_contact_id", aVar2.f4648e).withValue("data1", next.b);
            int i2 = next.c;
            if (i2 == 0) {
                withValue.withValue("data2", 0);
                withValue.withValue("data3", next.a);
            } else {
                withValue.withValue("data2", Integer.valueOf(i2));
            }
            arrayList.add(withValue.build());
        }
        Iterator<c> it2 = aVar2.f4661r.iterator();
        while (it2.hasNext()) {
            c next2 = it2.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/email_v2").withValue("raw_contact_id", aVar2.f4648e).withValue("data1", next2.b).withValue("data2", Integer.valueOf(next2.c)).build());
        }
        Iterator<d> it3 = aVar2.t.iterator();
        while (it3.hasNext()) {
            d next3 = it3.next();
            arrayList.add(ContentProviderOperation.newInsert(ContactsContract.Data.CONTENT_URI).withValue("mimetype", "vnd.android.cursor.item/postal-address_v2").withValue("raw_contact_id", aVar2.f4648e).withValue("data2", Integer.valueOf(next3.f4682g)).withValue("data4", next3.b).withValue("data7", next3.c).withValue("data8", next3.f4680e).withValue("data9", next3.f4679d).withValue("data10", next3.f4681f).build());
        }
        try {
            this.f4664e.applyBatch("com.android.contacts", arrayList);
            return true;
        } catch (Exception e2) {
            Log.e("TAG", "Exception encountered while inserting contact: ");
            e2.printStackTrace();
            return false;
        }
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        C0136b bVar = this.f4666g;
        if (bVar instanceof c) {
            ((c) bVar).i(activityPluginBinding);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f4667h = flutterPluginBinding.getApplicationContext().getResources();
        s(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
        this.f4666g = new c(this, flutterPluginBinding.getApplicationContext());
    }

    public void onDetachedFromActivity() {
        C0136b bVar = this.f4666g;
        if (bVar instanceof c) {
            ((c) bVar).j();
        }
    }

    public void onDetachedFromActivityForConfigChanges() {
        C0136b bVar = this.f4666g;
        if (bVar instanceof c) {
            ((c) bVar).j();
        }
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f4665f.setMethodCallHandler((MethodChannel.MethodCallHandler) null);
        this.f4665f = null;
        this.f4664e = null;
        this.f4666g = null;
        this.f4667h = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        if (r1.equals("addContact") == false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010f, code lost:
        r12.success(2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01c8, code lost:
        r12.success((java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ce, code lost:
        r12.error((java.lang.String) null, r0, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMethodCall(io.flutter.plugin.common.MethodCall r11, io.flutter.plugin.common.MethodChannel.Result r12) {
        /*
            r10 = this;
            java.lang.String r1 = r11.method
            r1.hashCode()
            int r2 = r1.hashCode()
            r3 = 2
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r5 = -1
            switch(r2) {
                case -1830951058: goto L_0x0079;
                case -1794825126: goto L_0x006e;
                case -1435206593: goto L_0x0065;
                case -544424169: goto L_0x005a;
                case -490500804: goto L_0x004f;
                case -480477426: goto L_0x0044;
                case 290055247: goto L_0x0039;
                case 331036779: goto L_0x002e;
                case 746754037: goto L_0x0022;
                case 1510448585: goto L_0x0015;
                default: goto L_0x0012;
            }
        L_0x0012:
            r3 = -1
            goto L_0x0083
        L_0x0015:
            java.lang.String r2 = "getContacts"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x001e
            goto L_0x0012
        L_0x001e:
            r3 = 9
            goto L_0x0083
        L_0x0022:
            java.lang.String r2 = "deleteContact"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x002b
            goto L_0x0012
        L_0x002b:
            r3 = 8
            goto L_0x0083
        L_0x002e:
            java.lang.String r2 = "openExistingContact"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0037
            goto L_0x0012
        L_0x0037:
            r3 = 7
            goto L_0x0083
        L_0x0039:
            java.lang.String r2 = "getAvatar"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0042
            goto L_0x0012
        L_0x0042:
            r3 = 6
            goto L_0x0083
        L_0x0044:
            java.lang.String r2 = "getContactsForPhone"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004d
            goto L_0x0012
        L_0x004d:
            r3 = 5
            goto L_0x0083
        L_0x004f:
            java.lang.String r2 = "getContactsForEmail"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0058
            goto L_0x0012
        L_0x0058:
            r3 = 4
            goto L_0x0083
        L_0x005a:
            java.lang.String r2 = "updateContact"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0063
            goto L_0x0012
        L_0x0063:
            r3 = 3
            goto L_0x0083
        L_0x0065:
            java.lang.String r2 = "addContact"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0083
            goto L_0x0012
        L_0x006e:
            java.lang.String r2 = "openContactForm"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0077
            goto L_0x0012
        L_0x0077:
            r3 = 1
            goto L_0x0083
        L_0x0079:
            java.lang.String r2 = "openDeviceContactPicker"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0082
            goto L_0x0012
        L_0x0082:
            r3 = 0
        L_0x0083:
            java.lang.String r1 = "contact"
            java.lang.String r2 = "orderByGivenName"
            java.lang.String r5 = "withThumbnails"
            java.lang.String r6 = "photoHighResolution"
            java.lang.String r8 = "androidLocalizedLabels"
            r9 = 0
            switch(r3) {
                case 0: goto L_0x01ee;
                case 1: goto L_0x01d2;
                case 2: goto L_0x01ba;
                case 3: goto L_0x01a8;
                case 4: goto L_0x016b;
                case 5: goto L_0x012d;
                case 6: goto L_0x0114;
                case 7: goto L_0x00e8;
                case 8: goto L_0x00d4;
                case 9: goto L_0x0096;
                default: goto L_0x0091;
            }
        L_0x0091:
            r12.notImplemented()
            goto L_0x01fb
        L_0x0096:
            java.lang.String r1 = r11.method
            java.lang.String r3 = "query"
            java.lang.Object r3 = r11.argument(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r11.argument(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r5 = r11.argument(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r2 = r11.argument(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r0 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r12
            r0.l(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01fb
        L_0x00d4:
            java.lang.Object r0 = r11.arguments
            java.util.HashMap r0 = (java.util.HashMap) r0
            h.a.a.a.a r0 = h.a.a.a.a.c(r0)
            boolean r0 = r10.j(r0)
            if (r0 == 0) goto L_0x00e4
            goto L_0x01c8
        L_0x00e4:
            java.lang.String r0 = "Failed to delete the contact, make sure it has a valid identifier"
            goto L_0x01ce
        L_0x00e8:
            java.lang.Object r1 = r11.argument(r1)
            java.util.HashMap r1 = (java.util.HashMap) r1
            h.a.a.a.a r1 = h.a.a.a.a.c(r1)
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            h.a.a.a.b$b r2 = r10.f4666g
            if (r2 == 0) goto L_0x010f
            r2.g(r12)
            h.a.a.a.b$b r2 = r10.f4666g
            r2.f(r0)
            h.a.a.a.b$b r0 = r10.f4666g
            r0.e(r1)
            goto L_0x01fb
        L_0x010f:
            r12.success(r4)
            goto L_0x01fb
        L_0x0114:
            java.lang.Object r1 = r11.argument(r1)
            java.util.HashMap r1 = (java.util.HashMap) r1
            h.a.a.a.a r1 = h.a.a.a.a.c(r1)
            java.lang.Object r0 = r11.argument(r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.k(r1, r0, r12)
            goto L_0x01fb
        L_0x012d:
            java.lang.String r1 = r11.method
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r11.argument(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r11.argument(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r5 = r11.argument(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r2 = r11.argument(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r0 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r12
            r0.n(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01fb
        L_0x016b:
            java.lang.String r1 = r11.method
            java.lang.String r3 = "email"
            java.lang.Object r3 = r11.argument(r3)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r11.argument(r5)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            java.lang.Object r5 = r11.argument(r6)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            java.lang.Object r2 = r11.argument(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r6 = r2.booleanValue()
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r8 = r0.booleanValue()
            r0 = r10
            r2 = r3
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r8
            r7 = r12
            r0.m(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x01fb
        L_0x01a8:
            java.lang.Object r0 = r11.arguments
            java.util.HashMap r0 = (java.util.HashMap) r0
            h.a.a.a.a r0 = h.a.a.a.a.c(r0)
            boolean r0 = r10.v(r0)
            if (r0 == 0) goto L_0x01b7
            goto L_0x01c8
        L_0x01b7:
            java.lang.String r0 = "Failed to update the contact, make sure it has a valid identifier"
            goto L_0x01ce
        L_0x01ba:
            java.lang.Object r0 = r11.arguments
            java.util.HashMap r0 = (java.util.HashMap) r0
            h.a.a.a.a r0 = h.a.a.a.a.c(r0)
            boolean r0 = r10.i(r0)
            if (r0 == 0) goto L_0x01cc
        L_0x01c8:
            r12.success(r9)
            goto L_0x01fb
        L_0x01cc:
            java.lang.String r0 = "Failed to add the contact"
        L_0x01ce:
            r12.error(r9, r0, r9)
            goto L_0x01fb
        L_0x01d2:
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            h.a.a.a.b$b r1 = r10.f4666g
            if (r1 == 0) goto L_0x010f
            r1.g(r12)
            h.a.a.a.b$b r1 = r10.f4666g
            r1.f(r0)
            h.a.a.a.b$b r0 = r10.f4666g
            r0.c()
            goto L_0x01fb
        L_0x01ee:
            java.lang.Object r0 = r11.argument(r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r10.u(r12, r0)
        L_0x01fb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.a.a.a.b.onMethodCall(io.flutter.plugin.common.MethodCall, io.flutter.plugin.common.MethodChannel$Result):void");
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        C0136b bVar = this.f4666g;
        if (bVar instanceof c) {
            ((c) bVar).i(activityPluginBinding);
        }
    }
}
