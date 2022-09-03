package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Mention {

private String codeMention;
	private String mention;
private List<Etudiant> etudiantsBacs;
private List<Etudiant> etudiantsDiplomes;

	public Mention() {
		super();
	}

	public Mention(String codeMention, String mention, List<Etudiant> etudiantsBacs, List<Etudiant> etudiantsDiplomes) {
		super();
		this.codeMention = codeMention;
		this.mention = mention;
		this.etudiantsBacs = etudiantsBacs;
		this.etudiantsDiplomes = etudiantsDiplomes;
	}

	public String getCodeMention() {
		return codeMention;
	}

	public void setCodeMention(String codeMention) {
		this.codeMention = codeMention;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	public List<Etudiant> getEtudiantsBacs() {
		return etudiantsBacs;
	}

	public void setEtudiantsBacs(List<Etudiant> etudiantsBacs) {
		this.etudiantsBacs = etudiantsBacs;
	}

	public List<Etudiant> getEtudiantsDiplomes() {
		return etudiantsDiplomes;
	}

	public void setEtudiantsDiplomes(List<Etudiant> etudiantsDiplomes) {
		this.etudiantsDiplomes = etudiantsDiplomes;
	}

}
