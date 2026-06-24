package guru.springframework.springDIwebapp;

import guru.springframework.springDIwebapp.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDIwebappApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringDIwebappApplication.class, args);

		MyController controller = ctx.getBean(MyController.class);
		System.out.println("In the Main method");
		System.out.println(controller.sayHello());
	}

}
