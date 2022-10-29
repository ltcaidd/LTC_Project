package com.ltc.mybatis.mapper;

import com.ltc.mybatis.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface SelectMapper {
    /**
     * 通过Id查数据
     */
    User getUserById(Integer id);
    /**
     * 查询所有用户信息
     */
    List<User> getUserAll();
    /**
     * 查询user条数记录
     */
    Integer getCount();
    /**
     * 通过Id查询返回一个Map类型
     */
    Map<String,Object> getUserByIdToMap(@Param("id") int id);

    /**
     *查询所有记录返回map类型
     */
    //List<Map<String,Object>> getUserAllToMap();
    @MapKey("id")
    Map<String,Object> getUserAllToMap();
}
