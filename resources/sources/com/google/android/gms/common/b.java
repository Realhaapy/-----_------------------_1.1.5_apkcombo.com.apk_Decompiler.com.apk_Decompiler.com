package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.n;

public class b extends DialogFragment {

    /* renamed from: e  reason: collision with root package name */
    private Dialog f2490e;

    /* renamed from: f  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2491f;

    /* renamed from: g  reason: collision with root package name */
    private Dialog f2492g;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        n.i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f2490e = dialog2;
        if (onCancelListener != null) {
            bVar.f2491f = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2491f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2490e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2492g == null) {
            Activity activity = getActivity();
            n.h(activity);
            this.f2492g = new AlertDialog.Builder(activity).create();
        }
        return this.f2492g;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
