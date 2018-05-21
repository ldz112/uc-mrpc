package com.polly.sdp.com.polly.sdp.ctrl;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * classname:AuthController
 * description:
 * version v0.0.1
 * Copyright: Copyright (c) 2018
 * Company: ND Co., Ltd.
 *
 * @author Administrator Created on 2018/5/15.21:29
 */
@RestController
public class AuthController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/operation" ,method = RequestMethod.GET)
    public String sub(@RequestParam Integer a, @RequestParam Integer b) {
        //ServiceInstance instance = client.getLocalServiceInstance();

        client.getServices().forEach(id -> {
            client.getInstances(id).forEach(instance -> {
                logger.info("/operation, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
            });
        });

        Integer r = a - b;
        logger.info("/operation, result:" + r);
        return "From auth2, Result is " + r;
    }

    //call service-A
    @RequestMapping(value="testAuth1",method=RequestMethod.GET)
    public String testServiceB(@RequestParam Integer a,@RequestParam Integer b){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("http://localhost:8081/operation?a="+a+"&b="+b, String.class);
    }
}
