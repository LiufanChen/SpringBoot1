package com.clf.designpattern.chain.product;


/**
 * ClassName: ProductBHandler
 * Package: com.clf.Designpattern.chain
 * Description:
 *
 * @Author clf
 * @Create 2025/12/4 21:15
 * @Version 1.0
 */
public class ProductBHandler extends IHandler {
    @Override
    public Boolean handle(ProductContext productContext) {
        System.out.println("处理产品B");
        return super.handle(productContext);
    }
}
