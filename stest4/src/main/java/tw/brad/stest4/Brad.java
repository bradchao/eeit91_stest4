package tw.brad.stest4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.brad.stest4.model.Products;
import tw.brad.stest4.repository.ProductsRepository;
import tw.brad.stest4.repository.Test1;

@RequestMapping("/brad")
@RestController
public class Brad {

	@Autowired
	private ProductsRepository productsRepository;

	@Autowired
	private Test1 test1;
	
	

	@RequestMapping("/test1")
	public void test1() {
		if (productsRepository == null) {
			System.out.println("null");
		}else {
			List<Products> list = productsRepository.findAll();
			System.out.println(list.size());
		}
		
	}
	
}
