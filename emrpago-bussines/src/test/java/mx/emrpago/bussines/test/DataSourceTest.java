package mx.emrpago.bussines.test;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//@Configuration
//@EnableJpaRepositories(basePackages = {"mx.emrpago.bussines.data.repositories"})
//@EntityScan("mx.emrpago.bussines.data.entities*")
//@EnableTransactionManagement
//public class DataSourceTest {
//
//	
//
////	@Value("${DB_HOST}")
//	private String DB_HOST = "127.0.0.1";
////	@Value("${DB_PORT}")
//	private String DB_PORT = "3306";
////	@Value("${DB_USER}")
//	private String DB_USER = "root";
////	@Value("${DB_PASS}")
//	private String DB_PASS = "admin";
//
//	@Bean(name = "dsMysql")
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//	
//
//		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//		dataSource.setUsername(DB_USER);
//		dataSource.setPassword(DB_PASS);
//		dataSource.setUrl("jdbc:mysql://" + DB_HOST + ":" + DB_PORT + "/sol_aplicacion?useSSL=false&allowPublicKeyRetrieval=true&characterEncoding=UTF-8" +
//			                               "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"); 
//
//
//		return dataSource;
//	}
//	
//}
