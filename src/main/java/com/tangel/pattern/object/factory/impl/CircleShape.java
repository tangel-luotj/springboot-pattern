package com.tangel.pattern.object.factory.impl;

import com.tangel.pattern.object.factory.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/6/23 11:35 上午
 **/
@Slf4j
public class CircleShape implements Shape {

    public void queryShapeDesc() {
        log.info("i am a circleShape implements!!");
    }

}
