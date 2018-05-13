package com.service.impl;

import com.service.FeignService;
import org.springframework.stereotype.Component;

@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public String test(String name) {
        return "i am very sorry"+   name;
    }
}
