package org.bouncycastle.pqc.crypto.hqc;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.pqc.crypto.crystals.kyber.KyberEngine;
import org.tensorflow.lite.schema.BuiltinOperator;

/* loaded from: classes2.dex */
public class HQCParameters implements CipherParameters {
    static final int GF_MUL_ORDER = 255;
    static final int PARAM_M = 8;
    public static final HQCParameters hqc128 = new HQCParameters("hqc-128", 17669, 46, KyberEngine.KyberPolyBytes, 16, 31, 15, 66, 75, 75, 16767881, 4, new int[]{89, 69, 153, 116, 176, 117, 111, 75, 73, 233, 242, 233, 65, 210, 21, 139, 103, 173, 67, 118, 105, 210, 174, 110, 74, 69, 228, 82, 255, 181, 1});
    public static final HQCParameters hqc192 = new HQCParameters("hqc-192", 35851, 56, 640, 24, 33, 16, 100, 114, 114, 16742417, 5, new int[]{45, 216, 239, 24, 253, 104, 27, 40, 107, 50, 163, 210, 227, 134, 224, 158, 119, 13, 158, 1, 238, 164, 82, 43, 15, 232, 246, 142, 50, 189, 29, 232, 1});
    public static final HQCParameters hqc256 = new HQCParameters("hqc-256", 57637, 90, 640, 32, 59, 29, 131, BuiltinOperator.MULTINOMIAL, BuiltinOperator.MULTINOMIAL, 16772367, 5, new int[]{49, 167, 49, 39, 200, 121, 124, 91, 240, 63, BuiltinOperator.RANDOM_UNIFORM, 71, BuiltinOperator.GELU, 123, 87, 101, 32, 215, 159, 71, 201, 115, 97, 210, 186, 183, 141, 217, 123, 12, 31, 243, 180, 219, 152, 239, 99, 141, 4, 246, 191, BuiltinOperator.ASSIGN_VARIABLE, 8, 232, 47, 27, 141, 178, 130, 64, 124, 47, 39, 188, 216, 48, 199, 187, 1});
    private int delta;
    private int fft;

    /* renamed from: g */
    private int f2052g;
    private int[] generatorPoly;
    private HQCEngine hqcEngine;

    /* renamed from: k */
    private int f2053k;

    /* renamed from: n */
    private int f2054n;

    /* renamed from: n1 */
    private int f2055n1;

    /* renamed from: n2 */
    private int f2056n2;
    private final String name;
    private int utilRejectionThreshold;

    /* renamed from: w */
    private int f2057w;

    /* renamed from: we */
    private int f2058we;

    /* renamed from: wr */
    private int f2059wr;

    private HQCParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int[] iArr) {
        this.name = str;
        this.f2054n = i;
        this.f2055n1 = i2;
        this.f2056n2 = i3;
        this.f2053k = i4;
        this.delta = i6;
        this.f2057w = i7;
        this.f2059wr = i8;
        this.f2058we = i9;
        this.generatorPoly = iArr;
        this.f2052g = i5;
        this.utilRejectionThreshold = i10;
        this.fft = i11;
        this.hqcEngine = new HQCEngine(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDelta() {
        return this.delta;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public HQCEngine getEngine() {
        return this.hqcEngine;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getK() {
        return this.f2053k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getN() {
        return this.f2054n;
    }

    int getN1() {
        return this.f2055n1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getN1N2_BYTES() {
        return ((this.f2055n1 * this.f2056n2) + 7) / 8;
    }

    int getN2() {
        return this.f2056n2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getN_BYTES() {
        return (this.f2054n + 7) / 8;
    }

    public String getName() {
        return this.name;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSHA512_BYTES() {
        return 64;
    }

    public int getSessionKeySize() {
        return this.f2053k * 8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getW() {
        return this.f2057w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getWe() {
        return this.f2058we;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getWr() {
        return this.f2059wr;
    }
}
