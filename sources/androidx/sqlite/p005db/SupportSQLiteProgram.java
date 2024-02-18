package androidx.sqlite.p005db;

import java.io.Closeable;

/* renamed from: androidx.sqlite.db.SupportSQLiteProgram */
/* loaded from: classes.dex */
public interface SupportSQLiteProgram extends Closeable {
    void bindBlob(int index, byte[] value);

    void bindDouble(int index, double value);

    void bindLong(int index, long value);

    void bindNull(int index);

    void bindString(int index, String value);

    void clearBindings();
}
