package com.myntra.model;

import java.util.List;

import lombok.Data;

@Data
public class RangeFilter {
    private String id;
    private int gap;
    private int start;
    private int end;
    private List<RangeFilterValue> filterValues;
}

