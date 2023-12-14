<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><%@ taglib
	uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="zxx">

<head>
<meta charset="UTF-8">
<meta name="description" content="Male_Fashion Template">
<meta name="keywords" content="Male_Fashion, unica, creative, html">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Male-Fashion | Template</title>

<!-- Google Font -->
<link
	href="https://fonts.googleapis.com/css2?family=Nunito+Sans:wght@300;400;600;700;800;900&display=swap"
	rel="stylesheet">

<!-- Css Styles -->
<link rel="stylesheet" href="../css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="../css/font-awesome.min.css"
	type="text/css">
<link rel="stylesheet" href="../css/elegant-icons.css" type="text/css">
<link rel="stylesheet" href="../css/magnific-popup.css" type="text/css">
<link rel="stylesheet" href="../css/nice-select.css" type="text/css">
<link rel="stylesheet" href="../css/owl.carousel.min.css"
	type="text/css">
<link rel="stylesheet" href="../css/slicknav.min.css" type="text/css">
<link rel="stylesheet" href="../css/style.css" type="text/css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>

<body>

	<!-- Offcanvas Menu Begin -->
	<div class="offcanvas-menu-overlay"></div>
	<div class="offcanvas-menu-wrapper">
		<div class="offcanvas__option">
			<div class="offcanvas__links">
				<a href="#">Sign in</a> <a href="#">FAQs</a>
			</div>
			<div class="offcanvas__top__hover">
				<span>Usd <i class="arrow_carrot-down"></i></span>
				<ul>
					<li>USD</li>
					<li>EUR</li>
					<li>USD</li>
				</ul>
			</div>
		</div>
		<div class="offcanvas__nav__option">
			<a href="#" class="search-switch"><img
				src="../img/icon/search.png" alt=""></a> <a href="#"><img
				src="../img/icon/heart.png" alt=""></a> <a href="#"><img
				src="../img/icon/cart.png" alt=""> <span>0</span></a>
			<div class="price">$0.00</div>
		</div>
		<div id="mobile-menu-wrap"></div>
		<div class="offcanvas__text">
			<p>Free shipping, 30-day return or refund guarantee.</p>
		</div>
	</div>
	<!-- Offcanvas Menu End -->

	<!-- Header Section Begin -->
	<header class="header">
		<div class="header__top">
			<div class="container">
				<div class="row">
					<div class="col-lg-6 col-md-7">
						<div class="header__top__left">
							<p>Free shipping, 30-day return or refund guarantee.</p>
						</div>
					</div>
					<div class="col-lg-6 col-md-5">
						<div class="header__top__right">
							<div class="header__top__links">
								<a href="#">Sign in</a> <a href="#">FAQs</a>
							</div>
							<div class="header__top__hover">
								<span>Usd <i class="arrow_carrot-down"></i></span>
								<ul>
									<li>USD</li>
									<li>EUR</li>
									<li>USD</li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-3">
					<div class="header__logo">
						<a href="./index"><img src="../img/logo.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-6 col-md-6">
					<nav class="header__menu mobile-menu">
						<ul>
							<li><a href="./index">Home</a></li>
							<li class="active"><a href="./shop">Shop</a></li>
							<li><a href="#">Pages</a>
								<ul class="dropdown">
									<li><a href="./about">About Us</a></li>
									<li><a href="./shop-details">Shop Details</a></li>
									<li><a href="./shopping-cart">Shopping Cart</a></li>
									<li><a href="./checkout">Check Out</a></li>
									<li><a href="./blog-details">Blog Details</a></li>
								</ul></li>
							<li><a href="./blog">Blog</a></li>
							<li><a href="./contact">Contacts</a></li>
						</ul>
					</nav>
				</div>
				<div class="col-lg-3 col-md-3">
					<div class="header__nav__option">
						<a href="#" class="search-switch"><img
							src="../img/icon/search.png" alt=""></a> <a href="#"><img
							src="../img/icon/heart.png" alt=""></a> <a href="#"><img
							src="../img/icon/cart.png" alt=""> <span>0</span></a>
						<div class="price">$0.00</div>
					</div>
				</div>
			</div>
			<div class="canvas__open">
				<i class="fa fa-bars"></i>
			</div>
		</div>
	</header>
	<!-- Header Section End -->

	<!-- Breadcrumb Section Begin -->
	<section class="breadcrumb-option">
		<div class="container">
			<div class="row">
				<div class="col-lg-12">
					<div class="breadcrumb__text">
						<h4>Shopping Cart</h4>
						<div class="breadcrumb__links">
							<a href="./index">Home</a> <a href="./shop">Shop</a> <span>Shopping
								Cart</span>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- Breadcrumb Section End -->

	<!-- Shopping Cart Section Begin -->
	<section class="shopping-cart spad">
		<div class="container">
			<div class="row">
				<div class="col-lg-8">
					<div class="shopping__cart__table">
						<table>
							<thead>
								<tr>
									<th>Product</th>
									<th>Sale</th>
									<th>Quantity</th>
									<th>Total</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<c:forEach var="item" items="${cart.products}">
									<tr>
										<td class="product__cart__item">
											<div class="product__cart__item__pic">
												<img src="../img/product/${item.imageUrls}" alt=""
													width="90" height="90">
											</div>
											<div class="product__cart__item__text">
												<h6 class="text-truncate">${item.name}</h6>
												<div class="d-inline-flex align-items-center">

													<h6 class="mr-2">
														Color: <span class="dotColor"
															style="width: 20px; height: 20px; background-color: ${item.color}; border-radius: 50%; border: 1px solid gray; display: inline-block; margin-right: 5px; margin-left: 3px"></span>
													</h6>
													<h6>Size: ${item.size}</h6>
												</div>
												<h6>$ ${item.price}</h6>
											</div>
										</td>
										<td class="cart__price">$${item.price -
											(item.price*item.discount/100)}</td>
										<td class="quantity__item">
											<div class="quantity">
												<div class="pro-qty-2">
													<a href="/asm/cart/update/${item.productId}/minus"><span
														class="fa fa-angle-left dec qtybtn"> </span></a> <input
														type="text" value="${item.quantity}"> <a
														href="/asm/cart/update/${item.productId}/plus"><span
														class="fa fa-angle-right inc qtybtn"></span></a>

												</div>
											</div>
										</td>
										<td class="cart__price"><fmt:formatNumber
												value="${(item.price - (item.price*item.discount/100)) * item.quantity}"
												type="currency" /></td>

										<td class="cart__close"><a
											href="/asm/cart/remove/${item.productId}"><i
												class="fa fa-close"></i></a></td>
									</tr>
								</c:forEach>
						</table>
					</div>
					<div class="row">
						<div class="col-lg-6 col-md-6 col-sm-6"></div>
						<div class="col-lg-6 col-md-6 col-sm-6">
							<div class="continue__btn update__btn">
								<a href="/asm/shop">Continue Shopping</a>
							</div>

						</div>
					</div>
				</div>
				<div class="col-lg-4">
					<div class="cart__discount">
						<h6>Discount codes</h6>
						<form action="#">
							<input type="text" placeholder="Coupon code">
							<button type="submit">Apply</button>
						</form>
					</div>
					<div class="cart__total">
						<div class="">
							<a href="profile" class="float-right">edit</a>
							<h6>Shipping address</h6>
							<ul>
								<li class="text-truncate">- ${user.fullname}</li>
								<li class="text-truncate">- ${user.phoneNum}</li>
								<li class="text-truncate">- ${user.address}</li>
							</ul>
						</div>
						<hr>
						<h6>Cart total</h6>
						<ul>
							<li>Subtotal <span>$ ${subtotal}</span></li>
							<li>Quantity total <span>${count}</span></li>
							<li>Discount total <span><fmt:formatNumber
										value="${afterSaled}" type="currency" /> </span></li>
						</ul>
						<hr>
						<div class="">
							<h6>Shipping Service</h6>
							<div class="input-group mb-3">
								<select class="form-select form-control" id="inputGroupSelect">
									<c:forEach var="item" items="${shippingservice}">
										<option value="${item.id}">${item.name}-
											$${item.cost} - ${item.deliveryTime}D</option>
									</c:forEach>
								</select>
							</div>
						</div>
						<hr>
						<div class="">
							<h6>Payment methods</h6>
							<div class="input-group">
								<select class="form-control" id="selectOption"
									name="selectedOption">
									<option value="" ${selectedOption eq '' ? 'selected' : ''}>Choose
										method</option>
									<option value="cashOnDelivery"
										${selectedOption eq 'cashOnDelivery' ? 'selected' : ''}>Cash
										on Delivery</option>
									<option value="debitCardPayment"
										${selectedOption eq 'debitCardPayment' ? 'selected' : ''}>Debit
										Card Payment</option>
									<option value="momoEWallet"
										${selectedOption eq 'momoEWallet' ? 'selected' : ''}>MOMO
										E-Waller</option>
								</select>

							</div>
							<form:errors path="momoAccount" class="text-danger" />
						</div>
						<hr>
						<ul>
							<li>Total <span>$ ${total}</span></li>
						</ul>
						<a href="/asm/shopping-cart/detail-invoice" class="primary-btn">Proceed
							to checkout</a>
					</div>
				</div>
			</div>
		</div>
		</div>
	</section>
	<!-- Shopping Cart Section End -->

	<!-- Footer Section Begin -->
	<footer class="footer">
		<div class="container">
			<div class="row">
				<div class="col-lg-3 col-md-6 col-sm-6">
					<div class="footer__about">
						<div class="footer__logo">
							<a href="#"><img src="../img/footer-logo.png" alt=""></a>
						</div>
						<p>The customer is at the heart of our unique business model,
							which includes design.</p>
						<a href="#"><img src="../img/payment.png" alt=""></a>
					</div>
				</div>
				<div class="col-lg-2 offset-lg-1 col-md-3 col-sm-6">
					<div class="footer__widget">
						<h6>Shopping</h6>
						<ul>
							<li><a href="#">Clothing Store</a></li>
							<li><a href="#">Trending Shoes</a></li>
							<li><a href="#">Accessories</a></li>
							<li><a href="#">Sale</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-2 col-md-3 col-sm-6">
					<div class="footer__widget">
						<h6>Shopping</h6>
						<ul>
							<li><a href="#">Contact Us</a></li>
							<li><a href="#">Payment Methods</a></li>
							<li><a href="#">Delivery</a></li>
							<li><a href="#">Return & Exchanges</a></li>
						</ul>
					</div>
				</div>
				<div class="col-lg-3 offset-lg-1 col-md-6 col-sm-6">
					<div class="footer__widget">
						<h6>NewLetter</h6>
						<div class="footer__newslatter">
							<p>Be the first to know about new arrivals, look books, sales
								& promos!</p>
							<form action="#">
								<input type="text" placeholder="Your email">
								<button type="submit">
									<span class="icon_mail_alt"></span>
								</button>
							</form>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col-lg-12 text-center">
					<div class="footer__copyright__text">
						<p>
							Copyright Â©
							<script>
								document.write(new Date().getFullYear());
							</script>
							2020 All rights reserved | This template is made with <i
								class="fa fa-heart-o" aria-hidden="true"></i> by <a
								href="https://colorlib.com" target="_blank">Colorlib</a>
						</p>
						<!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
					</div>
				</div>
			</div>
		</div>
	</footer>
	<!-- Footer Section End -->

	<!-- Search Begin -->
	<div class="search-model">
		<div class="h-100 d-flex align-items-center justify-content-center">
			<div class="search-close-switch">+</div>
			<form class="search-model-form">
				<input type="text" id="search-input" placeholder="Search here.....">
			</form>
		</div>
	</div>
	<!-- Search End -->

	<!-- Modal -->
	<div class="">
		<div class="modal fade" id="myModal">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Cash on delevery method</h4>
					</div>
					<div class="modal-body">This is the modal content.</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="myModal2">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">Debit Card Account</h4>
					</div>
					<div class="modal-body">

						<form:form
							action="/asm/shopping-cart/paymentMethod/selected/debitCardPayment"
							modelAttribute="debitCard" methodParam="post">
							<div class="form-group">
								<form:label path="cardOwner">Card Owner:</form:label>
								<form:input path="cardOwner" class="form-control" />
							</div>
							<div class="form-group">
								<form:label path="cardNumber">Card Number:</form:label>
								<form:input path="cardNumber" class="form-control" />
							</div>
							<div class="form-group">
								<form:label path="expirationDate">Expiration Date:</form:label>
								<form:input path="expirationDate" class="form-control" />
							</div>
							<div class="form-group">
								<form:label path="cvv">CVV (Card Verification Value):</form:label>
								<form:input path="cvv" class="form-control" min="0"
									minlength="3" maxlength="4" />
							</div>
							<button type="submit" class="btn btn-primary">Submit
								Payment</button>
						</form:form>
					</div>
				</div>
			</div>
		</div>

		<div class="modal fade" id="myModal3">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<h4 class="modal-title">MoMo E-Wallet</h4>
					</div>
					<div class="modal-body">
						<form:form
							action="/asm/shopping-cart/paymentMethod/selected/momoEWallet"
							modelAttribute="momo" methodParam="post">

							<form:label path="momoAccount">Momo Account Number</form:label>
							<form:input path="momoAccount" type="number" class="form-control"
								min="0" minlength="10" />
							<form:errors path="momoAccount" class="text-danger" />
							<button type="submit" class="btn btn-primary mt-2">Save</button>

						</form:form>
					</div>
					<!-- <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    </div> -->
				</div>
			</div>
		</div>
	</div>
	<!-- Model end -->

	<!-- Js Plugins -->

	<script>
		$(document).ready(function() {
			$("#selectOption").change(function() {
				var selectedOption = $(this).val();
				if (selectedOption === "option1") {
					$("#myModal").modal("show");
				}
				if (selectedOption === "debitCardPayment") {
					$("#myModal2").modal("show");
				}
				if (selectedOption === "momoEWallet") {
					$("#myModal3").modal("show");
				}
				// Add more conditions for other options if needed
			});
		});
	</script>
	<script src="../js/jquery-3.3.1.min.js"></script>
	<script src="../js/bootstrap.min.js"></script>
	<script src="../js/jquery.nice-select.min.js"></script>
	<script src="../js/jquery.nicescroll.min.js"></script>
	<script src="../js/jquery.magnific-popup.min.js"></script>
	<script src="../js/jquery.countdown.min.js"></script>
	<script src="../js/jquery.slicknav.js"></script>
	<script src="../js/mixitup.min.js"></script>
	<script src="../js/owl.carousel.min.js"></script>
	<script src="../js/main.js"></script>
</body>

</html>