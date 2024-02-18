package org.bouncycastle.pqc.crypto.lms;

import org.bouncycastle.crypto.Digest;

/* loaded from: classes2.dex */
class SeedDerive {

    /* renamed from: I */
    private final byte[] f2085I;
    private final Digest digest;

    /* renamed from: j */
    private int f2086j;
    private final byte[] masterSeed;

    /* renamed from: q */
    private int f2087q;

    public SeedDerive(byte[] bArr, byte[] bArr2, Digest digest) {
        this.f2085I = bArr;
        this.masterSeed = bArr2;
        this.digest = digest;
    }

    public void deriveSeed(byte[] bArr, boolean z) {
        deriveSeed(bArr, z, 0);
    }

    public void deriveSeed(byte[] bArr, boolean z, int i) {
        deriveSeed(bArr, i);
        if (z) {
            this.f2086j++;
        }
    }

    public byte[] deriveSeed(byte[] bArr, int i) {
        if (bArr.length >= this.digest.getDigestSize()) {
            Digest digest = this.digest;
            byte[] bArr2 = this.f2085I;
            digest.update(bArr2, 0, bArr2.length);
            this.digest.update((byte) (this.f2087q >>> 24));
            this.digest.update((byte) (this.f2087q >>> 16));
            this.digest.update((byte) (this.f2087q >>> 8));
            this.digest.update((byte) this.f2087q);
            this.digest.update((byte) (this.f2086j >>> 8));
            this.digest.update((byte) this.f2086j);
            this.digest.update((byte) -1);
            Digest digest2 = this.digest;
            byte[] bArr3 = this.masterSeed;
            digest2.update(bArr3, 0, bArr3.length);
            this.digest.doFinal(bArr, i);
            return bArr;
        }
        throw new IllegalArgumentException("target length is less than digest size.");
    }

    public byte[] getI() {
        return this.f2085I;
    }

    public int getJ() {
        return this.f2086j;
    }

    public byte[] getMasterSeed() {
        return this.masterSeed;
    }

    public int getQ() {
        return this.f2087q;
    }

    public void setJ(int i) {
        this.f2086j = i;
    }

    public void setQ(int i) {
        this.f2087q = i;
    }
}
