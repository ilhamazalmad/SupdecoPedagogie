package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rubriqueProfesseurEnregistree")

public class RubriqueProfesseurEnregistree {
	   public RubriqueProfesseurEnregistree() {
		super();
	}
	public RubriqueProfesseurEnregistree(int idRubriqueEnregistree, int nbrHeures, Date date, int idRubriqueProf) {
		super();
		this.idRubriqueEnregistree = idRubriqueEnregistree;
		this.nbrHeures = nbrHeures;
		this.date = date;
		this.idRubriqueProf = idRubriqueProf;
	}
	private int idRubriqueEnregistree;
	   private int nbrHeures;
	   private Date date;
	   private int idRubriqueProf;
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
	public int getIdRubriqueProf() {
		return idRubriqueProf;
	}
	public void setIdRubriqueProf(int idRubriqueProf) {
		this.idRubriqueProf = idRubriqueProf;
	}

}
