package com.lzc.growup.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("首页访问！");

        return "";
    }
}
