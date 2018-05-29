package com.learning.exception;

public class Test {
    public static void main(String[] args) {
        //新建一个高压锅
        Pan p = new Pan(550);
        //使用高压锅，捕获异常
        try{
            p.use();
            //捕获PanExp类异常，命名为e
        } catch (PanExp e){
            //输出异常信息
            e.printStackTrace();
        }
    }
}

//定义异常类，继承自exception
class PanExp extends Exception{
    //定义压力值
    int p;
    //定义构造方法
    public PanExp(int p, String name){
        //调用父类Exception的构造方法输入异常名称
        super(name);
        //定义自己独有的变量
        this.p = p;
    }
    //定义查询压力方法
    public int getP(){
        return p;
    }
}

//定义高压锅类
class Pan{
    int p;
    //定义构造方法
    public Pan(int p){
        this.p = p;
    }

    //定义使用方法，可以抛出对应异常，用throws声明
    public void use() throws PanExp{
        if (p>500){
            throw new PanExp(p,"压力太高，危险！");
        }
        System.out.println("正常运行...");
    }
}