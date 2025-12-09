package com.clf.despattern.template_strategy_simplesfactory.payment;

/**
 * ClassName: AbstractPaymentStrategy
 * Package: com.clf.despattern.template_strategy_simplesfactory
 * Description: 支付策略的模板抽象类
 * 模板方法
 * @Author clf
 * @Create 2025/12/9 22:29
 * @Version 1.0
 */
public abstract  class AbstractPaymentStrategy implements PaymentStrategy{
    //模板方法
    @Override
    public final void commonPay(double amount){
        //必须方法
        check(amount);
       //扩展抽象方法
        pay(amount);
    }

    //声明为private保障子类必须执行
    private void check(double amount) {
        if (amount <= 0){
            throw new RuntimeException("金额必须大于0");
        }
    }
    protected abstract void pay(double amount);

}
