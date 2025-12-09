package com.clf.designpattern.chain.Factory;


import com.clf.designpattern.chain.handler.I2Handler;

import java.util.List;

/**
 * ClassName: ChainFactory
 * Package: com.clf.springboot1.Designpattern.chain.Factory
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:39
 * @Version 1.0
 */


public class ChainFactory<T,R> {

    I2Handler<T,R> first;

    public ChainFactory(List<I2Handler<T,R>> handlers) {
        for(int i = 0; i < handlers.size()-1; i++){
            handlers.get(i).setNextHandler(handlers.get(i+1));
        }
        first = handlers.get(0);
    }

    public R handle(T t){
        return first.handle(t);
    }
}
