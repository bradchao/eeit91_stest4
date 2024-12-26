package tw.brad.stest4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class Stest4Application {

	public static void main(String[] args) {
		SpringApplication.run(Stest4Application.class, args);
	}

}
