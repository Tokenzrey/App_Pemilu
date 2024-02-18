package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
class PointProjFull {

    /* renamed from: X */
    long[][] f2111X;

    /* renamed from: Y */
    long[][] f2112Y;

    /* renamed from: Z */
    long[][] f2113Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointProjFull(int i) {
        this.f2111X = (long[][]) Array.newInstance(Long.TYPE, 2, i);
        this.f2112Y = (long[][]) Array.newInstance(Long.TYPE, 2, i);
        this.f2113Z = (long[][]) Array.newInstance(Long.TYPE, 2, i);
    }
}
