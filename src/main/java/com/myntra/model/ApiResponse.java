package com.myntra.model;

import java.util.List;

import org.apache.catalina.Cluster;

import lombok.Data;

@Data
public class ApiResponse {
    private String responseType;
    private int totalCount;
    private String totalCountRepresentation;
    private boolean hasNextPage;
    private String listPageContext;
    private int totalPLAShown;
    private int totalPLACount;
    private boolean isDiscountFallback;
    private List<Filter> filters;
    private List<Product> products;
    private MetaData metaData;
    private BannerAds bannerAds;
    private List<Cluster> clusters;
    private RelatedSearches relatedSearches;
    private TrendsInfo trendsInfo;
}