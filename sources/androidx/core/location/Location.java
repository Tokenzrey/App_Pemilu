package androidx.core.location;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m302d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0086\n\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0086\n¨\u0006\u0004"}, m301d2 = {"component1", "", "Landroid/location/Location;", "component2", "core-ktx_release"}, m300k = 2, m299mv = {1, 8, 0}, m297xi = 48)
/* renamed from: androidx.core.location.LocationKt */
/* loaded from: classes.dex */
public final class Location {
    public static final double component1(android.location.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLatitude();
    }

    public static final double component2(android.location.Location location) {
        Intrinsics.checkNotNullParameter(location, "<this>");
        return location.getLongitude();
    }
}
