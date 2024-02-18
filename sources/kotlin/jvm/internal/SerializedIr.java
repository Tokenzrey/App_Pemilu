package kotlin.jvm.internal;

import com.tom_roush.pdfbox.contentstream.operator.OperatorName;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: SerializedIr.kt */
@Target({ElementType.TYPE})
@Metadata(m302d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0010\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0007¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m301d2 = {"Lkotlin/jvm/internal/SerializedIr;", "", "bytes", "", "", OperatorName.CLOSE_FILL_NON_ZERO_AND_STROKE, "()[Ljava/lang/String;", "kotlin-stdlib"}, m300k = 1, m299mv = {1, 8, 0}, m297xi = 48)
@kotlin.annotation.Target(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.CLASS)
@kotlin.annotation.Retention(AnnotationRetention.BINARY)
/* loaded from: classes3.dex */
public @interface SerializedIr {
    /* renamed from: b */
    String[] m278b() default {};
}
