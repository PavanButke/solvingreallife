package com.myntra.dto;

import lombok.Data;

@Data
public class BannerAdsDTO {
    private Long id;
    private String colorTheme;
    private String defaultCacheExpiredAt;
    private String layoutId;
    private String title;
}
