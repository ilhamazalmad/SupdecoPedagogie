package ma.supdeco.pedagogie.ws.provided.dto;
import java.util.List;

public class Option {

private String codeOption;
	private String titreOption;
private List<OptionAnnee> optionAnnees;

	public Option() {
		super();
	}

	public Option(String codeOption, String titreOption, List<OptionAnnee> optionAnnees) {
		super();
		this.codeOption = codeOption;
		this.titreOption = titreOption;
		this.optionAnnees = optionAnnees;
	}

	public String getCodeOption() {
		return codeOption;
	}

	public void setCodeOption(String codeOption) {
		this.codeOption = codeOption;
	}

	public String getTitreOption() {
		return titreOption;
	}

	public void setTitreOption(String titreOption) {
		this.titreOption = titreOption;
	}

	public List<OptionAnnee> getOptionAnnees() {
		return optionAnnees;
	}

	public void setOptionAnnees(List<OptionAnnee> optionAnnees) {
		this.optionAnnees = optionAnnees;
	}

}
