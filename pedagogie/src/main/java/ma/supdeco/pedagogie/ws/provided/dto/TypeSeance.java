package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class TypeSeance {

	private Long codeType;
	private String typeSeance;
	private List<Seance> seances;

	public TypeSeance() {
		super();
	}

	public TypeSeance(Long codeType, String typeSeance, List<Seance> seances) {
		super();
		this.codeType = codeType;
		this.typeSeance = typeSeance;
		this.seances = seances;
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
