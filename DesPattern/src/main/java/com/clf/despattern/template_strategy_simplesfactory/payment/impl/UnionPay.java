package com.clf.despattern.template_strategy_simplesfactory.payment.impl;


import com.clf.despattern.template_strategy_simplesfactory.payment.AbstractPaymentStrategy;
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
@Service
public class UnionPay extends AbstractPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("银联支付");
    }

}
