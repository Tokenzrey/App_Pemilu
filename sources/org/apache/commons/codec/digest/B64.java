package org.apache.commons.codec.digest;

import androidx.core.view.ViewCompat;
import java.security.SecureRandom;
import java.util.Random;
import kotlin.UByte;

/* loaded from: classes2.dex */
class B64 {
    static final String B64T_STRING = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    static final char[] B64T_ARRAY = B64T_STRING.toCharArray();

    B64() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void b64from24bit(byte b, byte b2, byte b3, int i, StringBuilder sb) {
        int i2 = ((b << 16) & ViewCompat.MEASURED_SIZE_MASK) | ((b2 << 8) & 65535) | (b3 & UByte.MAX_VALUE);
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return;
            }
            sb.append(B64T_ARRAY[i2 & 63]);
            i2 >>= 6;
            i = i3;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getRandomSalt(int i) {
        return getRandomSalt(i, new SecureRandom());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getRandomSalt(int i, Random random) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 1; i2 <= i; i2++) {
            sb.append(B64T_STRING.charAt(random.nextInt(64)));
        }
        return sb.toString();
    }
}
