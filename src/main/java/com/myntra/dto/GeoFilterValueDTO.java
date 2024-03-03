package com.myntra.dto;

import lombok.Data;

@Data
public class GeoFilterValueDTO {
    private Long id;
    private Long geoFilterId;
    private String value;
}