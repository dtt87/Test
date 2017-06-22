package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the communication_history database table.
 * 
 */
@Entity
@Table(name="communication_history")
@NamedQuery(name="CommunicationHistory.findAll", query="SELECT c FROM CommunicationHistory c")
public class CommunicationHistory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String account;

	private String company;

	@Column(name="company_addr")
	private String companyAddr;

	private String email;

	private String issue;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="operate_time")
	private Date operateTime;

	private String post;

	private int sequence;

	private String served;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String tel;

	@Column(name="user_ip")
	private String userIp;

	public CommunicationHistory() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompanyAddr() {
		return this.companyAddr;
	}

	public void setCompanyAddr(String companyAddr) {
		this.companyAddr = companyAddr;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIssue() {
		return this.issue;
	}

	public void setIssue(String issue) {
		this.issue = issue;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getOperateTime() {
		return this.operateTime;
	}

	public void setOperateTime(Date operateTime) {
		this.operateTime = operateTime;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public int getSequence() {
		return this.sequence;
	}

	public void setSequence(int sequence) {
		this.sequence = sequence;
	}

	public String getServed() {
		return this.served;
	}

	public void setServed(String served) {
		this.served = served;
	}

	public Timestamp getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Timestamp systemTime) {
		this.systemTime = systemTime;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getUserIp() {
		return this.userIp;
	}

	public void setUserIp(String userIp) {
		this.userIp = userIp;
	}

}