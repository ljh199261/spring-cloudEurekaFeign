package com.controller;


import com.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignService feignService;
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String get(@RequestParam String name){
        return feignService.test(name);
    }
}
