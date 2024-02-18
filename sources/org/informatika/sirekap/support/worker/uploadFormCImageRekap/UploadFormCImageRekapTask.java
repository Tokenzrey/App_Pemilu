package org.informatika.sirekap.support.worker.uploadFormCImageRekap;

import android.content.Context;
import kotlin.Metadata;
import kotlin.Tuples;

/* compiled from: UploadFormCImageRekapTask.kt */
@Metadata(m302d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001JX\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0016\u0010\t\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&¨\u0006\u0010"}, m301d2 = {"Lorg/informatika/sirekap/support/worker/uploadFormCImageRekap/UploadFormCImageRekapTask;", "", "upload", "", "context", "Landroid/content/Context;", "electionId", "", "jenisPemilihan", "uploadedFiles", "Lkotlin/Pair;", "kodeTps", "imageDescription", "sign", "isOffline", "", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* loaded from: classes2.dex */
public interface UploadFormCImageRekapTask {
    void upload(Context context, String str, String str2, Tuples<String, String> tuples, String str3, String str4, String str5, boolean z);
}
