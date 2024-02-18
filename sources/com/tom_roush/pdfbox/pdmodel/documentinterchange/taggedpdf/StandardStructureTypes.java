package com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf;

import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class StandardStructureTypes {
    public static final String ANNOT = "Annot";
    public static final String ART = "Art";
    public static final String BIB_ENTRY = "BibEntry";
    public static final String BLOCK_QUOTE = "BlockQuote";
    public static final String CAPTION = "Caption";
    public static final String CODE = "Code";
    public static final String DIV = "Div";
    public static final String DOCUMENT = "Document";
    public static final String FORM = "Form";
    public static final String FORMULA = "Formula";
    public static final String Figure = "Figure";

    /* renamed from: H */
    public static final String f467H = "H";

    /* renamed from: H1 */
    public static final String f468H1 = "H1";

    /* renamed from: H2 */
    public static final String f469H2 = "H2";

    /* renamed from: H3 */
    public static final String f470H3 = "H3";

    /* renamed from: H4 */
    public static final String f471H4 = "H4";

    /* renamed from: H5 */
    public static final String f472H5 = "H5";

    /* renamed from: H6 */
    public static final String f473H6 = "H6";
    public static final String INDEX = "Index";

    /* renamed from: L */
    public static final String f474L = "L";
    public static final String LBL = "Lbl";

    /* renamed from: LI */
    public static final String f475LI = "LI";
    public static final String LINK = "Link";
    public static final String L_BODY = "LBody";
    public static final String NON_STRUCT = "NonStruct";
    public static final String NOTE = "Note";

    /* renamed from: P */
    public static final String f476P = "P";
    public static final String PART = "Part";
    public static final String PRIVATE = "Private";
    public static final String QUOTE = "Quote";

    /* renamed from: RB */
    public static final String f477RB = "RB";
    public static final String REFERENCE = "Reference";

    /* renamed from: RP */
    public static final String f478RP = "RP";

    /* renamed from: RT */
    public static final String f479RT = "RT";
    public static final String RUBY = "Ruby";
    public static final String SECT = "Sect";
    public static final String SPAN = "Span";
    public static final String TABLE = "Table";

    /* renamed from: TD */
    public static final String f480TD = "TD";

    /* renamed from: TH */
    public static final String f481TH = "TH";
    public static final String TOC = "TOC";
    public static final String TOCI = "TOCI";

    /* renamed from: TR */
    public static final String f482TR = "TR";
    public static final String T_BODY = "TBody";
    public static final String T_FOOT = "TFoot";
    public static final String T_HEAD = "THead";
    public static final String WARICHU = "Warichu";

    /* renamed from: WP */
    public static final String f483WP = "WP";

    /* renamed from: WT */
    public static final String f484WT = "WT";
    public static List<String> types = new ArrayList();

    static {
        Field[] fields;
        for (Field field : StandardStructureTypes.class.getFields()) {
            if (Modifier.isFinal(field.getModifiers())) {
                try {
                    types.add(field.get(null).toString());
                } catch (IllegalAccessException e) {
                    Log.e("PdfBox-Android", e.getMessage(), e);
                } catch (IllegalArgumentException e2) {
                    Log.e("PdfBox-Android", e2.getMessage(), e2);
                }
            }
        }
        Collections.sort(types);
    }

    private StandardStructureTypes() {
    }
}
