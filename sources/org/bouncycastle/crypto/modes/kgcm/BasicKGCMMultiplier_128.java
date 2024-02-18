package org.bouncycastle.crypto.modes.kgcm;

/* loaded from: classes2.dex */
public class BasicKGCMMultiplier_128 implements KGCMMultiplier {

    /* renamed from: H */
    private final long[] f1604H = new long[2];

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void init(long[] jArr) {
        KGCMUtil_128.copy(jArr, this.f1604H);
    }

    @Override // org.bouncycastle.crypto.modes.kgcm.KGCMMultiplier
    public void multiplyH(long[] jArr) {
        KGCMUtil_128.multiply(jArr, this.f1604H, jArr);
    }
}
