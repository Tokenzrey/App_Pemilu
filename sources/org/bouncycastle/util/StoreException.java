package org.bouncycastle.util;

/* loaded from: classes2.dex */
public class StoreException extends RuntimeException {

    /* renamed from: _e */
    private Throwable f2248_e;

    public StoreException(String str, Throwable th) {
        super(str);
        this.f2248_e = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f2248_e;
    }
}
