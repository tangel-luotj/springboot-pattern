package com.tangel.pattern.model.abstractFactory;

import com.tangel.pattern.object.abstractFactory.Color;
import com.tangel.pattern.object.abstractFactory.Shape;
import com.tangel.pattern.object.abstractFactory.impl.Blue;
import com.tangel.pattern.object.abstractFactory.impl.Red;
import com.tangel.pattern.object.abstractFactory.impl.Yellow;

/**
 * @author create by Tangel
 * @Date: 2020/7/7 2:36 下午
 **/
public class AbstractColor extends AbstractMethod {

    @Override
    public Color queryColorBy(String type) {
        if (type.equals("red"))
            return new Red();
        else if (type.equals("blue"))
            return new Blue();
        else if (type.equals("yellow"))
            return new Yellow();
        else
            return null;
    }

    @Override
    public Shape queryShapeBy(String type) {
        return null;
    }

}
