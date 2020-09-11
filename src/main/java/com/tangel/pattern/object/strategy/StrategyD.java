package com.tangel.pattern.object.strategy;

/**
 * @author create by luotj
 * @Date: 2020/9/11 6:56 下午
 **/
public class StrategyD implements StrategyFather {

    /**
     * 乘运算
     *
     * @param paramA 参数1
     * @param paramB 参数2
     * @return
     */
    @Override
    public Object CalculationNum(Integer paramA, Integer paramB) {
        return paramA * paramB;
    }

}
