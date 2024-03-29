package org.apache.commons.imaging.color;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes2.dex */
public final class ColorHunterLab {

    /* renamed from: L */
    public final double f992L;

    /* renamed from: a */
    public final double f993a;

    /* renamed from: b */
    public final double f994b;
    public static final ColorHunterLab BLACK = new ColorHunterLab(0.0d, 0.0d, 0.0d);
    public static final ColorHunterLab WHITE = new ColorHunterLab(100.0d, -5.336d, 5.433d);
    public static final ColorHunterLab RED = new ColorHunterLab(46.109d, 78.962d, 29.794d);
    public static final ColorHunterLab GREEN = new ColorHunterLab(84.569d, -72.518d, 50.842d);
    public static final ColorHunterLab BLUE = new ColorHunterLab(26.87d, 72.885d, -190.923d);

    public ColorHunterLab(double d, double d2, double d3) {
        this.f992L = d;
        this.f993a = d2;
        this.f994b = d3;
    }

    public String toString() {
        return "{L: " + this.f992L + ", a: " + this.f993a + ", b: " + this.f994b + StringSubstitutor.DEFAULT_VAR_END;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorHunterLab colorHunterLab = (ColorHunterLab) obj;
        return Double.compare(colorHunterLab.f992L, this.f992L) == 0 && Double.compare(colorHunterLab.f993a, this.f993a) == 0 && Double.compare(colorHunterLab.f994b, this.f994b) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f992L);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f993a);
        long doubleToLongBits3 = Double.doubleToLongBits(this.f994b);
        return (((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }
}
