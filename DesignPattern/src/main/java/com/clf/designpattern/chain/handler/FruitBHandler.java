package com.clf.designpattern.chain.handler;

import com.clf.designpattern.chain.entity.FruitContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: FruitBHandler
 * Package: com.clf.springboot1.Designpattern.chain.handler
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:38
 * @Version 1.0
 */
@Component
public class FruitBHandler extends I2Handler<FruitContext,Boolean>{
    @Override
    public Boolean handle(FruitContext fruitContext) {
        System.out.println("水果2");
        return super.handle(fruitContext);
    }
}