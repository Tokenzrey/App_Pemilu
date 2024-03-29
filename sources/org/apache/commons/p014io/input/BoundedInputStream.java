package org.apache.commons.p014io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.BoundedInputStream */
/* loaded from: classes2.dex */
public class BoundedInputStream extends InputStream {

    /* renamed from: in */
    private final InputStream f1065in;
    private long mark;
    private final long max;
    private long pos;
    private boolean propagateClose;

    public BoundedInputStream(InputStream inputStream, long j) {
        this.pos = 0L;
        this.mark = -1L;
        this.propagateClose = true;
        this.max = j;
        this.f1065in = inputStream;
    }

    public BoundedInputStream(InputStream inputStream) {
        this(inputStream, -1L);
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            int read = this.f1065in.read();
            this.pos++;
            return read;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            int read = this.f1065in.read(bArr, i, (int) (j >= 0 ? Math.min(i2, j - this.pos) : i2));
            if (read == -1) {
                return -1;
            }
            this.pos += read;
            return read;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        long j2 = this.max;
        if (j2 >= 0) {
            j = Math.min(j, j2 - this.pos);
        }
        long skip = this.f1065in.skip(j);
        this.pos += skip;
        return skip;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        long j = this.max;
        if (j < 0 || this.pos < j) {
            return this.f1065in.available();
        }
        return 0;
    }

    public String toString() {
        return this.f1065in.toString();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.propagateClose) {
            this.f1065in.close();
        }
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        this.f1065in.reset();
        this.pos = this.mark;
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        this.f1065in.mark(i);
        this.mark = this.pos;
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f1065in.markSupported();
    }

    public boolean isPropagateClose() {
        return this.propagateClose;
    }

    public void setPropagateClose(boolean z) {
        this.propagateClose = z;
    }
}
