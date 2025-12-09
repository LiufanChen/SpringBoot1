package com.clf.despattern.template_strategy_simplesfactory.payment.impl;


import com.clf.despattern.template_strategy_simplesfactory.payment.AbstractPaymentStrategy;
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
@Service
public class AliPay extends AbstractPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("支付宝支付");
    }
}
