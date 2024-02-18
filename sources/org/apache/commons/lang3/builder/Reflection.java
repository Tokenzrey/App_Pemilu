package org.apache.commons.lang3.builder;

import java.lang.reflect.Field;
import java.util.Objects;
import org.apache.xmpbox.type.PDFATypeType;

/* loaded from: classes2.dex */
class Reflection {
    Reflection() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object getUnchecked(Field field, Object obj) {
        try {
            return ((Field) Objects.requireNonNull(field, PDFATypeType.FIELD)).get(obj);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
