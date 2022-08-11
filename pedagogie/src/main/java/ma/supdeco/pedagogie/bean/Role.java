package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")

public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRole;
	private String role;

	public Role() {
		super();
	}

	public Role(int idRole, String role) {
		super();
		this.idRole = idRole;
		this.role = role;
	}

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

}
