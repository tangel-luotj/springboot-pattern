package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 双检锁/双重检验锁 -- 双重校验并加锁结构
 *      -相当于在懒汉单例模式的一个改进
 * @author create by Tangel
 * @Date: 2020/7/8 3:27 下午
 **/
@Slf4j
public class DoubleCheck {

    private static DoubleCheck sDoubleCheck;

    public DoubleCheck() {
    }

    public static DoubleCheck queryDoubleCheck() {
        //第一层检验
        if (sDoubleCheck == null) {
            //加锁
            synchronized (DoubleCheck.class) {
                //第二层检验
                if (sDoubleCheck == null)
                    sDoubleCheck = new DoubleCheck();
            }
        }
        return sDoubleCheck;
    }

    public void logInfoToTerminal() {
        log.info("hello, i am DoubleCheck Singleton!");
    }
}
