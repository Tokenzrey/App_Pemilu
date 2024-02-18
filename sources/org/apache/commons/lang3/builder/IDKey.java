package org.apache.commons.lang3.builder;

/* loaded from: classes2.dex */
final class IDKey {

    /* renamed from: id */
    private final int f1073id;
    private final Object value;

    /* JADX INFO: Access modifiers changed from: package-private */
    public IDKey(Object obj) {
        this.f1073id = System.identityHashCode(obj);
        this.value = obj;
    }

    public int hashCode() {
        return this.f1073id;
    }

    public boolean equals(Object obj) {
        if (obj instanceof IDKey) {
            IDKey iDKey = (IDKey) obj;
            return this.f1073id == iDKey.f1073id && this.value == iDKey.value;
        }
        return false;
    }
}
