package org.apache.xmpbox;

import androidx.core.p003os.EnvironmentCompat;
import com.google.android.material.timepicker.TimeModel;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.xml.bind.DatatypeConverter;
import net.openid.appauth.AuthState;
import org.apache.commons.codec.language.Soundex;
import org.apache.commons.lang3.time.TimeZones;

/* loaded from: classes2.dex */
public final class DateConverter {
    private static final SimpleDateFormat[] POTENTIAL_FORMATS = {new SimpleDateFormat("EEEE, dd MMM yyyy hh:mm:ss a"), new SimpleDateFormat("EEEE, MMM dd, yyyy hh:mm:ss a"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssz"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss"), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.S")};

    private DateConverter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2 A[Catch: NumberFormatException -> 0x0161, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0161, blocks: (B:7:0x0018, B:9:0x0020, B:11:0x0025, B:13:0x002d, B:14:0x0031, B:16:0x0040, B:18:0x004f, B:20:0x0059, B:22:0x0061, B:24:0x006c, B:26:0x0074, B:28:0x007f, B:30:0x0087, B:32:0x0092, B:34:0x009a, B:36:0x00a1, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:64:0x012c, B:65:0x0132, B:47:0x00d2, B:50:0x00dc, B:54:0x00f4, B:56:0x00fb, B:61:0x0117, B:57:0x0104, B:59:0x010c, B:51:0x00e5, B:40:0x00ad, B:71:0x0148, B:72:0x0160), top: B:101:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012c A[Catch: NumberFormatException -> 0x0161, TryCatch #1 {NumberFormatException -> 0x0161, blocks: (B:7:0x0018, B:9:0x0020, B:11:0x0025, B:13:0x002d, B:14:0x0031, B:16:0x0040, B:18:0x004f, B:20:0x0059, B:22:0x0061, B:24:0x006c, B:26:0x0074, B:28:0x007f, B:30:0x0087, B:32:0x0092, B:34:0x009a, B:36:0x00a1, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:64:0x012c, B:65:0x0132, B:47:0x00d2, B:50:0x00dc, B:54:0x00f4, B:56:0x00fb, B:61:0x0117, B:57:0x0104, B:59:0x010c, B:51:0x00e5, B:40:0x00ad, B:71:0x0148, B:72:0x0160), top: B:101:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0132 A[Catch: NumberFormatException -> 0x0161, TRY_LEAVE, TryCatch #1 {NumberFormatException -> 0x0161, blocks: (B:7:0x0018, B:9:0x0020, B:11:0x0025, B:13:0x002d, B:14:0x0031, B:16:0x0040, B:18:0x004f, B:20:0x0059, B:22:0x0061, B:24:0x006c, B:26:0x0074, B:28:0x007f, B:30:0x0087, B:32:0x0092, B:34:0x009a, B:36:0x00a1, B:41:0x00ba, B:43:0x00c2, B:46:0x00cc, B:64:0x012c, B:65:0x0132, B:47:0x00d2, B:50:0x00dc, B:54:0x00f4, B:56:0x00fb, B:61:0x0117, B:57:0x0104, B:59:0x010c, B:51:0x00e5, B:40:0x00ad, B:71:0x0148, B:72:0x0160), top: B:101:0x0018 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.Calendar toCalendar(java.lang.String r17) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 485
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.xmpbox.DateConverter.toCalendar(java.lang.String):java.util.Calendar");
    }

    private static void updateZoneId(TimeZone timeZone) {
        boolean z;
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            z = true;
        } else {
            z = true;
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset % 3600000) / AuthState.EXPIRY_TIME_TOLERANCE_MS;
        if (rawOffset == 0) {
            timeZone.setID(TimeZones.GMT_ID);
        } else if (z && i <= 12) {
            timeZone.setID(String.format(Locale.US, "GMT+%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2)));
        } else if (!z || i > 14) {
            timeZone.setID(EnvironmentCompat.MEDIA_UNKNOWN);
        } else {
            timeZone.setID(String.format(Locale.US, "GMT-%02d:%02d", Integer.valueOf(i), Integer.valueOf(i2)));
        }
    }

    public static String toISO8601(Calendar calendar) {
        return toISO8601(calendar, false);
    }

    public static String toISO8601(Calendar calendar, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(calendar.get(1));
        sb.append(Soundex.SILENT_MARKER);
        sb.append(String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(2) + 1)));
        sb.append(Soundex.SILENT_MARKER);
        sb.append(String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(5))));
        sb.append('T');
        sb.append(String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(11))));
        sb.append(':');
        sb.append(String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(12))));
        sb.append(':');
        sb.append(String.format(Locale.US, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(calendar.get(13))));
        if (z) {
            sb.append('.');
            sb.append(String.format(Locale.US, "%03d", Integer.valueOf(calendar.get(14))));
        }
        int i = calendar.get(15) + calendar.get(16);
        if (i < 0) {
            sb.append(Soundex.SILENT_MARKER);
        } else {
            sb.append('+');
        }
        int abs = Math.abs(i);
        int i2 = ((abs / 1000) / 60) / 60;
        int i3 = ((abs - (((i2 * 1000) * 60) * 60)) / 1000) / 60;
        if (i2 < 10) {
            sb.append('0');
        }
        sb.append(i2);
        sb.append(':');
        if (i3 < 10) {
            sb.append('0');
        }
        sb.append(i3);
        return sb.toString();
    }

    private static Calendar fromISO8601(String str) {
        int max;
        Matcher matcher = Pattern.compile("[\\d-]*T?[\\d-\\.]([A-Z]{1,4})$|(.*\\d*)([A-Z][a-z]+\\/[A-Z][a-z]+)$").matcher(str);
        String str2 = null;
        while (matcher.find()) {
            for (int i = 1; i <= matcher.groupCount(); i++) {
                String group = matcher.group(i);
                if (group != null) {
                    str2 = group;
                }
            }
        }
        if (str2 != null) {
            int indexOf = str.indexOf(84);
            int indexOf2 = str.indexOf(str2);
            String substring = str.substring(0, indexOf2);
            if (indexOf2 - indexOf == 6) {
                substring = str.substring(0, indexOf2) + ":00";
            }
            Calendar parseDateTime = DatatypeConverter.parseDateTime(substring);
            parseDateTime.setTimeZone(TimeZone.getTimeZone(str2));
            return parseDateTime;
        }
        int indexOf3 = str.indexOf(84);
        if (indexOf3 == -1) {
            return DatatypeConverter.parseDateTime(str);
        }
        int i2 = indexOf3 + 1;
        int indexOf4 = str.indexOf(43, i2);
        int indexOf5 = str.indexOf(45, i2);
        if (indexOf4 == -1 && indexOf5 == -1) {
            return DatatypeConverter.parseDateTime(str);
        }
        if (Math.max(indexOf4, indexOf5) - indexOf3 == 6) {
            return DatatypeConverter.parseDateTime(str.substring(0, max) + ":00" + str.substring(max));
        }
        return DatatypeConverter.parseDateTime(str);
    }
}
