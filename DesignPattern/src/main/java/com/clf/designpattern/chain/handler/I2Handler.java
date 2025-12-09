package com.clf.designpattern.chain.handler;


/**
 * ClassName: Handler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:08
 * @Version 1.0
 */
public abstract class I2Handler<T,R> {
    public I2Handler<T,R> nextHandler;
    public void setNextHandler(I2Handler<T,R> nextHandler){
        this.nextHandler = nextHandler;
    }
    public boolean hasNext(){
        return this.nextHandler != null;
    }

    public R  handle(T t){
        if(hasNext()){
            return nextHandler.handle(t);
        }
        return null;
    }
}
