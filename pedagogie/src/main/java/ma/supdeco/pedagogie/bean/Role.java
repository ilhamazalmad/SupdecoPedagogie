package ma.supdeco.pedagogie.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRole;
	private String role;

	@ManyToMany
	@JoinTable(name = "roleUtilisateur", joinColumns = @JoinColumn(name = "idRole"), inverseJoinColumns = @JoinColumn(name = "idUtilisateur"))
	public List<Utilisateur> utilisateurs = new ArrayList<>();

	public Role() {
		super();
	}

	public Role(int idRole, String role) {
		super();
		this.idRole = idRole;
		this.role = role;
	}

	public Role(int idRole, String role, List<Utilisateur> utilisateurs) {
		super();
		this.idRole = idRole;
		this.role = role;
		this.utilisateurs = utilisateurs;
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

	public List<Utilisateur> getUtilisateurs() {
		return utilisateurs;
	}

	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
		this.utilisateurs = utilisateurs;
	}

}
