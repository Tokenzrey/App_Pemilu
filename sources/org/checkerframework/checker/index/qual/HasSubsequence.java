package org.checkerframework.checker.index.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.JavaExpression;

@Target({ElementType.FIELD})
/* loaded from: classes2.dex */
public @interface HasSubsequence {
    @JavaExpression
    String from();

    @JavaExpression
    /* renamed from: to */
    String m67to();

    @JavaExpression
    String value();
}
