package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the loginfo database table.
 * 
 */
@Entity
@NamedQuery(name="Loginfo.findAll", query="SELECT l FROM Loginfo l")
public class Loginfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private LoginfoPK id;

	@Column(name="login_ip")
	private String loginIp;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="logout_time")
	private Date logoutTime;

	private String provider;

	private String region;

	@Column(name="system_time")
	private Timestamp systemTime;

	public Loginfo() {
	}

	public LoginfoPK getId() {
		return this.id;
	}

	public void setId(LoginfoPK id) {
		this.id = id;
	}

	public String getLoginIp() {
		return this.loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLogoutTime() {
		return this.logoutTime;
	}

	public void setLogoutTime(Date logoutTime) {
		this.logoutTime = logoutTime;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public Timestamp getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Timestamp systemTime) {
		this.systemTime = systemTime;
	}

}