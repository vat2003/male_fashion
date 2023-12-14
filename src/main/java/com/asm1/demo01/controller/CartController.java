package com.asm1.demo01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.asm1.demo01.Service.SessionService;
import com.asm1.demo01.interfaces.ShoppingCartService;
import com.asm1.demo01.model.DebitCardPayment;
import com.asm1.demo01.model.MomoEWalletPayment;
import com.asm1.demo01.model.Users;
import com.asm1.demo01.model.data.DTShippingService;

import jakarta.validation.Valid;

@Controller
@RequestMapping("asm")
public class CartController {

	@Autowired
	ShoppingCartService cart;

	@Autowired
	SessionService session;

	String selectedOption;

	@RequestMapping("shopping-cart")
	public String shopping_cart(Model model, @ModelAttribute("momo") MomoEWalletPayment momo,
			@ModelAttribute("debitCard") DebitCardPayment debitCard) {
		cart.add(1);
		cart.add(2);
		cart.add(3);
		model.addAttribute("cart", cart);
		model.addAttribute("count", cart.getCount());
		model.addAttribute("subtotal", cart.getAmount());
		System.out.println(cart.getAmount());
		model.addAttribute("afterSaled", cart.getAfterSaled());

		model.addAttribute("total", cart.getAmount() + cart.getAfterSaled());

		model.addAttribute("shippingservice", DTShippingService.item.values());
		model.addAttribute("selectedOption", selectedOption);

		Users user = session.get("email");
		System.out.println("USER IN SESSION: " + session.get("email"));
		model.addAttribute("user", user);

		return "shopping-cart";
	}

	////// ID PRODUCT
	@RequestMapping("shop-details")
	public String shopDetails() {

		return "shop-details";
	}

	@RequestMapping("checkout")
	public String checkout() {

		return "checkout";
	}

	/// ID BLOG
	@RequestMapping("blog-details")
	public String blogDetails() {

		return "blog-details";
	}

//	mathematical operations 	
	@RequestMapping("cart/update/{productId}/{mo}")
	public String updateQuantity(@PathVariable("productId") Integer productID, @PathVariable("mo") String mo) {

		cart.update(productID, mo);

		return "redirect:/asm/shopping-cart";

	}

	@RequestMapping("cart/remove/{productId}")
	public String removePD(@PathVariable("productId") Integer productID) {

		cart.remove(productID);

		return "redirect:/asm/shopping-cart";
	}

	@PostMapping("shopping-cart/paymentMethod/selected/momoEWallet")
	public String momoWalletSelected(Model model, @Valid @ModelAttribute("momo") MomoEWalletPayment momo,
			BindingResult bindingResult) {
		System.out.println("MOMO: " + momo.getMomoAccount());
		selectedOption = "momoEWallet";
		return "redirect:/asm/shopping-cart";
	}

	@PostMapping("shopping-cart/paymentMethod/selected/debitCardPayment")
	public String debitCardSelected(Model model, @Valid @ModelAttribute("debitCard") DebitCardPayment debitCard,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			System.out.println("ERRORS");
		}
		System.out.println("DEBIT CARD: " + debitCard.getCardOwner());
		System.out.println("DEBIT CARD: " + debitCard.getCardNumber());
		selectedOption = "debitCardPayment";
		return "redirect:/asm/shopping-cart";
	}

	@RequestMapping("shopping-cart/detail-invoice")
	public String invoice(Model model) {

		return "detail-invoice";
	}
}
