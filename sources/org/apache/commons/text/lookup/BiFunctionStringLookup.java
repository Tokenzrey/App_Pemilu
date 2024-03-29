package org.apache.commons.text.lookup;

import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;

/* loaded from: classes2.dex */
final class BiFunctionStringLookup<P, R> implements BiStringLookup<P> {
    private final BiFunction<String, P, R> biFunction;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: on */
    public static <U, T> BiFunctionStringLookup<U, T> m214on(BiFunction<String, U, T> biFunction) {
        return new BiFunctionStringLookup<>(biFunction);
    }

    /* renamed from: on */
    static <U, T> BiFunctionStringLookup<U, T> m215on(final Map<String, T> map) {
        return m214on(new BiFunction() { // from class: org.apache.commons.text.lookup.BiFunctionStringLookup$$ExternalSyntheticLambda0
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                Object obj3;
                obj3 = map.get((String) obj);
                return obj3;
            }
        });
    }

    private BiFunctionStringLookup(BiFunction<String, P, R> biFunction) {
        this.biFunction = biFunction;
    }

    @Override // org.apache.commons.text.lookup.StringLookup
    public String lookup(String str) {
        return lookup(str, null);
    }

    @Override // org.apache.commons.text.lookup.BiStringLookup
    public String lookup(String str, P p) {
        BiFunction<String, P, R> biFunction = this.biFunction;
        if (biFunction == null) {
            return null;
        }
        try {
            return Objects.toString(biFunction.apply(str, p), null);
        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
            return null;
        }
    }

    public String toString() {
        return super.toString() + " [function=" + this.biFunction + "]";
    }
}
