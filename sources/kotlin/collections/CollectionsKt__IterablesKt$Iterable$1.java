package kotlin.collections;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.markers.KMarkers;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Iterables.kt */
@Metadata(m302d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0096\u0002¨\u0006\u0004"}, m301d2 = {"kotlin/collections/CollectionsKt__IterablesKt$Iterable$1", "", "iterator", "", "kotlin-stdlib"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 176)
/* loaded from: classes3.dex */
public final class CollectionsKt__IterablesKt$Iterable$1<T> implements Iterable<T>, KMarkers {
    final /* synthetic */ Functions<Iterator<T>> $iterator;

    /* JADX WARN: Multi-variable type inference failed */
    public CollectionsKt__IterablesKt$Iterable$1(Functions<? extends Iterator<? extends T>> functions) {
        this.$iterator = functions;
    }

    @Override // java.lang.Iterable
    public Iterator<T> iterator() {
        return this.$iterator.invoke();
    }
}
