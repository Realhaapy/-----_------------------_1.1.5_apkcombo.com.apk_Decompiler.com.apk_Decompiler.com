package kotlinx.coroutines;

import kotlinx.coroutines.internal.z;

public final class v1 {
    /* access modifiers changed from: private */
    public static final z a = new z("COMPLETING_ALREADY");
    public static final z b = new z("COMPLETING_WAITING_CHILDREN");
    /* access modifiers changed from: private */
    public static final z c = new z("COMPLETING_RETRY");
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public static final z f4956d = new z("TOO_LATE_TO_CANCEL");
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final z f4957e = new z("SEALED");
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final x0 f4958f = new x0(false);
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final x0 f4959g = new x0(true);

    public static final Object g(Object obj) {
        return obj instanceof i1 ? new j1((i1) obj) : obj;
    }
}
