package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class DoubleVector extends BaseVector {
    public DoubleVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 8, byteBuffer);
        return this;
    }

    public double get(int i) {
        return this.f271bb.getDouble(__element(i));
    }
}
