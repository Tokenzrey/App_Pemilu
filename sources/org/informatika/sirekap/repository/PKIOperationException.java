package org.informatika.sirekap.repository;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PKIRepository.kt */
@Metadata(m302d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, m301d2 = {"Lorg/informatika/sirekap/repository/PKIOperationException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "(Ljava/lang/String;)V", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* loaded from: classes2.dex */
public final class PKIOperationException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PKIOperationException(String message) {
        super(message);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
