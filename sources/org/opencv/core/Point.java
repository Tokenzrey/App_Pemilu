package org.opencv.core;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes4.dex */
public class Point {

    /* renamed from: x */
    public double f2309x;

    /* renamed from: y */
    public double f2310y;

    public Point(double d, double d2) {
        this.f2309x = d;
        this.f2310y = d2;
    }

    public Point() {
        this(0.0d, 0.0d);
    }

    public Point(double[] dArr) {
        this();
        set(dArr);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.f2309x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.f2310y = dArr.length > 1 ? dArr[1] : 0.0d;
            return;
        }
        this.f2309x = 0.0d;
        this.f2310y = 0.0d;
    }

    public Point clone() {
        return new Point(this.f2309x, this.f2310y);
    }

    public double dot(Point point) {
        return (this.f2309x * point.f2309x) + (this.f2310y * point.f2310y);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2309x);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2310y);
        return ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return this.f2309x == point.f2309x && this.f2310y == point.f2310y;
        }
        return false;
    }

    public boolean inside(Rect rect) {
        return rect.contains(this);
    }

    public String toString() {
        return "{" + this.f2309x + ", " + this.f2310y + StringSubstitutor.DEFAULT_VAR_END;
    }
}
