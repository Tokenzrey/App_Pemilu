package org.bouncycastle.pqc.crypto.ntru;

import org.bouncycastle.pqc.math.ntru.Polynomial;

/* loaded from: classes2.dex */
class PolynomialPair {

    /* renamed from: a */
    private final Polynomial f2092a;

    /* renamed from: b */
    private final Polynomial f2093b;

    public PolynomialPair(Polynomial polynomial, Polynomial polynomial2) {
        this.f2092a = polynomial;
        this.f2093b = polynomial2;
    }

    /* renamed from: f */
    public Polynomial m88f() {
        return this.f2092a;
    }

    /* renamed from: g */
    public Polynomial m87g() {
        return this.f2093b;
    }

    /* renamed from: m */
    public Polynomial m86m() {
        return this.f2093b;
    }

    /* renamed from: r */
    public Polynomial m85r() {
        return this.f2092a;
    }
}
