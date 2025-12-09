package com.clf.despattern.chain.handler;

import com.clf.despattern.chain.entity.AnimalContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: AnimalSecondHandler
 * Package: com.clf.springboot1.Designpattern.chain.handler
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:35
 * @Version 1.0
 */
@Component
public class AnimalSecondHandler extends I2Handler<AnimalContext,Boolean>{
    @Override
    public Boolean handle(AnimalContext animal) {
        System.out.println("动物b");
        return super.handle(animal);
    }
}
