package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * 饿汉式单例模式
 * @author create by Tangel
 * @Date: 2020/7/8 6:09 下午
 **/
@Slf4j
public class SubHungryStyle {

    //直接创建
    private static SubHungryStyle sHungryStyle = new SubHungryStyle();

    private SubHungryStyle() {
        //空参构造方法不做处理
    }

    public static SubHungryStyle queryHungryStyle() {
        //不做判断直接返回
        return sHungryStyle;
    }

}
