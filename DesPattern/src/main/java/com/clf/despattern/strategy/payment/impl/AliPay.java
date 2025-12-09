package com.clf.despattern.strategy.payment.impl;


import com.clf.despattern.strategy.PayEnum;
import com.clf.despattern.strategy.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

/**
 * ClassName: AliPay
 * Package: com.clf.Designpattern.Strategy.payment.impl
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:13
 * @Version 1.0
 */
@Service("AliPay")
public class AliPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("支付宝支付");
    }

    @Override
    public PayEnum getHandleStrategy() {
        return PayEnum.AliPay;
    }
}
