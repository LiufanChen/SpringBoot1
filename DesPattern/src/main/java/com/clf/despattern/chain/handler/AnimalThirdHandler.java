package com.clf.despattern.chain.handler;

import com.clf.despattern.chain.entity.AnimalContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: AnimalThirdHandler
 * Package: com.clf.springboot1.Designpattern.chain.handler
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:36
 * @Version 1.0
 */
@Component
public class AnimalThirdHandler extends I2Handler<AnimalContext,Boolean> {
    @Override
    public Boolean handle(AnimalContext animal) {
        System.out.println("动物c");
        return super.handle(animal);
    }
}