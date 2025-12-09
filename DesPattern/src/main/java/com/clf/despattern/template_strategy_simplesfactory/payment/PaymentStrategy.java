package com.clf.despattern.template_strategy_simplesfactory.payment;

/**
 * ClassName: PaymentStrategy
 * Package: com.clf.despattern.template_strategy_simplesfactory
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 22:15
 * @Version 1.0
 */
public interface PaymentStrategy {
    void commonPay(double amount);
}
