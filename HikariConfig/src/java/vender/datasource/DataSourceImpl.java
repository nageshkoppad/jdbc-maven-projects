package java.vender.datasource;

import java.sql.Connection;

import javax.sql.DataSource;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class DataSourceImpl {

	public static void main(String[] args) {
         HikariConfig confi=new HikariConfig();
         confi.setUsername("root");
         confi.setPassword("Xworkzodc@123");
         confi.setJdbcUrl("jdbc:mysql://localhost:3306/collection");
         confi.setDriverClassName("com.mysql.cj.jdbc.Driver");
         DataSource dataSource=new HikariDataSource();
         
         try {
        	 Connection connection=dataSource.getConnection();
         }catch (Exception e) {
		 e.printStackTrace();
		}

	}

}
