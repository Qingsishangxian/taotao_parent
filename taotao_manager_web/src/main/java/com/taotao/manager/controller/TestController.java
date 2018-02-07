package com.taotao.manager.controller;

import com.taotao.manager.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author steven
 * @version 1.0
 * @description com.taotao.manager.controller
 * @date 2018/2/6
 */
@Controller
@RequestMapping("test")
public class TestController {
    @Autowired
    private TestService testService;

    /**
     * 查询当前时间
     * @return
     */
    @RequestMapping("date")
    @ResponseBody
    public String queryDate(){
        return this.testService.queryDate ();
    }

}
