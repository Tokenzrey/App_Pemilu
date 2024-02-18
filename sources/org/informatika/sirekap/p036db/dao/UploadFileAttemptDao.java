package org.informatika.sirekap.p036db.dao;

import java.util.List;
import kotlin.Metadata;
import org.apache.xmpbox.type.JobType;
import org.informatika.sirekap.model.UploadFileAttempt;

/* compiled from: UploadFileAttemptDao.kt */
@Metadata(m302d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'J\u0016\u0010\t\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u000bH'J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H'¨\u0006\r"}, m301d2 = {"Lorg/informatika/sirekap/db/dao/UploadFileAttemptDao;", "", "deleteBy", "", JobType.f1090ID, "", "type", "getBy", "Lorg/informatika/sirekap/model/UploadFileAttempt;", "insertAll", "records", "", "markAsSuccess", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* renamed from: org.informatika.sirekap.db.dao.UploadFileAttemptDao */
/* loaded from: classes2.dex */
public interface UploadFileAttemptDao {
    void deleteBy(String str);

    void deleteBy(String str, String str2);

    UploadFileAttempt getBy(String str, String str2);

    void insertAll(List<UploadFileAttempt> list);

    void markAsSuccess(String str, String str2);
}