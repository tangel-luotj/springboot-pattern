package com.tangel.pattern.object.singleton;

import com.sun.tools.classfile.ConstantPool;
import lombok.extern.slf4j.Slf4j;

/**
 * 登记式/静态内部类
 *
 * @author create by Tangel
 * @Date: 2020/7/8 4:11 下午
 **/
@Slf4j
public class Registration {

    private static class SingletonHolder {
        //静态内部类
        private static final Registration registration = new Registration();
    }

    private Registration() {
    }

    public static Registration queryRegistrationSingleton() {
        //获取静态内部类中的对象
        return SingletonHolder.registration;
    }

    public void logInfoToTerminal() {
        log.info("hello, i am Registration Singleton!");
    }

}
