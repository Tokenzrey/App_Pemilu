package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;

/* compiled from: CoroutineScope.kt */
@Metadata(m302d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, m301d2 = {
                "Lkotlinx/coroutines/CoroutineScope;", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;",
                "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;",
                "kotlinx-coroutines-core" }, m300k = 1, m299mv = { 1, 6, 0 }, m297xi = 48)
/* loaded from: classes.dex */
public interface CoroutineScope {
    CoroutineContext getCoroutineContext();
}
