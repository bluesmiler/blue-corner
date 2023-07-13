package com.blue.corner.mapper;

import com.blue.corner.model.Like;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface LikeMapper {

    void addLike(Like like);
}
