package org.informatika.sirekap.api.response;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CertificateGenerationResponsePayload.kt */
@Metadata(m302d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, m301d2 = {"Lorg/informatika/sirekap/api/response/CertificateGenerationResponsePayload;", "", "requestId", "", "(Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* loaded from: classes2.dex */
public final class CertificateGenerationResponsePayload {
    @SerializedName("request_id")
    private final String requestId;

    public static /* synthetic */ CertificateGenerationResponsePayload copy$default(CertificateGenerationResponsePayload certificateGenerationResponsePayload, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = certificateGenerationResponsePayload.requestId;
        }
        return certificateGenerationResponsePayload.copy(str);
    }

    public final String component1() {
        return this.requestId;
    }

    public final CertificateGenerationResponsePayload copy(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        return new CertificateGenerationResponsePayload(requestId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CertificateGenerationResponsePayload) && Intrinsics.areEqual(this.requestId, ((CertificateGenerationResponsePayload) obj).requestId);
    }

    public int hashCode() {
        return this.requestId.hashCode();
    }

    public String toString() {
        return "CertificateGenerationResponsePayload(requestId=" + this.requestId + ")";
    }

    public CertificateGenerationResponsePayload(String requestId) {
        Intrinsics.checkNotNullParameter(requestId, "requestId");
        this.requestId = requestId;
    }

    public final String getRequestId() {
        return this.requestId;
    }
}
