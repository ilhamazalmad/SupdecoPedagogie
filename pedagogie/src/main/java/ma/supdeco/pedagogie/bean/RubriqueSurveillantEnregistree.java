package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rubriqueSurveillantEnregistree")

public class RubriqueSurveillantEnregistree {
	   public RubriqueSurveillantEnregistree() {
		super();
	}
	public RubriqueSurveillantEnregistree(int idRubriqueEnregistree, int nbrHeures, Date date,
			int idRubriqueSurveillant) {
		super();
		this.idRubriqueEnregistree = idRubriqueEnregistree;
		this.nbrHeures = nbrHeures;
		this.date = date;
		this.idRubriqueSurveillant = idRubriqueSurveillant;
	}
	private int idRubriqueEnregistree;
	   private int nbrHeures;
	   private Date date;
	   private int idRubriqueSurveillant;
	public int getIdRubriqueEnregistree() {
		return idRubriqueEnregistree;
	}
	public void setIdRubriqueEnregistree(int idRubriqueEnregistree) {
		this.idRubriqueEnregistree = idRubriqueEnregistree;
	}
	public int getNbrHeures() {
		return nbrHeures;
	}
	public void setNbrHeures(int nbrHeures) {
		this.nbrHeures = nbrHeures;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public int getIdRubriqueSurveillant() {
		return idRubriqueSurveillant;
	}
	public void setIdRubriqueSurveillant(int idRubriqueSurveillant) {
		this.idRubriqueSurveillant = idRubriqueSurveillant;
	}

}
