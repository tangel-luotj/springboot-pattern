package com.tangel.pattern.model.abstractFactory;

import com.tangel.pattern.object.abstractFactory.Color;
import com.tangel.pattern.object.abstractFactory.Shape;
import com.tangel.pattern.object.abstractFactory.impl.Circle;
import com.tangel.pattern.object.abstractFactory.impl.Rectangle;
import com.tangel.pattern.object.abstractFactory.impl.Square;

/**
 * @author create by Tangel
 * @Date: 2020/7/7 2:36 下午
 **/
public class AbstractShape extends AbstractMethod {

    @Override
    public Color queryColorBy(String type) {
        return null;
    }

    @Override
    public Shape queryShapeBy(String type) {
        if ("circle".equalsIgnoreCase(type))
            return new Circle();
        else if ("square".equalsIgnoreCase(type))
            return new Square();
        else if ("rectangle".equalsIgnoreCase(type))
            return new Rectangle();
        else
            return null;
    }

}
