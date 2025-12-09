package com.clf.despattern.strategy.payment.impl;


import com.clf.despattern.strategy.PayEnum;
import com.clf.despattern.strategy.payment.PaymentStrategy;
import org.springframework.stereotype.Service;

/**
 * ClassName: UnionPay
 * Package: com.clf.Designpattern.Strategy.payment.impl
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:15
 * @Version 1.0
 */
@Service("UnionPay")
public class UnionPay implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("银联支付");
    }

    @Override
    public PayEnum getHandleStrategy() {
        return PayEnum.UnionPay;
    }
}
