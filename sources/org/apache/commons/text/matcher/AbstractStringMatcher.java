package org.apache.commons.text.matcher;

import java.util.Arrays;

/* loaded from: classes2.dex */
abstract class AbstractStringMatcher implements StringMatcher {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class NoneMatcher extends AbstractStringMatcher {
        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class AndStringMatcher extends AbstractStringMatcher {
        private final StringMatcher[] stringMatchers;

        /* JADX INFO: Access modifiers changed from: package-private */
        public AndStringMatcher(StringMatcher... stringMatcherArr) {
            this.stringMatchers = (StringMatcher[]) stringMatcherArr.clone();
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            StringMatcher[] stringMatcherArr;
            int i4 = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    int isMatch = stringMatcher.isMatch(cArr, i, i2, i3);
                    if (isMatch == 0) {
                        return 0;
                    }
                    i4 += isMatch;
                    i += isMatch;
                }
            }
            return i4;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            StringMatcher[] stringMatcherArr;
            int i4 = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    int isMatch = stringMatcher.isMatch(charSequence, i, i2, i3);
                    if (isMatch == 0) {
                        return 0;
                    }
                    i4 += isMatch;
                    i += isMatch;
                }
            }
            return i4;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            StringMatcher[] stringMatcherArr;
            int i = 0;
            for (StringMatcher stringMatcher : this.stringMatchers) {
                if (stringMatcher != null) {
                    i += stringMatcher.size();
                }
            }
            return i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CharArrayMatcher extends AbstractStringMatcher {
        private final char[] chars;
        private final String string;

        /* JADX INFO: Access modifiers changed from: package-private */
        public CharArrayMatcher(char... cArr) {
            this.string = String.valueOf(cArr);
            this.chars = (char[]) cArr.clone();
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            int size = size();
            if (i + size > i3) {
                return 0;
            }
            int i4 = 0;
            while (i4 < size) {
                if (this.chars[i4] != cArr[i]) {
                    return 0;
                }
                i4++;
                i++;
            }
            return size;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            int size = size();
            if (i + size > i3) {
                return 0;
            }
            int i4 = 0;
            while (i4 < size) {
                if (this.chars[i4] != charSequence.charAt(i)) {
                    return 0;
                }
                i4++;
                i++;
            }
            return size;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return this.chars.length;
        }

        public String toString() {
            return super.toString() + "[\"" + this.string + "\"]";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CharMatcher extends AbstractStringMatcher {

        /* renamed from: ch */
        private final char f1087ch;

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CharMatcher(char c) {
            this.f1087ch = c;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return this.f1087ch == cArr[i] ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            return this.f1087ch == charSequence.charAt(i) ? 1 : 0;
        }

        public String toString() {
            return super.toString() + "['" + this.f1087ch + "']";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class CharSetMatcher extends AbstractStringMatcher {
        private final char[] chars;

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public CharSetMatcher(char[] cArr) {
            char[] cArr2 = (char[]) cArr.clone();
            this.chars = cArr2;
            Arrays.sort(cArr2);
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return Arrays.binarySearch(this.chars, cArr[i]) >= 0 ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            return Arrays.binarySearch(this.chars, charSequence.charAt(i)) >= 0 ? 1 : 0;
        }

        public String toString() {
            return super.toString() + Arrays.toString(this.chars);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class TrimMatcher extends AbstractStringMatcher {
        private static final int SPACE_INT = 32;

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int size() {
            return 1;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(char[] cArr, int i, int i2, int i3) {
            return cArr[i] <= ' ' ? 1 : 0;
        }

        @Override // org.apache.commons.text.matcher.StringMatcher
        public int isMatch(CharSequence charSequence, int i, int i2, int i3) {
            return charSequence.charAt(i) <= ' ' ? 1 : 0;
        }
    }

    protected AbstractStringMatcher() {
    }
}
