package com.qiaodan.itmei.service;

import org.springframework.stereotype.Service;

/**
 * Created by qiaodan on 17/5/22.
 */

@Service
public class BaseService {
    public String showBaseInfo(){
        return "microservice-consumer-feign base information";
    }
}
