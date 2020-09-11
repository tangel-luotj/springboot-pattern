package com.tangel.pattern.object.strategy;

/**
 * @author create by luotj
 * @Date: 2020/9/11 6:41 下午
 **/
public class StrategyC implements StrategyFather {

    /**
     * 除运算
     *
     * @param paramA 参数1
     * @param paramB 参数2
     * @return
     */
    @Override
    public Object CalculationNum(Integer paramA, Integer paramB) {
        return paramA / paramB;
    }

}
