package io.flutter.plugin.common;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class StringCodec implements MessageCodec<String> {
    public static final StringCodec INSTANCE = new StringCodec();
    private static final Charset UTF8 = Charset.forName("UTF8");

    private StringCodec() {
    }

    public String decodeMessage(ByteBuffer byteBuffer) {
        int i2;
        byte[] bArr;
        if (byteBuffer == null) {
            return null;
        }
        int remaining = byteBuffer.remaining();
        if (byteBuffer.hasArray()) {
            bArr = byteBuffer.array();
            i2 = byteBuffer.arrayOffset();
        } else {
            bArr = new byte[remaining];
            byteBuffer.get(bArr);
            i2 = 0;
        }
        return new String(bArr, i2, remaining, UTF8);
    }

    public ByteBuffer encodeMessage(String str) {
        if (str == null) {
            return null;
        }
        byte[] bytes = str.getBytes(UTF8);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bytes.length);
        allocateDirect.put(bytes);
        return allocateDirect;
    }
}
