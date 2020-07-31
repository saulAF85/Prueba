package mx.emrpago.bussines.conf;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@EnableJpaRepositories(basePackages = {"mx.emrpago.bussines.data.repositories"})
@EntityScan("mx.emrpago.bussines.data.entities")
@EnableTransactionManagement
public class DataSourceApp {

	private String DB_HOST = "127.0.0.1";

	private String DB_PORT = "3306";

	private String DB_USER = "root";

	private String DB_PASS = "admin";
	
	   @Bean
	    public DriverManagerDataSource dataSource() {
	        DriverManagerDataSource dataSource = new DriverManagerDataSource();
	        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
	        dataSource.setUrl("jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/mrpago?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=UTF-8" +
                                                            "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); 
	        dataSource.setUsername(DB_USER);
	        dataSource.setPassword(DB_PASS);
	        dataSource.setSchema("mrpago");
	        return dataSource;
	    }
	
}
