package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public final class IntegerRange extends NumberRange<Integer> {
    private static final long serialVersionUID = 1;

    /* renamed from: of */
    public static IntegerRange m260of(int i, int i2) {
        return m259of(Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* renamed from: of */
    public static IntegerRange m259of(Integer num, Integer num2) {
        return new IntegerRange(num, num2);
    }

    private IntegerRange(Integer num, Integer num2) {
        super(num, num2, null);
    }
}
