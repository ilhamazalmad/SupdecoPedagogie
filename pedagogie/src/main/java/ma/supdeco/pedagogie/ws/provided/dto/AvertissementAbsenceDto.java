package ma.supdeco.pedagogie.ws.provided.dto;

public class AvertissementAbsenceDto extends AuditableDto {

	private String idAvertissement;
	private String avertis;
	private String conseil;
	private String presentConseil;
	private String engage;
	private String fin;
	private String dateAvertissement;
	private String dateConseil;
	private String dateEngagement;
	private EtudiantAnneeDto etudiantAnneeDto;
	private SemestreNiveauDto semestreNiveauDto;

	public AvertissementAbsenceDto() {
		super();
	}

	public AvertissementAbsenceDto(String idAvertissement, String avertis, String conseil, String presentConseil,
			String engage, String fin, String dateAvertissement, String dateConseil, String dateEngagement,
			EtudiantAnneeDto etudiantAnneeDto, SemestreNiveauDto semestreNiveauDto) {
		super();
		this.idAvertissement = idAvertissement;
		this.avertis = avertis;
		this.conseil = conseil;
		this.presentConseil = presentConseil;
		this.engage = engage;
		this.fin = fin;
		this.dateAvertissement = dateAvertissement;
		this.dateConseil = dateConseil;
		this.dateEngagement = dateEngagement;
		this.etudiantAnneeDto = etudiantAnneeDto;
		this.semestreNiveauDto = semestreNiveauDto;
	}

	public String getIdAvertissement() {
		return idAvertissement;
	}

	public void setIdAvertissement(String idAvertissement) {
		this.idAvertissement = idAvertissement;
	}

	public String isAvertis() {
		return avertis;
	}

	public void setAvertis(String avertis) {
		this.avertis = avertis;
	}

	public String isConseil() {
		return conseil;
	}

	public void setConseil(String conseil) {
		this.conseil = conseil;
	}

	public String isPresentConseil() {
		return presentConseil;
	}

	public void setPresentConseil(String presentConseil) {
		this.presentConseil = presentConseil;
	}

	public String isEngage() {
		return engage;
	}

	public void setEngage(String engage) {
		this.engage = engage;
	}

	public String isFin() {
		return fin;
	}

	public void setFin(String fin) {
		this.fin = fin;
	}

	public String getDateAvertissement() {
		return dateAvertissement;
	}

	public void setDateAvertissement(String dateAvertissement) {
		this.dateAvertissement = dateAvertissement;
	}

	public String getDateConseil() {
		return dateConseil;
	}

	public void setDateConseil(String dateConseil) {
		this.dateConseil = dateConseil;
	}

	public String getDateEngagement() {
		return dateEngagement;
	}

	public void setDateEngagement(String dateEngagement) {
		this.dateEngagement = dateEngagement;
	}

	public EtudiantAnneeDto getEtudiantAnnee() {
		return etudiantAnneeDto;
	}

	public void setEtudiantAnnee(EtudiantAnneeDto etudiantAnneeDto) {
		this.etudiantAnneeDto = etudiantAnneeDto;
	}

	public SemestreNiveauDto getSemestreNiveau() {
		return semestreNiveauDto;
	}

	public void setSemestreNiveau(SemestreNiveauDto semestreNiveauDto) {
		this.semestreNiveauDto = semestreNiveauDto;
	}

}
