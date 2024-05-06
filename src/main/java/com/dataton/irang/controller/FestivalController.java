package com.dataton.irang.controller;

import com.dataton.irang.dto.FestivalDto;
import com.dataton.irang.mapper.FestivalMapper;
import com.dataton.irang.service.FestivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



import java.util.List;

@RestController
public class FestivalController {

    @Autowired
    public FestivalService festivalService;

    @GetMapping("/my-festival")
    public String getTargetById(@RequestParam String userId){
        // return writeValueAsString(festivalService.getTargetById(userId));
        return "{\"target\": \"" + festivalService.getTargetById(userId) + "\"}";
    }

    @GetMapping("/festival")
    public List<FestivalDto> getAlData(){
        return festivalService.getAllData();
    }

    @GetMapping("/festival/{festival-id}")
    public FestivalDto getDataById(@PathVariable("festival-id") String festivalId){
        return festivalService.getDataById(festivalId);
    }
}
