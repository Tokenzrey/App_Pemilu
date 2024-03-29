package org.apache.commons.imaging.formats.tiff.photometricinterpreters;

import androidx.core.view.ViewCompat;
import java.io.IOException;
import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.common.ImageBuilder;

/* loaded from: classes2.dex */
public class PhotometricInterpreterLogLuv extends PhotometricInterpreter {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class TristimulusValues {

        /* renamed from: x */
        public float f1048x;

        /* renamed from: y */
        public float f1049y;

        /* renamed from: z */
        public float f1050z;

        TristimulusValues() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class RgbValues {

        /* renamed from: b */
        public int f1045b;

        /* renamed from: g */
        public int f1046g;

        /* renamed from: r */
        public int f1047r;

        RgbValues() {
        }
    }

    public PhotometricInterpreterLogLuv(int i, int[] iArr, int i2, int i3, int i4) {
        super(i, iArr, i2, i3, i4);
    }

    @Override // org.apache.commons.imaging.formats.tiff.photometricinterpreters.PhotometricInterpreter
    public void interpretPixel(ImageBuilder imageBuilder, int[] iArr, int i, int i2) throws ImageReadException, IOException {
        if (iArr == null || iArr.length != 3) {
            throw new ImageReadException("Invalid length of bits per sample (expected 3).");
        }
        RgbValues rgbValues = getRgbValues(getTristimulusValues(iArr[0], (byte) iArr[1], (byte) iArr[2]));
        int min = Math.min(255, Math.max(0, rgbValues.f1047r));
        int min2 = Math.min(255, Math.max(0, rgbValues.f1046g));
        imageBuilder.setRGB(i, i2, (Math.min(255, Math.max(0, rgbValues.f1045b)) << 0) | (min << 16) | ViewCompat.MEASURED_STATE_MASK | (min2 << 8));
    }

    TristimulusValues getTristimulusValues(int i, int i2, int i3) {
        float f = (((i * 100.0f) / 255.0f) + 16.0f) / 116.0f;
        float f2 = (i2 / 500.0f) + f;
        float f3 = f - (i3 / 200.0f);
        float pow = (float) Math.pow(f2, 3.0d);
        float pow2 = (float) Math.pow(f, 3.0d);
        float pow3 = (float) Math.pow(f3, 3.0d);
        if (pow2 <= 0.008856f) {
            pow2 = (f - 0.13793103f) / 7.787f;
        }
        if (pow <= 0.008856f) {
            pow = (f2 - 0.13793103f) / 7.787f;
        }
        if (pow3 <= 0.008856f) {
            pow3 = (f3 - 0.13793103f) / 7.787f;
        }
        TristimulusValues tristimulusValues = new TristimulusValues();
        tristimulusValues.f1048x = pow * 95.047f;
        tristimulusValues.f1049y = pow2 * 100.0f;
        tristimulusValues.f1050z = pow3 * 108.883f;
        return tristimulusValues;
    }

    RgbValues getRgbValues(TristimulusValues tristimulusValues) {
        float f = tristimulusValues.f1048x / 100.0f;
        float f2 = tristimulusValues.f1049y / 100.0f;
        float f3 = tristimulusValues.f1050z / 100.0f;
        float f4 = (3.2406f * f) + ((-1.5372f) * f2) + ((-0.4986f) * f3);
        float f5 = ((-0.9689f) * f) + (1.8758f * f2) + (0.0415f * f3);
        float f6 = (f * 0.0557f) + (f2 * (-0.204f)) + (f3 * 1.057f);
        double d = f4;
        float pow = d > 0.0031308d ? (((float) Math.pow(d, 0.4166666666666667d)) * 1.055f) - 0.055f : f4 * 12.92f;
        double d2 = f5;
        float pow2 = d2 > 0.0031308d ? (((float) Math.pow(d2, 0.4166666666666667d)) * 1.055f) - 0.055f : f5 * 12.92f;
        double d3 = f6;
        float pow3 = d3 > 0.0031308d ? (((float) Math.pow(d3, 0.4166666666666667d)) * 1.055f) - 0.055f : f6 * 12.92f;
        RgbValues rgbValues = new RgbValues();
        rgbValues.f1047r = (int) (pow * 255.0f);
        rgbValues.f1046g = (int) (pow2 * 255.0f);
        rgbValues.f1045b = (int) (pow3 * 255.0f);
        return rgbValues;
    }
}
