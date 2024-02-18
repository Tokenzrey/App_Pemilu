package org.bouncycastle.jce.spec;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.math.p030ec.ECCurve;
import org.bouncycastle.math.p030ec.ECPoint;

/* loaded from: classes2.dex */
public class ECParameterSpec implements AlgorithmParameterSpec {

    /* renamed from: G */
    private ECPoint f1755G;
    private ECCurve curve;

    /* renamed from: h */
    private BigInteger f1756h;

    /* renamed from: n */
    private BigInteger f1757n;
    private byte[] seed;

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger) {
        this.curve = eCCurve;
        this.f1755G = eCPoint.normalize();
        this.f1757n = bigInteger;
        this.f1756h = BigInteger.valueOf(1L);
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        this.curve = eCCurve;
        this.f1755G = eCPoint.normalize();
        this.f1757n = bigInteger;
        this.f1756h = bigInteger2;
        this.seed = null;
    }

    public ECParameterSpec(ECCurve eCCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.curve = eCCurve;
        this.f1755G = eCPoint.normalize();
        this.f1757n = bigInteger;
        this.f1756h = bigInteger2;
        this.seed = bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec) obj;
            return getCurve().equals(eCParameterSpec.getCurve()) && getG().equals(eCParameterSpec.getG());
        }
        return false;
    }

    public ECCurve getCurve() {
        return this.curve;
    }

    public ECPoint getG() {
        return this.f1755G;
    }

    public BigInteger getH() {
        return this.f1756h;
    }

    public BigInteger getN() {
        return this.f1757n;
    }

    public byte[] getSeed() {
        return this.seed;
    }

    public int hashCode() {
        return getCurve().hashCode() ^ getG().hashCode();
    }
}
