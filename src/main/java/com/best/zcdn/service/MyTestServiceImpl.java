package com.best.zcdn.service;

import com.best.zcdn.bean.User;
import com.best.zcdn.mapper.MyTestMapper;
import com.best.zcdn.service.interfaces.MyTestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2019/3/5.
 */
@Service
public class MyTestServiceImpl implements MyTestServiceI {

    @Autowired
    MyTestMapper myTestMapper;

    @Override
    public void springTransactionalTest() {
       method1();
    }

    @Override
    @Transactional
    public void method1() {
        User user = new User();
        user.setWorkId("N206");
        user.setUserName("杨攀");
        myTestMapper.addMethod1(user);

        int i = Integer.parseInt(user.getWorkId());
    }

}
