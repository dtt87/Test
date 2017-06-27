package spring.jdbc.transmanager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository("bookShopDao")
public class BookShopDaoImpl implements BookShopDao {
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int findBookPriceByIsbn(String isbn) {
		// TODO Auto-generated method stub
		
		String sql = "SELECT price FROM book WHERE isbn=?";
		int price = jdbcTemplate.queryForObject(sql, Integer.class, isbn);
		return price;
	}

	@Override
	public void updateBookStock(String isbn) {
		// TODO Auto-generated method stub
		String sql2 = "select stock from book_stock where isbn = ?";
		int stock = jdbcTemplate.queryForObject(sql2, Integer.class, isbn);
		//抛异常并捕获，程序停止运行
		try {
			if( stock < 0) {
				throw (new BookStockException("库存不足！"));
			}
		} catch (BookStockException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		String sql = "update book_stock set stock = stock-1 where isbn = ?";
		jdbcTemplate.update(sql, isbn);

	}

	@Override
	public void updateUserAccount(String username, int price) {
		// TODO Auto-generated method stub
		String sql2 = "select balance from account where username = ?";
		int balance = jdbcTemplate.queryForObject(sql2, Integer.class, username);
		//抛异常，程序停止
		if(balance - price < 0) {
			throw (new UserAccountException("余额不足"));
		}
						
		String sql = "update account set balance = balance - ? where username = ?";
		jdbcTemplate.update(sql, price, username);

	}

}
