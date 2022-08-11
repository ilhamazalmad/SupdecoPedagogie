package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idUtilisateur;
	private String nom;
	private String prenom;
	private String motDePasse;
	private boolean active;

	public java.util.Collection<RoleUtilisateur> roleUtilisateur;

	public Utilisateur() {
		super();
	}

	public Utilisateur(int idUtilisateur, String nom, String prenom, String motDePasse, boolean active,
			Collection<RoleUtilisateur> roleUtilisateur) {
		super();
		this.idUtilisateur = idUtilisateur;
		this.nom = nom;
		this.prenom = prenom;
		this.motDePasse = motDePasse;
		this.active = active;
		this.roleUtilisateur = roleUtilisateur;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<RoleUtilisateur> getRoleUtilisateur() {
		if (roleUtilisateur == null)
			roleUtilisateur = new java.util.HashSet<RoleUtilisateur>();
		return roleUtilisateur;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorRoleUtilisateur() {
		if (roleUtilisateur == null)
			roleUtilisateur = new java.util.HashSet<RoleUtilisateur>();
		return roleUtilisateur.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newRoleUtilisateur
	 */
	public void setRoleUtilisateur(java.util.Collection<RoleUtilisateur> newRoleUtilisateur) {
		removeAllRoleUtilisateur();
		for (java.util.Iterator iter = newRoleUtilisateur.iterator(); iter.hasNext();)
			addRoleUtilisateur((RoleUtilisateur) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newRoleUtilisateur
	 */
	public void addRoleUtilisateur(RoleUtilisateur newRoleUtilisateur) {
		if (newRoleUtilisateur == null)
			return;
		if (this.roleUtilisateur == null)
			this.roleUtilisateur = new java.util.HashSet<RoleUtilisateur>();
		if (!this.roleUtilisateur.contains(newRoleUtilisateur))
			this.roleUtilisateur.add(newRoleUtilisateur);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldRoleUtilisateur
	 */
	public void removeRoleUtilisateur(RoleUtilisateur oldRoleUtilisateur) {
		if (oldRoleUtilisateur == null)
			return;
		if (this.roleUtilisateur != null)
			if (this.roleUtilisateur.contains(oldRoleUtilisateur))
				this.roleUtilisateur.remove(oldRoleUtilisateur);
	}

	/** @pdGenerated default removeAll */
	public void removeAllRoleUtilisateur() {
		if (roleUtilisateur != null)
			roleUtilisateur.clear();
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

}
