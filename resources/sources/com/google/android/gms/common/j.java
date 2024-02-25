package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.d;
import com.google.android.gms.common.internal.n;

public class j extends d {
    private Dialog u;
    private DialogInterface.OnCancelListener v;
    private Dialog w;

    public static j q(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        j jVar = new j();
        n.i(dialog, "Cannot display null dialog");
        Dialog dialog2 = dialog;
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        jVar.u = dialog2;
        if (onCancelListener != null) {
            jVar.v = onCancelListener;
        }
        return jVar;
    }

    public Dialog j(Bundle bundle) {
        Dialog dialog = this.u;
        if (dialog != null) {
            return dialog;
        }
        n(false);
        if (this.w == null) {
            Context context = getContext();
            n.h(context);
            this.w = new AlertDialog.Builder(context).create();
        }
        return this.w;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.v;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public void p(androidx.fragment.app.n nVar, String str) {
        super.p(nVar, str);
    }
}
