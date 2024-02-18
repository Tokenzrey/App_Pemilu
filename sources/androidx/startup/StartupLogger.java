package androidx.startup;

import android.util.Log;

/* loaded from: classes.dex */
public final class StartupLogger {
    static final boolean DEBUG = false;
    private static final String TAG = "StartupLogger";

    private StartupLogger() {
    }

    /* renamed from: i */
    public static void m504i(String str) {
        Log.i(TAG, str);
    }

    /* renamed from: w */
    public static void m503w(String str) {
        Log.w(TAG, str);
    }

    /* renamed from: e */
    public static void m505e(String str, Throwable th) {
        Log.e(TAG, str, th);
    }
}
