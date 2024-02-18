package org.apache.commons.imaging.formats.jpeg.decoder;

/* loaded from: classes2.dex */
final class Block {
    final int height;
    final int[] samples;
    final int width;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Block(int i, int i2) {
        this.samples = new int[i * i2];
        this.width = i;
        this.height = i2;
    }
}
