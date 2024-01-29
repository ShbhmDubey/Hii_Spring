package AnnotationDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
     @Bean(name="e")
	public Employee getEmployee() {
		return new Employee();
	}
     @Bean(name="c")
     public Company getCompany() {
    	 return new Company();
     }
	
}
