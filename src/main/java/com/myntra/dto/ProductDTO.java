package com.myntra.dto;

import lombok.Data;

@Data
public class ProductDTO {
    private Long id;
    private String landingPageUrl;
    private Boolean loyaltyPointsEnabled;
    private String adId;
    private Boolean isPla;
    private Long productId;
    private String productName;
    private Double rating;
    private Integer ratingCount;
    private Boolean isFastFashion;
    private Integer futureDiscountedPrice;
    private String futureDiscountStartDate;
    private Integer discount;
    private String brand;
    private String searchImage;
    private Double effectiveDiscountPercentageAfterTax;
    private Integer effectiveDiscountAmountAfterTax;
    private Long buyButtonWinnerSkuId;
    private Long buyButtonWinnerSellerPartnerId;
    private Integer relatedStylesCount;
    private String relatedStylesType;
}