package androidx.datastore.core;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: CorruptionHandler.kt */
@Metadata(m302d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0019\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, m301d2 = {"Landroidx/datastore/core/CorruptionHandler;", "T", "", "handleCorruption", "ex", "Landroidx/datastore/core/CorruptionException;", "(Landroidx/datastore/core/CorruptionException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "datastore-core"}, m300k = 1, m299mv = {1, 5, 1}, m297xi = 48)
/* loaded from: classes.dex */
public interface CorruptionHandler<T> {
    Object handleCorruption(CorruptionException corruptionException, Continuation<? super T> continuation);
}