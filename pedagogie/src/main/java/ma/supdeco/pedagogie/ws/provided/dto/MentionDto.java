package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class MentionDto {

	private String codeMention;
	private String mention;
	private List<EtudiantDto> etudiantsBacs;
	private List<EtudiantDto> etudiantsDiplomes;

	public MentionDto() {
		super();
	}

	public MentionDto(String codeMention, String mention, List<EtudiantDto> etudiantsBacs, List<EtudiantDto> etudiantsDiplomes) {
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

	public List<EtudiantDto> getEtudiantsBacs() {
		return etudiantsBacs;
	}

	public void setEtudiantsBacs(List<EtudiantDto> etudiantsBacs) {
		this.etudiantsBacs = etudiantsBacs;
	}

	public List<EtudiantDto> getEtudiantsDiplomes() {
		return etudiantsDiplomes;
	}

	public void setEtudiantsDiplomes(List<EtudiantDto> etudiantsDiplomes) {
		this.etudiantsDiplomes = etudiantsDiplomes;
	}

}
