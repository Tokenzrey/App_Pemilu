package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public final class LongRange extends NumberRange<Long> {
    private static final long serialVersionUID = 1;

    /* renamed from: of */
    public static LongRange m258of(long j, long j2) {
        return m257of(Long.valueOf(j), Long.valueOf(j2));
    }

    /* renamed from: of */
    public static LongRange m257of(Long l, Long l2) {
        return new LongRange(l, l2);
    }

    private LongRange(Long l, Long l2) {
        super(l, l2, null);
    }
}
