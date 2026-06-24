package guru.springframework.springDIwebapp;

import guru.springframework.springDIwebapp.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class SpringDIwebappApplicationTests {

	//Spring is autowiring the dependencies
	@Autowired
	ApplicationContext applicationContext;

	@Autowired
	MyController myController;

	@Test
	void testAutowireOfController() {

		System.out.println(myController.sayHello());
	}

	@Test
	void testGetControllerFromCtx() {
		// Spring is injecting the Application context
		MyController myController = applicationContext.getBean(MyController.class);
		System.out.println(myController.sayHello());
	}

	@Test
	void contextLoads() {
	}

}
