package cn.thoughtworks.springeurekaorder.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {

    private Integer id;
    private String name;
    private Double price;
    private String unit;
}
