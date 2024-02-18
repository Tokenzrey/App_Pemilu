package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class ElGamalParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f1643g;

    /* renamed from: l */
    private int f1644l;

    /* renamed from: p */
    private BigInteger f1645p;

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, 0);
    }

    public ElGamalParameters(BigInteger bigInteger, BigInteger bigInteger2, int i) {
        this.f1643g = bigInteger2;
        this.f1645p = bigInteger;
        this.f1644l = i;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ElGamalParameters) {
            ElGamalParameters elGamalParameters = (ElGamalParameters) obj;
            return elGamalParameters.getP().equals(this.f1645p) && elGamalParameters.getG().equals(this.f1643g) && elGamalParameters.getL() == this.f1644l;
        }
        return false;
    }

    public BigInteger getG() {
        return this.f1643g;
    }

    public int getL() {
        return this.f1644l;
    }

    public BigInteger getP() {
        return this.f1645p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) + this.f1644l;
    }
}
