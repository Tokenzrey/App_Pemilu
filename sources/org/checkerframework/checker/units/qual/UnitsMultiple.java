package org.checkerframework.checker.units.qual;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public @interface UnitsMultiple {
    Prefix prefix() default Prefix.one;

    Class<? extends Annotation> quantity();
}
