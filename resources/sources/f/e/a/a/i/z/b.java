package f.e.a.a.i.z;

public final class b {
    public static <TInput, TResult, TException extends Throwable> TResult a(int i2, TInput tinput, a<TInput, TResult, TException> aVar, c<TInput, TResult> cVar) {
        TResult a;
        if (i2 < 1) {
            return aVar.a(tinput);
        }
        do {
            a = aVar.a(tinput);
            tinput = cVar.a(tinput, a);
            if (tinput == null || i2 - 1 < 1) {
                return a;
            }
            a = aVar.a(tinput);
            tinput = cVar.a(tinput, a);
            break;
        } while (i2 - 1 < 1);
        return a;
    }
}
