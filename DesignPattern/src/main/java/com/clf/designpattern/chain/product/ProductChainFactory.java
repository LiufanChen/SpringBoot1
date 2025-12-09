package com.clf.designpattern.chain.product;

/**
 * ClassName: ProductChainFactory
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:01
 * @Version 1.0
 */
public class ProductChainFactory {
    IHandler first;

    public ProductChainFactory() {
        ProductAHandler handlerA = new ProductAHandler();
        ProductBHandler handlerB = new ProductBHandler();
        ProductCHandler handlerC = new ProductCHandler();
        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);
        first=handlerA;
    }

    public Boolean handle(ProductContext productContext){
        return first.handle(productContext);
    }
}
