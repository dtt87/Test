package spring.jpa.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import spring.hibernate.dao.BookShopDao;
import spring.hibernate.service.BookShopService;


@Service("bookShopService")
public class BookShopServiceImpl implements BookShopService {
	
	@Autowired
	private BookShopDao bookShopDao;
	
	@Transactional
	@Override
	public void purchase(String username, String isbn) {
		// TODO Auto-generated method stub
		int price = bookShopDao.findBookPriceByIsbn(isbn);
		
		bookShopDao.updateBookStock(isbn);
		
		bookShopDao.updateUserAccount(username, price);
	}
	
	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void purchaseByIsbn(String username, List<String> isbns) {
		// TODO Auto-generated method stub
		for(String isbn : isbns){
			purchase(username, isbn);
		}		
	}

	@Transactional
	@Override
	public void purchaseByCount(String username, String isbn, int count) {
		// TODO Auto-generated method stub
		while(count-- > 0){
			purchase(username, isbn);		
		}
	}
	
	/**
	 * 买书，不同书，数量不同
	 * bookMap = {1001: 2, 1002: 3}
	 */
//	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void purchaseMore(String username, Map<String, Integer> bookMap) {
		// TODO Auto-generated method stub
		for(Entry<String, Integer> book : bookMap.entrySet() ){
//			System.out.println( book.getKey() + book.getValue());
			purchaseByCount(username, book.getKey(), book.getValue());
		}
		
	}
		

}
