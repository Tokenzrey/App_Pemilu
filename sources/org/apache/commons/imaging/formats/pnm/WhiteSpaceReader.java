package org.apache.commons.imaging.formats.pnm;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes2.dex */
class WhiteSpaceReader {

    /* renamed from: is */
    private final InputStream f1029is;

    /* JADX INFO: Access modifiers changed from: package-private */
    public WhiteSpaceReader(InputStream inputStream) {
        this.f1029is = inputStream;
    }

    private char read() throws IOException {
        int read = this.f1029is.read();
        if (read >= 0) {
            return (char) read;
        }
        throw new IOException("PNM: Unexpected EOF");
    }

    public char nextChar() throws IOException {
        char read = read();
        if (read == '#') {
            while (read != '\n' && read != '\r') {
                read = read();
            }
        }
        return read;
    }

    public String readtoWhiteSpace() throws IOException {
        char nextChar = nextChar();
        while (Character.isWhitespace(nextChar)) {
            nextChar = nextChar();
        }
        StringBuilder sb = new StringBuilder();
        while (!Character.isWhitespace(nextChar)) {
            sb.append(nextChar);
            nextChar = nextChar();
        }
        return sb.toString();
    }

    public String readLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            char read = read();
            if (read == '\n' || read == '\r') {
                break;
            }
            sb.append(read);
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }
}
