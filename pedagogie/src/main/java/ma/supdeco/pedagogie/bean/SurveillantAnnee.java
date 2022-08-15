package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "surveillantAnnee")
public class SurveillantAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idSurveillantAnnee;
	private int idSurveillant;
	private int idAnnee;

	public SurveillantAnnee() {
		super();
	}

	public SurveillantAnnee(int idSurveillantAnnee, int idSurveillant, int idAnnee) {
		super();
		this.idSurveillantAnnee = idSurveillantAnnee;
		this.idSurveillant = idSurveillant;
		this.idAnnee = idAnnee;
	}

	public int getIdSurveillantAnnee() {
		return idSurveillantAnnee;
	}

	public void setIdSurveillantAnnee(int idSurveillantAnnee) {
		this.idSurveillantAnnee = idSurveillantAnnee;
	}

	public int getIdSurveillant() {
		return idSurveillant;
	}

	public void setIdSurveillant(int idSurveillant) {
		this.idSurveillant = idSurveillant;
	}

	public int getIdAnnee() {
		return idAnnee;
	}

	public void setIdAnnee(int idAnnee) {
		this.idAnnee = idAnnee;
	}

}