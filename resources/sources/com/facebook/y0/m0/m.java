package com.facebook.y0.m0;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import m.y.d.l;

public final class m implements SensorEventListener {
    private a a;

    public interface a {
        void a();
    }

    public final void a(a aVar) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                this.a = aVar;
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i2) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(sensor, "sensor");
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!com.facebook.internal.s0.n.a.d(this)) {
            try {
                l.d(sensorEvent, "event");
                a aVar = this.a;
                if (aVar != null) {
                    float[] fArr = sensorEvent.values;
                    float f2 = fArr[0];
                    double d2 = (double) (f2 / 9.80665f);
                    double d3 = (double) (fArr[1] / 9.80665f);
                    double d4 = (double) (fArr[2] / 9.80665f);
                    if (Math.sqrt((d2 * d2) + (d3 * d3) + (d4 * d4)) > 2.3d) {
                        aVar.a();
                    }
                }
            } catch (Throwable th) {
                com.facebook.internal.s0.n.a.b(th, this);
            }
        }
    }
}
