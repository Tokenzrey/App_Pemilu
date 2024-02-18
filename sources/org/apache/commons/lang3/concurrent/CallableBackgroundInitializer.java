package org.apache.commons.lang3.concurrent;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public class CallableBackgroundInitializer<T> extends BackgroundInitializer<T> {
    private final Callable<T> callable;

    public CallableBackgroundInitializer(Callable<T> callable) {
        checkCallable(callable);
        this.callable = callable;
    }

    public CallableBackgroundInitializer(Callable<T> callable, ExecutorService executorService) {
        super(executorService);
        checkCallable(callable);
        this.callable = callable;
    }

    @Override // org.apache.commons.lang3.concurrent.BackgroundInitializer
    protected T initialize() throws Exception {
        return this.callable.call();
    }

    private void checkCallable(Callable<T> callable) {
        Objects.requireNonNull(callable, "callable");
    }
}
