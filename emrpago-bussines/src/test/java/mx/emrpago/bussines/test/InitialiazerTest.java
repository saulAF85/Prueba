package mx.emrpago.bussines.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@Configuration
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@SpringBootApplication
@ComponentScans(value = {
		@ComponentScan(value = "mx.emrpago.bussines"),
		@ComponentScan(value = "mx.emrpago.bussines.conf"),
		@ComponentScan(value = "mx.emrpago.bussines.converter"),
		@ComponentScan(value = "mx.emrpago.bussines.data"), 
		@ComponentScan(value = "mx.emrpago.bussines.data.entities"),
		@ComponentScan(value = "mx.emrpago.bussines.data.repositories")
		})
@EnableJpaRepositories(basePackages = {"mx.emrpago.bussines.data.repositories"})
@EntityScan("mx.emrpago.bussines.data.entities")
public class InitialiazerTest {

	
	public static void main(String[] args) {
		SpringApplication.run(InitialiazerTest.class, args);
	}
}
