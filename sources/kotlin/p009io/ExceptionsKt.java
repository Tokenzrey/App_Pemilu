package kotlin.p009io;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.text.lookup.StringLookupFactory;

/* compiled from: Exceptions.kt */
@Metadata(m302d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a$\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002¨\u0006\u0006"}, m301d2 = {"constructMessage", "", StringLookupFactory.KEY_FILE, "Ljava/io/File;", "other", "reason", "kotlin-stdlib"}, m300k = 2, m299mv = {1, 8, 0}, m297xi = 48)
/* renamed from: kotlin.io.ExceptionsKt */
/* loaded from: classes3.dex */
public final class ExceptionsKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String constructMessage(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": " + str);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }
}
