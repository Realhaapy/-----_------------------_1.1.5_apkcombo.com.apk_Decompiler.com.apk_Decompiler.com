package io.flutter.plugin.common;

import java.nio.ByteBuffer;

public interface MessageCodec<T> {
    T decodeMessage(ByteBuffer byteBuffer);

    ByteBuffer encodeMessage(T t);
}
