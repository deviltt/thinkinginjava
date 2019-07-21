package com.tt.chapter19.enumerated.myUnderstanding;

public enum StrategyEnumPattern {
    MONDAY(PayType.WEEKDAY), TUESDAY(PayType.WEEKDAY), WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY), FRIDAY(PayType.WEEKDAY), SATURDAY(PayType.WEEKEND), SUNDAY(PayType.WEEKEND);

    private final PayType payType;

    StrategyEnumPattern(PayType payType) {
        this.payType = payType;
    }

    double pay(double hoursWorked, double payRate){
        return payType.pay(hoursWorked, payRate);
    }

    private enum PayType {
        WEEKDAY {
            @Override
            double overtimePay(double hours, double payRate) {
                return HOURS_PER_SHIFT > 8 ? (hours - HOURS_PER_SHIFT) * payRate : 0;
            }
        },
        WEEKEND {
            @Override
            double overtimePay(double hours, double payRate) {
                return hours * payRate / 2;
            }
        };

        private static final int HOURS_PER_SHIFT = 8;

        abstract double overtimePay(double hours, double payRate);

        double pay(double hoursWorked, double payRate) {
            double basePay = HOURS_PER_SHIFT * payRate;
            return basePay + overtimePay(hoursWorked, payRate);
        }
    }

    public static void main(String[] args) {
        System.out.println(StrategyEnumPattern.SUNDAY.pay(9, 10));
    }
}
