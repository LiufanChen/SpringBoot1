package com.clf.despattern;

import com.clf.despattern.strategy.PayController;
import com.clf.despattern.strategy.PayEnum;
import com.clf.despattern.strategy.PaymentStrategyFactory;
import com.clf.despattern.strategy.payment.PaymentStrategy;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static org.mockito.Mockito.*;

/**
 * ClassName: PayStrategyTest
 * Package: com.clf.despattern
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 21:54
 * @Version 1.0
 */
@SpringBootTest(classes = DesPatternApplication.class)
public class PayStrategyTest {

    @Autowired
    private PayController payController;

    @Test
    public void payTest() {
        payController.pay(1, 100);
        payController.pay(2, 100);
        payController.pay(3, 100);
    }
}
