package f.e.c.a.a0;

class h extends i {
    h(byte[] bArr, int i2) {
        super(bArr, i2);
    }

    /* access modifiers changed from: package-private */
    public int[] d(int[] iArr, int i2) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            i.k(iArr2, this.a);
            iArr2[12] = i2;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", new Object[]{Integer.valueOf(iArr.length * 32)}));
    }

    /* access modifiers changed from: package-private */
    public int g() {
        return 12;
    }
}
