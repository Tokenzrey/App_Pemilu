package org.bouncycastle.crypto.agreement.jpake;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.math.BigInteger;

/* loaded from: classes2.dex */
public class JPAKEPrimeOrderGroup {

    /* renamed from: g */
    private final BigInteger f1212g;

    /* renamed from: p */
    private final BigInteger f1213p;

    /* renamed from: q */
    private final BigInteger f1214q;

    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
        this(bigInteger, bigInteger2, bigInteger3, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public JPAKEPrimeOrderGroup(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, boolean z) {
        JPAKEUtil.validateNotNull(bigInteger, "p");
        JPAKEUtil.validateNotNull(bigInteger2, OperatorName.SAVE);
        JPAKEUtil.validateNotNull(bigInteger3, OperatorName.NON_STROKING_GRAY);
        if (!z) {
            if (!bigInteger.subtract(JPAKEUtil.ONE).mod(bigInteger2).equals(JPAKEUtil.ZERO)) {
                throw new IllegalArgumentException("p-1 must be evenly divisible by q");
            }
            if (bigInteger3.compareTo(BigInteger.valueOf(2L)) == -1 || bigInteger3.compareTo(bigInteger.subtract(JPAKEUtil.ONE)) == 1) {
                throw new IllegalArgumentException("g must be in [2, p-1]");
            }
            if (!bigInteger3.modPow(bigInteger2, bigInteger).equals(JPAKEUtil.ONE)) {
                throw new IllegalArgumentException("g^q mod p must equal 1");
            }
            if (!bigInteger.isProbablePrime(20)) {
                throw new IllegalArgumentException("p must be prime");
            }
            if (!bigInteger2.isProbablePrime(20)) {
                throw new IllegalArgumentException("q must be prime");
            }
        }
        this.f1213p = bigInteger;
        this.f1214q = bigInteger2;
        this.f1212g = bigInteger3;
    }

    public BigInteger getG() {
        return this.f1212g;
    }

    public BigInteger getP() {
        return this.f1213p;
    }

    public BigInteger getQ() {
        return this.f1214q;
    }
}
