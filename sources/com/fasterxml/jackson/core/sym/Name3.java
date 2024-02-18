package com.fasterxml.jackson.core.sym;

/* loaded from: classes.dex */
public final class Name3 extends Name {

    /* renamed from: q1 */
    private final int f172q1;

    /* renamed from: q2 */
    private final int f173q2;

    /* renamed from: q3 */
    private final int f174q3;

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i) {
        return false;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    Name3(String str, int i, int i2, int i3, int i4) {
        super(str, i);
        this.f172q1 = i2;
        this.f173q2 = i3;
        this.f174q3 = i4;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int i, int i2, int i3) {
        return this.f172q1 == i && this.f173q2 == i2 && this.f174q3 == i3;
    }

    @Override // com.fasterxml.jackson.core.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 3 && iArr[0] == this.f172q1 && iArr[1] == this.f173q2 && iArr[2] == this.f174q3;
    }
}
