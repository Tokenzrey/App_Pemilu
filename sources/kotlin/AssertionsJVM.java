package kotlin;

import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;

@Metadata(m302d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u001a\u0011\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0087\b\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0007"}, m301d2 = {"assert", "", "value", "", "lazyMessage", "Lkotlin/Function0;", "", "kotlin-stdlib"}, m300k = 5, m299mv = {1, 8, 0}, m297xi = 49, m296xs = "kotlin/PreconditionsKt")
/* renamed from: kotlin.PreconditionsKt__AssertionsJVMKt */
/* loaded from: classes3.dex */
class AssertionsJVM {
    /* renamed from: assert  reason: not valid java name */
    private static final void m701assert(boolean z) {
    }

    /* renamed from: assert  reason: not valid java name */
    private static final void m702assert(boolean z, Functions<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
    }
}
