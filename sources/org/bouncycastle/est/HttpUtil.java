package org.bouncycastle.est;

import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
class HttpUtil {

    /* loaded from: classes2.dex */
    static class Headers extends HashMap<String, String[]> {
        private static final String EMPTY = "";

        private String actualKey(String str) {
            if (containsKey(str)) {
                return str;
            }
            for (String str2 : keySet()) {
                if (str.equalsIgnoreCase(str2)) {
                    return str2;
                }
            }
            return null;
        }

        private String[] copy(String[] strArr) {
            int length = strArr.length;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, length);
            return strArr2;
        }

        private boolean hasHeader(String str) {
            return actualKey(str) != null;
        }

        public void add(String str, String str2) {
            put(str, HttpUtil.append(get(str), str2));
        }

        @Override // java.util.HashMap, java.util.AbstractMap
        public Object clone() {
            Headers headers = new Headers();
            for (Map.Entry<String, String[]> entry : entrySet()) {
                headers.put(entry.getKey(), copy(entry.getValue()));
            }
            return headers;
        }

        public void ensureHeader(String str, String str2) {
            if (containsKey(str)) {
                return;
            }
            set(str, str2);
        }

        public String getFirstValue(String str) {
            String[] values = getValues(str);
            if (values == null || values.length <= 0) {
                return null;
            }
            return values[0];
        }

        public String getFirstValueOrEmpty(String str) {
            String[] values = getValues(str);
            return (values == null || values.length <= 0) ? "" : values[0];
        }

        public String[] getValues(String str) {
            String actualKey = actualKey(str);
            if (actualKey == null) {
                return null;
            }
            return get(actualKey);
        }

        public void set(String str, String str2) {
            put(str, new String[]{str2});
        }
    }

    /* loaded from: classes2.dex */
    static class PartLexer {
        int last = 0;

        /* renamed from: p */
        int f1699p = 0;
        private final String src;

        PartLexer(String str) {
            this.src = str;
        }

        private String consumeAlpha() {
            char charAt = this.src.charAt(this.f1699p);
            while (this.f1699p < this.src.length() && ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i = this.f1699p + 1;
                this.f1699p = i;
                charAt = this.src.charAt(i);
            }
            String substring = this.src.substring(this.last, this.f1699p);
            this.last = this.f1699p;
            return substring;
        }

        private boolean consumeIf(char c) {
            if (this.f1699p >= this.src.length() || this.src.charAt(this.f1699p) != c) {
                return false;
            }
            this.f1699p++;
            return true;
        }

        private String consumeUntil(char c) {
            while (this.f1699p < this.src.length() && this.src.charAt(this.f1699p) != c) {
                this.f1699p++;
            }
            String substring = this.src.substring(this.last, this.f1699p);
            this.last = this.f1699p;
            return substring;
        }

        private void discard() {
            this.last = this.f1699p;
        }

        private void discard(int i) {
            int i2 = this.f1699p + i;
            this.f1699p = i2;
            this.last = i2;
        }

        private void skipWhiteSpace() {
            while (this.f1699p < this.src.length() && this.src.charAt(this.f1699p) < '!') {
                this.f1699p++;
            }
            this.last = this.f1699p;
        }

        Map<String, String> Parse() {
            HashMap hashMap = new HashMap();
            while (this.f1699p < this.src.length()) {
                skipWhiteSpace();
                String consumeAlpha = consumeAlpha();
                if (consumeAlpha.length() == 0) {
                    throw new IllegalArgumentException("Expecting alpha label.");
                }
                skipWhiteSpace();
                if (!consumeIf('=')) {
                    throw new IllegalArgumentException("Expecting assign: '='");
                }
                skipWhiteSpace();
                if (!consumeIf('\"')) {
                    throw new IllegalArgumentException("Expecting start quote: '\"'");
                }
                discard();
                String consumeUntil = consumeUntil('\"');
                discard(1);
                hashMap.put(consumeAlpha, consumeUntil);
                skipWhiteSpace();
                if (!consumeIf(',')) {
                    break;
                }
                discard();
            }
            return hashMap;
        }
    }

    HttpUtil() {
    }

    public static String[] append(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[length + 1];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String mergeCSL(String str, Map<String, String> map) {
        StringWriter stringWriter = new StringWriter();
        stringWriter.write(str);
        stringWriter.write(32);
        boolean z = false;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z) {
                stringWriter.write(44);
            } else {
                z = true;
            }
            stringWriter.write(entry.getKey());
            stringWriter.write("=\"");
            stringWriter.write(entry.getValue());
            stringWriter.write(34);
        }
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map<String, String> splitCSL(String str, String str2) {
        String trim = str2.trim();
        if (trim.startsWith(str)) {
            trim = trim.substring(str.length());
        }
        return new PartLexer(trim).Parse();
    }
}
