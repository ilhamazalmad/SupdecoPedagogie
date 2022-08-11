package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tauxProfesseur")
public class TauxProfesseur implements Serializable{
	   public TauxProfesseur() {
		super();
	}
	public TauxProfesseur(int idTaux, float taux, int idNiveau, int idProfesseur, int idTypeSeance) {
		super();
		this.idTaux = idTaux;
		this.taux = taux;
		this.idNiveau = idNiveau;
		this.idProfesseur = idProfesseur;
		this.idTypeSeance = idTypeSeance;
	}
	private int idTaux;
	   private float taux;
	   private int idNiveau;
	   private int idProfesseur;
	   private int idTypeSeance;
	public int getIdTaux() {
		return idTaux;
	}
	public void setIdTaux(int idTaux) {
		this.idTaux = idTaux;
	}
	public float getTaux() {
		return taux;
	}
	public void setTaux(float taux) {
		this.taux = taux;
	}
	public int getIdNiveau() {
		return idNiveau;
	}
	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}
	public int getIdProfesseur() {
		return idProfesseur;
	}
	public void setIdProfesseur(int idProfesseur) {
		this.idProfesseur = idProfesseur;
	}
	public int getIdTypeSeance() {
		return idTypeSeance;
	}
	public void setIdTypeSeance(int idTypeSeance) {
		this.idTypeSeance = idTypeSeance;
	}

}
