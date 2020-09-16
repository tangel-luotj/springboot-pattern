package com.tangel.pattern.object.template.impl;

import com.tangel.pattern.object.template.Game;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by luotj
 * @Date: 2020/9/16 2:35 下午
 **/
@Slf4j
public class Football extends Game {

    @Override
    public void initialize() {
        log.info("足球比赛筹备中----------");
    }

    @Override
    public void startPlay() {
        log.info("足球比赛开始啦----------");
    }

    @Override
    public void endPlay() {
        log.info("足球比赛已经结束----------");
    }

}
