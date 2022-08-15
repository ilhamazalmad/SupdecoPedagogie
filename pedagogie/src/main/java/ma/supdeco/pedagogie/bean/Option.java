package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "option")
public class Option {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String codeOption;
	private String titreOption;

	public java.util.Collection<OptionAnnee> optionAnnee;

	public Option() {
		super();
	}

	public Option(int id, String codeOption, String titreOption, Collection<OptionAnnee> optionAnnee) {
		super();
		this.id = id;
		this.codeOption = codeOption;
		this.titreOption = titreOption;
		this.optionAnnee = optionAnnee;
	}

	/** @pdGenerated default getter */
	public java.util.Collection<OptionAnnee> getOptionAnnee() {
		if (optionAnnee == null)
			optionAnnee = new java.util.HashSet<OptionAnnee>();
		return optionAnnee;
	}

	/** @pdGenerated default iterator getter */
	public java.util.Iterator getIteratorOptionAnnee() {
		if (optionAnnee == null)
			optionAnnee = new java.util.HashSet<OptionAnnee>();
		return optionAnnee.iterator();
	}

	/**
	 * @pdGenerated default setter
	 * @param newOptionAnnee
	 */
	public void setOptionAnnee(java.util.Collection<OptionAnnee> newOptionAnnee) {
		removeAllOptionAnnee();
		for (java.util.Iterator iter = newOptionAnnee.iterator(); iter.hasNext();)
			addOptionAnnee((OptionAnnee) iter.next());
	}

	/**
	 * @pdGenerated default add
	 * @param newOptionAnnee
	 */
	public void addOptionAnnee(OptionAnnee newOptionAnnee) {
		if (newOptionAnnee == null)
			return;
		if (this.optionAnnee == null)
			this.optionAnnee = new java.util.HashSet<OptionAnnee>();
		if (!this.optionAnnee.contains(newOptionAnnee))
			this.optionAnnee.add(newOptionAnnee);
	}

	/**
	 * @pdGenerated default remove
	 * @param oldOptionAnnee
	 */
	public void removeOptionAnnee(OptionAnnee oldOptionAnnee) {
		if (oldOptionAnnee == null)
			return;
		if (this.optionAnnee != null)
			if (this.optionAnnee.contains(oldOptionAnnee))
				this.optionAnnee.remove(oldOptionAnnee);
	}

	/** @pdGenerated default removeAll */
	public void removeAllOptionAnnee() {
		if (optionAnnee != null)
			optionAnnee.clear();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
}
