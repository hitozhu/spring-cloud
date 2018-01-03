package com.htzhu.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
    private DiscoveryClient client;

    @Value("${file.name}")
    private String fileName;

    @GetMapping("/hi")
    public String hi() {
        ServiceInstance instance = client.getLocalServiceInstance();
        String res = "hi host:" + instance.getHost() + " port:" + instance.getPort();
        log.info("hi host:" + instance.getHost() + " port:" + instance.getPort());
        return res;
    }

}
