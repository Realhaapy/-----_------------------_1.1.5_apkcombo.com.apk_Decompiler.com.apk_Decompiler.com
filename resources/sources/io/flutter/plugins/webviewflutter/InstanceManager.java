package io.flutter.plugins.webviewflutter;

import android.util.LongSparseArray;
import java.util.HashMap;
import java.util.Map;

public class InstanceManager {
    private final LongSparseArray<Object> instanceIdsToInstances = new LongSparseArray<>();
    private final Map<Object, Long> instancesToInstanceIds = new HashMap();

    public void addInstance(Object obj, long j2) {
        this.instancesToInstanceIds.put(obj, Long.valueOf(j2));
        this.instanceIdsToInstances.append(j2, obj);
    }

    public Object getInstance(long j2) {
        return this.instanceIdsToInstances.get(j2);
    }

    public Long getInstanceId(Object obj) {
        return this.instancesToInstanceIds.get(obj);
    }

    public Long removeInstance(Object obj) {
        Long l2 = this.instancesToInstanceIds.get(obj);
        if (l2 != null) {
            this.instanceIdsToInstances.remove(l2.longValue());
            this.instancesToInstanceIds.remove(obj);
        }
        return l2;
    }

    public Object removeInstanceWithId(long j2) {
        Object obj = this.instanceIdsToInstances.get(j2);
        if (obj != null) {
            this.instanceIdsToInstances.remove(j2);
            this.instancesToInstanceIds.remove(obj);
        }
        return obj;
    }
}
