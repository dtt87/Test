package spring.jdbc.transmanager;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


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

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void purchaseByCount(String username, String isbn, int count) {
		// TODO Auto-generated method stub
		while(count-- > 0){
			purchase(username, isbn);		
		}
	}
	
//	@Transactional(propagation=Propagation.REQUIRES_NEW)
	@Override
	public void purchaseMore(String username, Map<String, Integer> bookMap) {
		// TODO Auto-generated method stub
		for(Entry<String, Integer> book : bookMap.entrySet() ){
			purchaseByCount(username, book.getKey(), book.getValue());
		}
		
	}
		

}
