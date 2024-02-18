package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.util.Memoable;

/* loaded from: classes2.dex */
public class CramerShoupParameters implements CipherParameters {

    /* renamed from: H */
    private Digest f1610H;

    /* renamed from: g1 */
    private BigInteger f1611g1;

    /* renamed from: g2 */
    private BigInteger f1612g2;

    /* renamed from: p */
    private BigInteger f1613p;

    public CramerShoupParameters(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, Digest digest) {
        this.f1613p = bigInteger;
        this.f1611g1 = bigInteger2;
        this.f1612g2 = bigInteger3;
        Digest digest2 = (Digest) ((Memoable) digest).copy();
        this.f1610H = digest2;
        digest2.reset();
    }

    public boolean equals(Object obj) {
        if (obj instanceof CramerShoupParameters) {
            CramerShoupParameters cramerShoupParameters = (CramerShoupParameters) obj;
            return cramerShoupParameters.getP().equals(this.f1613p) && cramerShoupParameters.getG1().equals(this.f1611g1) && cramerShoupParameters.getG2().equals(this.f1612g2);
        }
        return false;
    }

    public BigInteger getG1() {
        return this.f1611g1;
    }

    public BigInteger getG2() {
        return this.f1612g2;
    }

    public Digest getH() {
        return (Digest) ((Memoable) this.f1610H).copy();
    }

    public BigInteger getP() {
        return this.f1613p;
    }

    public int hashCode() {
        return (getP().hashCode() ^ getG1().hashCode()) ^ getG2().hashCode();
    }
}
