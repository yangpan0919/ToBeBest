package com.best.zcdn.controller;

import com.best.zcdn.service.interfaces.MyTestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2019/3/5.
 */
@RestController
public class MyTestController {


    @Autowired
    private MyTestServiceI myTestServiceI;


    @RequestMapping(value = "/springTransactionalTest", method = RequestMethod.GET)
    public String springTransactionalTest(){
        myTestServiceI.springTransactionalTest();
        return  "123";
    }

    @RequestMapping(value = "/addData", method = RequestMethod.GET)
    public String addData(){
        myTestServiceI.addData();
        return  "123";
    }
    @RequestMapping(value = "/addData1", method = RequestMethod.GET)
    public String addData1(){
        myTestServiceI.addData1();
        return  "123";
    }

    @RequestMapping(value = "/selectData", method = RequestMethod.GET)
    public String selectData(){
        myTestServiceI.selectData();
        return  "123";
    }
}
