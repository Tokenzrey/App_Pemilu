package com.tom_roush.pdfbox.p008io;

import java.io.Closeable;
import java.io.IOException;

/* renamed from: com.tom_roush.pdfbox.io.SequentialRead */
/* loaded from: classes3.dex */
public interface SequentialRead extends Closeable {
    int read() throws IOException;

    int read(byte[] bArr) throws IOException;

    int read(byte[] bArr, int i, int i2) throws IOException;
}
