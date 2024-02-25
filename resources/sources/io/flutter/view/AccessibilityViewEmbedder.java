package io.flutter.view;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import io.flutter.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Keep
class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray<>();
    private int nextFlutterId;
    private final Map<ViewAndId, Integer> originToFlutterId;
    private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors();
    private final View rootAccessibilityView;

    private static class ReflectionAccessors {
        private final Field childNodeIdsField;
        private final Method getChildId;
        private final Method getParentNodeId;
        private final Method getRecordSourceNodeId;
        private final Method getSourceNodeId;
        private final Method longArrayGetIndex;

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.lang.reflect.Field} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.reflect.Method} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.lang.reflect.Field} */
        /* JADX WARNING: Multi-variable type inference failed */
        @android.annotation.SuppressLint({"DiscouragedPrivateApi,PrivateApi"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private ReflectionAccessors() {
            /*
                r10 = this;
                java.lang.String r0 = "getSourceNodeId"
                java.lang.String r1 = "AccessibilityBridge"
                r10.<init>()
                r2 = 0
                r3 = 0
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r4 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0012 }
                java.lang.reflect.Method r4 = r4.getMethod(r0, r5)     // Catch:{ NoSuchMethodException -> 0x0012 }
                goto L_0x0018
            L_0x0012:
                java.lang.String r4 = "can't invoke AccessibilityNodeInfo#getSourceNodeId with reflection"
                io.flutter.Log.w(r1, r4)
                r4 = r3
            L_0x0018:
                java.lang.Class<android.view.accessibility.AccessibilityRecord> r5 = android.view.accessibility.AccessibilityRecord.class
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0021 }
                java.lang.reflect.Method r0 = r5.getMethod(r0, r6)     // Catch:{ NoSuchMethodException -> 0x0021 }
                goto L_0x0027
            L_0x0021:
                java.lang.String r0 = "can't invoke AccessibiiltyRecord#getSourceNodeId with reflection"
                io.flutter.Log.w(r1, r0)
                r0 = r3
            L_0x0027:
                int r5 = android.os.Build.VERSION.SDK_INT
                r6 = 26
                r7 = 1
                if (r5 > r6) goto L_0x0058
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "getParentNodeId"
                java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x0039 }
                java.lang.reflect.Method r5 = r5.getMethod(r6, r8)     // Catch:{ NoSuchMethodException -> 0x0039 }
                goto L_0x003f
            L_0x0039:
                java.lang.String r5 = "can't invoke getParentNodeId with reflection"
                io.flutter.Log.w(r1, r5)
                r5 = r3
            L_0x003f:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r6 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r8 = "getChildId"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ NoSuchMethodException -> 0x004f }
                r7[r2] = r9     // Catch:{ NoSuchMethodException -> 0x004f }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ NoSuchMethodException -> 0x004f }
                r2 = r3
                goto L_0x0056
            L_0x004f:
                java.lang.String r2 = "can't invoke getChildId with reflection"
                io.flutter.Log.w(r1, r2)
                r1 = r3
                r2 = r1
            L_0x0056:
                r3 = r5
                goto L_0x007f
            L_0x0058:
                java.lang.Class<android.view.accessibility.AccessibilityNodeInfo> r5 = android.view.accessibility.AccessibilityNodeInfo.class
                java.lang.String r6 = "mChildNodeIds"
                java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r5.setAccessible(r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r6 = "android.util.LongArray"
                java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.String r8 = "get"
                java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r7[r2] = r9     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                java.lang.reflect.Method r1 = r6.getMethod(r8, r7)     // Catch:{ ClassNotFoundException | NoSuchFieldException | NoSuchMethodException | NullPointerException -> 0x0078 }
                r2 = r1
                r1 = r3
                goto L_0x0080
            L_0x0078:
                java.lang.String r2 = "can't access childNodeIdsField with reflection"
                io.flutter.Log.w(r1, r2)
                r1 = r3
                r2 = r1
            L_0x007f:
                r5 = r2
            L_0x0080:
                r10.getSourceNodeId = r4
                r10.getParentNodeId = r3
                r10.getRecordSourceNodeId = r0
                r10.getChildId = r1
                r10.childNodeIdsField = r5
                r10.longArrayGetIndex = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.AccessibilityViewEmbedder.ReflectionAccessors.<init>():void");
        }

        /* access modifiers changed from: private */
        public Long getChildId(AccessibilityNodeInfo accessibilityNodeInfo, int i2) {
            String str;
            Method method = this.getChildId;
            if (method == null && (this.childNodeIdsField == null || this.longArrayGetIndex == null)) {
                return null;
            }
            if (method != null) {
                try {
                    return (Long) method.invoke(accessibilityNodeInfo, new Object[]{Integer.valueOf(i2)});
                } catch (IllegalAccessException e2) {
                    e = e2;
                    str = "Failed to access getChildId method.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (InvocationTargetException e3) {
                    e = e3;
                    str = "The getChildId method threw an exception when invoked.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            } else {
                try {
                    return Long.valueOf(((Long) this.longArrayGetIndex.invoke(this.childNodeIdsField.get(accessibilityNodeInfo), new Object[]{Integer.valueOf(i2)})).longValue());
                } catch (IllegalAccessException e4) {
                    e = e4;
                    str = "Failed to access longArrayGetIndex method or the childNodeId field.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                } catch (ArrayIndexOutOfBoundsException | InvocationTargetException e5) {
                    e = e5;
                    str = "The longArrayGetIndex method threw an exception when invoked.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return null;
                }
            }
        }

        /* access modifiers changed from: private */
        public Long getParentNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.getParentNodeId;
            if (method != null) {
                try {
                    return Long.valueOf(((Long) method.invoke(accessibilityNodeInfo, new Object[0])).longValue());
                } catch (IllegalAccessException e2) {
                    e = e2;
                    str = "Failed to access getParentNodeId method.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return yoinkParentIdFromParcel(accessibilityNodeInfo);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    str = "The getParentNodeId method threw an exception when invoked.";
                    Log.w(AccessibilityViewEmbedder.TAG, str, e);
                    return yoinkParentIdFromParcel(accessibilityNodeInfo);
                }
            }
            return yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        /* access modifiers changed from: private */
        public Long getRecordSourceNodeId(AccessibilityRecord accessibilityRecord) {
            String str;
            Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityRecord, new Object[0]);
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "Failed to access the getRecordSourceNodeId method.";
                Log.w(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e3) {
                e = e3;
                str = "The getRecordSourceNodeId method threw an exception when invoked.";
                Log.w(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public Long getSourceNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            String str;
            Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                return (Long) method.invoke(accessibilityNodeInfo, new Object[0]);
            } catch (IllegalAccessException e2) {
                e = e2;
                str = "Failed to access getSourceNodeId method.";
                Log.w(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            } catch (InvocationTargetException e3) {
                e = e3;
                str = "The getSourceNodeId method threw an exception when invoked.";
                Log.w(AccessibilityViewEmbedder.TAG, str, e);
                return null;
            }
        }

        /* access modifiers changed from: private */
        public static int getVirtualNodeId(long j2) {
            return (int) (j2 >> 32);
        }

        private static boolean isBitSet(long j2, int i2) {
            return (j2 & (1 << i2)) != 0;
        }

        private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
            Long l2 = null;
            if (Build.VERSION.SDK_INT < 26) {
                Log.w(AccessibilityViewEmbedder.TAG, "Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            Parcel obtain2 = Parcel.obtain();
            obtain2.setDataPosition(0);
            obtain.writeToParcel(obtain2, 0);
            obtain2.setDataPosition(0);
            long readLong = obtain2.readLong();
            if (isBitSet(readLong, 0)) {
                obtain2.readInt();
            }
            if (isBitSet(readLong, 1)) {
                obtain2.readLong();
            }
            if (isBitSet(readLong, 2)) {
                obtain2.readInt();
            }
            if (isBitSet(readLong, 3)) {
                l2 = Long.valueOf(obtain2.readLong());
            }
            obtain2.recycle();
            return l2;
        }
    }

    private static class ViewAndId {
        final int id;
        final View view;

        private ViewAndId(View view2, int i2) {
            this.view = view2;
            this.id = i2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ViewAndId)) {
                return false;
            }
            ViewAndId viewAndId = (ViewAndId) obj;
            return this.id == viewAndId.id && this.view.equals(viewAndId.view);
        }

        public int hashCode() {
            return ((this.view.hashCode() + 31) * 31) + this.id;
        }
    }

    AccessibilityViewEmbedder(View view, int i2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = i2;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        int i2;
        for (int i3 = 0; i3 < accessibilityNodeInfo.getChildCount(); i3++) {
            Long access$500 = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i3);
            if (access$500 != null) {
                int access$200 = ReflectionAccessors.getVirtualNodeId(access$500.longValue());
                ViewAndId viewAndId = new ViewAndId(view, access$200);
                if (this.originToFlutterId.containsKey(viewAndId)) {
                    i2 = this.originToFlutterId.get(viewAndId).intValue();
                } else {
                    int i4 = this.nextFlutterId;
                    this.nextFlutterId = i4 + 1;
                    cacheVirtualIdMappings(view, access$200, i4);
                    i2 = i4;
                }
                accessibilityNodeInfo2.addChild(this.rootAccessibilityView, i2);
            }
        }
    }

    private void cacheVirtualIdMappings(View view, int i2, int i3) {
        ViewAndId viewAndId = new ViewAndId(view, i2);
        this.originToFlutterId.put(viewAndId, Integer.valueOf(i3));
        this.flutterIdToOrigin.put(i3, viewAndId);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int i2, View view) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.rootAccessibilityView, i2);
        obtain.setPackageName(this.rootAccessibilityView.getContext().getPackageName());
        obtain.setSource(this.rootAccessibilityView, i2);
        obtain.setClassName(accessibilityNodeInfo.getClassName());
        copyAccessibilityFields(accessibilityNodeInfo, obtain);
        setFlutterNodesTranslateBounds(accessibilityNodeInfo, this.embeddedViewToDisplayBounds.get(view), obtain);
        addChildrenToFlutterNode(accessibilityNodeInfo, view, obtain);
        setFlutterNodeParent(accessibilityNodeInfo, view, obtain);
        return obtain;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (i2 >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (i2 >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (i2 >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (i2 >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (i2 >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long access$300 = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (access$300 != null) {
            Integer num = this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$300.longValue())));
            if (num != null) {
                accessibilityNodeInfo2.setParent(this.rootAccessibilityView, num.intValue());
            }
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int i2) {
        AccessibilityNodeInfo createAccessibilityNodeInfo;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i2);
        if (viewAndId == null || !this.embeddedViewToDisplayBounds.containsKey(viewAndId.view) || viewAndId.view.getAccessibilityNodeProvider() == null || (createAccessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.id)) == null) {
            return null;
        }
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, viewAndId.view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long access$600 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (access$600 == null) {
            return null;
        }
        return this.originToFlutterId.get(new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$600.longValue())));
    }

    public AccessibilityNodeInfo getRootNode(View view, int i2, Rect rect) {
        AccessibilityNodeInfo createAccessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long access$100 = this.reflectionAccessors.getSourceNodeId(createAccessibilityNodeInfo);
        if (access$100 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put(view, rect);
        cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(access$100.longValue()), i2);
        return convertToFlutterNode(createAccessibilityNodeInfo, i2, view);
    }

    public boolean onAccessibilityHoverEvent(int i2, MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i2);
        if (viewAndId == null) {
            return false;
        }
        Rect rect = this.embeddedViewToDisplayBounds.get(viewAndId.view);
        int pointerCount = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i3 = 0; i3 < motionEvent.getPointerCount(); i3++) {
            pointerPropertiesArr[i3] = new MotionEvent.PointerProperties();
            motionEvent2.getPointerProperties(i3, pointerPropertiesArr[i3]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent2.getPointerCoords(i3, pointerCoords);
            pointerCoordsArr[i3] = new MotionEvent.PointerCoords(pointerCoords);
            pointerCoordsArr[i3].x -= (float) rect.left;
            pointerCoordsArr[i3].y -= (float) rect.top;
        }
        return viewAndId.view.dispatchGenericMotionEvent(MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), motionEvent.getAction(), motionEvent.getPointerCount(), pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags()));
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i2);
        if (viewAndId == null || (accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider()) == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.id, i3, bundle);
    }

    public View platformViewOfNode(int i2) {
        ViewAndId viewAndId = this.flutterIdToOrigin.get(i2);
        if (viewAndId == null) {
            return null;
        }
        return viewAndId.view;
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(accessibilityEvent);
        Long access$600 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityEvent);
        if (access$600 == null) {
            return false;
        }
        int access$200 = ReflectionAccessors.getVirtualNodeId(access$600.longValue());
        Integer num = this.originToFlutterId.get(new ViewAndId(view, access$200));
        if (num == null) {
            int i2 = this.nextFlutterId;
            this.nextFlutterId = i2 + 1;
            num = Integer.valueOf(i2);
            cacheVirtualIdMappings(view, access$200, num.intValue());
        }
        obtain.setSource(this.rootAccessibilityView, num.intValue());
        obtain.setClassName(accessibilityEvent.getClassName());
        obtain.setPackageName(accessibilityEvent.getPackageName());
        for (int i3 = 0; i3 < obtain.getRecordCount(); i3++) {
            AccessibilityRecord record = obtain.getRecord(i3);
            Long access$6002 = this.reflectionAccessors.getRecordSourceNodeId(record);
            if (access$6002 == null) {
                return false;
            }
            ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(access$6002.longValue()));
            if (!this.originToFlutterId.containsKey(viewAndId)) {
                return false;
            }
            record.setSource(this.rootAccessibilityView, this.originToFlutterId.get(viewAndId).intValue());
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, obtain);
    }
}
