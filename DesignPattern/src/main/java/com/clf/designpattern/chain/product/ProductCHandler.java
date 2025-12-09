package com.clf.designpattern.chain.product;

/**
 * ClassName: ProductCHandler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:17
 * @Version 1.0
 */
public class ProductCHandler extends IHandler {
    @Override
    public Boolean handle(ProductContext productContext) {
        System.out.println("处理产品C");
        return super.handle(productContext);
    }
}
