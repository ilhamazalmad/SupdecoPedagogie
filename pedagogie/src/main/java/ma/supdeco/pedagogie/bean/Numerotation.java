package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "numerotation")
public class Numerotation implements Serializable{
	public Numerotation() {
		super();
	}
	public Numerotation(int idNumerotation, int numerotation) {
		super();
		this.idNumerotation = idNumerotation;
		this.numerotation = numerotation;
	}
	private int idNumerotation;
	   private int numerotation;
	public int getIdNumerotation() {
		return idNumerotation;
	}
	public void setIdNumerotation(int idNumerotation) {
		this.idNumerotation = idNumerotation;
	}
	public int getNumerotation() {
		return numerotation;
	}
	public void setNumerotation(int numerotation) {
		this.numerotation = numerotation;
	}
}
