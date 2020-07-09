package com.tangel.pattern.object.nullObject;

import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/7/9 2:41 下午
 **/
@Slf4j
public abstract class AbstractCustomer {

    public String name;

    public abstract boolean isNil();

    public abstract String queryName();

}
