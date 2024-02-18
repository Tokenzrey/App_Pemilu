package org.opencv.core;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes4.dex */
public class Rect2d {
    public double height;
    public double width;

    /* renamed from: x */
    public double f2316x;

    /* renamed from: y */
    public double f2317y;

    public Rect2d(double d, double d2, double d3, double d4) {
        this.f2316x = d;
        this.f2317y = d2;
        this.width = d3;
        this.height = d4;
    }

    public Rect2d() {
        this(0.0d, 0.0d, 0.0d, 0.0d);
    }

    public Rect2d(Point point, Point point2) {
        this.f2316x = point.f2309x < point2.f2309x ? point.f2309x : point2.f2309x;
        this.f2317y = point.f2310y < point2.f2310y ? point.f2310y : point2.f2310y;
        this.width = (point.f2309x > point2.f2309x ? point.f2309x : point2.f2309x) - this.f2316x;
        this.height = (point.f2310y > point2.f2310y ? point.f2310y : point2.f2310y) - this.f2317y;
    }

    public Rect2d(Point point, Size size) {
        this(point.f2309x, point.f2310y, size.width, size.height);
    }

    public Rect2d(double[] dArr) {
        set(dArr);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.f2316x = dArr.length > 0 ? dArr[0] : 0.0d;
            this.f2317y = dArr.length > 1 ? dArr[1] : 0.0d;
            this.width = dArr.length > 2 ? dArr[2] : 0.0d;
            this.height = dArr.length > 3 ? dArr[3] : 0.0d;
            return;
        }
        this.f2316x = 0.0d;
        this.f2317y = 0.0d;
        this.width = 0.0d;
        this.height = 0.0d;
    }

    public Rect2d clone() {
        return new Rect2d(this.f2316x, this.f2317y, this.width, this.height);
    }

    /* renamed from: tl */
    public Point m10tl() {
        return new Point(this.f2316x, this.f2317y);
    }

    /* renamed from: br */
    public Point m11br() {
        return new Point(this.f2316x + this.width, this.f2317y + this.height);
    }

    public Size size() {
        return new Size(this.width, this.height);
    }

    public double area() {
        return this.width * this.height;
    }

    public boolean empty() {
        return this.width <= 0.0d || this.height <= 0.0d;
    }

    public boolean contains(Point point) {
        return this.f2316x <= point.f2309x && point.f2309x < this.f2316x + this.width && this.f2317y <= point.f2310y && point.f2310y < this.f2317y + this.height;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.height);
        long doubleToLongBits2 = Double.doubleToLongBits(this.width);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2316x);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f2317y);
        return (i2 * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect2d) {
            Rect2d rect2d = (Rect2d) obj;
            return this.f2316x == rect2d.f2316x && this.f2317y == rect2d.f2317y && this.width == rect2d.width && this.height == rect2d.height;
        }
        return false;
    }

    public String toString() {
        return "{" + this.f2316x + ", " + this.f2317y + ", " + this.width + "x" + this.height + StringSubstitutor.DEFAULT_VAR_END;
    }
}
