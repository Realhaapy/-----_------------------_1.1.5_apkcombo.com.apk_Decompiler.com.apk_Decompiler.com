package com.google.firebase.messaging;

import com.google.firebase.messaging.c1;
import f.e.a.c.g.h;
import f.e.a.c.g.i;

public final /* synthetic */ class j implements h {
    public final /* synthetic */ FirebaseMessaging a;
    public final /* synthetic */ String b;
    public final /* synthetic */ c1.a c;

    public /* synthetic */ j(FirebaseMessaging firebaseMessaging, String str, c1.a aVar) {
        this.a = firebaseMessaging;
        this.b = str;
        this.c = aVar;
    }

    public final i a(Object obj) {
        return this.a.s(this.b, this.c, (String) obj);
    }
}
