package com.tom_roush.pdfbox.pdmodel.common.function.type4;

import java.util.Stack;

/* loaded from: classes3.dex */
class RelationalOperators {
    private RelationalOperators() {
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Eq */
    /* loaded from: classes3.dex */
    static class C1682Eq implements Operator {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            stack.push(Boolean.valueOf(isEqual(stack.pop(), stack.pop())));
        }

        protected boolean isEqual(Object obj, Object obj2) {
            if ((obj instanceof Number) && (obj2 instanceof Number)) {
                return ((Number) obj).floatValue() == ((Number) obj2).floatValue();
            }
            return obj.equals(obj2);
        }
    }

    /* loaded from: classes3.dex */
    private static abstract class AbstractNumberComparisonOperator implements Operator {
        protected abstract boolean compare(Number number, Number number2);

        private AbstractNumberComparisonOperator() {
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.Operator
        public void execute(ExecutionContext executionContext) {
            Stack<Object> stack = executionContext.getStack();
            stack.push(Boolean.valueOf(compare((Number) stack.pop(), (Number) stack.pop())));
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Ge */
    /* loaded from: classes3.dex */
    static class C1683Ge extends AbstractNumberComparisonOperator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1683Ge() {
            super();
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        protected boolean compare(Number number, Number number2) {
            return number.floatValue() >= number2.floatValue();
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Gt */
    /* loaded from: classes3.dex */
    static class C1684Gt extends AbstractNumberComparisonOperator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1684Gt() {
            super();
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        protected boolean compare(Number number, Number number2) {
            return number.floatValue() > number2.floatValue();
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Le */
    /* loaded from: classes3.dex */
    static class C1685Le extends AbstractNumberComparisonOperator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1685Le() {
            super();
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        protected boolean compare(Number number, Number number2) {
            return number.floatValue() <= number2.floatValue();
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Lt */
    /* loaded from: classes3.dex */
    static class C1686Lt extends AbstractNumberComparisonOperator {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C1686Lt() {
            super();
        }

        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.AbstractNumberComparisonOperator
        protected boolean compare(Number number, Number number2) {
            return number.floatValue() < number2.floatValue();
        }
    }

    /* renamed from: com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators$Ne */
    /* loaded from: classes3.dex */
    static class C1687Ne extends C1682Eq {
        @Override // com.tom_roush.pdfbox.pdmodel.common.function.type4.RelationalOperators.C1682Eq
        protected boolean isEqual(Object obj, Object obj2) {
            return !super.isEqual(obj, obj2);
        }
    }
}
