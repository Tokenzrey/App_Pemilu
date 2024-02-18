package org.bouncycastle.tsp.ers;

/* loaded from: classes2.dex */
class IndexedHash {
    final byte[] digest;
    final int order;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IndexedHash(int i, byte[] bArr) {
        this.order = i;
        this.digest = bArr;
    }
}
