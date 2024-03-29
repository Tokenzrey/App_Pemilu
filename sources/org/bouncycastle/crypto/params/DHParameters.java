package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Properties;

/* loaded from: classes2.dex */
public class DHParameters implements CipherParameters {
    private static final int DEFAULT_MINIMUM_LENGTH = 160;

    /* renamed from: g */
    private BigInteger f1623g;

    /* renamed from: j */
    private BigInteger f1624j;

    /* renamed from: l */
    private int f1625l;

    /* renamed from: m */
    private int f1626m;

    /* renamed from: p */
    private BigInteger f1627p;

    /* renamed from: q */
    private BigInteger f1628q;
    private DHValidationParameters validation;

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this(bigInteger, bigInteger2, null, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, 0);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i) {
        this(bigInteger, bigInteger2, bigInteger3, getDefaultMParam(i), i, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2) {
        this(bigInteger, bigInteger2, bigInteger3, i, i2, null, null);
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int i, int i2, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        if (i2 != 0) {
            if (i2 > bigInteger.bitLength()) {
                throw new IllegalArgumentException("when l value specified, it must satisfy 2^(l-1) <= p");
            }
            if (i2 < i) {
                throw new IllegalArgumentException("when l value specified, it may not be less than m value");
            }
        }
        if (i > bigInteger.bitLength() && !Properties.isOverrideSet("org.bouncycastle.dh.allow_unsafe_p_value")) {
            throw new IllegalArgumentException("unsafe p value so small specific l required");
        }
        this.f1623g = bigInteger2;
        this.f1627p = bigInteger;
        this.f1628q = bigInteger3;
        this.f1626m = i;
        this.f1625l = i2;
        this.f1624j = bigInteger4;
        this.validation = dHValidationParameters;
    }

    public DHParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, DHValidationParameters dHValidationParameters) {
        this(bigInteger, bigInteger2, bigInteger3, DEFAULT_MINIMUM_LENGTH, 0, bigInteger4, dHValidationParameters);
    }

    private static int getDefaultMParam(int i) {
        return (i != 0 && i < DEFAULT_MINIMUM_LENGTH) ? i : DEFAULT_MINIMUM_LENGTH;
    }

    public boolean equals(Object obj) {
        if (obj instanceof DHParameters) {
            DHParameters dHParameters = (DHParameters) obj;
            if (getQ() != null) {
                if (!getQ().equals(dHParameters.getQ())) {
                    return false;
                }
            } else if (dHParameters.getQ() != null) {
                return false;
            }
            return dHParameters.getP().equals(this.f1627p) && dHParameters.getG().equals(this.f1623g);
        }
        return false;
    }

    public BigInteger getG() {
        return this.f1623g;
    }

    public BigInteger getJ() {
        return this.f1624j;
    }

    public int getL() {
        return this.f1625l;
    }

    public int getM() {
        return this.f1626m;
    }

    public BigInteger getP() {
        return this.f1627p;
    }

    public BigInteger getQ() {
        return this.f1628q;
    }

    public DHValidationParameters getValidationParameters() {
        return this.validation;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG().hashCode()) ^ (getQ() != null ? getQ().hashCode() : 0);
    }
}
