package requiredAnnotation;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Lookup
	@Bean(name="p")
	public Student getStudent() {
		return new Student();
	}
	@Bean(name="q")
	public Student getStudent1() {
		return new Student();
	}
}
