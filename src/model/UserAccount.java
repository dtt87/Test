package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_account database table.
 * 
 */
@Entity
@Table(name="user_account")
@NamedQuery(name="UserAccount.findAll", query="SELECT u FROM UserAccount u")
public class UserAccount implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="other_account")
	private String otherAccount;

	@Column(name="account_type")
	private String accountType;

	@Column(name="primary_account")
	private String primaryAccount;

	private String status;

	@Column(name="system_time")
	private Timestamp systemTime;

	public UserAccount() {
	}

	public String getOtherAccount() {
		return this.otherAccount;
	}

	public void setOtherAccount(String otherAccount) {
		this.otherAccount = otherAccount;
	}

	public String getAccountType() {
		return this.accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getPrimaryAccount() {
		return this.primaryAccount;
	}

	public void setPrimaryAccount(String primaryAccount) {
		this.primaryAccount = primaryAccount;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Timestamp systemTime) {
		this.systemTime = systemTime;
	}

}