package org.bouncycastle.util;

/* loaded from: classes2.dex */
public class StreamParsingException extends Exception {

    /* renamed from: _e */
    Throwable f2249_e;

    public StreamParsingException(String str, Throwable th) {
        super(str);
        this.f2249_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f2249_e;
    }
}
