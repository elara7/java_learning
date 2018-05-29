package com.learning.interfaceclass;

//常量接口
//其他類實現這個接口後就可以直接使用裏面的常量（即實例化這個類）
public interface Constants {
    public static final double PI = 3.14;
    public static final String PRO_NAME = "Demo";
}


// 單方法接口：一個接口裏面只有一個方法，比如Runnable

// 標志接口：一個接口裏面沒有任何方法，只用來表示這個類的特性，比如Serializable接口，一個類實現了這個接口就表示這個類可序列化
// 比如public class xxx implement Serializable

