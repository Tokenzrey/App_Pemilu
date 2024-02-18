package com.google.flatbuffers;

import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class BooleanVector extends BaseVector {
    public BooleanVector __assign(int i, ByteBuffer byteBuffer) {
        __reset(i, 1, byteBuffer);
        return this;
    }

    public boolean get(int i) {
        return this.f271bb.get(__element(i)) != 0;
    }
}