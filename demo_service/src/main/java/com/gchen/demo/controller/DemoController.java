package com.gchen.demo.controller;

import com.gchen.commons.domain.Result;
import com.gchen.commons.utils.ResultUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/demo")
public class DemoController {
    @GetMapping("/test")
    public Result test(){
        return ResultUtils.success("恭喜你進入到service層");
    }
}
