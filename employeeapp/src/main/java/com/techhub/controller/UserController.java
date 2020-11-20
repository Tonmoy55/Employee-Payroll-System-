package com.techhub.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.techhub.iservice.IUserService;
import com.techhub.model.User;


@Controller
public class UserController {
	
	@Autowired
	private IUserService iUserService;

	@RequestMapping("/home")
	public String Welcome(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME");
		return "welcome";
	}
	
	@RequestMapping("/registration")
	public String Registration(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_REGISTER");
		return "welcome";
	}
	
	@PostMapping("/saveuser")
	public String SaveUser(@ModelAttribute User user,BindingResult BindingResult,HttpServletRequest request) {
		iUserService.saveUser(user);
		request.setAttribute("mode", "MODE_SUCCESS");
		return "welcome";
	}
	
	
	@RequestMapping("/show-all-users")
	public String ShowAllusers(HttpServletRequest request) {
		request.setAttribute("users", iUserService.showAllUsers());
		request.setAttribute("mode", "SHOW_ALL_USERS");
		return "welcome";
	}
	
	@RequestMapping("/delete-user")
	public String DeleteUser(@RequestParam int id,HttpServletRequest request) {
		iUserService.deleteUser(id);
		request.setAttribute("users", iUserService.showAllUsers());
		request.setAttribute("mode", "SHOW_ALL_USERS");
		return "welcome";
	}
	
	@RequestMapping("/edit-user")
	public String editUser(@RequestParam int id,HttpServletRequest request) {
		request.setAttribute("user", iUserService.editUser(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "welcome";
	}
	
	@PostMapping("/updateuser")
	public String updateUser(@ModelAttribute User user,BindingResult BindingResult,HttpServletRequest request) {
		iUserService.saveUser(user);
		request.setAttribute("mode", "MODE_UPDATE_SUCCESS");
		return "welcome";
	}
	
	
	@RequestMapping("/login")
	public String login(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_LOGIN");
		return "welcome";
	}
	
	@RequestMapping ("/login-user")
	public String loginUser(@ModelAttribute User user, HttpServletRequest request) {
		if(iUserService.findByUsernameAndPassword(user.getUsername(), user.getPassword())!=null) {
			request.setAttribute("mode", "MODE_HOME_LOGGEDIN");
			return "homepage";
		}
		else {
			request.setAttribute("error", "Invalid Username or Password");
			request.setAttribute("mode", "MODE_LOGIN");
			return "welcomepage";
			
		}
	}
	
	@RequestMapping("/home-loggedin")
	public String homeLoggedin(HttpServletRequest request) {
		request.setAttribute("mode", "MODE_HOME_LOGGEDIN");
		return "homepage";
	}
	
	
	
}
