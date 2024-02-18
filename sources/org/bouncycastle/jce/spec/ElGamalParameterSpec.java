package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;

/* loaded from: classes2.dex */
public class ElGamalParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: g */
    private BigInteger f1760g;

    /* renamed from: p */
    private BigInteger f1761p;

    public ElGamalParameterSpec(BigInteger bigInteger, BigInteger bigInteger2) {
        this.f1761p = bigInteger;
        this.f1760g = bigInteger2;
    }

    public BigInteger getG() {
        return this.f1760g;
    }

    public BigInteger getP() {
        return this.f1761p;
    }
}
