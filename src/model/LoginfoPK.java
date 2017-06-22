package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the loginfo database table.
 * 
 */
@Embeddable
public class LoginfoPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String account;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="login_time")
	private java.util.Date loginTime;

	public LoginfoPK() {
	}
	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public java.util.Date getLoginTime() {
		return this.loginTime;
	}
	public void setLoginTime(java.util.Date loginTime) {
		this.loginTime = loginTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof LoginfoPK)) {
			return false;
		}
		LoginfoPK castOther = (LoginfoPK)other;
		return 
			this.account.equals(castOther.account)
			&& this.loginTime.equals(castOther.loginTime);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.account.hashCode();
		hash = hash * prime + this.loginTime.hashCode();
		
		return hash;
	}
}