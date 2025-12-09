package com.clf.despattern.chain.config;



import com.clf.despattern.chain.Factory.ChainFactory;
import com.clf.despattern.chain.entity.AnimalContext;
import com.clf.despattern.chain.entity.FruitContext;
import com.clf.despattern.chain.handler.I2Handler;
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
