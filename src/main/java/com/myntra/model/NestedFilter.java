package com.myntra.model;

import java.util.List;

import lombok.Data;

@Data
public class NestedFilter {
    private String id;
    private String value;
    private List<NestedFilter> nestedValues;
}
