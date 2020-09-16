package com.tangel.pattern.controller.ui;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模版项目
 *
 * @author create by luotj
 * @Date: 2020/6/6 6:57 下午
 **/
@Slf4j
@Api(tags = "01. 项目模版")
@RestController
@RequestMapping("/api/demo")
public class DemoController {

    private static int demo = 1;

    @ApiOperation("模版接口")
    @GetMapping("/template")
    public String templateProject() {
        return "hello , i am template project!!!";
    }


    @ApiOperation("测试接口执行顺序,主要理解return的执行返回顺序")
    @GetMapping("/test")
    public String test(Integer value) {
        try {
            int value1 = demo / value;
            return value1 + "";
        } catch (Exception ex) {
            log.info("测试失败, 尝试次数:{},message:{}", demo, ex.getMessage());
            if (1 << demo <= 4) {
                demo++;
                value = 1;
                String result = this.test(value);
                return result + "A";
            } else {
                demo = 1;
                throw new RuntimeException("测试失败");
            }
        }
    }

}
