package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class FloatVector extends BaseVector {
    public FloatVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 4, byteBuffer);
        return this;
    }

    public float get(int i) {
        return this.f271bb.getFloat(__element(i));
    }
}
