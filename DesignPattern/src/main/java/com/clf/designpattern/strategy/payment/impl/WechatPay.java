package com.clf.designpattern.strategy.payment.impl;

import com.clf.designpattern.strategy.PayEnum;
import com.clf.designpattern.strategy.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

/**
 * ClassName: WechatPay
 * Package: com.clf.Designpattern.Strategy.payment.impl
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:14
 * @Version 1.0
 */
@Service
public class WechatPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("微信支付");
    }

    @Override
    public PayEnum getHandleStrategy() {
        return PayEnum.WechatPay;
    }
}
