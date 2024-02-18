package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorCmy {

    /* renamed from: C */
    public final double f979C;

    /* renamed from: M */
    public final double f980M;

    /* renamed from: Y */
    public final double f981Y;
    public static final ColorCmy CYAN = new ColorCmy(100.0d, 0.0d, 0.0d);
    public static final ColorCmy MAGENTA = new ColorCmy(0.0d, 100.0d, 0.0d);
    public static final ColorCmy YELLOW = new ColorCmy(0.0d, 0.0d, 100.0d);
    public static final ColorCmy BLACK = new ColorCmy(100.0d, 100.0d, 100.0d);
    public static final ColorCmy WHITE = new ColorCmy(0.0d, 0.0d, 0.0d);
    public static final ColorCmy RED = new ColorCmy(0.0d, 100.0d, 100.0d);
    public static final ColorCmy GREEN = new ColorCmy(100.0d, 0.0d, 100.0d);
    public static final ColorCmy BLUE = new ColorCmy(100.0d, 100.0d, 0.0d);

    public ColorCmy(double d, double d2, double d3) {
        this.f979C = d;
        this.f980M = d2;
        this.f981Y = d3;
    }

    public String toString() {
        return "{C: " + this.f979C + ", M: " + this.f980M + ", Y: " + this.f981Y + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorCmy colorCmy = (ColorCmy) obj;
        return Double.compare(colorCmy.f979C, this.f979C) == 0 && Double.compare(colorCmy.f980M, this.f980M) == 0 && Double.compare(colorCmy.f981Y, this.f981Y) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f979C);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f980M);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f981Y);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
