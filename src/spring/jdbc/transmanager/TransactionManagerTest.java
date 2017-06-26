package spring.jdbc.transmanager;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

import spring.jdbc.Employee;

public class TransactionManagerTest {
	
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-JDBC.xml");
	private JdbcTemplate jdbcTemplate  = (JdbcTemplate) ctx.getBean("jdbcTemplate");
	private BookShopDao bookShopDao = (BookShopDao) ctx.getBean("bookShopDao");
	private BookShopService bookShopService = (BookShopService) ctx.getBean("bookShopService");
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testBookShopDaoFindPriceByIsbn(){		
		int price = bookShopDao.findBookPriceByIsbn("1001");
		System.out.println(price);
	}
	
	@Test
	public void testBookShopDaoUpdateBookStock(){
		bookShopDao.updateBookStock("1001");
	}
	
	@Test
	public void testBookShopDaoUpdateUserAccount(){
		bookShopDao.updateUserAccount("AA", 100);
	}
	
	@Test
	public void testPurchase(){
		bookShopService.purchase("AA", "1001");
	}
	
	@Test
	public void testPurchaseMore(){
		Map<String, Integer> bookMap = new LinkedHashMap();
		bookMap.put("1001", 2);
		bookMap.put("1002", 3);	
		for(Entry<String, Integer> book : bookMap.entrySet() ){
			System.out.println( book.getKey() + book.getValue());
			
		}
		bookShopService.purchaseMore("AA", bookMap);
		
	}
}
