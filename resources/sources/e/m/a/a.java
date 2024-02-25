package e.m.a;

import androidx.lifecycle.h;
import androidx.lifecycle.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & v> a b(T t) {
        return new b(t, ((v) t).getViewModelStore());
    }

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void c();
}
