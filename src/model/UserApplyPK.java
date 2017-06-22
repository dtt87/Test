package model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the user_apply database table.
 * 
 */
@Embeddable
public class UserApplyPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	private String account;

	@Column(name="product_id")
	private String productId;

	public UserApplyPK() {
	}
	public String getAccount() {
		return this.account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getProductId() {
		return this.productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof UserApplyPK)) {
			return false;
		}
		UserApplyPK castOther = (UserApplyPK)other;
		return 
			this.account.equals(castOther.account)
			&& this.productId.equals(castOther.productId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.account.hashCode();
		hash = hash * prime + this.productId.hashCode();
		
		return hash;
	}
}