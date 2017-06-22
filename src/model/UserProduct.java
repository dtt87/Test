package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the user_product database table.
 * 
 */
@Entity
@Table(name="user_product")
@NamedQuery(name="UserProduct.findAll", query="SELECT u FROM UserProduct u")
public class UserProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String product;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String upid;

	public UserProduct() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getProduct() {
		return this.product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Timestamp getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Timestamp systemTime) {
		this.systemTime = systemTime;
	}

	public String getUpid() {
		return this.upid;
	}

	public void setUpid(String upid) {
		this.upid = upid;
	}

}