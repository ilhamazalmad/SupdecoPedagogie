package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class OptionDto {

	private String codeOption;
	private String titreOption;
	private List<OptionAnneeDto> optionAnneeDtos;

	public OptionDto() {
		super();
	}

	public OptionDto(String codeOption, String titreOption, List<OptionAnneeDto> optionAnneeDtos) {
		super();
		this.codeOption = codeOption;
		this.titreOption = titreOption;
		this.optionAnneeDtos = optionAnneeDtos;
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

	public List<OptionAnneeDto> getOptionAnnees() {
		return optionAnneeDtos;
	}

	public void setOptionAnnees(List<OptionAnneeDto> optionAnneeDtos) {
		this.optionAnneeDtos = optionAnneeDtos;
	}

}
