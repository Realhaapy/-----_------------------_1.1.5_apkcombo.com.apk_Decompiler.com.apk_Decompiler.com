package f.e.a.c.b;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import e.e.g;
import f.e.a.c.d.b.a;
import f.e.a.c.g.i;
import f.e.a.c.g.j;
import f.e.a.c.g.l;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class d {

    /* renamed from: h  reason: collision with root package name */
    private static int f3843h;

    /* renamed from: i  reason: collision with root package name */
    private static PendingIntent f3844i;

    /* renamed from: j  reason: collision with root package name */
    private static final Executor f3845j = e0.f3852e;

    /* renamed from: k  reason: collision with root package name */
    private static final Pattern f3846k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    private final g<String, j<Bundle>> a = new g<>();
    private final Context b;
    private final y c;

    /* renamed from: d  reason: collision with root package name */
    private final ScheduledExecutorService f3847d;

    /* renamed from: e  reason: collision with root package name */
    private Messenger f3848e;

    /* renamed from: f  reason: collision with root package name */
    private Messenger f3849f;

    /* renamed from: g  reason: collision with root package name */
    private i f3850g;

    public d(Context context) {
        this.b = context;
        this.c = new y(context);
        this.f3848e = new Messenger(new f(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f3847d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ i b(Bundle bundle) {
        return j(bundle) ? l.f(null) : l.f(bundle);
    }

    static /* bridge */ /* synthetic */ void d(d dVar, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new h());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof i) {
                        dVar.f3850g = (i) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        dVar.f3849f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if ("com.google.android.c2dm.intent.REGISTRATION".equals(action)) {
                    String stringExtra = intent2.getStringExtra("registration_id");
                    if (stringExtra == null) {
                        stringExtra = intent2.getStringExtra("unregistered");
                    }
                    if (stringExtra == null) {
                        String stringExtra2 = intent2.getStringExtra("error");
                        if (stringExtra2 == null) {
                            String valueOf = String.valueOf(intent2.getExtras());
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
                            sb.append("Unexpected response, no error or registration id ");
                            sb.append(valueOf);
                            Log.w("Rpc", sb.toString());
                            return;
                        }
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", stringExtra2.length() != 0 ? "Received InstanceID error ".concat(stringExtra2) : new String("Received InstanceID error "));
                        }
                        if (stringExtra2.startsWith("|")) {
                            String[] split = stringExtra2.split("\\|");
                            if (split.length <= 2 || !"ID".equals(split[1])) {
                                Log.w("Rpc", stringExtra2.length() != 0 ? "Unexpected structured response ".concat(stringExtra2) : new String("Unexpected structured response "));
                                return;
                            }
                            String str = split[2];
                            String str2 = split[3];
                            if (str2.startsWith(":")) {
                                str2 = str2.substring(1);
                            }
                            dVar.i(str, intent2.putExtra("error", str2).getExtras());
                            return;
                        }
                        synchronized (dVar.a) {
                            for (int i2 = 0; i2 < dVar.a.size(); i2++) {
                                dVar.i(dVar.a.i(i2), intent2.getExtras());
                            }
                        }
                        return;
                    }
                    Matcher matcher = f3846k.matcher(stringExtra);
                    if (matcher.matches()) {
                        String group = matcher.group(1);
                        String group2 = matcher.group(2);
                        if (group != null) {
                            Bundle extras = intent2.getExtras();
                            extras.putString("registration_id", group2);
                            dVar.i(group, extras);
                            return;
                        }
                        return;
                    } else if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", stringExtra.length() != 0 ? "Unexpected response string: ".concat(stringExtra) : new String("Unexpected response string: "));
                        return;
                    } else {
                        return;
                    }
                } else if (Log.isLoggable("Rpc", 3)) {
                    String valueOf2 = String.valueOf(action);
                    Log.d("Rpc", valueOf2.length() != 0 ? "Unexpected response action: ".concat(valueOf2) : new String("Unexpected response action: "));
                    return;
                } else {
                    return;
                }
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    private final i<Bundle> f(Bundle bundle) {
        String g2 = g();
        j jVar = new j();
        synchronized (this.a) {
            this.a.put(g2, jVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        intent.setAction(this.c.b() == 2 ? "com.google.iid.TOKEN_REQUEST" : "com.google.android.c2dm.intent.REGISTER");
        intent.putExtras(bundle);
        h(this.b, intent);
        StringBuilder sb = new StringBuilder(String.valueOf(g2).length() + 5);
        sb.append("|ID|");
        sb.append(g2);
        sb.append("|");
        intent.putExtra("kid", sb.toString());
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(intent.getExtras());
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 8);
            sb2.append("Sending ");
            sb2.append(valueOf);
            Log.d("Rpc", sb2.toString());
        }
        intent.putExtra("google.messenger", this.f3848e);
        if (!(this.f3849f == null && this.f3850g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f3849f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    this.f3850g.b(obtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
            }
            jVar.a().c(f3845j, new b0(this, g2, this.f3847d.schedule(new d0(jVar), 30, TimeUnit.SECONDS)));
            return jVar.a();
        }
        if (this.c.b() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        jVar.a().c(f3845j, new b0(this, g2, this.f3847d.schedule(new d0(jVar), 30, TimeUnit.SECONDS)));
        return jVar.a();
    }

    private static synchronized String g() {
        String num;
        synchronized (d.class) {
            int i2 = f3843h;
            f3843h = i2 + 1;
            num = Integer.toString(i2);
        }
        return num;
    }

    private static synchronized void h(Context context, Intent intent) {
        synchronized (d.class) {
            if (f3844i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f3844i = a.a(context, 0, intent2, a.a);
            }
            intent.putExtra("app", f3844i);
        }
    }

    private final void i(String str, Bundle bundle) {
        synchronized (this.a) {
            j remove = this.a.remove(str);
            if (remove == null) {
                String valueOf = String.valueOf(str);
                Log.w("Rpc", valueOf.length() != 0 ? "Missing callback for ".concat(valueOf) : new String("Missing callback for "));
                return;
            }
            remove.c(bundle);
        }
    }

    private static boolean j(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public i<Bundle> a(Bundle bundle) {
        return this.c.a() < 12000000 ? this.c.b() != 0 ? f(bundle).g(f3845j, new z(this, bundle)) : l.e(new IOException("MISSING_INSTANCEID_SERVICE")) : x.b(this.b).d(1, bundle).f(f3845j, a0.a);
    }

    public final /* synthetic */ i c(Bundle bundle, i iVar) {
        return (iVar.m() && j((Bundle) iVar.i())) ? f(bundle).o(f3845j, c0.a) : iVar;
    }

    public final /* synthetic */ void e(String str, ScheduledFuture scheduledFuture, i iVar) {
        synchronized (this.a) {
            this.a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
