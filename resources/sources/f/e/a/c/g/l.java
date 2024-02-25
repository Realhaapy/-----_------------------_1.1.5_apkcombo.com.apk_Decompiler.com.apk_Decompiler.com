package f.e.a.c.g;

import com.google.android.gms.common.internal.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class l {
    public static <TResult> TResult a(i<TResult> iVar) {
        n.f();
        n.i(iVar, "Task must not be null");
        if (iVar.l()) {
            return k(iVar);
        }
        o oVar = new o((n) null);
        l(iVar, oVar);
        oVar.c();
        return k(iVar);
    }

    public static <TResult> TResult b(i<TResult> iVar, long j2, TimeUnit timeUnit) {
        n.f();
        n.i(iVar, "Task must not be null");
        n.i(timeUnit, "TimeUnit must not be null");
        if (iVar.l()) {
            return k(iVar);
        }
        o oVar = new o((n) null);
        l(iVar, oVar);
        if (oVar.d(j2, timeUnit)) {
            return k(iVar);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    @Deprecated
    public static <TResult> i<TResult> c(Callable<TResult> callable) {
        return d(k.a, callable);
    }

    @Deprecated
    public static <TResult> i<TResult> d(Executor executor, Callable<TResult> callable) {
        n.i(executor, "Executor must not be null");
        n.i(callable, "Callback must not be null");
        j0 j0Var = new j0();
        executor.execute(new k0(j0Var, callable));
        return j0Var;
    }

    public static <TResult> i<TResult> e(Exception exc) {
        j0 j0Var = new j0();
        j0Var.p(exc);
        return j0Var;
    }

    public static <TResult> i<TResult> f(TResult tresult) {
        j0 j0Var = new j0();
        j0Var.q(tresult);
        return j0Var;
    }

    public static i<Void> g(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f((Object) null);
        }
        for (i requireNonNull : collection) {
            Objects.requireNonNull(requireNonNull, "null tasks are not accepted");
        }
        j0 j0Var = new j0();
        q qVar = new q(collection.size(), j0Var);
        for (i l2 : collection) {
            l(l2, qVar);
        }
        return j0Var;
    }

    public static i<Void> h(i<?>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? f((Object) null) : g(Arrays.asList(iVarArr));
    }

    public static i<List<i<?>>> i(Collection<? extends i<?>> collection) {
        if (collection == null || collection.isEmpty()) {
            return f(Collections.emptyList());
        }
        return g(collection).g(k.a, new m(collection));
    }

    public static i<List<i<?>>> j(i<?>... iVarArr) {
        return (iVarArr == null || iVarArr.length == 0) ? f(Collections.emptyList()) : i(Arrays.asList(iVarArr));
    }

    private static <TResult> TResult k(i<TResult> iVar) {
        if (iVar.m()) {
            return iVar.i();
        }
        if (iVar.k()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(iVar.h());
    }

    private static <T> void l(i<T> iVar, p<? super T> pVar) {
        Executor executor = k.b;
        iVar.e(executor, pVar);
        iVar.d(executor, pVar);
        iVar.a(executor, pVar);
    }
}
