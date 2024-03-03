package com.myntra.dto;

import lombok.Data;

@Data
public class NestedFilterDTO {
    private Long id;
    private String nestedFilterId;
    private String value;
    private Long parentId;
}