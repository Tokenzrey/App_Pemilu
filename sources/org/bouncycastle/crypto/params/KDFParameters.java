package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

/* loaded from: classes2.dex */
public class KDFParameters implements DerivationParameters {

    /* renamed from: iv */
    byte[] f1663iv;
    byte[] shared;

    public KDFParameters(byte[] bArr, byte[] bArr2) {
        this.shared = bArr;
        this.f1663iv = bArr2;
    }

    public byte[] getIV() {
        return this.f1663iv;
    }

    public byte[] getSharedSecret() {
        return this.shared;
    }
}
