package com.tangel.pattern.object.strategy;

/**
 * 逻辑策略分配调用
 *
 * @author create by luotj
 * @Date: 2020/9/11 6:45 下午
 **/
public class StrategyLogic {

    private StrategyFather mStrategyFather;

    public StrategyLogic(StrategyFather strategyFather) {
        this.mStrategyFather = strategyFather;
    }

    public Object execute(int paramA, int paramB) {
        return mStrategyFather.CalculationNum(paramA, paramB);
    }

}
