package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes3.dex */
final class DisposeOnCancel implements Future<Object> {

    /* renamed from: d */
    final Disposable f876d;

    @Override // java.util.concurrent.Future
    public Object get() throws InterruptedException, ExecutionException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return null;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DisposeOnCancel(Disposable disposable) {
        this.f876d = disposable;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        this.f876d.dispose();
        return false;
    }
}
