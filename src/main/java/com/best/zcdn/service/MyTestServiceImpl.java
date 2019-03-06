package com.best.zcdn.service;

import com.best.zcdn.bean.User;
import com.best.zcdn.mapper.MyTestMapper;
import com.best.zcdn.service.interfaces.MyTestServiceI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


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

    @Override
    public void addData() {
        List<User> list = new ArrayList<>();
        for(int i=1;i<1000;i++){
            User user = new User();
            user.setUserName(i+"");
            user.setWorkId(i+"");
            list.add(user);
        }
        myTestMapper.addData(list);
    }

    @Override
    public void addData1() {
        List<User> list = new ArrayList<>();
        User user = new User();
        user.setUserId(1L);
        user.setUserName("**");
        user.setWorkId("**");


        User user1 = new User();
        user1.setUserId(2L);
        user1.setUserName("**");
        user1.setWorkId("**");

        User user2 = new User();
        user2.setUserId(12L);
        user2.setUserName("**");
        user2.setWorkId("**");

        list.add(user);
        list.add(user1);
        list.add(user2);
        myTestMapper.addData1(list);
    }

    @Override
    public void selectData() {
        for(int i=0;i<10;i++){
            int j=i*10;
            List<User> users = myTestMapper.selectData(j);
            for(User user:users){
                System.out.print(user.getUserId()+"-");
            }
            try {
                Thread.currentThread().sleep(5000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println();
        }

    }

}
