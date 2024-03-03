package com.myntra.dto;

import java.util.List;

import org.hibernate.annotations.Filters;

import com.myntra.model.BannerAds;
import com.myntra.model.MetaData;
import com.myntra.model.TrendsInfo;

public class MyntraSearchResponseDTO {
    private String responseType;
    private int totalCount;
    private String totalCountRepresentation;
    private boolean hasNextPage;
    private String listPageContext;
    private int totalPLAShown;
    private int totalPLACount;
    private boolean isDiscountFallback;
    private Filters filters;
    private List<ProductDTO> products;
    // Other fields based on the response payload
    private String templateMessage;
    private String querySubstitution;
    private int totalProductCount;
    private String keywords;
    private List<ClusterDTO> clusters;
    private BannerAds bannerAds;
    private BannerAdsDTO paginatedBannerAds;
    private Object brandAttributes;
    private List<String> selectedClusterValues;
    private Object relatedSearches;
    private boolean isBPCListPage;
    private boolean showATC;
    private boolean showVtr;
    private Object error;
    private MetaData metaData;
    private TrendsInfo trendsInfo;
    private String plpLayout;
    private List<Object> trendsBanner;
    private List<Object> trendsRacks;
    private List<Object> productRacks;
}

