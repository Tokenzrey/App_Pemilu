package org.apache.commons.imaging.formats.gif;

import java.util.List;

/* loaded from: classes2.dex */
class GifImageContents {
    final List<GifBlock> blocks;
    final GifHeaderInfo gifHeaderInfo;
    final byte[] globalColorTable;

    /* JADX INFO: Access modifiers changed from: package-private */
    public GifImageContents(GifHeaderInfo gifHeaderInfo, byte[] bArr, List<GifBlock> list) {
        this.gifHeaderInfo = gifHeaderInfo;
        this.globalColorTable = bArr;
        this.blocks = list;
    }
}
