package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "avertissement")
public class AvertissementAbsence implements Serializable {

	@Id
	@GeneratedValue
	private Long idAvr;
	
	@ManyToOne
	@JoinColumn(name ="ins")
	private Etudiant etudiant;
	
	private boolean avertis;
	private String dateAvr;
	private String absAvertis;
	private boolean ccd;
	private String dateCcd;
	private String absCcd;
	private boolean presenteCcd;
	private boolean engage;
	private String dateEngage;
	private String absEngage;
	private boolean fin;
	private String session;

	public Long getIdAvr() {
		return idAvr;
	}

	public void setIdAvr(Long idAvr) {
		this.idAvr = idAvr;
	}

	
	public boolean isAvertis() {
		return avertis;
	}

	public void setAvertis(boolean avertis) {
		this.avertis = avertis;
	}

	public String getDateAvr() {
		return dateAvr;
	}

	public void setDateAvr(String dateAvr) {
		this.dateAvr = dateAvr;
	}

	public boolean isCcd() {
		return ccd;
	}

	public void setCcd(boolean ccd) {
		this.ccd = ccd;
	}

	public String getDateCcd() {
		return dateCcd;
	}

	public void setDateCcd(String dateCcd) {
		this.dateCcd = dateCcd;
	}

	public boolean isPresenteCcd() {
		return presenteCcd;
	}

	public void setPresenteCcd(boolean presenteCcd) {
		this.presenteCcd = presenteCcd;
	}

	public boolean isEngage() {
		return engage;
	}

	public void setEngage(boolean engage) {
		this.engage = engage;
	}

	public String getDateEngage() {
		return dateEngage;
	}

	public void setDateEngage(String dateEngage) {
		this.dateEngage = dateEngage;
	}

	public String getAbsEngage() {
		return absEngage;
	}

	public void setAbsEngage(String absEngage) {
		this.absEngage = absEngage;
	}

	public String getAbsAvertis() {
		return absAvertis;
	}

	public void setAbsAvertis(String absAvertis) {
		this.absAvertis = absAvertis;
	}

	public String getAbsCcd() {
		return absCcd;
	}

	public void setAbsCcd(String absCcd) {
		this.absCcd = absCcd;
	}


	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public boolean isFin() {
		return fin;
	}

	public void setFin(boolean fin) {
		this.fin = fin;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}
	
}
