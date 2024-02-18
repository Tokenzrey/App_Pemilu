package org.bouncycastle.jce.spec;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class GOST3410PublicKeyParameterSetSpec {

    /* renamed from: a */
    private BigInteger f1768a;

    /* renamed from: p */
    private BigInteger f1769p;

    /* renamed from: q */
    private BigInteger f1770q;

    public GOST3410PublicKeyParameterSetSpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1769p = bigInteger;
        this.f1770q = bigInteger2;
        this.f1768a = bigInteger3;
    }

    public boolean equals(Object obj) {
        if (obj instanceof GOST3410PublicKeyParameterSetSpec) {
            GOST3410PublicKeyParameterSetSpec gOST3410PublicKeyParameterSetSpec = (GOST3410PublicKeyParameterSetSpec) obj;
            return this.f1768a.equals(gOST3410PublicKeyParameterSetSpec.f1768a) && this.f1769p.equals(gOST3410PublicKeyParameterSetSpec.f1769p) && this.f1770q.equals(gOST3410PublicKeyParameterSetSpec.f1770q);
        }
        return false;
    }

    public BigInteger getA() {
        return this.f1768a;
    }

    public BigInteger getP() {
        return this.f1769p;
    }

    public BigInteger getQ() {
        return this.f1770q;
    }

    public int hashCode() {
        return (this.f1768a.hashCode() ^ this.f1769p.hashCode()) ^ this.f1770q.hashCode();
    }
}
