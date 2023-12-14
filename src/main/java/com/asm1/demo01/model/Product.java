package com.asm1.demo01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	private Integer productId;
	private String name;
	private String description;
	private Double price;
	private String size;
	private String color;
	private String brand;

	private String category;

	private Double discount;
	private String imageUrls;
	private Integer quantity;

}
