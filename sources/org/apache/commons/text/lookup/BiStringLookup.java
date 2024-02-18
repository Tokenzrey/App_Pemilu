package org.apache.commons.text.lookup;

@FunctionalInterface
/* loaded from: classes2.dex */
public interface BiStringLookup<U> extends StringLookup {
    default String lookup(String str, U u) {
        return lookup(str);
    }
}
