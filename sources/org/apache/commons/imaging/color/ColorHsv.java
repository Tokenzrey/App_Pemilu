package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorHsv {

    /* renamed from: H */
    public final double f989H;

    /* renamed from: S */
    public final double f990S;

    /* renamed from: V */
    public final double f991V;
    public static final ColorHsv BLACK = new ColorHsv(0.0d, 0.0d, 0.0d);
    public static final ColorHsv WHITE = new ColorHsv(0.0d, 0.0d, 100.0d);
    public static final ColorHsv RED = new ColorHsv(0.0d, 100.0d, 100.0d);
    public static final ColorHsv GREEN = new ColorHsv(120.0d, 100.0d, 100.0d);
    public static final ColorHsv BLUE = new ColorHsv(240.0d, 100.0d, 100.0d);

    public ColorHsv(double d, double d2, double d3) {
        this.f989H = d;
        this.f990S = d2;
        this.f991V = d3;
    }

    public String toString() {
        return "{H: " + this.f989H + ", S: " + this.f990S + ", V: " + this.f991V + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorHsv colorHsv = (ColorHsv) obj;
        return Double.compare(colorHsv.f989H, this.f989H) == 0 && Double.compare(colorHsv.f990S, this.f990S) == 0 && Double.compare(colorHsv.f991V, this.f991V) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f989H);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f990S);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f991V);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
