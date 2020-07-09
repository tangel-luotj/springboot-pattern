package com.tangel.pattern.object.nullObject;

/**
 * @author create by Tangel
 * @Date: 2020/7/9 2:44 下午
 **/
public class NullCustomer extends AbstractCustomer {
    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String queryName() {
        return "No this One!!";
    }
}
