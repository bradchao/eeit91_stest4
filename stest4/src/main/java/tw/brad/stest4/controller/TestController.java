package tw.brad.stest4.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

	@RequestMapping("/test1")
	public void test1() {
		System.out.println("test1()");
	}
	
	@GetMapping("/test2")
	public void test2(@RequestParam int a) {
		System.out.println("test2()");
	}
	
}
