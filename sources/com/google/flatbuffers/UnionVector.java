package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class UnionVector extends BaseVector {
    public UnionVector __assign(int i, int i2, ByteBuffer byteBuffer) {
        __reset(i, i2, byteBuffer);
        return this;
    }

    public Table get(Table table, int i) {
        return Table.__union(table, __element(i), this.f271bb);
    }
}
