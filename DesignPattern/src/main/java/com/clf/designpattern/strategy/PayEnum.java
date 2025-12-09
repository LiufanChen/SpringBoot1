package com.clf.designpattern.strategy;

/**
 * ClassName: payEnum
 * Package: com.clf.Designpattern.Strategy
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:05
 * @Version 1.0
 */

public enum PayEnum {
    AliPay(1, "支付宝"),
    WechatPay(2, "微信支付"),
    UnionPay(3, "银联支付");

    private final int value;
    private final String desc;

    PayEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    public int getValue() {
        return value;
    }

    public static PayEnum fromValue(int value) {
        for (PayEnum payEnum : PayEnum.values()) {
            if (payEnum.value == value) {
                return payEnum;
            }
        }
        return null;
    }


}
