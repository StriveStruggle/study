package com.jack.pattern.state;

/**
 * @author geqiang
 * @date 2018/1/18
 **/
public class Client {
    public static void main(String[] args) {
        Context context=new Context("iPhone x");
        //看看怎么进行补库存操作
        State revertState=new RevertState();
        revertState.doAction(context);
        //同样地，减库存操作也非常简单
        State deductState=new DeductState();
        deductState.doAction(context);

        //如果需要我们可以获取当前的状态
        context.getState().toString();
    }
}
