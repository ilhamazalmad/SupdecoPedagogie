package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

@Entity
@Table(name = "typeSeance")
@SQLDelete(sql = "UPDATE typeSeance SET deleted = true WHERE codeType=?")
@Where(clause = "deleted=false")
public class TypeSeance {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeType;
	private String typeSeance;

	@OneToMany(mappedBy = "typeSeance", cascade = CascadeType.MERGE)
	private List<Seance> seances;

	private boolean deleted = Boolean.FALSE;

	public TypeSeance() {
		super();
	}

	public TypeSeance(Long codeType, String typeSeance, List<Seance> seances) {
		super();
		this.codeType = codeType;
		this.typeSeance = typeSeance;
		this.seances = seances;
	}

	public TypeSeance(Long codeType, String typeSeance, List<Seance> seances, boolean deleted) {
		super();
		this.codeType = codeType;
		this.typeSeance = typeSeance;
		this.seances = seances;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public Long getCodeType() {
		return codeType;
	}

	public void setCodeType(Long codeType) {
		this.codeType = codeType;
	}

	public String getTypeSeance() {
		return typeSeance;
	}

	public void setTypeSeance(String typeSeance) {
		this.typeSeance = typeSeance;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

}
