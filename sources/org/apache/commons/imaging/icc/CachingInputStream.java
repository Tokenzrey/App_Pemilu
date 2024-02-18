package org.apache.commons.imaging.icc;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class CachingInputStream extends InputStream {
    private final ByteArrayOutputStream baos = new ByteArrayOutputStream();

    /* renamed from: is */
    private final InputStream f1061is;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CachingInputStream(InputStream inputStream) {
        this.f1061is = inputStream;
    }

    public byte[] getCache() {
        return this.baos.toByteArray();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        int read = this.f1061is.read();
        this.baos.write(read);
        return read;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f1061is.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f1061is.close();
    }
}
