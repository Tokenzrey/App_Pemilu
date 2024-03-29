package com.fasterxml.jackson.databind.util;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import net.openid.appauth.AuthState;
import org.apache.commons.codec.language.Soundex;

@Deprecated
/* loaded from: classes.dex */
public class ISO8601Utils {
    protected static final int DEF_8601_LEN = 29;
    private static final TimeZone TIMEZONE_Z = TimeZone.getTimeZone("UTC");

    public static String format(Date date) {
        return format(date, false, TIMEZONE_Z);
    }

    public static String format(Date date, boolean z) {
        return format(date, z, TIMEZONE_Z);
    }

    @Deprecated
    public static String format(Date date, boolean z, TimeZone timeZone) {
        return format(date, z, timeZone, Locale.US);
    }

    public static String format(Date date, boolean z, TimeZone timeZone, Locale locale) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, locale);
        gregorianCalendar.setTime(date);
        StringBuilder sb = new StringBuilder(30);
        sb.append(String.format("%04d-%02d-%02dT%02d:%02d:%02d", Integer.valueOf(gregorianCalendar.get(1)), Integer.valueOf(gregorianCalendar.get(2) + 1), Integer.valueOf(gregorianCalendar.get(5)), Integer.valueOf(gregorianCalendar.get(11)), Integer.valueOf(gregorianCalendar.get(12)), Integer.valueOf(gregorianCalendar.get(13))));
        if (z) {
            sb.append(String.format(".%03d", Integer.valueOf(gregorianCalendar.get(14))));
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i = offset / AuthState.EXPIRY_TIME_TOLERANCE_MS;
            int abs = Math.abs(i / 60);
            int abs2 = Math.abs(i % 60);
            Object[] objArr = new Object[3];
            objArr[0] = Character.valueOf(offset < 0 ? Soundex.SILENT_MARKER : '+');
            objArr[1] = Integer.valueOf(abs);
            objArr[2] = Integer.valueOf(abs2);
            sb.append(String.format("%c%02d:%02d", objArr));
        } else {
            sb.append('Z');
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7 A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x000d, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:17:0x0058, B:19:0x0068, B:20:0x006a, B:22:0x0076, B:23:0x0078, B:25:0x007e, B:29:0x0088, B:34:0x0098, B:36:0x00a0, B:48:0x00d1, B:50:0x00d7, B:52:0x00dd, B:74:0x016d, B:58:0x00eb, B:59:0x0103, B:60:0x0104, B:62:0x0115, B:65:0x011e, B:67:0x0139, B:70:0x0148, B:71:0x0168, B:73:0x016b, B:76:0x019f, B:77:0x01a6, B:41:0x00b9, B:42:0x00bc), top: B:89:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019f A[Catch: Exception -> 0x01a7, TryCatch #0 {Exception -> 0x01a7, blocks: (B:3:0x000d, B:5:0x001f, B:6:0x0021, B:8:0x002d, B:9:0x002f, B:11:0x003e, B:13:0x0044, B:17:0x0058, B:19:0x0068, B:20:0x006a, B:22:0x0076, B:23:0x0078, B:25:0x007e, B:29:0x0088, B:34:0x0098, B:36:0x00a0, B:48:0x00d1, B:50:0x00d7, B:52:0x00dd, B:74:0x016d, B:58:0x00eb, B:59:0x0103, B:60:0x0104, B:62:0x0115, B:65:0x011e, B:67:0x0139, B:70:0x0148, B:71:0x0168, B:73:0x016b, B:76:0x019f, B:77:0x01a6, B:41:0x00b9, B:42:0x00bc), top: B:89:0x000d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Date parse(java.lang.String r19, java.text.ParsePosition r20) throws java.text.ParseException {
        /*
            Method dump skipped, instructions count: 528
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.util.ISO8601Utils.parse(java.lang.String, java.text.ParsePosition):java.util.Date");
    }

    private static boolean checkOffset(String str, int i, char c) {
        return i < str.length() && str.charAt(i) == c;
    }

    private static int parseInt(String str, int i, int i2) throws NumberFormatException {
        int i3;
        int i4;
        if (i < 0 || i2 > str.length() || i > i2) {
            throw new NumberFormatException(str);
        }
        if (i < i2) {
            i4 = i + 1;
            int digit = Character.digit(str.charAt(i), 10);
            if (digit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = -digit;
        } else {
            i3 = 0;
            i4 = i;
        }
        while (i4 < i2) {
            int i5 = i4 + 1;
            int digit2 = Character.digit(str.charAt(i4), 10);
            if (digit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i, i2));
            }
            i3 = (i3 * 10) - digit2;
            i4 = i5;
        }
        return -i3;
    }

    private static int indexOfNonDigit(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt < '0' || charAt > '9') {
                return i;
            }
            i++;
        }
        return str.length();
    }
}
