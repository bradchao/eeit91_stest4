package tw.brad.stest4.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import tw.brad.stest4.api.Bike;
import tw.brad.stest4.api.Member;

@Controller
public class BradController {

	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Brad Big Company");
		return "index";
	}
	
	@RequestMapping("/test1")
	public String test1(Model model) {
		Bike b1 = new Bike();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
		model.addAttribute("bike", b1);
		model.addAttribute("lottery", (int)(Math.random()*49+1));
		
		Member member = new Member();
		member.setId(1); member.setAccount("brad"); member.setAge(16);
		model.addAttribute("member", member);
		
		List<Member> list = new LinkedList<Member>();
		list.add(new Member("brad1", 18));
		list.add(new Member("brad2", 12));
		list.add(new Member("brad3",44));
		list.add(new Member("brad4",52));
		model.addAttribute("list", list);
		
		return "page1";
	}
	
}
