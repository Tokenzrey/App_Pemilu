package org.bouncycastle.crypto.params;

/* loaded from: classes2.dex */
public class GOST3410ValidationParameters {

    /* renamed from: c */
    private int f1653c;

    /* renamed from: cL */
    private long f1654cL;

    /* renamed from: x0 */
    private int f1655x0;
    private long x0L;

    public GOST3410ValidationParameters(int i, int i2) {
        this.f1655x0 = i;
        this.f1653c = i2;
    }

    public GOST3410ValidationParameters(long j, long j2) {
        this.x0L = j;
        this.f1654cL = j2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410ValidationParameters) {
            GOST3410ValidationParameters gOST3410ValidationParameters = (GOST3410ValidationParameters) obj;
            return gOST3410ValidationParameters.f1653c == this.f1653c && gOST3410ValidationParameters.f1655x0 == this.f1655x0 && gOST3410ValidationParameters.f1654cL == this.f1654cL && gOST3410ValidationParameters.x0L == this.x0L;
        }
        return false;
    }

    public int getC() {
        return this.f1653c;
    }

    public long getCL() {
        return this.f1654cL;
    }

    public int getX0() {
        return this.f1655x0;
    }

    public long getX0L() {
        return this.x0L;
    }

    public int hashCode() {
        int i = this.f1655x0 ^ this.f1653c;
        long j = this.x0L;
        int i2 = (i ^ ((int) j)) ^ ((int) (j >> 32));
        long j2 = this.f1654cL;
        return (i2 ^ ((int) j2)) ^ ((int) (j2 >> 32));
    }
}
