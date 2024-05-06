package com.dataton.irang.mapper;

import com.dataton.irang.dto.FestivalDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface FestivalMapper {

    FestivalDto getTargetById(@Param("userId") String userId);
    List<FestivalDto> getAllData();
    FestivalDto getDataById(@Param("festivalId") String festivalId);

}
