package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rubriqueProfesseurAnnee")

public class RubriqueProfesseurAnnee {
	 public RubriqueProfesseurAnnee() {
		super();
	}
	private int idRubriqueAnnee;
	   private int idRubrique;
	   private int idAnnee;
	public int getIdRubriqueAnnee() {
		return idRubriqueAnnee;
	}
	public void setIdRubriqueAnnee(int idRubriqueAnnee) {
		this.idRubriqueAnnee = idRubriqueAnnee;
	}
	public int getIdRubrique() {
		return idRubrique;
	}
	public void setIdRubrique(int idRubrique) {
		this.idRubrique = idRubrique;
	}
	public int getIdAnnee() {
		return idAnnee;
	}
	public void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
	}
}
