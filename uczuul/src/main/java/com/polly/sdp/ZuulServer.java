package com.polly.sdp;

import com.polly.sdp.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * classname:ZuulServer
 * description:
 * version v0.0.1
 * Copyright: Copyright (c) 2018
 * Company: ND Co., Ltd.
 *
 * @author Administrator Created on 2018/5/21.11:38
 */

@EnableZuulProxy
@SpringCloudApplication
public class ZuulServer {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class,args);
    }

    @Bean
    public AccessFilter accessFilter() {
        return new AccessFilter();
    }
}
