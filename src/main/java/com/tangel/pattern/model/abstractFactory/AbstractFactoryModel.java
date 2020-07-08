package com.tangel.pattern.model.abstractFactory;

/**
 * 抽象工厂模式
 *        是围绕一个超级工厂创建其他工厂。该超级工厂又称为其他工厂的工厂。
 *        这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式
 *
 * @author create by Tangel
 * @Date: 2020/7/7 2:23 下午
 **/
public class AbstractFactoryModel {

    public static void main(String[] args) {

        AbstractMethod method1 = execAbstractMethod("color");
        method1.queryColorBy("red").fill();

        AbstractMethod method2 = execAbstractMethod("color");
        method2.queryColorBy("yellow").fill();

        AbstractMethod method3 = execAbstractMethod("color");
        method3.queryColorBy("blue").fill();

        AbstractMethod method4 = execAbstractMethod("shape");
        method4.queryShapeBy("Square").draw();

        AbstractMethod method5 = execAbstractMethod("shape");
        method5.queryShapeBy("cirCle").draw();

        AbstractMethod method6 = execAbstractMethod("shape");
        method6.queryShapeBy("rectangle").draw();

    }

    public static AbstractMethod execAbstractMethod(String choose) {
        if (choose.equalsIgnoreCase("shape")) {
            return new AbstractShape();
        } else if (choose.equalsIgnoreCase("color")) {
            return new AbstractColor();
        }
        return null;
    }

}
