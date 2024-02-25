package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import e.f.r.f;
import e.f.r.j0.b;
import e.f.r.j0.c;
import e.f.r.y;

final class t {

    class a implements b.c {
        final /* synthetic */ View a;

        a(View view) {
            this.a = view;
        }

        public boolean a(c cVar, int i2, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i2 & 1) != 0) {
                try {
                    cVar.d();
                    InputContentInfo inputContentInfo = (InputContentInfo) cVar.e();
                    bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
                } catch (Exception e2) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e2);
                    return false;
                }
            }
            f.a aVar = new f.a(new ClipData(cVar.b(), new ClipData.Item(cVar.a())), 2);
            aVar.d(cVar.c());
            aVar.b(bundle);
            return y.L(this.a, aVar.a()) == null;
        }
    }

    private static final class b {
        /* JADX INFO: finally extract failed */
        static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                y.L(textView, new f.a(dragEvent.getClipData(), 3).a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        static boolean b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            y.L(view, new f.a(dragEvent.getClipData(), 3).a());
            return true;
        }
    }

    static b.c a(View view) {
        return new a(view);
    }

    static boolean b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && y.u(view) != null) {
            Activity d2 = d(view);
            if (d2 == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            } else if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            } else {
                if (dragEvent.getAction() == 3) {
                    return view instanceof TextView ? b.a(dragEvent, (TextView) view, d2) : b.b(dragEvent, view, d2);
                }
            }
        }
        return false;
    }

    static boolean c(TextView textView, int i2) {
        int i3 = 0;
        if ((i2 != 16908322 && i2 != 16908337) || y.u(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            f.a aVar = new f.a(primaryClip, 1);
            if (i2 != 16908322) {
                i3 = 1;
            }
            aVar.c(i3);
            y.L(textView, aVar.a());
        }
        return true;
    }

    static Activity d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
