package com.htzhu;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Application
 *
 * @author zhuhaitao
 * @date 2017/11/16 下午11:39
 */
@SpringBootApplication
@EnableEurekaClient
public class Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Application.class)
                .web(true).run(args);
    }

}
