package com.tangel.pattern.model.singleton;

import com.tangel.pattern.object.singleton.DoubleCheck;
import com.tangel.pattern.object.singleton.EnumStyle;
import com.tangel.pattern.object.singleton.HungryStyle;
import com.tangel.pattern.object.singleton.Registration;
import com.tangel.pattern.object.singleton.Sluggard;
import com.tangel.pattern.object.singleton.SluggardSafe;
import lombok.extern.slf4j.Slf4j;

/**
 * 单例模式
 *      单例模式（Singleton Pattern）是 Java 中最简单也是最常用的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 *      这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。
 *
 *      将使用六种方式实例实现单例模式
 *      1、懒汉式(线程不安全)
 *      2、懒汉式(线程安全，加锁结构但是影响效率)
 *      3、饿汉式
 *      4、双检锁/双重校验锁
 *      5、登记式/静态内部类
 *      6、枚举式
 * @author create by Tangel
 * @Date: 2020/7/8 2:06 下午
 **/
@Slf4j
public class SingletonModel {

    public static void main(String[] args) {
        log.info("-------------------------------------------------");
        //第一种模式,懒汉式线程不安全
        Sluggard sluggard = Sluggard.querySingleton();
        sluggard.logInfoToTerminal();
        log.info("校验单例模式--懒汉式(线程不安全)逻辑是否正确 : {}", Sluggard.querySingleton().equals(sluggard));
        log.info("-------------------------------------------------");
        //第二种模式,懒汉式线程安全
        SluggardSafe sluggardSafe = SluggardSafe.querySluggarSafe();
        sluggardSafe.logInfoToTerminal();
        log.info("校验单例模式--懒汉式(线程安全)逻辑是否正确 : {}", SluggardSafe.querySluggarSafe().equals(sluggardSafe));
        log.info("-------------------------------------------------");
        //第三种模式,饿汉式
        HungryStyle style = HungryStyle.queryHungryStyle();
        style.logInfoToTerminal();
        log.info("校验单例模式--饿汉式逻辑是否正确 : {}", HungryStyle.queryHungryStyle().equals(style));
        log.info("-------------------------------------------------");
        DoubleCheck doubleCheck = DoubleCheck.queryDoubleCheck();
        doubleCheck.logInfoToTerminal();
        log.info("校验单例模式--双检锁/双重检验锁逻辑是否正确 : {}", DoubleCheck.queryDoubleCheck().equals(doubleCheck));
        log.info("-------------------------------------------------");
        Registration registration = Registration.queryRegistrationSingleton();
        registration.logInfoToTerminal();
        log.info("校验单例模式--登记式/静态内部类逻辑是否正确 : {}", Registration.queryRegistrationSingleton().equals(registration));
        log.info("-------------------------------------------------");
        EnumStyle enumStyle = EnumStyle.Instant;
        enumStyle.logInfoToTerminal();
        log.info("校验单例模式--枚举式逻辑是否正确 : {}", EnumStyle.Instant.equals(enumStyle));
        log.info("-------------------------------------------------");
    }

}
