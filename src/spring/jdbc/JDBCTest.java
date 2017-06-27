package spring.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;



public class JDBCTest {
	
	private ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-JDBC.xml");
	private JdbcTemplate jdbcTemplate  = (JdbcTemplate) ctx.getBean("jdbcTemplate");
	private EmployeeDao employeeDao = (EmployeeDao) ctx.getBean("employeeDaoImpl");
	
	@Test
	public void testDataSource() throws SQLException {
		DataSource dataSource = ctx.getBean(DataSource.class);
		System.out.println(dataSource.getConnection());
	}
	
	@Test
	public void testUpdate(){
		String sql = "UPDATE employees SET last_name = ? WHERE id = ?";
		jdbcTemplate.update(sql, "Jack", 1);
	}
	
	@Test
	public void testBatchUpdate(){
		
		String sql = "insert into employees (last_name, email, dept_id) values (?,?,?)";
		
		List<Object[]> batchArgs = new ArrayList<>();
		batchArgs.add(new Object[]{"AA", "aa@atguigu.com", 1});
		batchArgs.add(new Object[]{"BB", "bb@guigu.com", 2});
		
		jdbcTemplate.batchUpdate(sql, batchArgs);
		
	}
	
	@Test
	public void testQueryForObject(){
		String sql = "SELECT id, last_name lastName, email, dept_id as \"department.id\" FROM employees WHERE id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<>(Employee.class);
		Employee employee = jdbcTemplate.queryForObject(sql, rowMapper, 1);
		
		System.out.println(employee);
	}
	
	@Test
	public void testEmployeeDao(){
		
		System.out.println(employeeDao.get(1));
	}
	
	
}
