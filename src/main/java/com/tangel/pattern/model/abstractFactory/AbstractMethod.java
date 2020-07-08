package com.tangel.pattern.model.abstractFactory;

import com.tangel.pattern.object.abstractFactory.Color;
import com.tangel.pattern.object.abstractFactory.Shape;

/**
 * @author create by Tangel
 * @Date: 2020/7/7 2:34 下午
 **/
public abstract class AbstractMethod {

    public abstract Color queryColorBy(String type);

    public abstract Shape queryShapeBy(String type);

}
