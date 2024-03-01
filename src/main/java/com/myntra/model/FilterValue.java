package com.myntra.model;

import lombok.Data;

@Data
public class FilterValue {
    private String id;
    private String value;
    private int count;
    private String meta;
    private String pLevel;
}
