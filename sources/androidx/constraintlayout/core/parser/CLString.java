package androidx.constraintlayout.core.parser;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes.dex */
public class CLString extends CLElement {
    public CLString(char[] cArr) {
        super(cArr);
    }

    public static CLElement allocate(char[] cArr) {
        return new CLString(cArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toJSON() {
        return OperatorName.SHOW_TEXT_LINE + content() + OperatorName.SHOW_TEXT_LINE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.core.parser.CLElement
    public String toFormattedJSON(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        addIndent(sb, i);
        sb.append(OperatorName.SHOW_TEXT_LINE);
        sb.append(content());
        sb.append(OperatorName.SHOW_TEXT_LINE);
        return sb.toString();
    }
}
