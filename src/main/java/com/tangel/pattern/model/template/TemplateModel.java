package com.tangel.pattern.model.template;

import com.tangel.pattern.object.template.Game;
import com.tangel.pattern.object.template.impl.Basketball;
import com.tangel.pattern.object.template.impl.Football;
import lombok.extern.slf4j.Slf4j;

/**
 * @author create by luotj
 * @Date: 2020/9/16 2:39 下午
 **/
@Slf4j
public class TemplateModel {

    public static void main(String[] args) {
        Game game = new Basketball();
        game.play();

        log.info("");
        log.info("午休时间------");
        log.info("");

        game = new Football();
        game.play();
    }

}
