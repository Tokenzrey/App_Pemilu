package com.tom_roush.fontbox.ttf;

import android.graphics.Path;
import android.util.Log;
import com.tom_roush.pdfbox.android.PDFBoxConfig;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes3.dex */
class GlyphRenderer {
    private GlyphDescription glyphDescription;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GlyphRenderer(GlyphDescription glyphDescription) {
        this.glyphDescription = glyphDescription;
    }

    public Path getPath() {
        return calculatePath(describe(this.glyphDescription));
    }

    private Point[] describe(GlyphDescription glyphDescription) {
        int pointCount = glyphDescription.getPointCount();
        Point[] pointArr = new Point[pointCount];
        int i = 0;
        int i2 = 0;
        int i3 = -1;
        while (i < pointCount) {
            if (i3 == -1) {
                i3 = glyphDescription.getEndPtOfContours(i2);
            }
            boolean z = true;
            boolean z2 = i3 == i;
            if (z2) {
                i2++;
                i3 = -1;
            }
            short xCoordinate = glyphDescription.getXCoordinate(i);
            short yCoordinate = glyphDescription.getYCoordinate(i);
            if ((glyphDescription.getFlags(i) & 1) == 0) {
                z = false;
            }
            pointArr[i] = new Point(xCoordinate, yCoordinate, z, z2);
            i++;
        }
        return pointArr;
    }

    private Path calculatePath(Point[] pointArr) {
        Path path = new Path();
        int length = pointArr.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (pointArr[i2].endOfContour) {
                Point point = pointArr[i];
                Point point2 = pointArr[i2];
                ArrayList arrayList = new ArrayList();
                for (int i3 = i; i3 <= i2; i3++) {
                    arrayList.add(pointArr[i3]);
                }
                if (pointArr[i].onCurve) {
                    arrayList.add(point);
                } else if (pointArr[i2].onCurve) {
                    arrayList.add(0, point2);
                } else {
                    Point midValue = midValue(point, point2);
                    arrayList.add(0, midValue);
                    arrayList.add(midValue);
                }
                moveTo(path, (Point) arrayList.get(0));
                int size = arrayList.size();
                int i4 = 1;
                while (i4 < size) {
                    Point point3 = (Point) arrayList.get(i4);
                    if (point3.onCurve) {
                        lineTo(path, point3);
                    } else {
                        int i5 = i4 + 1;
                        if (((Point) arrayList.get(i5)).onCurve) {
                            quadTo(path, point3, (Point) arrayList.get(i5));
                            i4 = i5;
                        } else {
                            quadTo(path, point3, midValue(point3, (Point) arrayList.get(i5)));
                        }
                    }
                    i4++;
                }
                path.close();
                i = i2 + 1;
            }
        }
        return path;
    }

    private void moveTo(Path path, Point point) {
        path.moveTo(point.f321x, point.f322y);
        if (PDFBoxConfig.isDebugEnabled()) {
            Log.d("PdfBox-Android", "moveTo: " + String.format(Locale.US, "%d,%d", Integer.valueOf(point.f321x), Integer.valueOf(point.f322y)));
        }
    }

    private void lineTo(Path path, Point point) {
        path.lineTo(point.f321x, point.f322y);
        if (PDFBoxConfig.isDebugEnabled()) {
            Log.d("PdfBox-Android", "lineTo: " + String.format(Locale.US, "%d,%d", Integer.valueOf(point.f321x), Integer.valueOf(point.f322y)));
        }
    }

    private void quadTo(Path path, Point point, Point point2) {
        path.quadTo(point.f321x, point.f322y, point2.f321x, point2.f322y);
        if (PDFBoxConfig.isDebugEnabled()) {
            Log.d("PdfBox-Android", "quadTo: " + String.format(Locale.US, "%d,%d %d,%d", Integer.valueOf(point.f321x), Integer.valueOf(point.f322y), Integer.valueOf(point2.f321x), Integer.valueOf(point2.f322y)));
        }
    }

    private int midValue(int i, int i2) {
        return i + ((i2 - i) / 2);
    }

    private Point midValue(Point point, Point point2) {
        return new Point(midValue(point.f321x, point2.f321x), midValue(point.f322y, point2.f322y));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class Point {
        private boolean endOfContour;
        private boolean onCurve;

        /* renamed from: x */
        private int f321x;

        /* renamed from: y */
        private int f322y;

        Point(int i, int i2, boolean z, boolean z2) {
            this.f321x = i;
            this.f322y = i2;
            this.onCurve = z;
            this.endOfContour = z2;
        }

        Point(int i, int i2) {
            this(i, i2, true, false);
        }

        public String toString() {
            Locale locale = Locale.US;
            Object[] objArr = new Object[4];
            objArr[0] = Integer.valueOf(this.f321x);
            objArr[1] = Integer.valueOf(this.f322y);
            objArr[2] = this.onCurve ? "onCurve" : "";
            objArr[3] = this.endOfContour ? "endOfContour" : "";
            return String.format(locale, "Point(%d,%d,%s,%s)", objArr);
        }
    }
}
