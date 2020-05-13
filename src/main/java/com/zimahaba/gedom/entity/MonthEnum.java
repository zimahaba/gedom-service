package com.zimahaba.gedom.entity;

public enum MonthEnum {

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);

    private Integer value;

    MonthEnum(Integer value){
        this.value = value;
    }

    public static MonthEnum get(Integer value) {
        MonthEnum monthEnum = null;
        switch (value) {
            case 1: monthEnum = JANUARY; break;
            case 2: monthEnum = FEBRUARY; break;
            case 3: monthEnum = MARCH; break;
            case 4: monthEnum = APRIL; break;
            case 5: monthEnum = MAY; break;
            case 6: monthEnum = JUNE; break;
            case 7: monthEnum = JULY; break;
            case 8: monthEnum = AUGUST; break;
            case 9: monthEnum = SEPTEMBER; break;
            case 10: monthEnum = OCTOBER; break;
            case 11: monthEnum = NOVEMBER; break;
            case 12: monthEnum = DECEMBER; break;
        }
        return monthEnum;
    }

    public Integer getValue() {
        return value;
    }
}
