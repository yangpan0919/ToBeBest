package com.best.zcdn.mapper;

import com.best.zcdn.bean.Employee;
import com.best.zcdn.bean.Permission;
import com.best.zcdn.bean.User;
import com.best.zcdn.bean.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//@Mapper或者@MapperScan将接口扫描装配到容器中
//@Mapper
public interface EmployeeMapper {

    public Employee getEmpById(String id);

    public int insertEmp(Employee employee);

    public Integer insertEmps(List<Employee> list);

    List<Permission> getUserById(@Param(value = "userId") Integer userId);
    void createTable();

    List<UserBean> getMessageById(Integer userId);
}
