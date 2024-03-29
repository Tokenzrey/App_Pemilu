package org.informatika.sirekap.p036db.dao;

import androidx.core.app.NotificationCompat;
import java.util.List;
import kotlin.Metadata;
import org.informatika.sirekap.model.ElectionPageStage;

/* compiled from: ElectionPageStageDao.kt */
@Metadata(m302d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0005H'J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH'J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H'J \u0010\u0010\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0005H'¨\u0006\u0011"}, m301d2 = {"Lorg/informatika/sirekap/db/dao/ElectionPageStageDao;", "", "deleteAllByElectionPageId", "", "electionPageId", "", "finishCreatePdf", "electionId", "insertAll", "electionPageStages", "", "Lorg/informatika/sirekap/model/ElectionPageStage;", "updateStatus", NotificationCompat.CATEGORY_STATUS, "", "type", "updateStatusIsOffline", "app_productionRelease"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
/* renamed from: org.informatika.sirekap.db.dao.ElectionPageStageDao */
/* loaded from: classes2.dex */
public interface ElectionPageStageDao {
    void deleteAllByElectionPageId(String str);

    void finishCreatePdf(String str);

    void insertAll(List<ElectionPageStage> list);

    void updateStatus(int i, String str, String str2);

    void updateStatusIsOffline(int i, String str, String str2);
}
