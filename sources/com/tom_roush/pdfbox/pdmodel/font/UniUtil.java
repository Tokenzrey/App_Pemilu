package com.tom_roush.pdfbox.pdmodel.font;

import java.util.Locale;

/* loaded from: classes3.dex */
final class UniUtil {
    private UniUtil() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String getUniNameOfCodePoint(int i) {
        String upperCase = Integer.toString(i, 16).toUpperCase(Locale.US);
        int length = upperCase.length();
        if (length != 1) {
            if (length != 2) {
                if (length == 3) {
                    return "uni0" + upperCase;
                }
                return "uni" + upperCase;
            }
            return "uni00" + upperCase;
        }
        return "uni000" + upperCase;
    }
}
