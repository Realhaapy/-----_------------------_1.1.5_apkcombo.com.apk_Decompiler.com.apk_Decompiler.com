package r.b.a;

public class b extends RuntimeException {
    private static final long serialVersionUID = -1632418723876261839L;

    public b(String str) {
        super(str);
    }

    public b(String str, Throwable th) {
        super(str, th);
    }
}
