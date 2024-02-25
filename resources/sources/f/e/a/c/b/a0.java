package f.e.a.c.b;

import android.os.Bundle;
import android.util.Log;
import f.e.a.c.g.a;
import f.e.a.c.g.i;
import java.io.IOException;

public final /* synthetic */ class a0 implements a {
    public static final /* synthetic */ a0 a = new a0();

    private /* synthetic */ a0() {
    }

    public final Object a(i iVar) {
        if (iVar.m()) {
            return (Bundle) iVar.i();
        }
        if (Log.isLoggable("Rpc", 3)) {
            String valueOf = String.valueOf(iVar.h());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 22);
            sb.append("Error making request: ");
            sb.append(valueOf);
            Log.d("Rpc", sb.toString());
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", iVar.h());
    }
}
