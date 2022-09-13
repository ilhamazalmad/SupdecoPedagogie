package ma.supdeco.pedagogie.ws.provided.dto;

import java.util.List;

public class EtudiantDto {

	private String ins;
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
	private String dateNaissance;
	private String lieuNaissance;
	private String dateInscription;
	private String situation;
	private String anneeBac;
	private String anneeDiplome;
	private String boursier;
	private String resident;
	private String handicape;
	private String fonctionnaire;
	private String documentsFournis;
	private String posteOccupe;
	private String dateDepart;
	private String nomArabe;
	private String prenomArabe;
	private String lieuNaissanceArabe;
	private List<EtudiantAnneeDto> etudiantAnneeDtos;
	private List<TuteurDto> tuteurDtos;
	private MoisDto sessionBac;
	private PaysDto nationalite;
	private NiveauAdmissionDto niveauAdmissionDto;
	private ResponsableInscriptionDto responsableInscriptionDto;
	private MentionDto mentionBac;
	private DiplomeDto diplomeDto;
	private MentionDto mentionDiplome;
	private VilleDto villeNaissance;
	private VilleDto villeDto;
	private LyceeDto lyceeBac;
	private EtablissementDiplomeDto etablissementDiplomeDto;
	private SerieBacDto serieBacDto;
	private SpecialiteDiplomeDto specialiteDiplomeDto;

	public EtudiantDto() {
		super();
	}

	public EtudiantDto(String ins, String nom, String prenom, String cin, String cne, String photo, String sexe,
			String telephone, String adresse, String email, String emailSupdeco, String dateNaissance,
			String lieuNaissance, String dateInscription, String situation, String anneeBac, String anneeDiplome,
			String boursier, String resident, String handicape, String fonctionnaire, String documentsFournis,
			String posteOccupe, String dateDepart, String nomArabe, String prenomArabe, String lieuNaissanceArabe,
			List<EtudiantAnneeDto> etudiantAnneeDtos, List<TuteurDto> tuteurDtos, MoisDto sessionBac,
			PaysDto nationalite, NiveauAdmissionDto niveauAdmissionDto,
			ResponsableInscriptionDto responsableInscriptionDto, MentionDto mentionBac, DiplomeDto diplomeDto,
			MentionDto mentionDiplome, VilleDto villeNaissance, VilleDto villeDto, LyceeDto lyceeBac,
			EtablissementDiplomeDto etablissementDiplomeDto, SerieBacDto serieBacDto,
			SpecialiteDiplomeDto specialiteDiplomeDto) {
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
		this.lieuNaissance = lieuNaissance;
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
		this.nomArabe = nomArabe;
		this.prenomArabe = prenomArabe;
		this.lieuNaissanceArabe = lieuNaissanceArabe;
		this.etudiantAnneeDtos = etudiantAnneeDtos;
		this.tuteurDtos = tuteurDtos;
		this.sessionBac = sessionBac;
		this.nationalite = nationalite;
		this.niveauAdmissionDto = niveauAdmissionDto;
		this.responsableInscriptionDto = responsableInscriptionDto;
		this.mentionBac = mentionBac;
		this.diplomeDto = diplomeDto;
		this.mentionDiplome = mentionDiplome;
		this.villeNaissance = villeNaissance;
		this.villeDto = villeDto;
		this.lyceeBac = lyceeBac;
		this.etablissementDiplomeDto = etablissementDiplomeDto;
		this.serieBacDto = serieBacDto;
		this.specialiteDiplomeDto = specialiteDiplomeDto;
	}

	public String getIns() {
		return ins;
	}

	public void setIns(String ins) {
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

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getDateInscription() {
		return dateInscription;
	}

	public void setDateInscription(String dateInscription) {
		this.dateInscription = dateInscription;
	}

	public String getSituation() {
		return situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public String getAnneeBac() {
		return anneeBac;
	}

	public void setAnneeBac(String anneeBac) {
		this.anneeBac = anneeBac;
	}

	public String getAnneeDiplome() {
		return anneeDiplome;
	}

	public void setAnneeDiplome(String anneeDiplome) {
		this.anneeDiplome = anneeDiplome;
	}

	public String isBoursier() {
		return boursier;
	}

	public void setBoursier(String boursier) {
		this.boursier = boursier;
	}

	public String isResident() {
		return resident;
	}

	public void setResident(String resident) {
		this.resident = resident;
	}

	public String isHandicape() {
		return handicape;
	}

	public void setHandicape(String handicape) {
		this.handicape = handicape;
	}

	public String isFonctionnaire() {
		return fonctionnaire;
	}

	public void setFonctionnaire(String fonctionnaire) {
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

	public String getDateDepart() {
		return dateDepart;
	}

	public void setDateDepart(String dateDepart) {
		this.dateDepart = dateDepart;
	}

	public String getNomArabe() {
		return nomArabe;
	}

	public void setNomArabe(String nomArabe) {
		this.nomArabe = nomArabe;
	}

	public String getPrenomArabe() {
		return prenomArabe;
	}

	public void setPrenomArabe(String prenomArabe) {
		this.prenomArabe = prenomArabe;
	}

	public String getLieuNaissanceArabe() {
		return lieuNaissanceArabe;
	}

	public void setLieuNaissanceArabe(String lieuNaissanceArabe) {
		this.lieuNaissanceArabe = lieuNaissanceArabe;
	}

	public List<EtudiantAnneeDto> getEtudiantAnnees() {
		return etudiantAnneeDtos;
	}

	public void setEtudiantAnnees(List<EtudiantAnneeDto> etudiantAnneeDtos) {
		this.etudiantAnneeDtos = etudiantAnneeDtos;
	}

	public List<TuteurDto> getTuteurs() {
		return tuteurDtos;
	}

	public void setTuteurs(List<TuteurDto> tuteurDtos) {
		this.tuteurDtos = tuteurDtos;
	}

	public MoisDto getSessionBac() {
		return sessionBac;
	}

	public void setSessionBac(MoisDto sessionBac) {
		this.sessionBac = sessionBac;
	}

	public PaysDto getNationalite() {
		return nationalite;
	}

	public void setNationalite(PaysDto nationalite) {
		this.nationalite = nationalite;
	}

	public NiveauAdmissionDto getNiveauAdmission() {
		return niveauAdmissionDto;
	}

	public void setNiveauAdmission(NiveauAdmissionDto niveauAdmissionDto) {
		this.niveauAdmissionDto = niveauAdmissionDto;
	}

	public ResponsableInscriptionDto getResponsableInscription() {
		return responsableInscriptionDto;
	}

	public void setResponsableInscription(ResponsableInscriptionDto responsableInscriptionDto) {
		this.responsableInscriptionDto = responsableInscriptionDto;
	}

	public MentionDto getMentionBac() {
		return mentionBac;
	}

	public void setMentionBac(MentionDto mentionBac) {
		this.mentionBac = mentionBac;
	}

	public DiplomeDto getDiplome() {
		return diplomeDto;
	}

	public void setDiplome(DiplomeDto diplomeDto) {
		this.diplomeDto = diplomeDto;
	}

	public MentionDto getMentionDiplome() {
		return mentionDiplome;
	}

	public void setMentionDiplome(MentionDto mentionDiplome) {
		this.mentionDiplome = mentionDiplome;
	}

	public VilleDto getVilleNaissance() {
		return villeNaissance;
	}

	public void setVilleNaissance(VilleDto villeNaissance) {
		this.villeNaissance = villeNaissance;
	}

	public VilleDto getVille() {
		return villeDto;
	}

	public void setVille(VilleDto villeDto) {
		this.villeDto = villeDto;
	}

	public LyceeDto getLyceeBac() {
		return lyceeBac;
	}

	public void setLyceeBac(LyceeDto lyceeBac) {
		this.lyceeBac = lyceeBac;
	}

	public EtablissementDiplomeDto getEtablissementDiplome() {
		return etablissementDiplomeDto;
	}

	public void setEtablissementDiplome(EtablissementDiplomeDto etablissementDiplomeDto) {
		this.etablissementDiplomeDto = etablissementDiplomeDto;
	}

	public SerieBacDto getSerieBac() {
		return serieBacDto;
	}

	public void setSerieBac(SerieBacDto serieBacDto) {
		this.serieBacDto = serieBacDto;
	}

	public SpecialiteDiplomeDto getSpecialiteDiplome() {
		return specialiteDiplomeDto;
	}

	public void setSpecialiteDiplome(SpecialiteDiplomeDto specialiteDiplomeDto) {
		this.specialiteDiplomeDto = specialiteDiplomeDto;
	}

}
