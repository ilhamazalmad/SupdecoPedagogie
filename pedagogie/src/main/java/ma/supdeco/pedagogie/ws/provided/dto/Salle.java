package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Salle {

private String codeSalle;
	private String nom;
	private int nbrTables;
private List<Seance> seances;
private List<Numerotation> numerotations;
private TypeSalle typeSalle;

	public Salle() {
		super();
	}

	public Salle(String codeSalle, String nom, int nbrTables, List<Seance> seances, List<Numerotation> numerotations,
			TypeSalle typeSalle) {
		super();
		this.codeSalle = codeSalle;
		this.nom = nom;
		this.nbrTables = nbrTables;
		this.seances = seances;
		this.numerotations = numerotations;
		this.typeSalle = typeSalle;
	}

	public String getCodeSalle() {
		return codeSalle;
	}

	public void setCodeSalle(String codeSalle) {
		this.codeSalle = codeSalle;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbrTables() {
		return nbrTables;
	}

	public void setNbrTables(int nbrTables) {
		this.nbrTables = nbrTables;
	}

	public List<Seance> getSeances() {
		return seances;
	}

	public void setSeances(List<Seance> seances) {
		this.seances = seances;
	}

	public List<Numerotation> getNumerotations() {
		return numerotations;
	}

	public void setNumerotations(List<Numerotation> numerotations) {
		this.numerotations = numerotations;
	}

	public TypeSalle getTypeSalle() {
		return typeSalle;
	}

	public void setTypeSalle(TypeSalle typeSalle) {
		this.typeSalle = typeSalle;
	}

}
