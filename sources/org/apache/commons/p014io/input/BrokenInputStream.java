package org.apache.commons.p014io.input;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: org.apache.commons.io.input.BrokenInputStream */
/* loaded from: classes2.dex */
public class BrokenInputStream extends InputStream {
    private final IOException exception;

    public BrokenInputStream(IOException iOException) {
        this.exception = iOException;
    }

    public BrokenInputStream() {
        this(new IOException("Broken input stream"));
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream
    public synchronized void reset() throws IOException {
        throw this.exception;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        throw this.exception;
    }
}
