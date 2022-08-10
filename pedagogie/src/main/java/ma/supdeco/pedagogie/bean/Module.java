package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "module")

public class Module implements Serializable{

	@Id
	@GeneratedValue
	
	private Long idMod;
	private String codeMod;
	private String nomMod;
	private String nomNiv;
	private String codeSem;
	
	public Module() {
		
	}

	public Module(String codeMod, String nomMod) {
        super();
        this.codeMod = codeMod;
        this.nomMod = nomMod;
    }
	
	public Long getIdMod() {
		return idMod;
	}

	public void setIdMod(Long idMod) {
		this.idMod = idMod;
	}

	public String getCodeMod() {
		return codeMod;
	}

	public void setCodeMod(String codeMod) {
		this.codeMod = codeMod;
	}

	public String getNomMod() {
		return nomMod;
	}

	public void setNomMod(String nomMod) {
		this.nomMod = nomMod;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	public String getCodeSem() {
		return codeSem;
	}

	public void setCodeSem(String codeSem) {
		this.codeSem = codeSem;
	}

}
