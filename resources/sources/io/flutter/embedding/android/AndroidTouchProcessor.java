package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class AndroidTouchProcessor {
    static final int BYTES_PER_FIELD = 8;
    private static final Matrix IDENTITY_TRANSFORM = new Matrix();
    private static final int POINTER_DATA_FIELD_COUNT = 35;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private final MotionEventTracker motionEventTracker;
    private final Map<Integer, float[]> ongoingPans = new HashMap();
    private final FlutterRenderer renderer;
    private final boolean trackMotionEvents;

    public @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int PAN_ZOOM_END = 9;
        public static final int PAN_ZOOM_START = 7;
        public static final int PAN_ZOOM_UPDATE = 8;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    public @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int TRACKPAD = 4;
        public static final int UNKNOWN = 5;
    }

    public @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCROLL = 1;
        public static final int UNKNOWN = 2;
    }

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer, boolean z) {
        this.renderer = flutterRenderer;
        this.motionEventTracker = MotionEventTracker.getInstance();
        this.trackMotionEvents = z;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int i2, int i3, int i4, Matrix matrix, ByteBuffer byteBuffer) {
        long j2;
        long j3;
        double d2;
        double d3;
        double d4;
        double d5;
        double d6;
        InputDevice.MotionRange motionRange;
        MotionEvent motionEvent2 = motionEvent;
        int i5 = i2;
        int i6 = i3;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (i6 != -1) {
            long id = this.trackMotionEvents ? this.motionEventTracker.track(motionEvent2).getId() : 0;
            int pointerDeviceTypeForToolType = getPointerDeviceTypeForToolType(motionEvent.getToolType(i2));
            float[] fArr = {motionEvent.getX(i2), motionEvent.getY(i2)};
            matrix.mapPoints(fArr);
            if (pointerDeviceTypeForToolType == 1) {
                j2 = (long) (motionEvent.getButtonState() & 31);
                if (j2 == 0 && motionEvent.getSource() == 8194 && i6 == 4) {
                    this.ongoingPans.put(Integer.valueOf(motionEvent.getPointerId(i2)), fArr);
                }
            } else {
                j2 = pointerDeviceTypeForToolType == 2 ? (long) ((motionEvent.getButtonState() >> 4) & 15) : 0;
            }
            boolean containsKey = this.ongoingPans.containsKey(Integer.valueOf(motionEvent.getPointerId(i2)));
            int i7 = motionEvent.getActionMasked() == 8 ? 1 : 0;
            byteBuffer2.putLong(id);
            byteBuffer2.putLong(motionEvent.getEventTime() * 1000);
            if (containsKey) {
                byteBuffer2.putLong((long) getPointerChangeForPanZoom(i6));
                j3 = 4;
            } else {
                byteBuffer2.putLong((long) i6);
                j3 = (long) pointerDeviceTypeForToolType;
            }
            byteBuffer2.putLong(j3);
            byteBuffer2.putLong((long) i7);
            byteBuffer2.putLong((long) motionEvent.getPointerId(i2));
            byteBuffer2.putLong(0);
            if (containsKey) {
                float[] fArr2 = this.ongoingPans.get(Integer.valueOf(motionEvent.getPointerId(i2)));
                byteBuffer2.putDouble((double) fArr2[0]);
                byteBuffer2.putDouble((double) fArr2[1]);
            } else {
                byteBuffer2.putDouble((double) fArr[0]);
                byteBuffer2.putDouble((double) fArr[1]);
            }
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putDouble(0.0d);
            byteBuffer2.putLong(j2);
            byteBuffer2.putLong(0);
            byteBuffer2.putLong(0);
            byteBuffer2.putDouble((double) motionEvent.getPressure(i2));
            if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
                d3 = 1.0d;
                d2 = 0.0d;
            } else {
                d2 = (double) motionRange.getMin();
                d3 = (double) motionRange.getMax();
            }
            byteBuffer2.putDouble(d2);
            byteBuffer2.putDouble(d3);
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(24, i5));
                d4 = 0.0d;
            } else {
                d4 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble((double) motionEvent.getSize(i2));
            byteBuffer2.putDouble((double) motionEvent.getToolMajor(i2));
            byteBuffer2.putDouble((double) motionEvent.getToolMinor(i2));
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble(d4);
            byteBuffer2.putDouble((double) motionEvent2.getAxisValue(8, i5));
            if (pointerDeviceTypeForToolType == 2) {
                byteBuffer2.putDouble((double) motionEvent2.getAxisValue(25, i5));
            } else {
                byteBuffer2.putDouble(d4);
            }
            byteBuffer2.putLong((long) i4);
            if (i7 == 1) {
                byteBuffer2.putDouble((double) (-motionEvent2.getAxisValue(10)));
                d5 = (double) (-motionEvent2.getAxisValue(9));
            } else {
                d5 = 0.0d;
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d5);
            if (containsKey) {
                float[] fArr3 = this.ongoingPans.get(Integer.valueOf(motionEvent.getPointerId(i2)));
                byteBuffer2.putDouble((double) (fArr[0] - fArr3[0]));
                byteBuffer2.putDouble((double) (fArr[1] - fArr3[1]));
                d6 = 0.0d;
            } else {
                d6 = 0.0d;
                byteBuffer2.putDouble(0.0d);
                byteBuffer2.putDouble(0.0d);
            }
            byteBuffer2.putDouble(d6);
            byteBuffer2.putDouble(d6);
            byteBuffer2.putDouble(1.0d);
            byteBuffer2.putDouble(d6);
            if (containsKey && getPointerChangeForPanZoom(i6) == 9) {
                this.ongoingPans.remove(Integer.valueOf(motionEvent.getPointerId(i2)));
            }
        }
    }

    @PointerChange
    private int getPointerChangeForAction(int i2) {
        if (i2 == 0) {
            return 4;
        }
        if (i2 == 1) {
            return 6;
        }
        if (i2 == 5) {
            return 4;
        }
        if (i2 == 6) {
            return 6;
        }
        if (i2 == 2) {
            return 5;
        }
        if (i2 == 7) {
            return 3;
        }
        if (i2 == 3) {
            return 0;
        }
        if (i2 == 8) {
            return 3;
        }
        throw new AssertionError("Unexpected masked action");
    }

    @PointerChange
    private int getPointerChangeForPanZoom(int i2) {
        if (i2 == 4) {
            return 7;
        }
        if (i2 == 5) {
            return 8;
        }
        if (i2 == 6 || i2 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    @PointerDeviceKind
    private int getPointerDeviceTypeForToolType(int i2) {
        if (i2 == 1) {
            return 0;
        }
        if (i2 == 2) {
            return 2;
        }
        if (i2 != 3) {
            return i2 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean z = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z || !z2) {
            return false;
        }
        int pointerChangeForAction = getPointerChangeForAction(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * POINTER_DATA_FIELD_COUNT * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        addPointerForIndex(motionEvent, motionEvent.getActionIndex(), pointerChangeForAction, 0, IDENTITY_TRANSFORM, allocateDirect);
        if (allocateDirect.position() % 280 == 0) {
            this.renderer.dispatchPointerDataPacket(allocateDirect, allocateDirect.position());
            return true;
        }
        throw new AssertionError("Packet position is not on field boundary.");
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return onTouchEvent(motionEvent, IDENTITY_TRANSFORM);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 35
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.getPointerChangeForAction(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L_0x0027
            r4 = 5
            if (r2 != r4) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            if (r4 != 0) goto L_0x0031
            if (r2 == r10) goto L_0x002f
            r5 = 6
            if (r2 != r5) goto L_0x0031
        L_0x002f:
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r4 == 0) goto L_0x0042
        L_0x0034:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.addPointerForIndex(r3, r4, r5, r6, r7, r8)
            goto L_0x006f
        L_0x0042:
            r11 = 0
            if (r2 == 0) goto L_0x0060
        L_0x0045:
            if (r11 >= r0) goto L_0x0034
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L_0x005d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L_0x005d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.addPointerForIndex(r3, r4, r5, r6, r7, r8)
        L_0x005d:
            int r11 = r11 + 1
            goto L_0x0045
        L_0x0060:
            if (r11 >= r0) goto L_0x006f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.addPointerForIndex(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L_0x0060
        L_0x006f:
            int r13 = r1.position()
            int r13 = r13 % 280
            if (r13 != 0) goto L_0x0081
            io.flutter.embedding.engine.renderer.FlutterRenderer r13 = r12.renderer
            int r14 = r1.position()
            r13.dispatchPointerDataPacket(r1, r14)
            return r10
        L_0x0081:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.AndroidTouchProcessor.onTouchEvent(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
