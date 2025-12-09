package com.clf.despattern.template_strategy_simplesfactory;

import com.clf.despattern.template_strategy_simplesfactory.payment.AbstractPaymentStrategy;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * ClassName: PaymentSrategyFactory
 * Package: com.clf.despattern.template_strategy_simplesfactory
 * Description:实现ApplicationContextAware接口，用于获取ApplicationContext对象，从容器中获取对应的策略对象
 *  简单工厂
 * @Author clf
 * @Create 2025/12/9 22:20
 * @Version 1.0
 */
@Component
public class PaymentStrategyFactory1 {

    private final Map<String, AbstractPaymentStrategy> strategyMap;

    public PaymentStrategyFactory1(Map<String, AbstractPaymentStrategy> strategyMap) {
        this.strategyMap = strategyMap;
    }

    public AbstractPaymentStrategy get(String name) {
        AbstractPaymentStrategy strategy = strategyMap.get(name);
        if (strategy == null) {
            throw new IllegalArgumentException("未知支付类型：" + name);
        }
        return strategy;
    }
}

