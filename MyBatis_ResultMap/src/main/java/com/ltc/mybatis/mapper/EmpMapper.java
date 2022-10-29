package com.ltc.mybatis.mapper;

import com.ltc.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
/**
 * 通过id获取员工信息
 */
Emp getEmpById(@Param("empid") int empid);
/**
 * 查询员工信息既对应信息
 */
Emp getEmpAndDeptById(@Param("empid") Integer empid);
/**
 * 通过分步联查查询员工信息对应部门信息
 */
Emp getEmpAndDeptStepOne(@Param("empid") Integer empid);
}
