package androidx.window.layout;

import m.y.d.l;

final class EmptyDecorator implements WindowInfoTrackerDecorator {
    public static final EmptyDecorator INSTANCE = new EmptyDecorator();

    private EmptyDecorator() {
    }

    public WindowInfoTracker decorate(WindowInfoTracker windowInfoTracker) {
        l.d(windowInfoTracker, "tracker");
        return windowInfoTracker;
    }
}
