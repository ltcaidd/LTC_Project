package com.ltc.mybatis.test;

import com.ltc.mybatis.mapper.SelectMapper;
import com.ltc.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class SelectMapperTest {
    @Test
    public void testUserById(){
        SqlSession sqlSession= SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserById(4));
    }
    @Test
    public void testGetUserAll(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserAll());
    }
    @Test
    public void testGetCount(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getCount());
    }
    @Test
    public void testGetUserByIdToMap(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println( mapper.getUserByIdToMap(3));

    }
    @Test
    public void testGetUserAllToMap(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        SelectMapper mapper=sqlSession.getMapper(SelectMapper.class);
        System.out.println(mapper.getUserAllToMap());
    }


}
