package com.clf.despattern.chain.handler;

import com.clf.despattern.chain.entity.AnimalContext;
import org.springframework.stereotype.Component;

/**
 * ClassName: ProductAHandler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:14
 * @Version 1.0
 */
@Component
public class AnimalFirstHandler extends I2Handler<AnimalContext,Boolean> {
    @Override
    public Boolean handle(AnimalContext animal) {
        System.out.println("动物a");
        return super.handle(animal);
    }
}
