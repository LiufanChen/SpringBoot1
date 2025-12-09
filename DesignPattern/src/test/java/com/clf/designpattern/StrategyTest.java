package com.clf.designpattern;



import com.clf.designpattern.strategy.PayController;
import com.clf.designpattern.strategy.PayEnum;
import com.clf.designpattern.strategy.PaymentStrategyFactory;
import com.clf.designpattern.strategy.payment.PaymentStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.mockito.Mockito.*;

/**
 * ClassName: SrategyTest
 * Package: com.clf.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:24
 * @Version 1.0
 */
@SpringBootTest
class StrategyTest {
    @Test
    void testPayTest() {
        // 准备 Mock
        PaymentStrategyFactory factory = mock(PaymentStrategyFactory.class);
        PaymentStrategy strategy = mock(PaymentStrategy.class);

        // 构造 payType 对应的策略
        int payType = 1;
        double amount = 100.0;
        PayEnum payEnum = PayEnum.fromValue(payType);

        // 构造 strategyMap
        Map<PayEnum, PaymentStrategy> map = new HashMap<>();
        map.put(payEnum, strategy);

        // mock factory 返回 map
        when(factory.paymentStrategyMap).thenReturn((ConcurrentHashMap<PayEnum, PaymentStrategy>) map);

        // 创建 controller 注入 mock 工厂
        PayController controller = new PayController();
        controller.paymentStrategyFactory = factory;

        // 执行
        controller.payTest(payType, amount);

        // 验证是否调用正确的 strategy.pay
        verify(strategy, times(1)).pay(amount);
    }
}