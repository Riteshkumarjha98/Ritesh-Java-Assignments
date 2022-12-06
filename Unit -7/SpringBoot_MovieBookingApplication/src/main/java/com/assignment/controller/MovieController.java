package com.assignment.controller;

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

import com.assignment.exception.NotFoundException;
import com.assignment.model.Movie;
import com.assignment.services.MovieService;

@RestController
public class MovieController {
	
	@Autowired
  private MovieService MovieService;
	

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
//	public ModelAndView addUser(@RequestParam("user_email") StringMovie_email,MovieMovie)
//	{
//		ModelAndView mv=new ModelAndView("success");
//		List<User> list=UsrService.findByEMAIL(user_email);
//		
//		if(list.size()!=0)
//		{
//		mv.addObject("message", "Oops!  There is already aMovie registered with the email provided.");
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
//	public String login_user(@RequestParam("username") StringMoviename,@RequestParam("password") String password,
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
	
	@PostMapping(value = "/Movie")
	public ResponseEntity<Movie>  createUserHandler(@RequestBody Movie Movie) throws NotFoundException{
	
		Movie e = MovieService.createMovie(Movie);
		return new ResponseEntity<Movie>(e,HttpStatus.CREATED);
		
	}
	
	
	@GetMapping(value = "Movie/{id}")
	public ResponseEntity<Movie> findUserByIdHandler(@PathVariable Integer id) throws NotFoundException{
		
	 Movie foundMovie =	MovieService.findMovieById(id);
	  return new ResponseEntity<Movie>(foundMovie,HttpStatus.ACCEPTED);
	}


	 
	
	@GetMapping("/Movies")
	public List<Movie> getUsers() throws NotFoundException{
	   return this.MovieService.getAllMoviesDetails();
	}
	
	
	 @DeleteMapping(value= "/Movie/{id}")
	 public Movie DeleteMovie(@PathVariable int id) throws NotFoundException {
//		
		 return this.MovieService.DeleteMovie(id);
		 
		 
	 }
	
}
