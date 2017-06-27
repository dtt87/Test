package spring.hibernate;

import java.sql.SQLException;

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

}
