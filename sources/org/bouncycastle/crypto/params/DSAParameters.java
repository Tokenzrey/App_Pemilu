package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class DSAParameters implements CipherParameters {

    /* renamed from: g */
    private BigInteger f1633g;

    /* renamed from: p */
    private BigInteger f1634p;

    /* renamed from: q */
    private BigInteger f1635q;
    private DSAValidationParameters validation;

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this.f1633g = bigInteger3;
        this.f1634p = bigInteger;
        this.f1635q = bigInteger2;
    }

    public DSAParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, DSAValidationParameters dSAValidationParameters) {
        this.f1633g = bigInteger3;
        this.f1634p = bigInteger;
        this.f1635q = bigInteger2;
        this.validation = dSAValidationParameters;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DSAParameters) {
            DSAParameters dSAParameters = (DSAParameters) obj;
            return dSAParameters.getP().equals(this.f1634p) && dSAParameters.getQ().equals(this.f1635q) && dSAParameters.getG().equals(this.f1633g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f1633g;
    }

    public BigInteger getP() {
        return this.f1634p;
    }

    public BigInteger getQ() {
        return this.f1635q;
    }

    public DSAValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getQ().hashCode()) ^ getG().hashCode();
    }
}
