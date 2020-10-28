package be.tvt.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import be.tvt.backend.repository.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
    
	@RequestMapping("/test")
	public String test() {
		System.out.println("UserController.test()");
		return "hello";
	}
    
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("UserController.test2()");
		return "hello";
	}
    
	@RequestMapping("/test3")
	public String test3() {
		System.out.println("UserController.test2()");
		System.out.println(userRepository.findAll().size());
		return "hello";
	}

}