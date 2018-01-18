package com.jack.pattern.state;

/**
 * 补库存
 *
 * @author geqiang
 * @date 2018/1/18
 **/
public class RevertState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("给此商品补库存");
        context.setState(this);

        //...执行加库存的具体操作
    }

    public String toString(){
        return "Revert State";
    }
}
