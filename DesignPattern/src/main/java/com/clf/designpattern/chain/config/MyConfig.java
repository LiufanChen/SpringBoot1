package com.clf.designpattern.chain.config;


import com.clf.designpattern.chain.Factory.ChainFactory;
import com.clf.designpattern.chain.entity.AnimalContext;
import com.clf.designpattern.chain.entity.FruitContext;
import com.clf.designpattern.chain.handler.I2Handler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * ClassName: MyConfig
 * Package: com.clf.springboot1.Designpattern.chain.config
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 23:36
 * @Version 1.0
 */
@Configuration
public class MyConfig {

    @Bean
    public ChainFactory animalChain(List<I2Handler<AnimalContext,Boolean>> handlers){
        return new ChainFactory<>(handlers);
    }
    @Bean
    public ChainFactory fruitChain(List<I2Handler<FruitContext,Boolean>> handlers){
        return new ChainFactory<>(handlers);
    }

}
