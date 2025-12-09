package com.clf.designpattern.chain.product;

/**
 * ClassName: test
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 22:03
 * @Version 1.0
 */
public class test {
    public static void main(String[] args) {
        ProductContext productContext = new ProductContext();
        ProductChainFactory productChainFactory = new ProductChainFactory();
        productChainFactory.handle(productContext);
    }
}
