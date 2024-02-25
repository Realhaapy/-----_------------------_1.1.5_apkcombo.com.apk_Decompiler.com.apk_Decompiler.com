package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.e;

public class p extends Fragment {

    /* renamed from: e  reason: collision with root package name */
    private a f1224e;

    interface a {
        void a();

        void onResume();

        void onStart();
    }

    static class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new b());
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public void onActivityDestroyed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            p.a(activity, e.b.ON_CREATE);
        }

        public void onActivityPostResumed(Activity activity) {
            p.a(activity, e.b.ON_RESUME);
        }

        public void onActivityPostStarted(Activity activity) {
            p.a(activity, e.b.ON_START);
        }

        public void onActivityPreDestroyed(Activity activity) {
            p.a(activity, e.b.ON_DESTROY);
        }

        public void onActivityPrePaused(Activity activity) {
            p.a(activity, e.b.ON_PAUSE);
        }

        public void onActivityPreStopped(Activity activity) {
            p.a(activity, e.b.ON_STOP);
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }
    }

    static void a(Activity activity, e.b bVar) {
        if (activity instanceof j) {
            ((j) activity).getLifecycle().h(bVar);
        } else if (activity instanceof h) {
            e lifecycle = ((h) activity).getLifecycle();
            if (lifecycle instanceof i) {
                ((i) lifecycle).h(bVar);
            }
        }
    }

    private void b(e.b bVar) {
        if (Build.VERSION.SDK_INT < 29) {
            a(getActivity(), bVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            aVar.a();
        }
    }

    private void d(a aVar) {
        if (aVar != null) {
            aVar.onResume();
        }
    }

    private void e(a aVar) {
        if (aVar != null) {
            aVar.onStart();
        }
    }

    public static void f(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new p(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c(this.f1224e);
        b(e.b.ON_CREATE);
    }

    public void onDestroy() {
        super.onDestroy();
        b(e.b.ON_DESTROY);
        this.f1224e = null;
    }

    public void onPause() {
        super.onPause();
        b(e.b.ON_PAUSE);
    }

    public void onResume() {
        super.onResume();
        d(this.f1224e);
        b(e.b.ON_RESUME);
    }

    public void onStart() {
        super.onStart();
        e(this.f1224e);
        b(e.b.ON_START);
    }

    public void onStop() {
        super.onStop();
        b(e.b.ON_STOP);
    }
}
