package com.clf.despattern.strategy.payment.impl;

import com.clf.despattern.strategy.PayEnum;
import com.clf.despattern.strategy.payment.PaymentStrategy;
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
@Service("wechatPay")
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
