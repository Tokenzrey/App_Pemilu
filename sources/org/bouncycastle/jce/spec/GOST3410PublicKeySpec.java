package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.KeySpec;

/* loaded from: classes2.dex */
public class GOST3410PublicKeySpec implements KeySpec {

    /* renamed from: a */
    private BigInteger f1771a;

    /* renamed from: p */
    private BigInteger f1772p;

    /* renamed from: q */
    private BigInteger f1773q;

    /* renamed from: y */
    private BigInteger f1774y;

    public GOST3410PublicKeySpec(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f1774y = bigInteger;
        this.f1772p = bigInteger2;
        this.f1773q = bigInteger3;
        this.f1771a = bigInteger4;
    }

    public BigInteger getA() {
        return this.f1771a;
    }

    public BigInteger getP() {
        return this.f1772p;
    }

    public BigInteger getQ() {
        return this.f1773q;
    }

    public BigInteger getY() {
        return this.f1774y;
    }
}
