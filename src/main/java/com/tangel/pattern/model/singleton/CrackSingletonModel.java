package com.tangel.pattern.model.singleton;

import com.tangel.pattern.object.singleton.HungryStyle;
import com.tangel.pattern.object.singleton.SubHungryStyle;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 使用反射机制破解单例模式（枚举除外，所以枚举暂时是世界上相对之下最好的单例模式）
 *
 * 单例模式的破解，以及如何预防
 * @author create by Tangel
 * @Date: 2020/7/8 5:12 下午
 **/
@Slf4j
public class CrackSingletonModel {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Constructor<SubHungryStyle> singleton2 = SubHungryStyle.class.getDeclaredConstructor();
        //设置可访问
        singleton2.setAccessible(true);
        //对创建的对象进行比对
        SubHungryStyle style3 = singleton2.newInstance();
        SubHungryStyle style4 = singleton2.newInstance();
        log.info("singleton1 : {}", style3);
        log.info("singleton2 : {}", style4);
        log.info("比对结果equals:{}", style3.equals(style4));

        log.info("----------------------------------------------------");

        //防止此类事件发生可以在空参构造方法中，添加报错逻辑,可防止开发者使用反射机制破解单例模式
        Constructor<HungryStyle> singleton1 = HungryStyle.class.getDeclaredConstructor();
        //设置可访问
        singleton1.setAccessible(true);
        //对创建的对象进行比对
        HungryStyle style1 = singleton1.newInstance();
        HungryStyle style2 = singleton1.newInstance();
        log.info("singleton1 : {}", style1);
        log.info("singleton2 : {}", style2);
        log.info("比对结果equals:{}", style1.equals(style2));
    }
}
