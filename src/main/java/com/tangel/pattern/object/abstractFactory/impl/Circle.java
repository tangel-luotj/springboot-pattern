package com.tangel.pattern.object.abstractFactory.impl;

import com.tangel.pattern.object.abstractFactory.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/7/7 2:30 下午
 **/
@Slf4j
public class Circle implements Shape {

    @Override
    public void draw() {
        log.info("i will be draw a circle!!");
    }

}
