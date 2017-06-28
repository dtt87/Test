package spring.hibernate;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.hibernate.dao.BookShopDao;
import spring.hibernate.service.BookShopService;


public class SpringHibernateTest {
	
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-Hibernate.xml");
	private BookShopService bookShopService = (BookShopService) ctx.getBean("bookShopService");
	private BookShopDao bookShopDao = (BookShopDao) ctx.getBean("bookShopDao");
	
	@Test
	public void testConnection() throws SQLException{
		DataSource dataSource = (DataSource) ctx.getBean("dataSource");
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testFindBookPriceByIsbn(){
		int price = bookShopDao.findBookPriceByIsbn("1001");
		System.out.println(price);
	}
	
	@Test
	public void testUpdateBookStock(){
		bookShopDao.updateBookStock("1001");
	}
	
	@Test
	public void testUpdateUserAccount(){
		bookShopDao.updateUserAccount("AA", 100);
	}
	
	@Test
	public void testPurchase(){
		bookShopService.purchase("AA", "1001");
	}
	
	@Test 
	public void testPurchaseMore(){
		Map<String, Integer> book = new LinkedHashMap<>();
		book.put("1001", 1);
		book.put("1002", 2);
		bookShopService.purchaseMore("AA", book);
	}
	
	@Test
	public void testSaveBookStock(){
		Map<Object, Object> map = new HashMap<>();
		map.put("1003", 3);
		map.put("1002", 2);
		bookShopDao.saveBookStock(map);
	}
	
}
