package io.flutter.embedding.engine.dart;

import java.nio.ByteBuffer;

public interface PlatformMessageHandler {
    void handleMessageFromDart(String str, ByteBuffer byteBuffer, int i2, long j2);

    void handlePlatformMessageResponse(int i2, ByteBuffer byteBuffer);
}
