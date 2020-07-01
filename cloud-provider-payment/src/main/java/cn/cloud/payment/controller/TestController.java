package cn.cloud.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: lzf
 * @date:   2020/7/1
 * @Description:
 */
@RestController
@RequestMapping("/t")
public class TestController {

    @GetMapping
    public String test(){
        return "success";
    }
}
