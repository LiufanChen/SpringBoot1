package com.clf.despattern;

import com.clf.despattern.template_strategy_simplesfactory.PayController1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: template_strategy_simplesfactoryTest
 * Package: com.clf.despattern
 * Description:
 *
 * @Author clf
 * @Create 2025/12/9 22:43
 * @Version 1.0
 */
@SpringBootTest(classes = DesPatternApplication.class)
public class template_strategy_simplesfactoryTest {
    @Autowired
    private PayController1 payController;
    @Test
    public void payTest() {
        payController.payTest("aliPay",100.0);
    }
}
