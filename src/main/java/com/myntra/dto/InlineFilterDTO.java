package com.myntra.dto;

import lombok.Data;

@Data
public class InlineFilterDTO {
    private Long id;
    private String inlineFilterId;
    private String value;
}