package in.computor.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import in.computor.model.Employee;

@SpringBootApplication
public class ComputorApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ComputorApplication.class, args);
		System.out.println(context.getBean(Employee.class).hashCode());
		
	}
}
