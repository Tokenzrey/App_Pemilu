package org.bouncycastle.pqc.crypto.sike;

import java.lang.reflect.Array;

/* loaded from: classes2.dex */
class PointProj {

    /* renamed from: X */
    long[][] f2109X;

    /* renamed from: Z */
    long[][] f2110Z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PointProj(int i) {
        this.f2109X = (long[][]) Array.newInstance(Long.TYPE, 2, i);
        this.f2110Z = (long[][]) Array.newInstance(Long.TYPE, 2, i);
    }
}
