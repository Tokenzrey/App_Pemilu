package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorCmyk {

    /* renamed from: C */
    public final double f982C;

    /* renamed from: K */
    public final double f983K;

    /* renamed from: M */
    public final double f984M;

    /* renamed from: Y */
    public final double f985Y;
    public static final ColorCmyk CYAN = new ColorCmyk(100.0d, 0.0d, 0.0d, 0.0d);
    public static final ColorCmyk MAGENTA = new ColorCmyk(0.0d, 100.0d, 0.0d, 0.0d);
    public static final ColorCmyk YELLOW = new ColorCmyk(0.0d, 0.0d, 100.0d, 0.0d);
    public static final ColorCmyk BLACK = new ColorCmyk(0.0d, 0.0d, 0.0d, 100.0d);
    public static final ColorCmyk WHITE = new ColorCmyk(0.0d, 0.0d, 0.0d, 0.0d);
    public static final ColorCmyk RED = new ColorCmyk(0.0d, 100.0d, 100.0d, 0.0d);
    public static final ColorCmyk GREEN = new ColorCmyk(100.0d, 0.0d, 100.0d, 0.0d);
    public static final ColorCmyk BLUE = new ColorCmyk(100.0d, 100.0d, 0.0d, 0.0d);

    public ColorCmyk(double d, double d2, double d3, double d4) {
        this.f982C = d;
        this.f984M = d2;
        this.f985Y = d3;
        this.f983K = d4;
    }

    public String toString() {
        return "{C: " + this.f982C + ", M: " + this.f984M + ", Y: " + this.f985Y + ", K: " + this.f983K + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorCmyk colorCmyk = (ColorCmyk) obj;
        return Double.compare(colorCmyk.f982C, this.f982C) == 0 && Double.compare(colorCmyk.f983K, this.f983K) == 0 && Double.compare(colorCmyk.f984M, this.f984M) == 0 && Double.compare(colorCmyk.f985Y, this.f985Y) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f982C);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f984M);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f985Y);
        long doubleToLongBits4 = Double.doubleToLongBits(this.f983K);
        return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }
}
