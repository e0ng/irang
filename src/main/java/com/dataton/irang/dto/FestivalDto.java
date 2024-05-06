package com.dataton.irang.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter @Setter
public class FestivalDto {

    private String festivalUrl;
    private String Title;
    private LocalDateTime StartDate;
    private LocalDateTime EndDate;
    private String Org;
    private String Place;
    private String Target;
    private String price;
    private String FestivalDetailUrl;
    private String HomepageUrl;


}
