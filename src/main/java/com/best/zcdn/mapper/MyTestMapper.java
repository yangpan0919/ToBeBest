package com.best.zcdn.mapper;

import com.best.zcdn.bean.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator on 2019/3/5.
 */
public interface MyTestMapper {

    void addMethod1(User user);

    void delMethod1(User user);

    void updateMethod1(User user);

    void addData(List<User> list);

    void addData1(List<User> list);

    List<User> selectData(@Param(value = "pageNo") Integer pageNo);
}
