package com.myntra.model;

import lombok.Data;

@Data
public class RangeFilterValue {
    private String id;
    private int start;
    private int end;
    private int count;
    private String pLevel;
}