package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rubriqueProfesseur")
public class RubriqueProfesseur implements Serializable{
	public RubriqueProfesseur() {
		super();
	}
	public RubriqueProfesseur(int idRubrique, String rubrique, int idTaux, int idProfesseur, int idNiveau) {
		super();
		this.idRubrique = idRubrique;
		this.rubrique = rubrique;
		this.idTaux = idTaux;
		this.idProfesseur = idProfesseur;
		this.idNiveau = idNiveau;
	}
	private int idRubrique;
	   private String rubrique;
	   private int idTaux;
	   private int idProfesseur;
	   private int idNiveau;
	public int getIdRubrique() {
		return idRubrique;
	}
	public void setIdRubrique(int idRubrique) {
		this.idRubrique = idRubrique;
	}
	public String getRubrique() {
		return rubrique;
	}
	public void setRubrique(String rubrique) {
		this.rubrique = rubrique;
	}
	public int getIdTaux() {
		return idTaux;
	}
	public void setIdTaux(int idTaux) {
		this.idTaux = idTaux;
	}
	public int getIdProfesseur() {
		return idProfesseur;
	}
	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
	}
	public int getIdNiveau() {
		return idNiveau;
	}
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}
}
