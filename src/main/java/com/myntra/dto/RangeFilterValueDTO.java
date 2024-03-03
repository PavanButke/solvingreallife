package com.myntra.dto;

import lombok.Data;

@Data
public class RangeFilterValueDTO {
    private Long id;
    private Long rangeFilterId;
    private Integer start;
    private Integer end;
    private Integer count;
    private String pLevel;
}