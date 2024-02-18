package androidx.lifecycle;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ViewModelStore.kt */
@Metadata(m302d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0087\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, m301d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "()V", "map", "", "", "Landroidx/lifecycle/ViewModel;", "clear", "", "get", "key", UserMetadata.KEYDATA_FILENAME, "", "put", "viewModel", "lifecycle-viewmodel_release"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* loaded from: classes.dex */
public class ViewModelStore {
    private final Map<String, ViewModel> map = new LinkedHashMap();

    public final void put(String key, ViewModel viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        ViewModel put = this.map.put(key, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }

    public final ViewModel get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    public final Set<String> keys() {
        return new HashSet(this.map.keySet());
    }

    public final void clear() {
        for (ViewModel viewModel : this.map.values()) {
            viewModel.clear();
        }
        this.map.clear();
    }
}
