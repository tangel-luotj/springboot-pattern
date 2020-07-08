package com.tangel.pattern.object.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * 枚举式
 * @author create by Tangel
 * @Date: 2020/7/8 4:19 下午
 **/
@Slf4j
public enum EnumStyle {

    Instant;

    public void logInfoToTerminal() {
        log.info("hello, i am Enum Singleton!");
    }

}
