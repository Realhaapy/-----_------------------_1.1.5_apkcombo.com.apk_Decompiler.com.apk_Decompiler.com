package f.e.a.c.g;

public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(i<?> iVar) {
        String str;
        if (!iVar.l()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception h2 = iVar.h();
        if (h2 != null) {
            str = "failure";
        } else if (iVar.m()) {
            String valueOf = String.valueOf(iVar.i());
            String.valueOf(valueOf).length();
            str = "result ".concat(String.valueOf(valueOf));
        } else {
            str = iVar.k() ? "cancellation" : "unknown issue";
        }
        return new b(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), h2);
    }
}
