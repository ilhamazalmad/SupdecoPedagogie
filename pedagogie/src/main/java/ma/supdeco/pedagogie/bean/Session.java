package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "session")
public class Session implements Serializable{

	@Id
	@GeneratedValue
	private Long idSess;
	private String session;
	private boolean activate;
	
	public Long getIdSess() {
		return idSess;
	}
	public void setIdSess(Long idSess) {
		this.idSess = idSess;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	public boolean isActivate() {
		return activate;
	}
	public void setActivate(boolean activate) {
		this.activate = activate;
	}
}
