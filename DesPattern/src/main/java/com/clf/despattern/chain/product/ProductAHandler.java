package com.clf.despattern.chain.product;


/**
 * ClassName: ProductAHandler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:14
 * @Version 1.0
 */
public class ProductAHandler extends IHandler {
    @Override
    public Boolean handle(ProductContext productContext) {
        System.out.println("处理产品A");
        return super.handle(productContext);
    }
}
