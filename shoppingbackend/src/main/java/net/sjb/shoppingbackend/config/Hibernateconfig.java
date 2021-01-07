package net.sjb.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "net.sjb.shoppingbackend.dto" })
@EnableTransactionManagement
public class Hibernateconfig {

	// JDBC driver name and database URL
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/onlineshopping";
	static final String DIALECT = "org.hibernate.dialect.MySQLDialect";

	// Database credentials
	static final String USER = "joseph";
	static final String PASS = "joseph12345";

	// dataSource bean creating
	@Bean
	public DataSource getDataSource() {

		BasicDataSource dataSource = new BasicDataSource();

		// database connection information
		dataSource.setDriverClassName(JDBC_DRIVER);
		dataSource.setUrl(DB_URL);
		dataSource.setUsername(USER);
		dataSource.setPassword(PASS);

		return dataSource;
	}

	// sessionFatory bean creating
	@Bean
	   public SessionFactory getSessionFactory(DataSource dataSource) {
		   
		   LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(dataSource);
		   
		   	builder.addProperties(getHibernateproperties());
		   	builder.scanPackages("net.sjb.shoppingbackend.dto" );
		   
		   return builder.buildSessionFactory();
		   
	   }

	// all hibernate properties will be returned in this method
	private Properties getHibernateproperties() {
		
		Properties properties = new Properties();
		properties.put("hibernate.dialect", DIALECT);
		properties.put("hibernate.show_sql", "true");
		properties.put("hibernate.format_sql", "true");

		return null;
	}
	
	//TransactionManager Bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
	}
	
}
