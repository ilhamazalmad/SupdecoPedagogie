package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pays")
public class Pays implements Serializable{

	@Id
	@GeneratedValue
	private Long id;
	private String pays;
	private String nationnalite;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public String getNationnalite() {
		return nationnalite;
	}
	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}
	
}
