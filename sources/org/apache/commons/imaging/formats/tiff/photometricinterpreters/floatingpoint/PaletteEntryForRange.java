package org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint;

import java.awt.Color;

/* loaded from: classes2.dex */
public class PaletteEntryForRange implements PaletteEntry {

    /* renamed from: a0 */
    private final float f1051a0;

    /* renamed from: a1 */
    private final float f1052a1;

    /* renamed from: b0 */
    private final float f1053b0;

    /* renamed from: b1 */
    private final float f1054b1;

    /* renamed from: g0 */
    private final float f1055g0;

    /* renamed from: g1 */
    private final float f1056g1;

    /* renamed from: r0 */
    private final float f1057r0;

    /* renamed from: r1 */
    private final float f1058r1;

    /* renamed from: v0 */
    private final float f1059v0;

    /* renamed from: v1 */
    private final float f1060v1;

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean coversSingleEntry() {
        return false;
    }

    public PaletteEntryForRange(float f, float f2, Color color, Color color2) {
        this.f1059v0 = f;
        this.f1060v1 = f2;
        float f3 = f2 - f;
        if (f3 <= 0.0f || Float.isNaN(f3)) {
            throw new IllegalArgumentException("Specified values must be v0<v1");
        }
        if (color == null || color2 == null) {
            throw new IllegalArgumentException("Null colors not allowed");
        }
        int rgb = color.getRGB();
        this.f1051a0 = (rgb >> 24) & 255;
        this.f1057r0 = (rgb >> 16) & 255;
        this.f1055g0 = (rgb >> 8) & 255;
        this.f1053b0 = rgb & 255;
        int rgb2 = color2.getRGB();
        this.f1052a1 = (rgb2 >> 24) & 255;
        this.f1058r1 = (rgb2 >> 16) & 255;
        this.f1056g1 = (rgb2 >> 8) & 255;
        this.f1054b1 = rgb2 & 255;
    }

    public PaletteEntryForRange(float f, float f2, Color color) {
        this.f1059v0 = f;
        this.f1060v1 = f2;
        float f3 = f2 - f;
        if (f3 <= 0.0f || Float.isNaN(f3)) {
            throw new IllegalArgumentException("Specified values must be v0<v1");
        }
        if (color == null) {
            throw new IllegalArgumentException("Null colors not allowed");
        }
        int rgb = color.getRGB();
        this.f1051a0 = (rgb >> 24) & 255;
        this.f1057r0 = (rgb >> 16) & 255;
        this.f1055g0 = (rgb >> 8) & 255;
        this.f1053b0 = rgb & 255;
        int rgb2 = color.getRGB();
        this.f1052a1 = (rgb2 >> 24) & 255;
        this.f1058r1 = (rgb2 >> 16) & 255;
        this.f1056g1 = (rgb2 >> 8) & 255;
        this.f1054b1 = rgb2 & 255;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public boolean isCovered(float f) {
        return this.f1059v0 <= f && f < this.f1060v1;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public int getARGB(float f) {
        float f2 = this.f1059v0;
        if (f2 <= f) {
            float f3 = this.f1060v1;
            if (f <= f3) {
                float f4 = (f - f2) / (f3 - f2);
                float f5 = this.f1052a1;
                float f6 = this.f1051a0;
                float f7 = this.f1058r1;
                float f8 = this.f1057r0;
                int i = (int) (((f7 - f8) * f4) + f8 + 0.5d);
                float f9 = this.f1056g1;
                float f10 = this.f1055g0;
                float f11 = this.f1054b1;
                float f12 = this.f1053b0;
                return ((int) ((f4 * (f11 - f12)) + f12 + 0.5d)) | (((((((int) ((((f5 - f6) * f4) + f6) + 0.5d)) << 8) | i) << 8) | ((int) ((((f9 - f10) * f4) + f10) + 0.5d))) << 8);
            }
            return 0;
        }
        return 0;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public Color getColor(float f) {
        float f2 = this.f1059v0;
        if (f2 <= f) {
            float f3 = this.f1060v1;
            if (f <= f3) {
                float f4 = (f - f2) / (f3 - f2);
                float f5 = this.f1052a1;
                float f6 = this.f1051a0;
                float f7 = this.f1058r1;
                float f8 = this.f1057r0;
                int i = (int) (((f7 - f8) * f4) + f8 + 0.5d);
                float f9 = this.f1056g1;
                float f10 = this.f1055g0;
                int i2 = (int) (((f9 - f10) * f4) + f10 + 0.5d);
                float f11 = this.f1054b1;
                float f12 = this.f1053b0;
                return new Color(i, i2, (int) ((f4 * (f11 - f12)) + f12 + 0.5d), (int) (((f5 - f6) * f4) + f6 + 0.5d));
            }
            return null;
        }
        return null;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getLowerBound() {
        return this.f1059v0;
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.floatingpoint.PaletteEntry
    public float getUpperBound() {
        return this.f1060v1;
    }

    public String toString() {
        return "PaletteEntry for range " + this.f1059v0 + ", " + this.f1060v1;
    }
}
