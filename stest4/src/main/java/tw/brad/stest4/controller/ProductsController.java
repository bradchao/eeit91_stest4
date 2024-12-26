package tw.brad.stest4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.stest4.model.Products;
import tw.brad.stest4.repository.ProductsRepository;
import tw.brad.stest4.repository.Test1;

@RequestMapping("/products")
@Controller
public class ProductsController {
	@Autowired
	private ProductsRepository productsRepository;
	
	@Autowired
	private Test1 test1;
	
	@RequestMapping("/all")
	private String all(Model model) {
//		List<Products> list = productsRepository.findAll();
//		model.addAttribute("list", list);


		if (productsRepository == null) {
			System.out.println("XX");
		}
		
		return "all";
	}
	
	
}
