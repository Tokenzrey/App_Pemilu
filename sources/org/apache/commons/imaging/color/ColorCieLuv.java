package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorCieLuv {

    /* renamed from: L */
    public final double f976L;

    /* renamed from: u */
    public final double f977u;

    /* renamed from: v */
    public final double f978v;
    public static final ColorCieLuv BLACK = new ColorCieLuv(0.0d, 0.0d, 0.0d);
    public static final ColorCieLuv WHITE = new ColorCieLuv(100.0d, 0.0d, -0.017d);
    public static final ColorCieLuv RED = new ColorCieLuv(53.233d, 175.053d, 37.751d);
    public static final ColorCieLuv GREEN = new ColorCieLuv(87.737d, -83.08d, 107.401d);
    public static final ColorCieLuv BLUE = new ColorCieLuv(32.303d, -9.4d, -130.358d);

    public ColorCieLuv(double d, double d2, double d3) {
        this.f976L = d;
        this.f977u = d2;
        this.f978v = d3;
    }

    public String toString() {
        return "{L: " + this.f976L + ", u: " + this.f977u + ", v: " + this.f978v + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorCieLuv colorCieLuv = (ColorCieLuv) obj;
        return Double.compare(colorCieLuv.f976L, this.f976L) == 0 && Double.compare(colorCieLuv.f977u, this.f977u) == 0 && Double.compare(colorCieLuv.f978v, this.f978v) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f976L);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f977u);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f978v);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
