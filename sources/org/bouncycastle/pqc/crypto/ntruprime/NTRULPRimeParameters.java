package org.bouncycastle.pqc.crypto.ntruprime;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.recyclerview.widget.ItemTouchHelper;
import org.bouncycastle.crypto.CipherParameters;
import org.opencv.features2d.FeatureDetector;
import org.tensorflow.lite.schema.BuiltinOperator;

/* loaded from: classes2.dex */
public class NTRULPRimeParameters implements CipherParameters {
    private final int delta;
    private final String name;

    /* renamed from: p */
    private final int f2094p;
    private final int privateKeyBytes;
    private final int publicKeyBytes;

    /* renamed from: q */
    private final int f2095q;
    private final int roundedPolynomialBytes;
    private final int sharedKeyBytes;
    private final int tau0;
    private final int tau1;
    private final int tau2;
    private final int tau3;

    /* renamed from: w */
    private final int f2096w;
    public static final NTRULPRimeParameters ntrulpr653 = new NTRULPRimeParameters("ntrulpr653", 653, 4621, 252, 289, 2175, BuiltinOperator.MATRIX_DIAG, 2031, 290, 865, 897, 1125, 16);
    public static final NTRULPRimeParameters ntrulpr761 = new NTRULPRimeParameters("ntrulpr761", 761, 4591, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 292, 2156, 114, FeatureDetector.PYRAMID_GFTT, 287, 1007, 1039, 1294, 16);
    public static final NTRULPRimeParameters ntrulpr857 = new NTRULPRimeParameters("ntrulpr857", 857, 5167, 281, 329, 2433, 101, 2265, 324, 1152, 1184, 1463, 16);
    public static final NTRULPRimeParameters ntrulpr953 = new NTRULPRimeParameters("ntrulpr953", 953, 6343, 345, 404, 2997, 82, 2798, 400, 1317, 1349, 1652, 24);
    public static final NTRULPRimeParameters ntrulpr1013 = new NTRULPRimeParameters("ntrulpr1013", 1013, 7177, 392, 450, 3367, 73, 3143, 449, 1423, 1455, 1773, 24);
    public static final NTRULPRimeParameters ntrulpr1277 = new NTRULPRimeParameters("ntrulpr1277", 1277, 7879, 429, TypedValues.PositionType.TYPE_DRAWPATH, 3724, 66, 3469, 496, 1815, 1847, 2231, 32);

    private NTRULPRimeParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.name = str;
        this.f2094p = i;
        this.f2095q = i2;
        this.f2096w = i3;
        this.delta = i4;
        this.tau0 = i5;
        this.tau1 = i6;
        this.tau2 = i7;
        this.tau3 = i8;
        this.roundedPolynomialBytes = i9;
        this.publicKeyBytes = i10;
        this.privateKeyBytes = i11;
        this.sharedKeyBytes = i12;
    }

    public int getDelta() {
        return this.delta;
    }

    public String getName() {
        return this.name;
    }

    public int getP() {
        return this.f2094p;
    }

    public int getPrivateKeyBytes() {
        return this.privateKeyBytes;
    }

    public int getPublicKeyBytes() {
        return this.publicKeyBytes;
    }

    public int getQ() {
        return this.f2095q;
    }

    public int getRoundedPolynomialBytes() {
        return this.roundedPolynomialBytes;
    }

    public int getSessionKeySize() {
        return this.sharedKeyBytes * 8;
    }

    public int getTau0() {
        return this.tau0;
    }

    public int getTau1() {
        return this.tau1;
    }

    public int getTau2() {
        return this.tau2;
    }

    public int getTau3() {
        return this.tau3;
    }

    public int getW() {
        return this.f2096w;
    }
}
