package com.clf.despattern.template_strategy_simplesfactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: PayController
 * Package: com.clf.despattern.template_strategy_simplesfactory
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 22:14
 * @Version 1.0
 */
@Controller
public class PayController1 {

    @Autowired
    PaymentStrategyFactory1 paymentSrategyFactory;

    @RequestMapping("/pay")
    public void pay(String payName, double amount) {
        paymentSrategyFactory.get(payName).commonPay(amount);
    }

    public void payTest(String payName, double amount) {
        paymentSrategyFactory.get(payName).commonPay(amount);
    }
}
