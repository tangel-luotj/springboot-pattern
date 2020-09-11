package com.tangel.pattern.object.strategy;

/**
 * 减运算
 * @author create by luotj
 * @Date: 2020/9/11 6:41 下午
 **/
public class StrategyB implements StrategyFather {

    /**
     * 减运算
     * @param paramA    参数A
     * @param paramB    参数B
     * @return
     */
    @Override
    public Object CalculationNum(Integer paramA, Integer paramB) {
        return paramA - paramB;
    }

}
