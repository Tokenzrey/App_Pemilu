package org.apache.commons.codec.language;

import androidx.exifinterface.media.ExifInterface;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.Locale;

/* loaded from: classes2.dex */
public class Caverphone2 extends AbstractCaverphone {
    private static final String TEN_1 = "1111111111";

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        if (str == null || str.length() == 0) {
            return TEN_1;
        }
        return (str.toLowerCase(Locale.ENGLISH).replaceAll("[^a-z]", "").replaceAll("e$", "").replaceAll("^cough", "cou2f").replaceAll("^rough", "rou2f").replaceAll("^tough", "tou2f").replaceAll("^enough", "enou2f").replaceAll("^trough", "trou2f").replaceAll("^gn", "2n").replaceAll("mb$", "m2").replaceAll("cq", "2q").replaceAll("ci", "si").replaceAll("ce", "se").replaceAll("cy", "sy").replaceAll("tch", "2ch").replaceAll(OperatorName.CURVE_TO, OperatorName.NON_STROKING_CMYK).replaceAll(OperatorName.SAVE, OperatorName.NON_STROKING_CMYK).replaceAll("x", OperatorName.NON_STROKING_CMYK).replaceAll(OperatorName.CURVE_TO_REPLICATE_INITIAL_POINT, OperatorName.FILL_NON_ZERO).replaceAll("dg", "2g").replaceAll("tio", "sio").replaceAll("tia", "sia").replaceAll(OperatorName.SET_LINE_DASHPATTERN, "t").replaceAll("ph", "fh").replaceAll(OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "p").replaceAll(OperatorName.SHADING_FILL, "s2").replaceAll("z", OperatorName.CLOSE_AND_STROKE).replaceAll("^[aeiou]", "A").replaceAll("[aeiou]", ExifInterface.GPS_MEASUREMENT_3D).replaceAll(OperatorName.SET_LINE_JOINSTYLE, OperatorName.CURVE_TO_REPLICATE_FINAL_POINT).replaceAll("^y3", "Y3").replaceAll("^y", "A").replaceAll(OperatorName.CURVE_TO_REPLICATE_FINAL_POINT, ExifInterface.GPS_MEASUREMENT_3D).replaceAll("3gh3", "3kh3").replaceAll("gh", "22").replaceAll(OperatorName.NON_STROKING_GRAY, OperatorName.NON_STROKING_CMYK).replaceAll("s+", "S").replaceAll("t+", "T").replaceAll("p+", "P").replaceAll("k+", "K").replaceAll("f+", "F").replaceAll("m+", "M").replaceAll("n+", "N").replaceAll("w3", "W3").replaceAll("wh3", "Wh3").replaceAll("w$", ExifInterface.GPS_MEASUREMENT_3D).replaceAll("w", ExifInterface.GPS_MEASUREMENT_2D).replaceAll("^h", "A").replaceAll("h", ExifInterface.GPS_MEASUREMENT_2D).replaceAll("r3", "R3").replaceAll("r$", ExifInterface.GPS_MEASUREMENT_3D).replaceAll(PDPageLabelRange.STYLE_ROMAN_LOWER, ExifInterface.GPS_MEASUREMENT_2D).replaceAll("l3", "L3").replaceAll("l$", ExifInterface.GPS_MEASUREMENT_3D).replaceAll(OperatorName.LINE_TO, ExifInterface.GPS_MEASUREMENT_2D).replaceAll(ExifInterface.GPS_MEASUREMENT_2D, "").replaceAll("3$", "A").replaceAll(ExifInterface.GPS_MEASUREMENT_3D, "") + TEN_1).substring(0, 10);
    }
}
