package org.apache.commons.p014io;

import java.io.IOException;

@Deprecated
/* renamed from: org.apache.commons.io.IOExceptionWithCause */
/* loaded from: classes2.dex */
public class IOExceptionWithCause extends IOException {
    private static final long serialVersionUID = 1;

    public IOExceptionWithCause(String str, Throwable th) {
        super(str, th);
    }

    public IOExceptionWithCause(Throwable th) {
        super(th);
    }
}
