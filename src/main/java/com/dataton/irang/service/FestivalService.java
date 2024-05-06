package com.dataton.irang.service;

import com.dataton.irang.dto.FestivalDto;
import com.dataton.irang.mapper.FestivalMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FestivalService {
    private final FestivalMapper festivalMapper;

    @Autowired
    public FestivalService(FestivalMapper festivalMapper) {
        this.festivalMapper = festivalMapper;
    }

    public String getTargetById(String userId){
        System.out.println(festivalMapper.getTargetById(userId));
        return festivalMapper.getTargetById(userId).getTarget();
    }
    public List<FestivalDto> getAllData(){
        return festivalMapper.getAllData();
    }

    public FestivalDto getDataById(String festivalId){
        return festivalMapper.getDataById(festivalId);
    }

}
