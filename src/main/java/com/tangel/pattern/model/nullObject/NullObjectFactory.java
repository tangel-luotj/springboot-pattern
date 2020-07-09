package com.tangel.pattern.model.nullObject;

import com.tangel.pattern.object.nullObject.AbstractCustomer;
import com.tangel.pattern.object.nullObject.NullCustomer;
import com.tangel.pattern.object.nullObject.RealCustomer;

/**
 * @author create by Tangel
 * @Date: 2020/7/9 2:51 下午
 **/
public class NullObjectFactory {

    private static final String[] userName = {"tangel","luotj","nex"};

    public static AbstractCustomer queryUserName(String name) {

        for (int i = 0; i < userName.length; i++) {
            if (userName[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
