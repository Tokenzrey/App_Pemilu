package com.tom_roush.pdfbox.pdmodel.graphics.shading;

import android.graphics.PointF;

/* loaded from: classes3.dex */
class CoordinateColorPair {
    final float[] color;
    final PointF coordinate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CoordinateColorPair(PointF pointF, float[] fArr) {
        this.coordinate = pointF;
        this.color = (float[]) fArr.clone();
    }
}
