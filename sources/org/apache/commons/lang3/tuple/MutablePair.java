package org.apache.commons.lang3.tuple;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class MutablePair<L, R> extends Pair<L, R> {
    public static final MutablePair<?, ?>[] EMPTY_ARRAY = new MutablePair[0];
    private static final long serialVersionUID = 4954918890077093841L;
    public L left;
    public R right;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> MutablePair<L, R>[] emptyArray() {
        return EMPTY_ARRAY;
    }

    /* renamed from: of */
    public static <L, R> MutablePair<L, R> m224of(L l, R r) {
        return new MutablePair<>(l, r);
    }

    /* renamed from: of */
    public static <L, R> MutablePair<L, R> m223of(Map.Entry<L, R> entry) {
        L l;
        R r;
        if (entry != null) {
            l = entry.getKey();
            r = entry.getValue();
        } else {
            l = null;
            r = null;
        }
        return new MutablePair<>(l, r);
    }

    public static <L, R> MutablePair<L, R> ofNonNull(L l, R r) {
        return m224of(Objects.requireNonNull(l, "left"), Objects.requireNonNull(r, "right"));
    }

    public MutablePair() {
    }

    public MutablePair(L l, R r) {
        this.left = l;
        this.right = r;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public L getLeft() {
        return this.left;
    }

    @Override // org.apache.commons.lang3.tuple.Pair
    public R getRight() {
        return this.right;
    }

    public void setLeft(L l) {
        this.left = l;
    }

    public void setRight(R r) {
        this.right = r;
    }

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        R right = getRight();
        setRight(r);
        return right;
    }
}
