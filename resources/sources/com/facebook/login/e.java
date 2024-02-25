package com.facebook.login;

import android.content.DialogInterface;
import com.facebook.login.q;
import java.util.Date;

public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ q f1588e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f1589f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ q.b f1590g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f1591h;

    /* renamed from: i  reason: collision with root package name */
    public final /* synthetic */ Date f1592i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ Date f1593j;

    public /* synthetic */ e(q qVar, String str, q.b bVar, String str2, Date date, Date date2) {
        this.f1588e = qVar;
        this.f1589f = str;
        this.f1590g = bVar;
        this.f1591h = str2;
        this.f1592i = date;
        this.f1593j = date2;
    }

    public final void onClick(DialogInterface dialogInterface, int i2) {
        q.M(this.f1588e, this.f1589f, this.f1590g, this.f1591h, this.f1592i, this.f1593j, dialogInterface, i2);
    }
}
