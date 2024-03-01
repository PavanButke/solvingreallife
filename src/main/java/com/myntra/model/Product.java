package com.myntra.model;

import java.util.List;

import lombok.Data;

@Data
public class Product {
    private String landingPageUrl;
    private boolean loyaltyPointsEnabled;
    private String adId;
    private boolean isPLA;
    private long productId;
    private String product;
    private String productName;
    private double rating;
    private int ratingCount;
    private boolean isFastFashion;
    private int futureDiscountedPrice;
    private String futureDiscountStartDate;
    private int discount;
    private String brand;
    private String searchImage;
    private double effectiveDiscountPercentageAfterTax;
    private int effectiveDiscountAmountAfterTax;
    private long buyButtonWinnerSkuId;
    private long buyButtonWinnerSellerPartnerId;
    private int relatedStylesCount;
    private String relatedStylesType;
    private List<String> sizes;
}