package com.myntra.dto;

import java.util.List;

import lombok.Data;

@Data
class InlineFilterDTOs {
    private List<InlineFilterDTO> savedInlineFilterDTOs;
    private List<InlineFilterDTO> primaryInlineFilterDTOs;
    private List<InlineFilterDTO> secondaryInlineFilterDTOs;
    private List<InlineFilterDTO> rangeInlineFilterDTOs;
    private List<InlineFilterDTO> geoInlineFilterDTOs;
    private List<InlineFilterDTO> geoSpecificInlineFilterDTOs;
    private List<InlineFilterDTO> inlineInlineFilterDTOs;
    private List<InlineFilterDTO> pillsInlineFilterDTOs;
    private List<InlineFilterDTO> collapsiblePillsInlineFilterDTOs;
    private List<InlineFilterDTO> nestedInlineFilterDTOs;
    private List<InlineFilterDTO> inlineInlineFilterDTOsGroups;
    private List<InlineFilterDTO> derivedInlineFilterDTOs;
    private List<InlineFilterDTO> preferredInlineFilterDTOs;
}
