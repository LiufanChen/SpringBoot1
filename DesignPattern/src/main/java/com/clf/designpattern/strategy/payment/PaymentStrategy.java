package com.clf.designpattern.strategy.payment;

import com.clf.designpattern.strategy.PayEnum;

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
