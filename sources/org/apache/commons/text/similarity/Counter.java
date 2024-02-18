package org.apache.commons.text.similarity;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
final class Counter {
    /* renamed from: of */
    public static Map<CharSequence, Integer> m211of(CharSequence[] charSequenceArr) {
        HashMap hashMap = new HashMap();
        for (CharSequence charSequence : charSequenceArr) {
            Integer num = (Integer) hashMap.get(charSequence);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            hashMap.put(charSequence, Integer.valueOf(i));
        }
        return hashMap;
    }

    private Counter() {
    }
}
