package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 懒汉式(线程安全，加锁结构，但是在高并发的情况下，会影响效率)
 *      --相当于用户进来仓库之后检查是否已经提前装好商品，如果没有继续装载，如果有直接拿东西走人，佣人每次只能装载同一个用户一个商品
 *
 * @author create by Tangel
 * @Date: 2020/7/8 2:49 下午
 **/
@Slf4j
public class SluggardSafe {

    private static SluggardSafe sSluggardSafe;

    private SluggardSafe() {
        if (sSluggardSafe != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized SluggardSafe querySluggarSafe() {
        if (sSluggardSafe == null) {
            sSluggardSafe = new SluggardSafe();
        }
        return sSluggardSafe;
    }

    public void logInfoToTerminal() {
        log.info("hello, i am SluggardSafe Singleton!");
    }

}
