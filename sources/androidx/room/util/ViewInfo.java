package androidx.room.util;

import android.database.Cursor;
import androidx.sqlite.p005db.SupportSQLiteDatabase;
import com.tom_roush.pdfbox.contentstream.operator.OperatorName;

/* loaded from: classes.dex */
public final class ViewInfo {
    public final String name;
    public final String sql;

    public ViewInfo(String name, String sql) {
        this.name = name;
        this.sql = sql;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof ViewInfo) {
            ViewInfo viewInfo = (ViewInfo) o;
            String str = this.name;
            if (str == null ? viewInfo.name == null : str.equals(viewInfo.name)) {
                String str2 = this.sql;
                if (str2 != null) {
                    if (str2.equals(viewInfo.sql)) {
                        return true;
                    }
                } else if (viewInfo.sql == null) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sql;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ViewInfo{name='" + this.name + "', sql='" + this.sql + "'}";
    }

    public static ViewInfo read(SupportSQLiteDatabase database, String viewName) {
        Cursor query = database.query("SELECT name, sql FROM sqlite_master WHERE type = 'view' AND name = '" + viewName + OperatorName.SHOW_TEXT_LINE);
        try {
            if (query.moveToFirst()) {
                return new ViewInfo(query.getString(0), query.getString(1));
            }
            return new ViewInfo(viewName, null);
        } finally {
            query.close();
        }
    }
}
