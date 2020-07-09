package com.tangel.pattern.model.nullObject;

import com.tangel.pattern.object.nullObject.AbstractCustomer;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by Tangel
 * @Date: 2020/7/9 2:41 下午
 **/
@Slf4j
public class NullObjectModel {

    public static void main(String[] args) {
        log.info("username Luo : {}", NullObjectFactory.queryUserName("luo").queryName());
        log.info("username luotj : {}", NullObjectFactory.queryUserName("luotj").queryName());
        log.info("username Tangel : {}", NullObjectFactory.queryUserName("Tangel").queryName());
        log.info("username DaSha : {}", NullObjectFactory.queryUserName("DaSha").queryName());
        log.info("username zhang : {}", NullObjectFactory.queryUserName("zhang").queryName());
    }
}
