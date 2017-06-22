package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the visitor database table.
 * 
 */
@Entity
@NamedQuery(name="Visitor.findAll", query="SELECT v FROM Visitor v")
public class Visitor implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String company;

	@Column(name="company_addr")
	private String companyAddr;

	private String cookieid;

	private String email;

	private String issue;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="operate_time")
	private Date operateTime;

	private String post;

	private String provider;

	private String region;

	private int sequence;

	private String served;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String tel;

	@Column(name="visit_ip")
	private String visitIp;

	public Visitor() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
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

	public String getCookieid() {
		return this.cookieid;
	}

	public void setCookieid(String cookieid) {
		this.cookieid = cookieid;
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

	public String getVisitIp() {
		return this.visitIp;
	}

	public void setVisitIp(String visitIp) {
		this.visitIp = visitIp;
	}

}