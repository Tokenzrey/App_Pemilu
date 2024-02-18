package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.crypto.CipherParameters;

/* loaded from: classes2.dex */
public class BIKEParameters implements CipherParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, 192);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;

    /* renamed from: l */
    private int f1978l;
    private String name;
    private int nbIter;

    /* renamed from: r */
    private int f1979r;

    /* renamed from: t */
    private int f1980t;
    private int tau;

    /* renamed from: w */
    private int f1981w;

    private BIKEParameters(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.name = str;
        this.f1979r = i;
        this.f1981w = i2;
        this.f1980t = i3;
        this.f1978l = i4;
        this.nbIter = i5;
        this.tau = i6;
        this.defaultKeySize = i7;
        this.bikeEngine = new BIKEEngine(i, i2, i3, i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.f1978l;
    }

    public int getLByte() {
        return this.f1978l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f1979r;
    }

    public int getRByte() {
        return (this.f1979r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f1980t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f1981w;
    }
}
