package com.otaku.model;


import lombok.Data;

@Data
public class Items {
    private Integer itemId;
    private String imageUrl;
    private String itemTitle;
    private Double price;
    private Category itemCategory;
}
