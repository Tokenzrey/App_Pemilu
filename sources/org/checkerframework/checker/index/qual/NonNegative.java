package org.checkerframework.checker.index.qual;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.SubtypeOf;

@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@SubtypeOf({GTENegativeOne.class})
/* loaded from: classes2.dex */
public @interface NonNegative {
}
