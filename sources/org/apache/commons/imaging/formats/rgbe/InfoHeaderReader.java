package org.apache.commons.imaging.formats.rgbe;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class InfoHeaderReader {

    /* renamed from: is */
    private final InputStream f1032is;

    /* JADX INFO: Access modifiers changed from: package-private */
    public InfoHeaderReader(InputStream inputStream) {
        this.f1032is = inputStream;
    }

    private char read() throws IOException {
        int read = this.f1032is.read();
        if (read >= 0) {
            return (char) read;
        }
        throw new IOException("HDR: Unexpected EOF");
    }

    public String readNextLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char read = read();
            if (read != '\n') {
                sb.append(read);
            } else {
                return sb.toString();
            }
        }
    }
}
