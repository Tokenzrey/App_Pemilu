package androidx.core.p003os;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;

/* compiled from: Handler.kt */
@Metadata(m302d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, m301d2 = {"<anonymous>", "", "run"}, m300k = 3, m299mv = {1, 8, 0}, m297xi = 176)
/* renamed from: androidx.core.os.HandlerKt$postAtTime$runnable$1 */
/* loaded from: classes.dex */
public final class HandlerKt$postAtTime$runnable$1 implements Runnable {
    final /* synthetic */ Functions<Unit> $action;

    public HandlerKt$postAtTime$runnable$1(Functions<Unit> functions) {
        this.$action = functions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.$action.invoke();
    }
}
