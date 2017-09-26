//package org.openpaas.servicebroker.mysql.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.env.Environment;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import java.net.UnknownHostException;
//
//@Configuration
//@PropertySource("classpath:datasource.properties")
////@PropertySources(value = {@PropertySource("classpath:/datasource.properties")})
//public class MysqlConfig {
//
////	@Value("${jdbc.driver}")
////	private String jdbcDriver;
//
//	@Autowired
//	private Environment env;
////	@Bean
////	public PropertyPlaceholderConfigurer properties() {
////		PropertyPlaceholderConfigurer propertyPlaceholderConfigurer = new PropertyPlaceholderConfigurer();
////		Resource[] resources = new ClassPathResource[] {
////				new ClassPathResource("mysql.properties")
////		};
////		propertyPlaceholderConfigurer.setLocations(resources);
////		propertyPlaceholderConfigurer.setIgnoreUnresolvablePlaceholders(true);
////		return propertyPlaceholderConfigurer;
////	}
//
//	@Bean
//	public JdbcTemplate jdbcTemplate() throws UnknownHostException {
//		return new JdbcTemplate();
//	}
//
//	//@Override
//	@Bean
//    public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
////		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		dataSource.setDriverClassName(env.getRequiredProperty("jdbc.driver"));
//		dataSource.setUrl("");
//		dataSource.setUsername("");
//		dataSource.setPassword("");
////
//		return dataSource;
//        // instantiate, configure and return DataSource
//    }
//
//}
