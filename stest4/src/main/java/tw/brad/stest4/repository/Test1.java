package tw.brad.stest4.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tw.brad.stest4.model.Products;

@Repository
public interface Test1 extends JpaRepository<Products, Integer>{

}
