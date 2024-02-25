package e.f.r.i0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

public final class a extends ClickableSpan {

    /* renamed from: e  reason: collision with root package name */
    private final int f3425e;

    /* renamed from: f  reason: collision with root package name */
    private final b f3426f;

    /* renamed from: g  reason: collision with root package name */
    private final int f3427g;

    public a(int i2, b bVar, int i3) {
        this.f3425e = i2;
        this.f3426f = bVar;
        this.f3427g = i3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3425e);
        this.f3426f.F(this.f3427g, bundle);
    }
}
