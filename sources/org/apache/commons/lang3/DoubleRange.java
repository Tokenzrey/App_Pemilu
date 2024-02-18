package org.apache.commons.lang3;

/* loaded from: classes2.dex */
public final class DoubleRange extends NumberRange<Double> {
    private static final long serialVersionUID = 1;

    /* renamed from: of */
    public static DoubleRange m262of(double d, double d2) {
        return m261of(Double.valueOf(d), Double.valueOf(d2));
    }

    /* renamed from: of */
    public static DoubleRange m261of(Double d, Double d2) {
        return new DoubleRange(d, d2);
    }

    private DoubleRange(Double d, Double d2) {
        super(d, d2, null);
    }
}
