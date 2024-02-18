package org.visp.core;

/* loaded from: classes4.dex */
public class VpColor extends VpRGBa {
    public VpColor() {
    }

    public VpColor(char c, char c2, char c3) {
        super(c, c2, c3);
    }

    public VpColor(int i, int i2, int i3) {
        super((char) i, (char) i2, (char) i3);
    }

    public VpColor(char c) {
        super(c);
    }

    public VpColor(int i) {
        super((char) i);
    }

    @Override // org.visp.core.VpRGBa
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof VpColor) {
            VpColor vpColor = (VpColor) obj;
            return this.f2331R == vpColor.f2331R && this.f2330G == vpColor.f2330G && this.f2329B == vpColor.f2329B;
        }
        return false;
    }

    @Override // org.visp.core.VpRGBa
    public String toString() {
        return "(" + ((int) this.f2331R) + "," + ((int) this.f2330G) + "," + ((int) this.f2329B) + ")";
    }
}
