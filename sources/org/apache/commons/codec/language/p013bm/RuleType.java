package org.apache.commons.codec.language.p013bm;

/* renamed from: org.apache.commons.codec.language.bm.RuleType */
/* loaded from: classes2.dex */
public enum RuleType {
    APPROX("approx"),
    EXACT("exact"),
    RULES("rules");
    
    private final String name;

    RuleType(String str) {
        this.name = str;
    }

    public String getName() {
        return this.name;
    }
}
