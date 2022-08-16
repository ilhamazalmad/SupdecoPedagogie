package ma.supdeco.pedagogie.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "etudiant")
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ins;
	private String nom;
	private String prenom;
	private String cin;
	private String cne;
	private String photo;
	private String sexe;
	private String telephone;
	private String adresse;
	private String email;
	private String emailSupdeco;
	private Date dateNaissance;
	private int lieuDeNaissance;
	private Date dateInscription;
	private String situation;
	private int anneeBac;
	private int anneeDiplome;
	private boolean boursier;
	private boolean resident;
	private boolean handicape;
	private boolean fonctionnaire;
	private String documentsFournis;
	private String posteOccupe;
	private Date dateDepart;

	@OneToMany(mappedBy = "etudiant", cascade = CascadeType.MERGE)
	private List<EtudiantAnnee> etudiantAnnees;

	@OneToMany(mappedBy = "etudiant", cascade = CascadeType.MERGE)
	private List<Tuteur> tuteurs;

	@ManyToOne
	@JoinColumn(name = "idSession", nullable = false)
	private Mois session;

	@ManyToOne
	@JoinColumn(name = "idNiveauAdmission", nullable = false)
	private NiveauAdmission niveauAdmission;

	@ManyToOne
	@JoinColumn(name = "idResponsable", nullable = false)
	private ResponsableInscription responsableInscription;

	@ManyToOne
	@JoinColumn(name = "idMentionBac", nullable = false)
	private Mention mentionBac;

	@ManyToOne
	@JoinColumn(name = "idMentionDiplome", nullable = true)
	private Mention mentionDiplome;

	@ManyToOne
	@JoinColumn(name = "idVilleNaissance", nullable = false)
	private Ville villeNaissance;

	@ManyToOne
	@JoinColumn(name = "idVille", nullable = false)
	private Ville ville;

	@ManyToOne
	@JoinColumn(name = "IdlyceeBac", nullable = false)
	private Lycee lyceeBac;

	@ManyToOne
	@JoinColumn(name = "idEtablissementDiplome", nullable = true)
	private Etablissement etablissementDiplome;

	@ManyToOne
	@JoinColumn(name = "idSerieBac", nullable = false)
	private SerieBac serieBac;

	@ManyToOne
	@JoinColumn(name = "idSpecialiteDiplome", nullable = true)
	private SpecialiteDiplome specialiteDiplome;

	public Etudiant() {
		super();
	}

	public Etudiant(int ins, String nom, String prenom, String cin, String cne, String photo, String sexe,
			String telephone, String adresse, String email, String emailSupdeco, Date dateNaissance,
			int lieuDeNaissance, Date dateInscription, String situation, int anneeBac, int anneeDiplome,
			boolean boursier, boolean resident, boolean handicape, boolean fonctionnaire, String documentsFournis,
			String posteOccupe, Date dateDepart, List<EtudiantAnnee> etudiantAnnees, List<Tuteur> tuteurs, Mois session,
			NiveauAdmission niveauAdmission, ResponsableInscription responsableInscription, Mention mentionBac,
			Mention mentionDiplome, Ville villeNaissance, Ville ville, Lycee lyceeBac,
			Etablissement etablissementDiplome, SerieBac serieBac, SpecialiteDiplome specialiteDiplome) {
		super();
		this.ins = ins;
		this.nom = nom;
		this.prenom = prenom;
		this.cin = cin;
		this.cne = cne;
		this.photo = photo;
		this.sexe = sexe;
		this.telephone = telephone;
		this.adresse = adresse;
		this.email = email;
		this.emailSupdeco = emailSupdeco;
		this.dateNaissance = dateNaissance;
		this.lieuDeNaissance = lieuDeNaissance;
		this.dateInscription = dateInscription;
		this.situation = situation;
		this.anneeBac = anneeBac;
		this.anneeDiplome = anneeDiplome;
		this.boursier = boursier;
		this.resident = resident;
		this.handicape = handicape;
		this.fonctionnaire = fonctionnaire;
		this.documentsFournis = documentsFournis;
		this.posteOccupe = posteOccupe;
		this.dateDepart = dateDepart;
		this.etudiantAnnees = etudiantAnnees;
		this.tuteurs = tuteurs;
		this.session = session;
		this.niveauAdmission = niveauAdmission;
		this.responsableInscription = responsableInscription;
		this.mentionBac = mentionBac;
		this.mentionDiplome = mentionDiplome;
		this.villeNaissance = villeNaissance;
		this.ville = ville;
		this.lyceeBac = lyceeBac;
		this.etablissementDiplome = etablissementDiplome;
		this.serieBac = serieBac;
		this.specialiteDiplome = specialiteDiplome;
	}

	public int getIns() {
		return ins;
	}

	public void setIns(int ins) {
		this.ins = ins;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSupdeco() {
		return emailSupdeco;
	}

	public void setEmailSupdeco(String emailSupdeco) {
		this.emailSupdeco = emailSupdeco;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public int getLieuDeNaissance() {
		return lieuDeNaissance;
	}

	public void setLieuDeNaissance(int lieuDeNaissance) {
		this.lieuDeNaissance = lieuDeNaissance;
	}

	public Date getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(Date dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public int getAnneeBac() {
		return anneeBac;
	}

	public void setAnneeBac(int anneeBac) {
		this.anneeBac = anneeBac;
	}

	public int getAnneeDiplome() {
		return anneeDiplome;
	}

	public void setAnneeDiplome(int anneeDiplome) {
		this.anneeDiplome = anneeDiplome;
	}

	public boolean isBoursier() {
		return boursier;
	}

	public void setBoursier(boolean boursier) {
		this.boursier = boursier;
	}

	public boolean isResident() {
		return resident;
	}

	public void setResident(boolean resident) {
		this.resident = resident;
	}

	public boolean isHandicape() {
		return handicape;
	}

	public void setHandicape(boolean handicape) {
		this.handicape = handicape;
	}

	public boolean isFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(boolean fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}

	public String getDocumentsFournis() {
		return documentsFournis;
	}

	public void setDocumentsFournis(String documentsFournis) {
		this.documentsFournis = documentsFournis;
	}

	public String getPosteOccupe() {
		return posteOccupe;
	}

	public void setPosteOccupe(String posteOccupe) {
		this.posteOccupe = posteOccupe;
	}

	public Date getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(Date dateDepart) {
		this.dateDepart = dateDepart;
	}

	public List<EtudiantAnnee> getEtudiantAnnees() {
		return etudiantAnnees;
	}

	public void setEtudiantAnnees(List<EtudiantAnnee> etudiantAnnees) {
		this.etudiantAnnees = etudiantAnnees;
	}

	public List<Tuteur> getTuteurs() {
		return tuteurs;
	}

	public void setTuteurs(List<Tuteur> tuteurs) {
		this.tuteurs = tuteurs;
	}

	public Mois getSession() {
		return session;
	}

	public void setSession(Mois session) {
		this.session = session;
	}

	public NiveauAdmission getNiveauAdmission() {
		return niveauAdmission;
	}

	public void setNiveauAdmission(NiveauAdmission niveauAdmission) {
		this.niveauAdmission = niveauAdmission;
	}

	public ResponsableInscription getResponsableInscription() {
		return responsableInscription;
	}

	public void setResponsableInscription(ResponsableInscription responsableInscription) {
		this.responsableInscription = responsableInscription;
	}

	public Mention getMentionBac() {
		return mentionBac;
	}

	public void setMentionBac(Mention mentionBac) {
		this.mentionBac = mentionBac;
	}

	public Mention getMentionDiplome() {
		return mentionDiplome;
	}

	public void setMentionDiplome(Mention mentionDiplome) {
		this.mentionDiplome = mentionDiplome;
	}

	public Ville getVilleNaissance() {
		return villeNaissance;
	}

	public void setVilleNaissance(Ville villeNaissance) {
		this.villeNaissance = villeNaissance;
	}

	public Ville getVille() {
		return ville;
	}

	public void setVille(Ville ville) {
		this.ville = ville;
	}

	public Lycee getLyceeBac() {
		return lyceeBac;
	}

	public void setLyceeBac(Lycee lyceeBac) {
		this.lyceeBac = lyceeBac;
	}

	public Etablissement getEtablissementDiplome() {
		return etablissementDiplome;
	}

	public void setEtablissementDiplome(Etablissement etablissementDiplome) {
		this.etablissementDiplome = etablissementDiplome;
	}

	public SerieBac getSerieBac() {
		return serieBac;
	}

	public void setSerieBac(SerieBac serieBac) {
		this.serieBac = serieBac;
	}

	public SpecialiteDiplome getSpecialiteDiplome() {
		return specialiteDiplome;
	}

	public void setSpecialiteDiplome(SpecialiteDiplome specialiteDiplome) {
		this.specialiteDiplome = specialiteDiplome;
	}

}
