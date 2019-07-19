package io.lzg.checkinout.dao;

import io.lzg.checkinout.po.CheckRecord;

public interface CheckRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CheckRecord record);

    int insertSelective(CheckRecord record);

    CheckRecord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CheckRecord record);

    int updateByPrimaryKey(CheckRecord record);
}