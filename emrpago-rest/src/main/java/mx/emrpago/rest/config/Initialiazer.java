package mx.emrpago.rest.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;


@Configuration
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@ComponentScans(value = {
	    @ComponentScan(value = "mx.emrpago.*"),
		@ComponentScan(value = "mx.emrpago.bussines"),
		@ComponentScan(value = "mx.emrpago.bussines.conf"),
		@ComponentScan(value = "mx.emrpago.bussines.converter"),
		@ComponentScan(value = "mx.emrpago.bussines.data"), 
		@ComponentScan(value = "mx.emrpago.bussines.data.entities"),
		@ComponentScan(value = "mx.emrpago.bussines.data.repositories"),
		@ComponentScan(value = "mx.emrpago.rest.controller")
		})
public class Initialiazer extends SpringBootServletInitializer {

	Initialiazer(){
		
		System.out.println("====================================");
		
	}
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
	    return builder.sources(Initialiazer.class);
	  }
	
	
	public static void main(String[] args) {
		SpringApplication.run(Initialiazer.class, args);
	}
}
