package com.ltc.mybatis.mapper;

import com.ltc.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SqlMapper {
    /**
     * 通过username进行模糊查询
     */
    List<User> getUserByLike(@Param("username") String username);
    /**
     * 批量删除
     */
    int getDeleteMove(@Param("ids") String ids);
    /**
     * 查询表明指定的数据
     */
    List<User> getUserTableName(@Param("tablename") String tablename);
    /**
     * 添加时获取自增的主键
     */
    int inserUser(User user);
}
