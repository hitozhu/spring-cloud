package com.htzhu.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * HelloController
 *
 * @author zhuhaitao
 * @date 2017/11/16 下午11:41
 */
@RestController
@Slf4j
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/hi")
    public String hi() {
        return restTemplate.getForObject("http://eureka-client/hi", String.class);
    }

}
