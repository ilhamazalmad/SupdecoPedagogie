package ma.supdeco.pedagogie.bean;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="rattrapageSeance")

public class RattrapageSeance {
	   public RattrapageSeance() {
		super();
	}
	public RattrapageSeance(int idRattrapage, int idSeance, Date dateAttrapage) {
		super();
		this.idRattrapage = idRattrapage;
		this.idSeance = idSeance;
		this.dateAttrapage = dateAttrapage;
	}
	private int idRattrapage;
	   private int idSeance;
	   private Date dateAttrapage;
	public int getIdRattrapage() {
		return idRattrapage;
	}
	public void setIdRattrapage(int idRattrapage) {
		this.idRattrapage = idRattrapage;
	}
	public int getIdSeance() {
		return idSeance;
	}
	public void setIdSeance(int idSeance) {
		this.idSeance = idSeance;
	}
	public Date getDateAttrapage() {
		return dateAttrapage;
	}
	public void setDateAttrapage(Date dateAttrapage) {
		this.dateAttrapage = dateAttrapage;
	}

}
