package com.asm1.demo01.model.data;

import java.util.HashMap;
import java.util.Map;

import com.asm1.demo01.model.Product;
import com.asm1.demo01.model.myEnum.Brand;
import com.asm1.demo01.model.myEnum.Category;
import com.asm1.demo01.model.myEnum.Color;
import com.asm1.demo01.model.myEnum.Size;

public class DTProduct {
	public static Map<Integer, Product> item = new HashMap<>();
	static {
		item.put(1, new Product(1, "Áo thun ASB", "Áo nỉ", 13., Size.L.toString(), Color.BLACK.toString(),
				Brand.ADIDAS.toString(), Category.T_SHIRT.toString(), 10.0, "product-2.jpg", 0));
		item.put(2, new Product(2, "Quần đùi Jean", "Vải Jean", 29.0, Size.M.toString(), Color.BLUE.toString(),
				Brand.NO_BRAND.toString(), Category.PANTS.toString(), 0.0, "product-1.jpg", 0));
		item.put(3, new Product(3, "Nịt bụng", "Da", 35.0, Size.XL.toString(), Color.GRAY.toString(),
				Brand.ADIDAS.toString(), Category.ACCESSORIES.toString(), 10.0, "product-3.jpg", 0));
		item.put(4, new Product(4, "Áo nam", "Áo nỉ dai", 23.0, Size.XL.toString(), Color.WHITE.toString(),
				Brand.CALVIN_KLEIN.toString(), Category.T_SHIRT.toString(), 18.0, "product-4.jpg", 0));
	}
}
