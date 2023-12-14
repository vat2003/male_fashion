package com.asm1.demo01.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import com.asm1.demo01.interfaces.ShoppingCartService;
import com.asm1.demo01.model.Product;
import com.asm1.demo01.model.data.DTProduct;

@SessionScope
@Controller
public class ShoppingCartServiceImpl implements ShoppingCartService {
	Map<Integer, Product> map = new HashMap<>();

	@Override
	public Product add(Integer id) {
		Product item = map.get(id);
		if (item == null) {// cart is empty
			item = DTProduct.item.get(id);
			item.setQuantity(1);// set quantity to 1

			map.put(id, item); // add item into cart
		} else {
			item.setQuantity(item.getQuantity() + 1);
		}
		return item;
	}

	@Override
	public void remove(Integer id) {
		map.remove(id);
	}

	@Override
	public Product update(Integer id, String qty) {
		Product item = map.get(id);

		if (item.getQuantity() == 1 && qty.equals("minus")) {
			map.remove(id);
		}

		if (qty.equals("minus")) {
			item.setQuantity(item.getQuantity() - 1);
		} else if (qty.equals("plus") && item.getQuantity() < 100) {
			item.setQuantity(item.getQuantity() + 1);
		}

		return item;
	}

	@Override
	public void clear() {
		map.clear();
	}

	@Override
	public Collection<Product> getProducts() {
		return map.values();
	}

	@Override
	public int getCount() {
		// values => lấy tất cả đối tượng trong map
		// stream().mapToInt(...) => lấy giá trị của thuộc tính quantity trong item và
		// tính tổng
		return map.values().stream().mapToInt(item -> item.getQuantity()).sum();
	}

	@Override
	public double getAmount() {
		return map.values().stream().mapToDouble(item -> item.getPrice() * item.getQuantity()).sum();
	}

	@Override
	public double getAfterSaled() {

		double totalDiscountedAmount = 0.0;

		// Lặp qua từng sản phẩm trong giỏ hàng
		for (Product item : map.values()) {
			double originalPrice = item.getPrice();
			double discount = item.getDiscount(); // Giảm giá của sản phẩm
			int quantity = item.getQuantity();

			// Tính tổng số tiền được giảm cho sản phẩm này
			double discountedAmount = (originalPrice * discount / 100) * quantity;

			// Cộng vào tổng số tiền được giảm cho toàn bộ giỏ hàng
			totalDiscountedAmount += discountedAmount;
		}

		return totalDiscountedAmount;
	}

}
