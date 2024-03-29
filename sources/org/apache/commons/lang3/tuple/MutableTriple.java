package org.apache.commons.lang3.tuple;

import java.util.Objects;

/* loaded from: classes2.dex */
public class MutableTriple<L, M, R> extends Triple<L, M, R> {
    public static final MutableTriple<?, ?, ?>[] EMPTY_ARRAY = new MutableTriple[0];
    private static final long serialVersionUID = 1;
    public L left;
    public M middle;
    public R right;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, M, R> MutableTriple<L, M, R>[] emptyArray() {
        return EMPTY_ARRAY;
    }

    /* renamed from: of */
    public static <L, M, R> MutableTriple<L, M, R> m222of(L l, M m, R r) {
        return new MutableTriple<>(l, m, r);
    }

    public static <L, M, R> MutableTriple<L, M, R> ofNonNull(L l, M m, R r) {
        return m222of(Objects.requireNonNull(l, "left"), Objects.requireNonNull(m, "middle"), Objects.requireNonNull(r, "right"));
    }

    public MutableTriple() {
    }

    public MutableTriple(L l, M m, R r) {
        this.left = l;
        this.middle = m;
        this.right = r;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public M getMiddle() {
        return this.middle;
    }

    @Override // org.apache.commons.lang3.tuple.Triple
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l) {
        this.left = l;
    }

    public void setMiddle(M m) {
        this.middle = m;
    }

    public void setRight(R r) {
        this.right = r;
    }
}
