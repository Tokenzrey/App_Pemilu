package org.apache.commons.imaging.formats.psd;

import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.fasterxml.jackson.databind.ser.SerializerCache;
import com.tom_roush.fontbox.ttf.OpenTypeScript;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes2.dex */
class ImageResourceType {
    private static final ImageResourceType[] TYPES = {new ImageResourceType(1000, "Number of channels, rows, columns, depth, and mode."), new ImageResourceType(1001, "Optional. Macintosh print manager print info record"), new ImageResourceType(1003, "Indexed color table."), new ImageResourceType(1005, "ResolutionInfo structure"), new ImageResourceType(1006, "Names of the alpha channels as a series of Pascal strings."), new ImageResourceType(1007, "DisplayInfo structure"), new ImageResourceType(1008, "Optional. The caption as a Pascal string."), new ImageResourceType(1009, "Border information"), new ImageResourceType(1010, "Background color"), new ImageResourceType(1011, "Print flags (labels, crop marks, color bars, registration marks, negative, flip, interpolate, caption)"), new ImageResourceType(1012, "Grayscale and multichannel halftoning information."), new ImageResourceType(1013, "Color halftoning information"), new ImageResourceType(1014, "Duotone halftoning information"), new ImageResourceType(1015, "Grayscale and multichannel transfer function"), new ImageResourceType(1016, "Color transfer functions"), new ImageResourceType(1017, "Duotone transfer functions"), new ImageResourceType(1018, "Duotone image information"), new ImageResourceType(1019, "Effective black and white values for the dot range."), new ImageResourceType(1020, "Obsolete"), new ImageResourceType(1021, "EPS options"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, "Quick Mask information"), new ImageResourceType(1023, "Obsolete"), new ImageResourceType(1024, "Layer state information"), new ImageResourceType(1025, "Working path (not saved)"), new ImageResourceType(1026, "Layers group information"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_OBSOLETE_PHOTOSHOP_TAG3, "Obsolete"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_IPTC_DATA, "IPTC-NAA record"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_RAW_IMAGE_MODE, "Image mode for raw format files"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_JPEG_QUALITY, "JPEG quality"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_GRID_GUIDES_INFO, "Grid and guides information"), new ImageResourceType(1033, "Thumbnail resource"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_COPYRIGHT_FLAG, "Copyright flag"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_URL, "URL"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP_THUMBNAIL, "Thumbnail resource"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ANGLE, "Global lighting angle for effects layer"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_SAMPLERS_RESOURCE, "Color samplers resource"), new ImageResourceType(1039, "ICC Profile"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_WATERMARK, "Watermark"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_ICC_UNTAGGED, "ICC Untagged. Disables any assumed profile handling when opening the file"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_EFFECTS_VISIBLE, "Effects visible. global flag to show/hide all the effects layer. Only present when they are hidden."), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_SPOT_HALFTONE, "Spot Halftone"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_IDS_BASE_VALUE, "Document specific IDs"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_UNICODE_ALPHA_NAMES, "Unicode Alpha Names"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_INDEXED_COLOUR_TABLE_COUNT, "Indexed Color Table Count. Number of colors in table that are actually defined"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_TRANSPARENT_INDEX, "Transparency Index. Index of transparent color, if any"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_GLOBAL_ALTITUDE, "Global Altitude"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_SLICES, "Slices"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_WORKFLOW_URL, "Workflow URL"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_JUMP_TO_XPEP, "Jump To XPEP"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_ALPHA_IDENTIFIERS, "Alpha Identifiers"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_URL_LIST, "URL List"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_VERSION_INFO, "Version Info"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_EXIFINFO, "EXIF data 1"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_EXIF_INFO2, "EXIF data 3"), new ImageResourceType(1060, "XMP metadata"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_CAPTION_DIGEST, "Caption digest"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_PRINT_SCALE, "Print scale"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO, "Pixel Aspect Ratio"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_LAYER_COMPS, "Layer Comps"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_ALTERNATE_DUOTONE_COLORS, "Alternate Duotone Colors"), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_ALTERNATE_SPOT_COLORS, "Alternate Spot Colors"), new ImageResourceType(1069, "Layer Selection ID(s)"), new ImageResourceType(1070, "HDR Toning information"), new ImageResourceType(1071, "Print info"), new ImageResourceType(1072, "Layer Group(s) Enabled ID"), new ImageResourceType(1073, "Color samplers resource"), new ImageResourceType(1074, "Measurement Scale"), new ImageResourceType(1075, "Timeline Information"), new ImageResourceType(1076, "Sheet Disclosure"), new ImageResourceType(1077, "DisplayInfo structure to support floating point colors"), new ImageResourceType(1078, "Onion Skins"), new ImageResourceType(1080, "Count Information. Information about the count in the document."), new ImageResourceType(1082, "Print Information. Information about the current print settings in the document. The color management options."), new ImageResourceType(1083, "Print Style. Information about the current print style in the document. The printing marks, labels, ornaments, etc."), new ImageResourceType(1084, "Macintosh NSPrintInfo. Variable OS specific info for Macintosh. NSPrintInfo."), new ImageResourceType(1085, "Windows DEVMODE. Variable OS specific info for Windows. DEVMODE."), new ImageResourceType(1086, "Auto Save File Path"), new ImageResourceType(1087, "Auto Save Format"), new ImageResourceType(1088, "Path Selection State. Information about the current path selection state"), new ImageResourceType(2000, 2998, "Path Information (saved paths)."), new ImageResourceType(IptcConstants.IMAGE_RESOURCE_BLOCK_CLIPPING_PATH_NAME, "Name of clipping path"), new ImageResourceType(PathInterpolatorCompat.MAX_NUM_POINTS, "Origin Path Info"), new ImageResourceType(SerializerCache.DEFAULT_MAX_CACHED, 4999, "Plug-In resource(s). Resources added by a plug-in"), new ImageResourceType(7000, "Image Ready variables. XML representation of variables definition"), new ImageResourceType(7001, "Image Ready data sets"), new ImageResourceType(8000, "Lightroom workflow, if present the document is in the middle of a Lightroom workflow"), new ImageResourceType(10000, "Print flags information (center crop marks, bleed width value, bleed width scale)")};
    public final String description;
    public final int from;

    /* renamed from: to */
    public final int f1031to;

    public static String getDescription(int i) {
        ImageResourceType[] imageResourceTypeArr;
        for (ImageResourceType imageResourceType : TYPES) {
            if (imageResourceType.from <= i && i <= imageResourceType.f1031to) {
                return imageResourceType.description;
            }
        }
        return OpenTypeScript.UNKNOWN;
    }

    ImageResourceType(int i, String str) {
        this.from = i;
        this.f1031to = i;
        this.description = str;
    }

    ImageResourceType(int i, int i2, String str) {
        this.from = i;
        this.f1031to = i2;
        this.description = str;
    }
}
