package com.tangel.pattern.object.template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author create by luotj
 * @Date: 2020/9/16 2:30 下午
 **/
@Slf4j
public abstract class Game {

    public abstract void initialize();

    public abstract void startPlay();

    public abstract void endPlay();

    //开始游戏
    public final void play() {

        initialize();

        startPlay();

        log.info("-------------华丽的中场休息分界线--------------");

        endPlay();
    }

}