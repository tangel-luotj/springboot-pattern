package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉式(线程不安全)--相当于用户进来仓库之后检查是否已经提前装好商品，如果没有继续装载，如果有直接拿东西走人
 * @author create by Tangel
 * @Date: 2020/7/8 2:22 下午
 **/
@Slf4j
public class Sluggard {

    private static Sluggard sMSluggard;

    private Sluggard() {
        if (sMSluggard != null) {
             throw new RuntimeException();
        }
    }

    public static Sluggard querySingleton() {
        if (sMSluggard == null) {
            //如果为null新创建一个对象
            sMSluggard = new Sluggard();
        }
        //经过检查之后再返回
        return sMSluggard;
    }

    public void logInfoToTerminal() {
        log.info("hello, i am Sluggard Singleton");
    }

}
