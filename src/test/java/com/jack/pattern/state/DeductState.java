package com.jack.pattern.state;

/**
 * 减库存
 *
 * @author geqiang
 * @date 2018/1/18
 **/
public class DeductState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("商品卖出，准备减库存");
        context.setState(this);
        //...执行减库存的具体操作
    }
    public String toString(){
        return "Deduct State";
    }
}
