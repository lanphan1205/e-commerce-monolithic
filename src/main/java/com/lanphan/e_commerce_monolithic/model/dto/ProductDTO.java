package com.lanphan.e_commerce_monolithic.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductDTO {
    private String title;
    private Float price;
    private String description;
    @JsonProperty("category_id")
    private Long categoryId;
    @JsonProperty("image")
    private String imageUrl;
}
