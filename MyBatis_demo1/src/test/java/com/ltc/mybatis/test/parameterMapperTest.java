package com.ltc.mybatis.test;

import com.ltc.mybatis.mapper.ParameterMapper;
import com.ltc.mybatis.pojo.User;
import com.ltc.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class parameterMapperTest {
    @Test
    public void testInsertUser(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user=new User(null,"李四","987654",25,"男","147@qq.com");
        int count=mapper.insertUser(user);
        System.out.println(count);
    }

    @Test
    public void testGetAllUser()throws IOException {
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();

        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        List<User> list=mapper.getAllUser();
        //System.out.println(list);
        list.forEach(user -> System.out.println(user));
    }

    @Test
    public void testUserByname(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user=mapper.getUserByName("张三");
        System.out.println(user);
    }
    @Test
    public void testCheckLogin(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user=mapper.getCheckLogin("张三","123456");
        System.out.println(user);
    }

    @Test
    public void testCheckLoginMap(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        Map<String, Object> map=new HashMap<>();
        map.put("username","张三");
        map.put("password","123456");
        User user=mapper.CheckLoginByMap(map);
        System.out.println(user);
    }
    @Test
    public void testCheckLogByParam(){

        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        ParameterMapper mapper=sqlSession.getMapper(ParameterMapper.class);
        User user=mapper.checkLogByParam("李四","987654");
        System.out.println(user);
    }
}
