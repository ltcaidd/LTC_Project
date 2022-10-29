package com.ltc.mybatis.test;

import com.ltc.mybatis.mapper.EmpMapper;
import com.ltc.mybatis.pojo.Emp;
import com.ltc.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

public class EmpMapperTest {
    @Test
    public void testGetEmpById(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=mapper.getEmpById(4);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDeptByEmpId(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=mapper.getEmpAndDeptById(2);
        System.out.println(emp);
    }
    @Test
    public void testGetEmpAndDept(){
        SqlSession sqlSession=SqlSessionUtils.getSqlSession();
        EmpMapper mapper=sqlSession.getMapper(EmpMapper.class);
        Emp emp=mapper.getEmpAndDeptStepOne(4);
        System.out.println(emp);
    }
}
