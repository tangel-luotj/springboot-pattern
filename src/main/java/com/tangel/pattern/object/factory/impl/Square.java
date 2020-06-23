package com.tangel.pattern.object.factory.impl;

import com.tangel.pattern.object.factory.Shape;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/6/23 11:36 上午
 **/
@Slf4j
public class Square implements Shape {

    @Override
    public void queryShapeDesc() {
        log.info("i am a SquareShape implements!!");
    }

}
