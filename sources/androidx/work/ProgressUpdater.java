package androidx.work;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

/* loaded from: classes.dex */
public interface ProgressUpdater {
    ListenableFuture<Void> updateProgress(Context context, UUID id2, Data data);
}
