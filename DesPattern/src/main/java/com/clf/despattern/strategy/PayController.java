package com.clf.despattern.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: PayController
 * Package: com.clf.Designpattern.Strategy
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:19
 * @Version 1.0
 */
@Controller
public class PayController {

    @Autowired
    public PaymentStrategyFactory paymentStrategyFactory;
    @RequestMapping("/pay")
    public void pay(int payType, double amount) {
        paymentStrategyFactory.paymentStrategyMap.get(PayEnum.fromValue(payType)).pay(amount);
    }

    public void payTest(int payType, double amount) {
        paymentStrategyFactory.paymentStrategyMap.get(PayEnum.fromValue(payType)).pay(amount);
    }

}
