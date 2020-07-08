package com.tangel.pattern.model.factory;

import com.tangel.pattern.object.factory.Shape;
import com.tangel.pattern.object.factory.impl.CircleShape;
import com.tangel.pattern.object.factory.impl.Rectangle;
import com.tangel.pattern.object.factory.impl.Square;

/**
 * 工厂模式
 *      该模式针对一个接口，有多种不同的实现类，根据不同的需求类型调用不同的实现类，并实现对应的功能
 *
 * @author create by Tangel
 * @Date: 2020/6/23 11:27 上午
 **/
public class FactoryModel {

    public static void main(String[] args) {
        //根据类型，调用对象
        execShapeFactory("Square").queryShapeDesc();
        execShapeFactory("Circle").queryShapeDesc();
        execShapeFactory("Rectangle").queryShapeDesc();
    }

    //创建工厂
    private static Shape execShapeFactory(String type) {
        if ("Square".equals(type.trim()))
            return new Square();
        if ("Circle".equals(type.trim()))
            return new CircleShape();
        else
            return new Rectangle();
    }
}
