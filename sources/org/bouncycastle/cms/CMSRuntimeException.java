package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSRuntimeException extends RuntimeException {

    /* renamed from: e */
    Exception f1204e;

    public CMSRuntimeException(String str) {
        super(str);
    }

    public CMSRuntimeException(String str, Exception exc) {
        super(str);
        this.f1204e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1204e;
    }

    public Exception getUnderlyingException() {
        return this.f1204e;
    }
}
