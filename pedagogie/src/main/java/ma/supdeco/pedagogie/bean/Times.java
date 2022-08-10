package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "times")
public class Times implements Serializable{
	
	@Id
	@GeneratedValue
	private Long idTime;
	private String heure;
	
	public Long getIdTime() {
		return idTime;
	}
	public void setIdTime(Long idTime) {
		this.idTime = idTime;
	}
	public String getHeure() {
		return heure;
	}
	public void setHeure(String heure) {
		this.heure = heure;
	}
	
}
