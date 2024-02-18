package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorHsl {

    /* renamed from: H */
    public final double f986H;

    /* renamed from: L */
    public final double f987L;

    /* renamed from: S */
    public final double f988S;
    public static final ColorHsl BLACK = new ColorHsl(0.0d, 0.0d, 0.0d);
    public static final ColorHsl WHITE = new ColorHsl(0.0d, 0.0d, 100.0d);
    public static final ColorHsl RED = new ColorHsl(0.0d, 100.0d, 100.0d);
    public static final ColorHsl GREEN = new ColorHsl(120.0d, 100.0d, 100.0d);
    public static final ColorHsl BLUE = new ColorHsl(240.0d, 100.0d, 100.0d);

    public ColorHsl(double d, double d2, double d3) {
        this.f986H = d;
        this.f988S = d2;
        this.f987L = d3;
    }

    public String toString() {
        return "{H: " + this.f986H + ", S: " + this.f988S + ", L: " + this.f987L + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorHsl colorHsl = (ColorHsl) obj;
        return Double.compare(colorHsl.f986H, this.f986H) == 0 && Double.compare(colorHsl.f987L, this.f987L) == 0 && Double.compare(colorHsl.f988S, this.f988S) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f986H);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f988S);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f987L);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
