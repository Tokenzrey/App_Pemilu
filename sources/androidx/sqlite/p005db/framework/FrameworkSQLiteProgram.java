package androidx.sqlite.p005db.framework;

import android.database.sqlite.SQLiteProgram;
import androidx.sqlite.p005db.SupportSQLiteProgram;

/* renamed from: androidx.sqlite.db.framework.FrameworkSQLiteProgram */
/* loaded from: classes.dex */
class FrameworkSQLiteProgram implements SupportSQLiteProgram {
    private final SQLiteProgram mDelegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FrameworkSQLiteProgram(SQLiteProgram delegate) {
        this.mDelegate = delegate;
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.mDelegate.bindNull(index);
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.mDelegate.bindLong(index, value);
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.mDelegate.bindDouble(index, value);
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void bindString(int index, String value) {
        this.mDelegate.bindString(index, value);
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        this.mDelegate.bindBlob(index, value);
    }

    @Override // androidx.sqlite.p005db.SupportSQLiteProgram
    public void clearBindings() {
        this.mDelegate.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mDelegate.close();
    }
}
