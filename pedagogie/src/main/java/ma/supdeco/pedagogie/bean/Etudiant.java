package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable{

	@Id
	@GeneratedValue
	private Long ins;
	private String nom;
	private String photo;
	private String prenom;
	private String cin;
	private String nationnalite;
	private String date_naissance;
	private String lieu_naissance;
	private String sexe;
	private String email;
	private String tel;
	private String adresse;
	private String ville;
	private String pays;
	private String date_inscription;
	
	private String civiliteTuteur1;
	private String nomTuteur1;
	private String prenomTuteur1;
	private String cinTuteur1;
	private String professionTuteur1;
	private String gsmTuteur1;
	private String fixeTuteur1;
	private String telProfTuteur1;
	private String emailTuteur1;
	private String adresseTuteur1;
	private String villeTuteur1;
	private String paysTuteur1;
	
	private String civiliteTuteur2;
	private String nomTuteur2;
	private String prenomTuteur2;
	private String cinTuteur2;
	private String professionTuteur2;
	private String gsmTuteur2;
	private String fixeTuteur2;
	private String telProfTuteur2;
	private String emailTuteur2;
	private String adresseTuteur2;
	private String villeTuteur2;
	private String paysTuteur2;
	
	private String type;
	private String cne;
	private String serie_bac;
	private String annee_bac;
	private String session;
	private String mention;
	private String lycee;
	private String ville_bac;
	private String pays_bac;
	private String resident;
	private String boursier;
	private String niveau_admission;
	private String diplome;
	private String specialite;
	private String etablissement;
	private String ville_diplome;
	private String pays_diplome;
	private String situation;
	private String niveau1ereInscription;
	private String handicape;
	private String fonctionnaire;
	private String emailSupdeco;
	private String typeLycee;
	private String typeEtabl;
	private String depart;
	private String date_depart;
	private String poste_occupe;
	private String laureat;
	private String annee_laureat;
	private String anneeScolaire;
	private String nomNiv;
	private String codeOpt;
	private String nomGr;
	private String nomSousGr;
	private String nomSousGr2;
	private String nomSousGr3;
	private String responsable;
	private String nomPrenom;
	
	@OneToMany(mappedBy = "etudiant")
	List<AbsenceEtudiant> absenceEtudiant;
	
	@OneToMany(mappedBy = "etudiant")
	List<Controle> controle;
	
	@OneToMany(mappedBy = "etudiant")
	List<Examen> examen;
	
	@OneToMany(mappedBy = "etudiant")
	List<AvertissementAbsence> avertissementAbsence;
	
	
	@OneToMany(mappedBy = "etudiant")
	List<ArretCours> arretCours;
	
	public Etudiant() {
		
	}
	
	public Etudiant(Long ins, String nomPrenom) {
		super();
        this.ins = ins;
        this.nomPrenom = nomPrenom;
	}

	 public Etudiant(Long ins, String nom,String prenom,String situation) {
	        super();
	        this.ins = ins;
	        this.nom = nom;
	        this.prenom = prenom;
	        this.situation = situation;
	    }

	 public Etudiant(Long ins, String nomPrenom,String photo) {
	        super();
	        this.ins = ins;
	        this.nomPrenom = nomPrenom;
	        this.photo = photo;
	    }
	 
	public Long getIns() {
		return ins;
	}

	public void setIns(Long ins) {
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

	public String getNationnalite() {
		return nationnalite;
	}

	public void setNationnalite(String nationnalite) {
		this.nationnalite = nationnalite;
	}

	public String getDate_naissance() {
		return date_naissance;
	}

	public void setDate_naissance(String date_naissance) {
		this.date_naissance = date_naissance;
	}

	public String getLieu_naissance() {
		return lieu_naissance;
	}

	public void setLieu_naissance(String lieu_naissance) {
		this.lieu_naissance = lieu_naissance;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getDate_inscription() {
		return date_inscription;
	}

	public void setDate_inscription(String date_inscription) {
		this.date_inscription = date_inscription;
	}

	public String getCiviliteTuteur1() {
		return civiliteTuteur1;
	}

	public void setCiviliteTuteur1(String civiliteTuteur1) {
		this.civiliteTuteur1 = civiliteTuteur1;
	}

	public String getNomTuteur1() {
		return nomTuteur1;
	}

	public void setNomTuteur1(String nomTuteur1) {
		this.nomTuteur1 = nomTuteur1;
	}

	public String getPrenomTuteur1() {
		return prenomTuteur1;
	}

	public void setPrenomTuteur1(String prenomTuteur1) {
		this.prenomTuteur1 = prenomTuteur1;
	}

	public String getCinTuteur1() {
		return cinTuteur1;
	}

	public void setCinTuteur1(String cinTuteur1) {
		this.cinTuteur1 = cinTuteur1;
	}

	public String getProfessionTuteur1() {
		return professionTuteur1;
	}

	public void setProfessionTuteur1(String professionTuteur1) {
		this.professionTuteur1 = professionTuteur1;
	}

	public String getGsmTuteur1() {
		return gsmTuteur1;
	}

	public void setGsmTuteur1(String gsmTuteur1) {
		this.gsmTuteur1 = gsmTuteur1;
	}

	public String getFixeTuteur1() {
		return fixeTuteur1;
	}

	public void setFixeTuteur1(String fixeTuteur1) {
		this.fixeTuteur1 = fixeTuteur1;
	}

	public String getTelProfTuteur1() {
		return telProfTuteur1;
	}

	public void setTelProfTuteur1(String telProfTuteur1) {
		this.telProfTuteur1 = telProfTuteur1;
	}

	public String getEmailTuteur1() {
		return emailTuteur1;
	}

	public void setEmailTuteur1(String emailTuteur1) {
		this.emailTuteur1 = emailTuteur1;
	}

	public String getAdresseTuteur1() {
		return adresseTuteur1;
	}

	public void setAdresseTuteur1(String adresseTuteur1) {
		this.adresseTuteur1 = adresseTuteur1;
	}

	public String getVilleTuteur1() {
		return villeTuteur1;
	}

	public void setVilleTuteur1(String villeTuteur1) {
		this.villeTuteur1 = villeTuteur1;
	}

	public String getPaysTuteur1() {
		return paysTuteur1;
	}

	public void setPaysTuteur1(String paysTuteur1) {
		this.paysTuteur1 = paysTuteur1;
	}

	public String getCiviliteTuteur2() {
		return civiliteTuteur2;
	}

	public void setCiviliteTuteur2(String civiliteTuteur2) {
		this.civiliteTuteur2 = civiliteTuteur2;
	}

	public String getNomTuteur2() {
		return nomTuteur2;
	}

	public void setNomTuteur2(String nomTuteur2) {
		this.nomTuteur2 = nomTuteur2;
	}

	public String getPrenomTuteur2() {
		return prenomTuteur2;
	}

	public void setPrenomTuteur2(String prenomTuteur2) {
		this.prenomTuteur2 = prenomTuteur2;
	}

	public String getCinTuteur2() {
		return cinTuteur2;
	}

	public void setCinTuteur2(String cinTuteur2) {
		this.cinTuteur2 = cinTuteur2;
	}

	public String getProfessionTuteur2() {
		return professionTuteur2;
	}

	public void setProfessionTuteur2(String professionTuteur2) {
		this.professionTuteur2 = professionTuteur2;
	}

	public String getGsmTuteur2() {
		return gsmTuteur2;
	}

	public void setGsmTuteur2(String gsmTuteur2) {
		this.gsmTuteur2 = gsmTuteur2;
	}

	public String getFixeTuteur2() {
		return fixeTuteur2;
	}

	public void setFixeTuteur2(String fixeTuteur2) {
		this.fixeTuteur2 = fixeTuteur2;
	}

	public String getTelProfTuteur2() {
		return telProfTuteur2;
	}

	public void setTelProfTuteur2(String telProfTuteur2) {
		this.telProfTuteur2 = telProfTuteur2;
	}

	public String getEmailTuteur2() {
		return emailTuteur2;
	}

	public void setEmailTuteur2(String emailTuteur2) {
		this.emailTuteur2 = emailTuteur2;
	}

	public String getAdresseTuteur2() {
		return adresseTuteur2;
	}

	public void setAdresseTuteur2(String adresseTuteur2) {
		this.adresseTuteur2 = adresseTuteur2;
	}

	public String getVilleTuteur2() {
		return villeTuteur2;
	}

	public void setVilleTuteur2(String villeTuteur2) {
		this.villeTuteur2 = villeTuteur2;
	}

	public String getPaysTuteur2() {
		return paysTuteur2;
	}

	public void setPaysTuteur2(String paysTuteur2) {
		this.paysTuteur2 = paysTuteur2;
	}

	public String getCne() {
		return cne;
	}

	public void setCne(String cne) {
		this.cne = cne;
	}

	public String getSerie_bac() {
		return serie_bac;
	}

	public void setSerie_bac(String serie_bac) {
		this.serie_bac = serie_bac;
	}

	public String getAnnee_bac() {
		return annee_bac;
	}

	public void setAnnee_bac(String annee_bac) {
		this.annee_bac = annee_bac;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}

	public String getLycee() {
		return lycee;
	}

	public void setLycee(String lycee) {
		this.lycee = lycee;
	}

	public String getVille_bac() {
		return ville_bac;
	}

	public void setVille_bac(String ville_bac) {
		this.ville_bac = ville_bac;
	}

	public String getPays_bac() {
		return pays_bac;
	}

	public void setPays_bac(String pays_bac) {
		this.pays_bac = pays_bac;
	}

	public String getResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String getBoursier() {
		return boursier;
	}

	public void setBoursier(String boursier) {
		this.boursier = boursier;
	}

	public String getNiveau_admission() {
		return niveau_admission;
	}

	public void setNiveau_admission(String niveau_admission) {
		this.niveau_admission = niveau_admission;
	}

	public String getDiplome() {
		return diplome;
	}

	public void setDiplome(String diplome) {
		this.diplome = diplome;
	}

	public String getEtablissement() {
		return etablissement;
	}

	public void setEtablissement(String etablissement) {
		this.etablissement = etablissement;
	}

	public String getVille_diplome() {
		return ville_diplome;
	}

	public void setVille_diplome(String ville_diplome) {
		this.ville_diplome = ville_diplome;
	}

	public String getPays_diplome() {
		return pays_diplome;
	}

	public void setPays_diplome(String pays_diplome) {
		this.pays_diplome = pays_diplome;
	}

	public String getSpecialite() {
		return specialite;
	}

	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getNiveau1ereInscription() {
		return niveau1ereInscription;
	}

	public void setNiveau1ereInscription(String niveau1ereInscription) {
		this.niveau1ereInscription = niveau1ereInscription;
	}

	public String getHandicape() {
		return handicape;
	}

	public void setHandicape(String handicape) {
		this.handicape = handicape;
	}

	public String getFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(String fonctionnaire) {
		this.fonctionnaire = fonctionnaire;
	}

	public String getEmailSupdeco() {
		return emailSupdeco;
	}

	public void setEmailSupdeco(String emailSupdeco) {
		this.emailSupdeco = emailSupdeco;
	}

	public String getTypeLycee() {
		return typeLycee;
	}

	public void setTypeLycee(String typeLycee) {
		this.typeLycee = typeLycee;
	}

	public String getTypeEtabl() {
		return typeEtabl;
	}

	public void setTypeEtabl(String typeEtabl) {
		this.typeEtabl = typeEtabl;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getDate_depart() {
		return date_depart;
	}

	public void setDate_depart(String date_depart) {
		this.date_depart = date_depart;
	}

	public String getPoste_occupe() {
		return poste_occupe;
	}

	public void setPoste_occupe(String poste_occupe) {
		this.poste_occupe = poste_occupe;
	}

	public String getLaureat() {
		return laureat;
	}

	public void setLaureat(String laureat) {
		this.laureat = laureat;
	}

	public String getAnnee_laureat() {
		return annee_laureat;
	}

	public void setAnnee_laureat(String annee_laureat) {
		this.annee_laureat = annee_laureat;
	}

	public String getAnneeScolaire() {
		return anneeScolaire;
	}

	public void setAnneeScolaire(String anneeScolaire) {
		this.anneeScolaire = anneeScolaire;
	}

	public String getNomNiv() {
		return nomNiv;
	}

	public void setNomNiv(String nomNiv) {
		this.nomNiv = nomNiv;
	}

	public String getCodeOpt() {
		return codeOpt;
	}

	public void setCodeOpt(String codeOpt) {
		this.codeOpt = codeOpt;
	}

	public String getNomGr() {
		return nomGr;
	}

	public void setNomGr(String nomGr) {
		this.nomGr = nomGr;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getNomSousGr() {
		return nomSousGr;
	}

	public void setNomSousGr(String nomSousGr) {
		this.nomSousGr = nomSousGr;
	}

	public String getNomSousGr2() {
		return nomSousGr2;
	}

	public void setNomSousGr2(String nomSousGr2) {
		this.nomSousGr2 = nomSousGr2;
	}

	public String getNomSousGr3() {
		return nomSousGr3;
	}

	public void setNomSousGr3(String nomSousGr3) {
		this.nomSousGr3 = nomSousGr3;
	}

	public List<AbsenceEtudiant> getAbsence() {
		return absenceEtudiant;
	}

	public void setAbsence(List<AbsenceEtudiant> absenceEtudiant) {
		this.absenceEtudiant = absenceEtudiant;
	}

	public String getNomPrenom() {
		return nomPrenom;
	}

	public void setNomPrenom(String nomPrenom) {
		this.nomPrenom = nomPrenom;
	}

	public List<AvertissementAbsence> getAvertissement() {
		return avertissementAbsence;
	}

	public void setAvertissement(List<AvertissementAbsence> avertissementAbsence) {
		this.avertissementAbsence = avertissementAbsence;
	}

	public List<Controle> getControle() {
		return controle;
	}

	public void setControle(List<Controle> controle) {
		this.controle = controle;
	}

	public List<Examen> getExamen() {
		return examen;
	}

	public void setExamen(List<Examen> examen) {
		this.examen = examen;
	}

	
}
