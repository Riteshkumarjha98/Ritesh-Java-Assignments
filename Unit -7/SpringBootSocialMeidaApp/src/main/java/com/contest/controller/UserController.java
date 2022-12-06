package com.contest.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.contest.exception.NotFoundException;
import com.contest.model.User;
import com.contest.services.UserService;

@RestController
public class UserController {
	
	@Autowired
  private UserService UsrService;
	

//	@RequestMapping("/")
//	public String home()
//	{
//		return "home";
//	}
//	
//	@RequestMapping("/signup")
//	public String getSignup()
//	{
//		return "signup";
//	}
//	
//	@RequestMapping("/login")
//	public String getLogin()
//	{
//		return "login";
//	}
//	
//	@PostMapping("/addUser")
//	public ModelAndView addUser(@RequestParam("user_email") String user_email, User user)
//	{
//		ModelAndView mv=new ModelAndView("success");
//		List<User> list=UsrService.findByEMAIL(user_email);
//		
//		if(list.size()!=0)
//		{
//		mv.addObject("message", "Oops!  There is already a user registered with the email provided.");
//		
//		}
//		else
//		{
//			UsrService.save(user);
//		mv.addObject("message","User has been successfully registered.");
//		}
//		
//		return mv;
//	}
//	@GetMapping("/dummy")
//	public String dummy()
//	{
//		return "dummy";
//	}
//	
//	@PostMapping("/login")
//	public String login_user(@RequestParam("username") String username,@RequestParam("password") String password,
//			HttpSession session,ModelMap modelMap)
//	{
//		
//	User auser=UsrService.findByUsernamePassword(username, password);
//	
//	if(auser!=null)
//	{
//		String uname=auser.getUser_email();
//		String upass=auser.getUser_pass();
//	
//		if(username.equalsIgnoreCase(uname) && password.equalsIgnoreCase(upass)) 
//		{
//			session.setAttribute("username",username);
//			return "dummy";
//		}
//		else 
//		{
//			modelMap.put("error", "Invalid Account");
//			return "login";
//		}
//	}
//	else
//	{
//		modelMap.put("error", "Invalid Account");
//		return "login";
//	}
//	
//	}
//	
//	@GetMapping(value = "/logout")
//	public String logout_user(HttpSession session)
//	{
//		session.removeAttribute("username");
//		session.invalidate();
//		return "redirect:/login";
//	}
//	
//	
	
	
//============================================================================================================
	
	@PostMapping(value = "/User")
	public ResponseEntity<User>  createUserHandler(@RequestBody User User) throws NotFoundException{
	
		User e = UsrService.createUser(User);
		return new ResponseEntity<User>(e,HttpStatus.CREATED);
		
	}
	
	@GetMapping(value = "User/{id}")
	public ResponseEntity<User> findUserByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	  User foundUser =	UsrService.findUserById(id);
	  return new ResponseEntity<User>(foundUser,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Users")
	public List<User> getUsers() throws NotFoundException{
	   return this.UsrService.getAllUsersDetails();
	}
	
	
	 @DeleteMapping(value= "/User/{id}")
	 public User BlockUser(@PathVariable int id) throws NotFoundException {
//		
		 return this.UsrService.BlockUser(id);
		 
		 
	 }
	
}
