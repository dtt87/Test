package spring.hibernate.service;

import java.util.List;
import java.util.Map;

public interface BookShopService {
	
	public void purchase(String username, String isbn);
	
	public void purchaseByIsbn(String username, List<String> isbns);
	
	public void purchaseByCount(String username, String isbn, int count);
	
	public void purchaseMore(String username, Map<String, Integer> book);
	
}
