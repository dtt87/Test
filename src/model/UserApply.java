package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the user_apply database table.
 * 
 */
@Entity
@Table(name="user_apply")
@NamedQuery(name="UserApply.findAll", query="SELECT u FROM UserApply u")
public class UserApply implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private UserApplyPK id;

	@Column(name="apply_num")
	private String applyNum;

	public UserApply() {
	}

	public UserApplyPK getId() {
		return this.id;
	}

	public void setId(UserApplyPK id) {
		this.id = id;
	}

	public String getApplyNum() {
		return this.applyNum;
	}

	public void setApplyNum(String applyNum) {
		this.applyNum = applyNum;
	}

}