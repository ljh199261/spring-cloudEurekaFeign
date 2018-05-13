package com.service;


import com.service.impl.FeignServiceImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-client",fallback = FeignServiceImpl.class)
public interface FeignService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String test(@RequestParam(value = "name") String name);
}
