package com.ltc.mybatis.mapper;

import com.ltc.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    Dept getEmpAndDeptSteptwo(@Param("deptid") Integer deptid);
}
