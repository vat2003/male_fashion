package com.asm1.demo01.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.converters.DateConverter;
import org.apache.commons.beanutils.converters.DateTimeConverter;
import org.apache.commons.lang3.RandomStringUtils;
import org.eclipse.tags.shaded.org.apache.bcel.generic.NEW;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.annotation.SessionScope;

import com.asm1.demo01.DAO.UsersDao;
import com.asm1.demo01.Service.SessionService;
import com.asm1.demo01.Ultis.EditProfileFormValidator;
import com.asm1.demo01.Ultis.LoginFormValidator;
import com.asm1.demo01.Ultis.SignUpFormValidator;
import com.asm1.demo01.model.Users;

@SessionScope
@Controller
@Configuration
@RequestMapping("asm")
public class UserController {
	@Autowired
	UsersDao usersDao;
	@Autowired
	SessionService ss;
	@Autowired
	JavaMailSender javaMailSender;

	String pinCode;

	@RequestMapping("login")
	public String setupLogin(Model model) {

		model.addAttribute("user_login", new Users());
		model.addAttribute("user_signup", new Users());
		return "login_signup";
	}

	@PostMapping("/account/loginPost")
	public String Login(@ModelAttribute("user_login") @Validated Users user_login, Errors errors, Model model) {
		List<Users> list = usersDao.findAll();

		System.out.println(user_login.getEmail());
		System.out.println(user_login.getPasswords());
		model.addAttribute("user_signup", new Users());// để cho khỏi lỗi form đăng ký

		if (errors.hasFieldErrors("email") || errors.hasFieldErrors("passwords")) {
			return "login_signup";
		}
		
	
		
		

		for (Users item : list) {
			if (item.getEmail().equals(user_login.getEmail())
					&& item.getPasswords().equals(user_login.getPasswords())) {
				ss.set("email", item);
				
				return "redirect:/asm/index";
			}
			
		}
		
		model.addAttribute("bug","The email or the password isn't correct");
		
		
		
		return "login_signup";
	}

	@PostMapping("/account/createAcc")
	public String createAcc(@ModelAttribute("user_signup") @Validated Users user_signup, Errors errors, Model model,
			@RequestParam("re_passwords") String re_passwords) {
		model.addAttribute("user_login", new Users());
		System.out.println(user_signup);
		if (re_passwords=="") {
			model.addAttribute("msg", "Please enter repassword");
		}
		if (!errors.hasFieldErrors("email") && !errors.hasFieldErrors("passwords")
				&& !errors.hasFieldErrors("fullname")) {
			if (!user_signup.getPasswords().equals(re_passwords)) {
				// báo lỗi nếu re_pass sai
				model.addAttribute("msg", "The password and repassword doesn't match");

			} else {
				user_signup.setAddress("no address");
				user_signup.setPhoneNum("no phone number");

				usersDao.save(user_signup);
			}
		} 

		return "login_signup";
	}

	@RequestMapping("profile")
	public String profile(Model model) {
		Users user = ss.get("email");
		System.out.println(user);
		if (user == null) {
			user = new Users();
		}
		model.addAttribute("user_profile", user);
		return "profile";
	}

	@PostMapping("/account/profile/{id}")
	public String editprofile(Model model, @ModelAttribute("user_profile") @Validated Users user_profile, Errors errors,
			@PathVariable("id") Integer id) {
		System.out.println(id);
		user_profile.setUserID(id);
		if (!errors.hasFieldErrors("email") && !errors.hasFieldErrors("address") && !errors.hasFieldErrors("fullname")
				&& !errors.hasFieldErrors("phoneNum")) {

			// Lấy thông tin người dùng từ cơ sở dữ liệu
			Users user = usersDao.findById(user_profile.getUserID()).orElse(null);

			// Kiểm tra xem người dùng có tồn tại không
			if (user == null) {
				// Xử lý trường hợp người dùng không tồn tại
				return "redirect:/error"; // Hoặc bất kỳ trang lỗi nào bạn muốn
			}

			// Cập nhật thông tin người dùng
			user.setAddress(user_profile.getAddress());
			user.setEmail(user_profile.getEmail());
			user.setPhoneNum(user_profile.getPhoneNum());
			System.out.println(user_profile.getBirthday() + "sinh nhat");
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

			try {
				java.util.Date parsedDate = dateFormat.parse(user_profile.getBirthday() + "");
				java.sql.Date sqlDate = new java.sql.Date(parsedDate.getTime());
				user.setBirthday(sqlDate);
			} catch (ParseException e) {
				System.out.println(e);
			}

			user.setFullname(user_profile.getFullname());
			usersDao.save(user);
			model.addAttribute("user", user);

		}
		
		else {
			model.addAttribute("bug","Cập nhật thất bại!");
		}

		return "profile";
	}

	@RequestMapping("email")
	public String getPW() {
		return "forgotPass_1";
	}

	@RequestMapping("forgotPass_2")
	public String getCode() {
		return "forgotPass_2";
	}

	@RequestMapping("forgotPass_3")
	public String getChange() {
		return "forgotPass_3";
	}

	@PostMapping("/email/getpass")
	public String forgotPass_1(@RequestParam("email") String email, Model model) {
		if (email.equals("") || email == null) {
			model.addAttribute("msg", "Please enter your email!");
			return "forgotPass_1";
		}
		List<Users> list = usersDao.findAll();
		for (Users item : list) {
			if (item.getEmail().equals(email)) {
				ss.set("pw", item);
				sendPinCode(email);
				model.addAttribute("msg", "Please checking your email!");
				return "redirect:/asm/forgotPass_2";
			} else {
				model.addAttribute("msg", "The email address you entered isn't connected to an account.");
			}
		}
		return "forgotPass_1";
	}

	@PostMapping("/email/forgotPass_2")
	public String checkCode(@RequestParam("code") String code, Model model) {
		if (code.equals("") || code == null) {
			model.addAttribute("msg", "Enter Auth Code");
			return "forgotPass_2";
		}
		if (code.equals(pinCode)) {
			return "redirect:/asm/forgotPass_3";
		}
		model.addAttribute("msg", "Authentication code is incorrect");
		return "forgotPass_2";
	}

	@PostMapping("/email/forgotPass_3")
	public String checkCode(@RequestParam("pw") String pw, @RequestParam("repw") String repw, Model model) {
		boolean kt = true;

		if (pw == null || pw.isEmpty() || pw.equals("")) {
			model.addAttribute("msg_pw", "Please enter your new password");
			kt = false;
		}

		if (repw == null || repw.isEmpty() || pw.equals("")) {
			model.addAttribute("msg_repw", "Please confirm your new password");
			kt = false;
		}
		if (!kt) {
			return "forgotPass_3";
		}

		Users user = ss.get("pw");
		if (pw.equals(repw)) {
			user.setPasswords(pw);
			usersDao.save(user);
			return "redirect:/asm/login";
		} else {
			model.addAttribute("msg_repw", "Confirmation password is incorrect");
			return "forgotPass_3";
		}

	}

	public void sendPinCode(String toEmail) {
		pinCode = RandomStringUtils.randomNumeric(6);

		// Tạo đối tượng SimpleMailMessage để cấu hình email
		SimpleMailMessage mailMessage = new SimpleMailMessage();
		mailMessage.setTo(toEmail);
		mailMessage.setSubject("Mã Pin Xác Thực");
		mailMessage.setText("Mã Pin của bạn là: " + pinCode);

		javaMailSender.send(mailMessage);
	}

}
