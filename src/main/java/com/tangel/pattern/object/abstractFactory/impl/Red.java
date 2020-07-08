package com.tangel.pattern.object.abstractFactory.impl;

import com.tangel.pattern.object.abstractFactory.Color;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/7/7 2:26 下午
 **/
@Slf4j
public class Red implements Color {

    @Override
    public void fill() {
        log.info("hello boy, i am color - red");
    }

}
