package com.myntra.dto;

import lombok.Data;

@Data
public class ClusterDTO {
    private Long id;
    private String clusterId;
    private String name;
    private Integer count;
}