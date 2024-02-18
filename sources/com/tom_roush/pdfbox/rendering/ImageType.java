package com.tom_roush.pdfbox.rendering;

import android.graphics.Bitmap;

/* loaded from: classes3.dex */
public enum ImageType {
    BINARY { // from class: com.tom_roush.pdfbox.rendering.ImageType.1
        @Override // com.tom_roush.pdfbox.rendering.ImageType
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ALPHA_8;
        }
    },
    GRAY { // from class: com.tom_roush.pdfbox.rendering.ImageType.2
        @Override // com.tom_roush.pdfbox.rendering.ImageType
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ALPHA_8;
        }
    },
    RGB { // from class: com.tom_roush.pdfbox.rendering.ImageType.3
        @Override // com.tom_roush.pdfbox.rendering.ImageType
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }
    },
    ARGB { // from class: com.tom_roush.pdfbox.rendering.ImageType.4
        @Override // com.tom_roush.pdfbox.rendering.ImageType
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }
    },
    BGR { // from class: com.tom_roush.pdfbox.rendering.ImageType.5
        @Override // com.tom_roush.pdfbox.rendering.ImageType
        Bitmap.Config toBitmapConfig() {
            return Bitmap.Config.ARGB_8888;
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract Bitmap.Config toBitmapConfig();
}
