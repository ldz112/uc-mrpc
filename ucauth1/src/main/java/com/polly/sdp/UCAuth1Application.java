package com.polly.sdp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * classname:UCAuth1Application
 * description:
 * version v0.0.1
 * Copyright: Copyright (c) 2018
 * Company: ND Co., Ltd.
 *
 * @author Administrator Created on 2018/5/15.19:50
 */
@EnableDiscoveryClient
@SpringBootApplication
public class UCAuth1Application {

    public static void main(String[] args) {
        SpringApplication.run(UCAuth1Application.class,args);
    }
}
