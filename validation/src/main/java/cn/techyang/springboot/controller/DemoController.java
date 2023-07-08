package cn.techyang.springboot.controller;

import cn.techyang.springboot.controller.vo.HelloRequestVo;
import cn.techyang.springboot.controller.vo.HelloResponseVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author tecyang@gmail.com
 * @version V1.0
 * @title
 * @description
 * @date 2023-06-04 09:59
 */
@RestController
public class DemoController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestBody @Validated  HelloRequestVo helloRequestVo) {
        return "hello world!" + helloRequestVo.getUserName();
    }


    @RequestMapping(value = "/hello2", method = RequestMethod.POST)
    public HelloResponseVo hello2(@RequestBody @Validated  HelloRequestVo helloRequestVo ){
        return HelloResponseVo.builder().age(10).name("张三").build();
    }
}
