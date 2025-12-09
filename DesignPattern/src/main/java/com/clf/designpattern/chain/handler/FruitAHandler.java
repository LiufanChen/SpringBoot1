package com.clf.designpattern.chain.handler;


import com.clf.designpattern.chain.entity.FruitContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: FruitAHandler
 * Package: com.clf.springboot1.Designpattern.chain.handler
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:36
 * @Version 1.0
 */
@Component
public class FruitAHandler extends I2Handler<FruitContext,Boolean>{
    @Override
    public Boolean handle(FruitContext fruitContext) {
        System.out.println("水果1");
        return super.handle(fruitContext);
    }
}
