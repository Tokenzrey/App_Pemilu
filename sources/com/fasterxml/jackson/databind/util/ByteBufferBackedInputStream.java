package com.fasterxml.jackson.databind.util;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* loaded from: classes.dex */
public class ByteBufferBackedInputStream extends InputStream {

    /* renamed from: _b */
    protected final ByteBuffer f186_b;

    public ByteBufferBackedInputStream(ByteBuffer byteBuffer) {
        this.f186_b = byteBuffer;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f186_b.remaining();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (this.f186_b.hasRemaining()) {
            return this.f186_b.get() & UByte.MAX_VALUE;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f186_b.hasRemaining()) {
            int min = Math.min(i2, this.f186_b.remaining());
            this.f186_b.get(bArr, i, min);
            return min;
        }
        return -1;
    }
}
