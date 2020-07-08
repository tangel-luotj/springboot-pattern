package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 饿汉式(相当于用户进来仓库直接拿走已经提前装好的东西)
 *
 * @author create by Tangel
 * @Date: 2020/7/8 2:58 下午
 **/
@Slf4j
public class HungryStyle {

    //直接创建
    private static HungryStyle sHungryStyle = new HungryStyle();

    private HungryStyle() {
        if (sHungryStyle != null) {
            throw new RuntimeException();
        }
    }

    public static HungryStyle queryHungryStyle() {
        //不做判断直接返回
        return sHungryStyle;
    }

    public void logInfoToTerminal() {
        log.info("hello, i am HungryStyle Singleton!");
    }

}
