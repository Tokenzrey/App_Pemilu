package org.bouncycastle.asn1.eac;

import java.util.Enumeration;
import java.util.Hashtable;
import org.apache.commons.lang3.StringUtils;

/* loaded from: classes2.dex */
public class Flags {
    int value;

    /* loaded from: classes2.dex */
    private static class StringJoiner {
        boolean First = true;

        /* renamed from: b */
        StringBuffer f1117b = new StringBuffer();
        String mSeparator;

        public StringJoiner(String str) {
            this.mSeparator = str;
        }

        public void add(String str) {
            if (this.First) {
                this.First = false;
            } else {
                this.f1117b.append(this.mSeparator);
            }
            this.f1117b.append(str);
        }

        public String toString() {
            return this.f1117b.toString();
        }
    }

    public Flags() {
        this.value = 0;
    }

    public Flags(int i) {
        this.value = i;
    }

    String decode(Hashtable hashtable) {
        StringJoiner stringJoiner = new StringJoiner(StringUtils.SPACE);
        Enumeration keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            if (isSet(num.intValue())) {
                stringJoiner.add((String) hashtable.get(num));
            }
        }
        return stringJoiner.toString();
    }

    public int getFlags() {
        return this.value;
    }

    public boolean isSet(int i) {
        return (i & this.value) != 0;
    }

    public void set(int i) {
        this.value = i | this.value;
    }
}
