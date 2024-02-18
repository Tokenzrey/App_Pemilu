package org.informatika.sirekap.support.pdf.data;

import kotlin.Metadata;

@Metadata(m302d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, m301d2 = {"Lorg/informatika/sirekap/support/pdf/data/BallotData;", "", "row1", "", "row2", "row3", "row4", "(IIII)V", "getRow1", "()I", "getRow2", "getRow3", "getRow4", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* renamed from: org.informatika.sirekap.support.pdf.data.BallotData */
/* loaded from: classes2.dex */
public final class CHAdministratorData {
    private final int row1;
    private final int row2;
    private final int row3;
    private final int row4;

    public static /* synthetic */ CHAdministratorData copy$default(CHAdministratorData cHAdministratorData, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = cHAdministratorData.row1;
        }
        if ((i5 & 2) != 0) {
            i2 = cHAdministratorData.row2;
        }
        if ((i5 & 4) != 0) {
            i3 = cHAdministratorData.row3;
        }
        if ((i5 & 8) != 0) {
            i4 = cHAdministratorData.row4;
        }
        return cHAdministratorData.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.row1;
    }

    public final int component2() {
        return this.row2;
    }

    public final int component3() {
        return this.row3;
    }

    public final int component4() {
        return this.row4;
    }

    public final CHAdministratorData copy(int i, int i2, int i3, int i4) {
        return new CHAdministratorData(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CHAdministratorData) {
            CHAdministratorData cHAdministratorData = (CHAdministratorData) obj;
            return this.row1 == cHAdministratorData.row1 && this.row2 == cHAdministratorData.row2 && this.row3 == cHAdministratorData.row3 && this.row4 == cHAdministratorData.row4;
        }
        return false;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.row1) * 31) + Integer.hashCode(this.row2)) * 31) + Integer.hashCode(this.row3)) * 31) + Integer.hashCode(this.row4);
    }

    public String toString() {
        int i = this.row1;
        int i2 = this.row2;
        int i3 = this.row3;
        return "BallotData(row1=" + i + ", row2=" + i2 + ", row3=" + i3 + ", row4=" + this.row4 + ")";
    }

    public CHAdministratorData(int i, int i2, int i3, int i4) {
        this.row1 = i;
        this.row2 = i2;
        this.row3 = i3;
        this.row4 = i4;
    }

    public final int getRow1() {
        return this.row1;
    }

    public final int getRow2() {
        return this.row2;
    }

    public final int getRow3() {
        return this.row3;
    }

    public final int getRow4() {
        return this.row4;
    }
}
