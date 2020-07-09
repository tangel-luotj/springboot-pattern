package com.tangel.pattern.object.nullObject;

import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/7/9 2:44 下午
 **/
@Slf4j
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name){
        this.name = name;
    }

    @Override
    public String queryName() {
        return "hello , i am " + name + ", nice to meet you!!";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
