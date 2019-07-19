package io.lzg.checkinout.dao;

import io.lzg.checkinout.po.UserDetail;

public interface UserDetailMapper {
    int deleteByPrimaryKey(String openid);

    int insert(UserDetail record);

    int insertSelective(UserDetail record);

    UserDetail selectByPrimaryKey(String openid);

    int updateByPrimaryKeySelective(UserDetail record);

    int updateByPrimaryKey(UserDetail record);
}