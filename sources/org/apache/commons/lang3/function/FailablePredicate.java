package org.apache.commons.lang3.function;

import java.lang.Throwable;
import java.util.Objects;

@FunctionalInterface
/* loaded from: classes2.dex */
public interface FailablePredicate<T, E extends Throwable> {
    public static final FailablePredicate FALSE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda3
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.lambda$static$0(obj);
        }
    };
    public static final FailablePredicate TRUE = new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda4
        @Override // org.apache.commons.lang3.function.FailablePredicate
        public final boolean test(Object obj) {
            return FailablePredicate.lambda$static$1(obj);
        }
    };

    static /* synthetic */ boolean lambda$static$0(Object obj) throws Throwable {
        return false;
    }

    static /* synthetic */ boolean lambda$static$1(Object obj) throws Throwable {
        return true;
    }

    boolean test(T t) throws Throwable;

    static <T, E extends Throwable> FailablePredicate<T, E> falsePredicate() {
        return FALSE;
    }

    static <T, E extends Throwable> FailablePredicate<T, E> truePredicate() {
        return TRUE;
    }

    default FailablePredicate<T, E> and(final FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda1
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return FailablePredicate.lambda$and$2(FailablePredicate.this, failablePredicate, obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$and$2(FailablePredicate _this, FailablePredicate failablePredicate, Object obj) throws Throwable {
        return _this.test(obj) && failablePredicate.test(obj);
    }

    static /* synthetic */ boolean lambda$negate$3(FailablePredicate _this, Object obj) throws Throwable {
        return !_this.test(obj);
    }

    default FailablePredicate<T, E> negate() {
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda2
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return FailablePredicate.lambda$negate$3(FailablePredicate.this, obj);
            }
        };
    }

    /* renamed from: or */
    default FailablePredicate<T, E> m240or(final FailablePredicate<? super T, E> failablePredicate) {
        Objects.requireNonNull(failablePredicate);
        return new FailablePredicate() { // from class: org.apache.commons.lang3.function.FailablePredicate$$ExternalSyntheticLambda0
            @Override // org.apache.commons.lang3.function.FailablePredicate
            public final boolean test(Object obj) {
                return FailablePredicate.lambda$or$4(FailablePredicate.this, failablePredicate, obj);
            }
        };
    }

    static /* synthetic */ boolean lambda$or$4(FailablePredicate _this, FailablePredicate failablePredicate, Object obj) throws Throwable {
        return _this.test(obj) || failablePredicate.test(obj);
    }
}
