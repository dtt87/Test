package model;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;


/**
 * The persistent class for the codelist_industry database table.
 * 
 */
@Entity
@Table(name="codelist_industry")
@NamedQuery(name="CodelistIndustry.findAll", query="SELECT c FROM CodelistIndustry c")
public class CodelistIndustry implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String uuid;

	private String desc;

	private String key;

	@Column(name="system_time")
	private Timestamp systemTime;

	private String value;

	public CodelistIndustry() {
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getDesc() {
		return this.desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public Timestamp getSystemTime() {
		return this.systemTime;
	}

	public void setSystemTime(Timestamp systemTime) {
		this.systemTime = systemTime;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}