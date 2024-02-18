package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class ParametersWithID implements CipherParameters {

    /* renamed from: id */
    private byte[] f1666id;
    private CipherParameters parameters;

    public ParametersWithID(CipherParameters cipherParameters, byte[] bArr) {
        this.parameters = cipherParameters;
        this.f1666id = bArr;
    }

    public byte[] getID() {
        return this.f1666id;
    }

    public CipherParameters getParameters() {
        return this.parameters;
    }
}
