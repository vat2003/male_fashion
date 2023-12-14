package com.asm1.demo01.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShippingService {
	private Integer id; // ID của phương thức thanh toán
	private String name; // Tên phương thức thanh toán
	private double cost; // Giá trị thanh toán
	private int deliveryTime; // Thời gian giao hàng (số ngày)
}
