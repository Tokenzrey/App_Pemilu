package kotlinx.coroutines.tasks;

import com.tom_roush.pdfbox.pdmodel.common.PDPageLabelRange;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* compiled from: Tasks.kt */
@Metadata(m302d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, m301d2 = {"Lkotlinx/coroutines/tasks/DirectExecutor;", "Ljava/util/concurrent/Executor;", "()V", "execute", "", PDPageLabelRange.STYLE_ROMAN_LOWER, "Ljava/lang/Runnable;", "kotlinx-coroutines-play-services"}, m300k = 1, m299mv = {1, 6, 0}, m297xi = 48)
/* loaded from: classes2.dex */
final class DirectExecutor implements Executor {
    public static final DirectExecutor INSTANCE = new DirectExecutor();

    private DirectExecutor() {
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}