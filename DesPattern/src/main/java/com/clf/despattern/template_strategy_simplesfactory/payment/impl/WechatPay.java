package com.clf.despattern.template_strategy_simplesfactory.payment.impl;

import com.clf.despattern.template_strategy_simplesfactory.payment.AbstractPaymentStrategy;
import com.clf.despattern.template_strategy_simplesfactory.payment.PaymentStrategy;
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
public class WechatPay extends AbstractPaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("微信支付");
    }

}
