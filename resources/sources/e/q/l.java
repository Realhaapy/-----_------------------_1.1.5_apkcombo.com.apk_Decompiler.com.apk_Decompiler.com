package e.q;

import android.view.ViewGroup;

public class l {
    private ViewGroup a;
    private Runnable b;

    public static l b(ViewGroup viewGroup) {
        return (l) viewGroup.getTag(j.transition_current_scene);
    }

    static void c(ViewGroup viewGroup, l lVar) {
        viewGroup.setTag(j.transition_current_scene, lVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.a) == this && (runnable = this.b) != null) {
            runnable.run();
        }
    }
}
