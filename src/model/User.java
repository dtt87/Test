package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the user database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String account;

	@Column(name="age_size")
	private String ageSize;

	@Column(name="career_status")
	private String careerStatus;

	private String city;

	private String industry;

	private String mail;

	private String mobile;

	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="operate_time")
	private Date operateTime;

	@Column(name="org_name")
	private String orgName;

	@Column(name="org_size")
	private String orgSize;

	private String password;

	private String post;

	private String pwdtype;

	private String sex;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String tel;

	private String type;

	public User() {
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getAgeSize() {
		return this.ageSize;
	}

	public void setAgeSize(String ageSize) {
		this.ageSize = ageSize;
	}

	public String getCareerStatus() {
		return this.careerStatus;
	}

	public void setCareerStatus(String careerStatus) {
		this.careerStatus = careerStatus;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getIndustry() {
		return this.industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getMail() {
		return this.mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
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

	public String getOrgName() {
		return this.orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getOrgSize() {
		return this.orgSize;
	}

	public void setOrgSize(String orgSize) {
		this.orgSize = orgSize;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPost() {
		return this.post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getPwdtype() {
		return this.pwdtype;
	}

	public void setPwdtype(String pwdtype) {
		this.pwdtype = pwdtype;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
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

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

}