package org.ld.dao;

import org.ld.model.RoomPic;

public interface RoomPicMapper {
    int deleteByPrimaryKey(Integer ID);

    int insert(RoomPic record);

    int insertSelective(RoomPic record);

    RoomPic selectByPrimaryKey(Integer ID);

    int updateByPrimaryKeySelective(RoomPic record);

    int updateByPrimaryKey(RoomPic record);
}