package androidx.sqlite.p005db;

/* renamed from: androidx.sqlite.db.SupportSQLiteQuery */
/* loaded from: classes.dex */
public interface SupportSQLiteQuery {
    void bindTo(SupportSQLiteProgram statement);

    int getArgCount();

    String getSql();
}
