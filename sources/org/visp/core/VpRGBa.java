package org.visp.core;

/* loaded from: classes4.dex */
public class VpRGBa {
    public static final char alphaDefault = 255;

    /* renamed from: A */
    public char f2328A;

    /* renamed from: B */
    public char f2329B;

    /* renamed from: G */
    public char f2330G;

    /* renamed from: R */
    public char f2331R;

    public VpRGBa() {
        this((char) 0, (char) 0, (char) 0, alphaDefault);
    }

    public VpRGBa(char c, char c2, char c3) {
        this(c, c2, c3, alphaDefault);
    }

    public VpRGBa(char c, char c2, char c3, char c4) {
        this.f2331R = c;
        this.f2330G = c2;
        this.f2329B = c3;
        this.f2328A = c4;
    }

    public VpRGBa(char c) {
        this(c, c, c, c);
    }

    public VpRGBa(VpRGBa vpRGBa) {
        this(vpRGBa.f2331R, vpRGBa.f2330G, vpRGBa.f2329B, vpRGBa.f2328A);
    }

    public void add(VpRGBa vpRGBa) {
        this.f2331R = (char) (this.f2331R + vpRGBa.f2331R);
        this.f2330G = (char) (this.f2330G + vpRGBa.f2330G);
        this.f2329B = (char) (this.f2329B + vpRGBa.f2329B);
        this.f2328A = (char) (this.f2328A + vpRGBa.f2328A);
    }

    public String toString() {
        return "(" + ((int) this.f2331R) + "," + ((int) this.f2330G) + "," + ((int) this.f2329B) + "," + ((int) this.f2328A) + ")";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VpRGBa) {
            VpRGBa vpRGBa = (VpRGBa) obj;
            return this.f2331R == vpRGBa.f2331R && this.f2330G == vpRGBa.f2330G && this.f2329B == vpRGBa.f2329B && this.f2328A == vpRGBa.f2328A;
        }
        return false;
    }
}
