package com.spider.mapper;

import com.spider.pojo.LianjiaHouse;
import com.spider.pojo.LianjiaHouseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LianjiaHouseMapper {
    int countByExample(LianjiaHouseExample example);

    int deleteByExample(LianjiaHouseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(LianjiaHouse record);

    int insertSelective(LianjiaHouse record);

    List<LianjiaHouse> selectByExample(LianjiaHouseExample example);

    LianjiaHouse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") LianjiaHouse record, @Param("example") LianjiaHouseExample example);

    int updateByExample(@Param("record") LianjiaHouse record, @Param("example") LianjiaHouseExample example);

    int updateByPrimaryKeySelective(LianjiaHouse record);

    int updateByPrimaryKey(LianjiaHouse record);
}