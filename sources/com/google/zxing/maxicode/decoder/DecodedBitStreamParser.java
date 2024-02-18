package com.google.zxing.maxicode.decoder;

import com.google.zxing.common.DecoderResult;
import java.text.DecimalFormat;
import org.tensorflow.lite.schema.BuiltinOperator;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes3.dex */
final class DecodedBitStreamParser {
    private static final char ECI = 65530;

    /* renamed from: FS */
    private static final char f284FS = 28;

    /* renamed from: GS */
    private static final char f285GS = 29;
    private static final char LATCHA = 65527;
    private static final char LATCHB = 65528;
    private static final char LOCK = 65529;

    /* renamed from: NS */
    private static final char f286NS = 65531;
    private static final char PAD = 65532;

    /* renamed from: RS */
    private static final char f287RS = 30;
    private static final String[] SETS = {"\nABCDEFGHIJKLMNOPQRSTUVWXYZ\ufffa\u001c\u001d\u001e\ufffb ￼\"#$%&'()*+,-./0123456789:\ufff1\ufff2\ufff3\ufff4\ufff8", "`abcdefghijklmnopqrstuvwxyz\ufffa\u001c\u001d\u001e\ufffb{￼}~\u007f;<=>?[\\]^_ ,./:@!|￼\ufff5\ufff6￼\ufff0\ufff2\ufff3\ufff4\ufff7", "ÀÁÂÃÄÅÆÇÈÉÊËÌÍÎÏÐÑÒÓÔÕÖ×ØÙÚ\ufffa\u001c\u001d\u001eÛÜÝÞßª¬±²³µ¹º¼½¾\u0080\u0081\u0082\u0083\u0084\u0085\u0086\u0087\u0088\u0089\ufff7 \ufff9\ufff3\ufff4\ufff8", "àáâãäåæçèéêëìíîïðñòóôõö÷øùú\ufffa\u001c\u001d\u001e\ufffbûüýþÿ¡¨«¯°´·¸»¿\u008a\u008b\u008c\u008d\u008e\u008f\u0090\u0091\u0092\u0093\u0094\ufff7 \ufff2\ufff9\ufff4\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\ufffa￼￼\u001b\ufffb\u001c\u001d\u001e\u001f\u009f ¢£¤¥¦§©\u00ad®¶\u0095\u0096\u0097\u0098\u0099\u009a\u009b\u009c\u009d\u009e\ufff7 \ufff2\ufff3\ufff9\ufff8", "\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?"};
    private static final char SHIFTA = 65520;
    private static final char SHIFTB = 65521;
    private static final char SHIFTC = 65522;
    private static final char SHIFTD = 65523;
    private static final char SHIFTE = 65524;
    private static final char THREESHIFTA = 65526;
    private static final char TWOSHIFTA = 65525;

    private DecodedBitStreamParser() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DecoderResult decode(byte[] bArr, int i) {
        String postCode3;
        StringBuilder sb = new StringBuilder((int) BuiltinOperator.ASSIGN_VARIABLE);
        if (i == 2 || i == 3) {
            if (i == 2) {
                postCode3 = new DecimalFormat("0000000000".substring(0, getPostCode2Length(bArr))).format(getPostCode2(bArr));
            } else {
                postCode3 = getPostCode3(bArr);
            }
            DecimalFormat decimalFormat = new DecimalFormat("000");
            String format = decimalFormat.format(getCountry(bArr));
            String format2 = decimalFormat.format(getServiceClass(bArr));
            sb.append(getMessage(bArr, 10, 84));
            if (sb.toString().startsWith("[)>\u001e01\u001d")) {
                sb.insert(9, postCode3 + f285GS + format + f285GS + format2 + f285GS);
            } else {
                sb.insert(0, postCode3 + f285GS + format + f285GS + format2 + f285GS);
            }
        } else if (i == 4) {
            sb.append(getMessage(bArr, 1, 93));
        } else if (i == 5) {
            sb.append(getMessage(bArr, 1, 77));
        }
        return new DecoderResult(bArr, sb.toString(), null, String.valueOf(i));
    }

    private static int getBit(int i, byte[] bArr) {
        int i2 = i - 1;
        return ((1 << (5 - (i2 % 6))) & bArr[i2 / 6]) == 0 ? 0 : 1;
    }

    private static int getInt(byte[] bArr, byte[] bArr2) {
        if (bArr2.length == 0) {
            throw new IllegalArgumentException();
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr2.length; i2++) {
            i += getBit(bArr2[i2], bArr) << ((bArr2.length - i2) - 1);
        }
        return i;
    }

    private static int getCountry(byte[] bArr) {
        return getInt(bArr, new byte[]{53, 54, BuiltinOptions.PadV2Options, BuiltinOptions.GreaterOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.SelectOptions, BuiltinOptions.SliceOptions, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions});
    }

    private static int getServiceClass(byte[] bArr) {
        return getInt(bArr, new byte[]{55, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.PackOptions, BuiltinOptions.LogicalOrOptions, 49, 50, 51, 52});
    }

    private static int getPostCode2Length(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.SequenceRNNOptions, 32});
    }

    private static int getPostCode2(byte[] bArr) {
        return getInt(bArr, new byte[]{BuiltinOptions.ExpOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SpaceToBatchNDOptions, BuiltinOptions.TransposeOptions, BuiltinOptions.ReducerOptions, BuiltinOptions.SubOptions, BuiltinOptions.DivOptions, BuiltinOptions.SqueezeOptions, BuiltinOptions.SpaceToDepthOptions, BuiltinOptions.EmbeddingLookupSparseOptions, BuiltinOptions.MulOptions, BuiltinOptions.PadOptions, BuiltinOptions.GatherOptions, BuiltinOptions.BatchToSpaceNDOptions, 13, 14, 15, 16, BuiltinOptions.ReshapeOptions, BuiltinOptions.SkipGramOptions, 7, 8, 9, 10, 11, 12, 1, 2});
    }

    private static String getPostCode3(byte[] bArr) {
        String[] strArr = SETS;
        return String.valueOf(new char[]{strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.SequenceRNNOptions, 32})), strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.ExpOptions, BuiltinOptions.TopKV2Options, BuiltinOptions.SplitOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.SpaceToBatchNDOptions, BuiltinOptions.TransposeOptions})), strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.ReducerOptions, BuiltinOptions.SubOptions, BuiltinOptions.DivOptions, BuiltinOptions.SqueezeOptions, BuiltinOptions.SpaceToDepthOptions, BuiltinOptions.EmbeddingLookupSparseOptions})), strArr[0].charAt(getInt(bArr, new byte[]{BuiltinOptions.MulOptions, BuiltinOptions.PadOptions, BuiltinOptions.GatherOptions, BuiltinOptions.BatchToSpaceNDOptions, 13, 14})), strArr[0].charAt(getInt(bArr, new byte[]{15, 16, BuiltinOptions.ReshapeOptions, BuiltinOptions.SkipGramOptions, 7, 8})), strArr[0].charAt(getInt(bArr, new byte[]{9, 10, 11, 12, 1, 2}))});
    }

    private static String getMessage(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        StringBuilder sb = new StringBuilder();
        int i7 = i;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        while (i7 < i + i2) {
            char charAt = SETS[i9].charAt(bArr[i7]);
            switch (charAt) {
                case 65520:
                case 65521:
                case 65522:
                case 65523:
                case 65524:
                    i10 = i9;
                    i9 = charAt - SHIFTA;
                    i8 = 1;
                    break;
                case 65525:
                    i8 = 2;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65526:
                    i8 = 3;
                    i10 = i9;
                    i9 = 0;
                    break;
                case 65527:
                    i8 = -1;
                    i9 = 0;
                    break;
                case 65528:
                    i8 = -1;
                    i9 = 1;
                    break;
                case 65529:
                    i8 = -1;
                    break;
                case 65530:
                default:
                    sb.append(charAt);
                    break;
                case 65531:
                    i7 = i7 + 1 + 1 + 1 + 1 + 1;
                    sb.append(new DecimalFormat("000000000").format((bArr[i3] << BuiltinOptions.BatchToSpaceNDOptions) + (bArr[i4] << BuiltinOptions.SkipGramOptions) + (bArr[i5] << 12) + (bArr[i6] << 6) + bArr[i7]));
                    break;
            }
            int i11 = i8 - 1;
            if (i8 == 0) {
                i9 = i10;
            }
            i7++;
            i8 = i11;
        }
        while (sb.length() > 0 && sb.charAt(sb.length() - 1) == 65532) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }
}
