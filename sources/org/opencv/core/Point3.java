package org.opencv.core;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes4.dex */
public class Point3 {

    /* renamed from: x */
    public double f2311x;

    /* renamed from: y */
    public double f2312y;

    /* renamed from: z */
    public double f2313z;

    public Point3(double d, double d2, double d3) {
        this.f2311x = d;
        this.f2312y = d2;
        this.f2313z = d3;
    }

    public Point3() {
        this(0.0d, 0.0d, 0.0d);
    }

    public Point3(Point point) {
        this.f2311x = point.f2309x;
        this.f2312y = point.f2310y;
        this.f2313z = 0.0d;
    }

    public Point3(double[] dArr) {
        this();
        set(dArr);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.f2311x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.f2312y = dArr.length > 1 ? dArr[1] : 0.0d;
            this.f2313z = dArr.length > 2 ? dArr[2] : 0.0d;
            return;
        }
        this.f2311x = 0.0d;
        this.f2312y = 0.0d;
        this.f2313z = 0.0d;
    }

    public Point3 clone() {
        return new Point3(this.f2311x, this.f2312y, this.f2313z);
    }

    public double dot(Point3 point3) {
        return (this.f2311x * point3.f2311x) + (this.f2312y * point3.f2312y) + (this.f2313z * point3.f2313z);
    }

    public Point3 cross(Point3 point3) {
        double d = this.f2312y;
        double d2 = point3.f2313z;
        double d3 = this.f2313z;
        double d4 = point3.f2312y;
        double d5 = (d * d2) - (d3 * d4);
        double d6 = point3.f2311x;
        double d7 = this.f2311x;
        return new Point3(d5, (d3 * d6) - (d2 * d7), (d7 * d4) - (d * d6));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f2311x);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f2312y);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2313z);
        return (i * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Point3) {
            Point3 point3 = (Point3) obj;
            return this.f2311x == point3.f2311x && this.f2312y == point3.f2312y && this.f2313z == point3.f2313z;
        }
        return false;
    }

    public String toString() {
        return "{" + this.f2311x + ", " + this.f2312y + ", " + this.f2313z + StringSubstitutor.DEFAULT_VAR_END;
    }
}
