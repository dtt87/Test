package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the visitor_product database table.
 * 
 */
@Entity
@Table(name="visitor_product")
@NamedQuery(name="VisitorProduct.findAll", query="SELECT v FROM VisitorProduct v")
public class VisitorProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String product;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String vpid;

	public VisitorProduct() {
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

	public String getVpid() {
		return this.vpid;
	}

	public void setVpid(String vpid) {
		this.vpid = vpid;
	}

}