package com.myntra.model;

import java.util.List;

import lombok.Data;

@Data
public class InlineFilter {
    private String id;
    private List<FilterValue> filterValues;
}
