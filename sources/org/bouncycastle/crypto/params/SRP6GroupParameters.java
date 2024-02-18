package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* loaded from: classes2.dex */
public class SRP6GroupParameters {

    /* renamed from: N */
    private BigInteger f1673N;

    /* renamed from: g */
    private BigInteger f1674g;

    public SRP6GroupParameters(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f1673N = bigInteger;
        this.f1674g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f1674g;
    }

    public BigInteger getN() {
        return this.f1673N;
    }
}
