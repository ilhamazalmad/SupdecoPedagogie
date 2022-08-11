package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rubriqueSurveillant")

public class RubriqueSurveillant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idRubrique;
	private String rubrique;
	private int idTaux;
	private int idSurveillant;

	public RubriqueSurveillant() {
		super();
	}

	public RubriqueSurveillant(int idRubrique, String rubrique, int idTaux, int idSurveillant) {
		super();
		this.idRubrique = idRubrique;
		this.rubrique = rubrique;
		this.idTaux = idTaux;
		this.idSurveillant = idSurveillant;
	}

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

	public int getIdSurveillant() {
		return idSurveillant;
	}

	public void setIdSurveillant(int idSurveillant) {
		this.idSurveillant = idSurveillant;
	}
}
