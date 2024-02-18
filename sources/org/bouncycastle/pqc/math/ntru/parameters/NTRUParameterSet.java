package org.bouncycastle.pqc.math.ntru.parameters;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes2.dex */
public abstract class NTRUParameterSet {
    private final int logQ;

    /* renamed from: n */
    private final int f2247n;
    private final int prfKeyBytes;
    private final int seedBytes;
    private final int sharedKeyBytes;

    public NTRUParameterSet(int i, int i2, int i3, int i4, int i5) {
        this.f2247n = i;
        this.logQ = i2;
        this.seedBytes = i3;
        this.prfKeyBytes = i4;
        this.sharedKeyBytes = i5;
    }

    public abstract Polynomial createPolynomial();

    public int logQ() {
        return this.logQ;
    }

    /* renamed from: n */
    public int m69n() {
        return this.f2247n;
    }

    public int ntruCiphertextBytes() {
        return owcpaBytes();
    }

    public int ntruPublicKeyBytes() {
        return owcpaPublicKeyBytes();
    }

    public int ntruSecretKeyBytes() {
        return owcpaSecretKeyBytes() + this.prfKeyBytes;
    }

    public int owcpaBytes() {
        return ((this.logQ * packDegree()) + 7) / 8;
    }

    public int owcpaMsgBytes() {
        return packTrinaryBytes() * 2;
    }

    public int owcpaPublicKeyBytes() {
        return ((this.logQ * packDegree()) + 7) / 8;
    }

    public int owcpaSecretKeyBytes() {
        return (packTrinaryBytes() * 2) + owcpaPublicKeyBytes();
    }

    public int packDegree() {
        return this.f2247n - 1;
    }

    public int packTrinaryBytes() {
        return (packDegree() + 4) / 5;
    }

    public int prfKeyBytes() {
        return this.prfKeyBytes;
    }

    /* renamed from: q */
    public int m68q() {
        return 1 << this.logQ;
    }

    public abstract int sampleFgBytes();

    public int sampleFixedTypeBytes() {
        return (((this.f2247n - 1) * 30) + 7) / 8;
    }

    public int sampleIidBytes() {
        return this.f2247n - 1;
    }

    public abstract int sampleRmBytes();

    public int seedBytes() {
        return this.seedBytes;
    }

    public int sharedKeyBytes() {
        return this.sharedKeyBytes;
    }
}
