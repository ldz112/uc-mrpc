package com.polly.sdp;

/**
 * classname:EurekaServer
 * description:
 * version v0.0.1
 * Copyright: Copyright (c) 2018
 * Company: ND Co., Ltd.
 *
 * @author Administrator Created on 2018/5/15.16:03
 */
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServer {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServer.class,args);
    }
}
