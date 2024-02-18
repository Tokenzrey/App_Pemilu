package org.opencv.core;

import org.apache.commons.text.StringSubstitutor;

/* loaded from: classes4.dex */
public class Rect {
    public int height;
    public int width;

    /* renamed from: x */
    public int f2314x;

    /* renamed from: y */
    public int f2315y;

    public Rect(int i, int i2, int i3, int i4) {
        this.f2314x = i;
        this.f2315y = i2;
        this.width = i3;
        this.height = i4;
    }

    public Rect() {
        this(0, 0, 0, 0);
    }

    public Rect(Point point, Point point2) {
        this.f2314x = (int) (point.f2309x < point2.f2309x ? point.f2309x : point2.f2309x);
        this.f2315y = (int) (point.f2310y < point2.f2310y ? point.f2310y : point2.f2310y);
        this.width = ((int) (point.f2309x > point2.f2309x ? point.f2309x : point2.f2309x)) - this.f2314x;
        this.height = ((int) (point.f2310y > point2.f2310y ? point.f2310y : point2.f2310y)) - this.f2315y;
    }

    public Rect(Point point, Size size) {
        this((int) point.f2309x, (int) point.f2310y, (int) size.width, (int) size.height);
    }

    public Rect(double[] dArr) {
        set(dArr);
    }

    public void set(double[] dArr) {
        if (dArr != null) {
            this.f2314x = dArr.length > 0 ? (int) dArr[0] : 0;
            this.f2315y = dArr.length > 1 ? (int) dArr[1] : 0;
            this.width = dArr.length > 2 ? (int) dArr[2] : 0;
            this.height = dArr.length > 3 ? (int) dArr[3] : 0;
            return;
        }
        this.f2314x = 0;
        this.f2315y = 0;
        this.width = 0;
        this.height = 0;
    }

    public Rect clone() {
        return new Rect(this.f2314x, this.f2315y, this.width, this.height);
    }

    /* renamed from: tl */
    public Point m12tl() {
        return new Point(this.f2314x, this.f2315y);
    }

    /* renamed from: br */
    public Point m13br() {
        return new Point(this.f2314x + this.width, this.f2315y + this.height);
    }

    public Size size() {
        return new Size(this.width, this.height);
    }

    public double area() {
        return this.width * this.height;
    }

    public boolean empty() {
        return this.width <= 0 || this.height <= 0;
    }

    public boolean contains(Point point) {
        return ((double) this.f2314x) <= point.f2309x && point.f2309x < ((double) (this.f2314x + this.width)) && ((double) this.f2315y) <= point.f2310y && point.f2310y < ((double) (this.f2315y + this.height));
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.height);
        long doubleToLongBits2 = Double.doubleToLongBits(this.width);
        int i = ((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.f2314x);
        int i2 = (i * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)));
        long doubleToLongBits4 = Double.doubleToLongBits(this.f2315y);
        return (i2 * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Rect) {
            Rect rect = (Rect) obj;
            return this.f2314x == rect.f2314x && this.f2315y == rect.f2315y && this.width == rect.width && this.height == rect.height;
        }
        return false;
    }

    public String toString() {
        return "{" + this.f2314x + ", " + this.f2315y + ", " + this.width + "x" + this.height + StringSubstitutor.DEFAULT_VAR_END;
    }
}
