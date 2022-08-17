package ma.supdeco.pedagogie.bean;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private String motDePasse;
	private boolean active;

	@ManyToMany
	@JoinTable(name = "roleUtilisateur", joinColumns = @JoinColumn(name = "idUtilisateur"), inverseJoinColumns = @JoinColumn(name = "idRole"))
	private List<Role> roles;

	public Utilisateur() {
		super();
	}

	public Utilisateur(int idUtilisateur, String nom, String prenom, String motDePasse, boolean active,
			List<Role> roles) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.active = active;
		this.roles = roles;
	}

	public int getIdUtilisateur() {
		return idUtilisateur;
	}

	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

}
