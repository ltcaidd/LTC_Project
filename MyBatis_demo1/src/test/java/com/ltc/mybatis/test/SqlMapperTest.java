package com.ltc.mybatis.test;

import com.ltc.mybatis.mapper.SqlMapper;
import com.ltc.mybatis.pojo.User;
import com.ltc.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class SqlMapperTest {
    @Test
    public void testGetUserLike(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SqlMapper mapper=sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.getUserByLike("张"));
    }
    @Test
    public void testGetDeleteMove(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SqlMapper mapper=sqlSession.getMapper(SqlMapper.class);
        System.out.println(mapper.getDeleteMove("1,2,3,8"));
    }
    @Test
    public void testGetUserTableName(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SqlMapper mapper=sqlSession.getMapper(SqlMapper.class);
        List<User> list=mapper.getUserTableName("t_user");
        System.out.println(list);
    }
    @Test
    public void testInserUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        SqlMapper mapper = sqlSession.getMapper(SqlMapper.class);
        User user=new User(null,"张三","147956",29,"男","159@qq.com");
        mapper.inserUser(user);
        System.out.println(user);
    }
}
