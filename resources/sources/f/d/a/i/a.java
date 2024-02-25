package f.d.a.i;

import android.content.Context;
import java.io.File;
import java.util.UUID;
import m.y.d.l;

public final class a {
    public static final a a = new a();

    private a() {
    }

    public final File a(Context context) {
        l.d(context, "context");
        String uuid = UUID.randomUUID().toString();
        l.c(uuid, "randomUUID().toString()");
        return new File(context.getCacheDir(), uuid);
    }
}
