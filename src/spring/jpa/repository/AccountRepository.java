package spring.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import spring.jpa.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	
	@Modifying
	@Query(value = "update Account set balance = balance - price where username = :username")
	public void updateAccount(@Param(value = "price") int price, @Param(value = "username") String usename);

}
