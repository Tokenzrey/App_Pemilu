package com.tom_roush.pdfbox.util;

/* loaded from: classes3.dex */
public final class Vector {

    /* renamed from: x */
    private final float f505x;

    /* renamed from: y */
    private final float f506y;

    public Vector(float f, float f2) {
        this.f505x = f;
        this.f506y = f2;
    }

    public float getX() {
        return this.f505x;
    }

    public float getY() {
        return this.f506y;
    }

    public Vector scale(float f) {
        return new Vector(this.f505x * f, this.f506y * f);
    }

    public String toString() {
        return "(" + this.f505x + ", " + this.f506y + ")";
    }
}
