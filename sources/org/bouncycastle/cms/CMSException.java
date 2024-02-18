package org.bouncycastle.cms;

/* loaded from: classes2.dex */
public class CMSException extends Exception {

    /* renamed from: e */
    Exception f1203e;

    public CMSException(String str) {
        super(str);
    }

    public CMSException(String str, Exception exc) {
        super(str);
        this.f1203e = exc;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.f1203e;
    }

    public Exception getUnderlyingException() {
        return this.f1203e;
    }
}
