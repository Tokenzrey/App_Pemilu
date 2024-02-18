package org.apache.commons.lang3.tuple;

import java.util.Map;
import java.util.Objects;

/* loaded from: classes2.dex */
public class ImmutablePair<L, R> extends Pair<L, R> {
    public static final ImmutablePair<?, ?>[] EMPTY_ARRAY = new ImmutablePair[0];
    private static final ImmutablePair NULL = new ImmutablePair(null, null);
    private static final long serialVersionUID = 4954918890077093841L;
    public final L left;
    public final R right;

    /* JADX WARN: Multi-variable type inference failed */
    public static <L, R> ImmutablePair<L, R>[] emptyArray() {
        return EMPTY_ARRAY;
    }

    public static <L, R> Pair<L, R> left(L l) {
        return m227of((Object) l, (Object) null);
    }

    public static <L, R> ImmutablePair<L, R> nullPair() {
        return NULL;
    }

    /* renamed from: of */
    public static <L, R> ImmutablePair<L, R> m227of(L l, R r) {
        return (l == null && r == null) ? nullPair() : new ImmutablePair<>(l, r);
    }

    /* renamed from: of */
    public static <L, R> ImmutablePair<L, R> m226of(Map.Entry<L, R> entry) {
        return entry != null ? new ImmutablePair<>(entry.getKey(), entry.getValue()) : nullPair();
    }

    public static <L, R> ImmutablePair<L, R> ofNonNull(L l, R r) {
        return m227of(Objects.requireNonNull(l, "left"), Objects.requireNonNull(r, "right"));
    }

    public static <L, R> Pair<L, R> right(R r) {
        return m227of((Object) null, (Object) r);
    }

    public ImmutablePair(L l, R r) {
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

    @Override // java.util.Map.Entry
    public R setValue(R r) {
        throw new UnsupportedOperationException();
    }
}
