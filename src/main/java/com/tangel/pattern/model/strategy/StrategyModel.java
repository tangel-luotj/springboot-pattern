package com.tangel.pattern.model.strategy;

import com.tangel.pattern.object.strategy.StrategyA;
import com.tangel.pattern.object.strategy.StrategyB;
import com.tangel.pattern.object.strategy.StrategyC;
import com.tangel.pattern.object.strategy.StrategyD;
import com.tangel.pattern.object.strategy.StrategyLogic;
import lombok.extern.slf4j.Slf4j;

/**
 * 策略模式-启动类
 *
 * @author create by luotj
 * @Date: 2020/9/11 6:38 下午
 **/
@Slf4j
public class StrategyModel {

    public static void main(String[] args) {
        int result = 0;
        //加运算策略
        StrategyLogic logicA = new StrategyLogic(new StrategyA());
        result = (int) logicA.execute(1, 1);
        log.info("加运算:1 + 1 = {}", result);

        //减运算策略
        StrategyLogic logicB = new StrategyLogic(new StrategyB());
        result = (int) logicB.execute(3, 1);
        log.info("减运算:3 - 1 = {}", result);

        //除运算策略
        StrategyLogic logicC = new StrategyLogic(new StrategyC());
        result = (int) logicC.execute(2, 1);
        log.info("除运算:2 / 1 = {}", result);

        //乘运算策略
        StrategyLogic logicD = new StrategyLogic(new StrategyD());
        result = (int) logicD.execute(2, 1);
        log.info("乘运算:2 * 1 = {}", result);
    }

}
