package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorCieLab {

    /* renamed from: L */
    public final double f970L;

    /* renamed from: a */
    public final double f971a;

    /* renamed from: b */
    public final double f972b;
    public static final ColorCieLab BLACK = new ColorCieLab(0.0d, 0.0d, 0.0d);
    public static final ColorCieLab WHITE = new ColorCieLab(100.0d, 0.0d, 0.0d);
    public static final ColorCieLab RED = new ColorCieLab(53.0d, 80.0d, 67.0d);
    public static final ColorCieLab GREEN = new ColorCieLab(88.0d, -86.0d, 83.0d);
    public static final ColorCieLab BLUE = new ColorCieLab(32.0d, 79.0d, -108.0d);

    public ColorCieLab(double d, double d2, double d3) {
        this.f970L = d;
        this.f971a = d2;
        this.f972b = d3;
    }

    public String toString() {
        return "{L: " + this.f970L + ", a: " + this.f971a + ", b: " + this.f972b + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorCieLab colorCieLab = (ColorCieLab) obj;
        return Double.compare(colorCieLab.f970L, this.f970L) == 0 && Double.compare(colorCieLab.f971a, this.f971a) == 0 && Double.compare(colorCieLab.f972b, this.f972b) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f970L);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f971a);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f972b);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
