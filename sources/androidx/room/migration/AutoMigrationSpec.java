package androidx.room.migration;

import androidx.sqlite.p005db.SupportSQLiteDatabase;

/* loaded from: classes.dex */
public interface AutoMigrationSpec {
    default void onPostMigrate(SupportSQLiteDatabase db) {
    }
}
