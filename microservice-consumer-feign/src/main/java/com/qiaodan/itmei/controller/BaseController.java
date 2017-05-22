package com.qiaodan.itmei.controller;

import com.qiaodan.itmei.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by qiaodan on 17/5/22.
 */

@RestController
@RequestMapping("BaseController")
public class BaseController {

    @Autowired
    private BaseService baseService;

    @RequestMapping("showBaseInfo")
    public String showBaseInfo(){
        return baseService.showBaseInfo();
    }
}
