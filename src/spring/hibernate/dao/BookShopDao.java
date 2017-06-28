package spring.hibernate.dao;

import java.util.Map;

public interface BookShopDao {
	
	public int findBookPriceByIsbn(String isbn);
	
	public void updateBookStock(String isbn);
	
	public void updateUserAccount(String username, int price);
	
	public void saveBookStock(Map <Object, Object> map);
}
