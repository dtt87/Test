package spring.hibernate.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.BookStockException;
import spring.hibernate.UserAccountException;
import spring.hibernate.dao.BookShopDao;
import spring.hibernate.entities.BookStock;

@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {

	@Autowired
	private SessionFactory sessionFactory;

	private Session getSession() {
		return sessionFactory.getCurrentSession();

	}
	
//	private Transaction tx = getSession().beginTransaction();  

	@Transactional
	@Override
	public int findBookPriceByIsbn(String isbn) {
		// TODO Auto-generated method stub
		// int price = sessionFactory.queryForObject(sql, Integer.class, isbn);
		String hql = "SELECT b.price FROM Book b WHERE b.isbn = ?";
		Query query = getSession().createQuery(hql).setString(0, isbn);
		return (Integer) query.uniqueResult();
	}

	@Transactional
	@Override
	public void updateBookStock(String isbn) {
		// TODO Auto-generated method stub
		String hql2 = "select stock from BookStock where isbn = ?";
		int stock = (int) getSession().createQuery(hql2).setString(0, isbn).uniqueResult();
		// 抛异常并捕获，程序停止运行
		try {
			if (stock < 0) {
				throw (new BookStockException("库存不足！"));
			}
		} catch (BookStockException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

		String hql = "update BookStock set stock = stock-1 where isbn = ?";
		getSession().createQuery(hql).setString(0, isbn).executeUpdate();
		
	}

	@Transactional
	@Override
	public void updateUserAccount(String username, int price) {
		// TODO Auto-generated method stub
		String hql2 = "select balance from Account where username = ?";
		int balance = (int) getSession().createQuery(hql2).setString(0, username).uniqueResult();
		// 抛异常，程序停止
		if (balance - price < 0) {
			throw (new UserAccountException("余额不足"));
		}

		String hql = "update Account set balance = balance - ? where username = ?";
		getSession().createQuery(hql).setInteger(0, price).setString(1, username).executeUpdate();

	}

	@Transactional
	@Override
	public void saveBookStock(Map<Object, Object> map) {
		// TODO Auto-generated method stub
		BookStock bookStock = new BookStock();
		List<BookStock> bookStocks = new ArrayList<BookStock>();
		for (Entry<Object, Object> e : map.entrySet()) {
			bookStock.setIsbn((String) e.getKey());
			bookStock.setStock((int) e.getValue());
			getSession().save(bookStock);
			getSession().flush();						
			getSession().clear();
			
		}
		
	}

}
