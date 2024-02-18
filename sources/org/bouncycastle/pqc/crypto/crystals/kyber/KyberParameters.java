package org.bouncycastle.pqc.crypto.crystals.kyber;

/* loaded from: classes2.dex */
public class KyberParameters {

    /* renamed from: k */
    private final int f2001k;
    private final String name;
    private final int sessionKeySize;
    private final boolean usingAes;
    public static final KyberParameters kyber512 = new KyberParameters("kyber512", 2, 128, false);
    public static final KyberParameters kyber768 = new KyberParameters("kyber768", 3, 192, false);
    public static final KyberParameters kyber1024 = new KyberParameters("kyber1024", 4, 256, false);
    public static final KyberParameters kyber512_aes = new KyberParameters("kyber512-aes", 2, 128, true);
    public static final KyberParameters kyber768_aes = new KyberParameters("kyber768-aes", 3, 192, true);
    public static final KyberParameters kyber1024_aes = new KyberParameters("kyber1024-aes", 4, 256, true);

    private KyberParameters(String str, int i, int i2, boolean z) {
        this.name = str;
        this.f2001k = i;
        this.sessionKeySize = i2;
        this.usingAes = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public KyberEngine getEngine() {
        return new KyberEngine(this.f2001k, this.usingAes);
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return this.sessionKeySize;
    }
}
