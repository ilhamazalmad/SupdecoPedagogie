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
@Table(name = "mention")
@SQLDelete(sql = "UPDATE mention SET deleted = true WHERE codeMention=?")
@Where(clause = "deleted=false")
public class Mention {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String codeMention;
	private String mention;

	@OneToMany(mappedBy = "mentionBac", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiantsBacs;

	@OneToMany(mappedBy = "mentionDiplome", cascade = CascadeType.MERGE)
	private List<Etudiant> etudiantsDiplomes;

	private boolean deleted = Boolean.FALSE;

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

	public Mention(String codeMention, String mention, List<Etudiant> etudiantsBacs, List<Etudiant> etudiantsDiplomes,
			boolean deleted) {
		super();
		this.codeMention = codeMention;
		this.mention = mention;
		this.etudiantsBacs = etudiantsBacs;
		this.etudiantsDiplomes = etudiantsDiplomes;
		this.deleted = deleted;
	}

	public boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
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
