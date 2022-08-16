package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "option")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeOption;
	private String titreOption;

	@OneToMany(mappedBy = "option", cascade = CascadeType.MERGE)
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
