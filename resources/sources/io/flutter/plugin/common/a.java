package io.flutter.plugin.common;

import io.flutter.plugin.common.BinaryMessenger;

public final /* synthetic */ class a {
    public static void $default$disableBufferingIncomingMessages(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("disableBufferingIncomingMessages not implemented.");
    }

    public static void $default$enableBufferingIncomingMessages(BinaryMessenger binaryMessenger) {
        throw new UnsupportedOperationException("enableBufferingIncomingMessages not implemented.");
    }

    public static BinaryMessenger.TaskQueue $default$makeBackgroundTaskQueue(BinaryMessenger binaryMessenger) {
        return binaryMessenger.makeBackgroundTaskQueue(new BinaryMessenger.TaskQueueOptions());
    }

    public static BinaryMessenger.TaskQueue $default$makeBackgroundTaskQueue(BinaryMessenger binaryMessenger, BinaryMessenger.TaskQueueOptions taskQueueOptions) {
        throw new UnsupportedOperationException("makeBackgroundTaskQueue not implemented.");
    }

    public static void $default$setMessageHandler(BinaryMessenger binaryMessenger, String str, BinaryMessenger.BinaryMessageHandler binaryMessageHandler, BinaryMessenger.TaskQueue taskQueue) {
        if (taskQueue == null) {
            binaryMessenger.setMessageHandler(str, binaryMessageHandler);
            return;
        }
        throw new UnsupportedOperationException("setMessageHandler called with nonnull taskQueue is not supported.");
    }
}
