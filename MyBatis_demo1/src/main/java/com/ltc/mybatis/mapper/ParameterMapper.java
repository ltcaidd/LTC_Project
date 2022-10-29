package com.ltc.mybatis.mapper;

import com.ltc.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ParameterMapper {
    /**
     *查询所有的员工
     */
    List<User> getAllUser();
    /**
     * 通过username查询
     */
    User getUserByName(String username);

    /**
     * 名字和密码来查找
     */
    User getCheckLogin(String username,String password);
    /**
     * 通过自己定义的Map集合来传参数
     */
    User CheckLoginByMap(Map<String ,Object> map);
    /**
     * 通过user对象添加
     */
    int insertUser(User user);
    /**
     * 以param注解来访问User
     */
    User checkLogByParam(@Param("username") String username,@Param("password") String password );
}
