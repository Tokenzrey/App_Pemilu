package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes2.dex */
public class GOST3410PrivateKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f1764a;

    /* renamed from: p */
    private BigInteger f1765p;

    /* renamed from: q */
    private BigInteger f1766q;

    /* renamed from: x */
    private BigInteger f1767x;

    public GOST3410PrivateKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f1767x = bigInteger;
        this.f1765p = bigInteger2;
        this.f1766q = bigInteger3;
        this.f1764a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f1764a;
    }

    public BigInteger getP() {
        return this.f1765p;
    }

    public BigInteger getQ() {
        return this.f1766q;
    }

    public BigInteger getX() {
        return this.f1767x;
    }
}
