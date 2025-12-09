package com.clf.designpattern.chain.product;


/**
 * ClassName: Handler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:08
 * @Version 1.0
 */
public abstract class IHandler {
    public IHandler nextHandler;
    public void setNextHandler(IHandler nextHandler){
        this.nextHandler = nextHandler;
    }
    public boolean hasNext(){
        return this.nextHandler != null;
    }

    public Boolean  handle(ProductContext productContext){
        if(hasNext()){
            return nextHandler.handle(productContext);
        }
        return null;
    }
}
