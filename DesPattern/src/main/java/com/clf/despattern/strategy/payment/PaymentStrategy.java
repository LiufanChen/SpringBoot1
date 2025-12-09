package com.clf.despattern.strategy.payment;


import com.clf.despattern.strategy.PayEnum;

/**
 * ClassName: IHander
 * Package: com.clf.Designpattern.Strategy
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:10
 * @Version 1.0
 */
public interface PaymentStrategy {
    void pay(double amount);
    PayEnum getHandleStrategy();
}
