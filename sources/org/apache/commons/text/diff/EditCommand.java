package org.apache.commons.text.diff;

/* loaded from: classes2.dex */
public abstract class EditCommand<T> {
    private final T object;

    public abstract void accept(CommandVisitor<T> commandVisitor);

    /* JADX INFO: Access modifiers changed from: protected */
    public EditCommand(T t) {
        this.object = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public T getObject() {
        return this.object;
    }
}
