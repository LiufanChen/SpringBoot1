package com.clf.despattern.strategy;

import com.clf.despattern.strategy.payment.PaymentStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * ClassName: PaymentStrategyFactory
 * Package: com.clf.Designpattern.Strategy
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:16
 * @Version 1.0
 */
@Service
public class PaymentStrategyFactory {
    public final ConcurrentHashMap<PayEnum, PaymentStrategy> paymentStrategyMap = new ConcurrentHashMap<>();

    @Autowired
    public PaymentStrategyFactory(List<PaymentStrategy> paymentStrategyList) {
        paymentStrategyList.forEach( x -> paymentStrategyMap.put(x.getHandleStrategy(), x));
    }


}
