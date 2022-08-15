package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "etudiantAnnee")
public class EtudiantAnnee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idEtudiantAnnee;
	private boolean depart;
	private Date dateDepart;
	
	private Etudiant etudiant;
	private Niveau niveau;
	private Rachetage rachetage;
	private Numerotation numerotation;
	private OptionAnnee optionAnnee;
	private Examen examen;
	private Controle controle;
	private SousGroupeAnnee sousGroupeAnnee;
	private List<Controle> controles;
	private List<Examen> examens;
	private List<Rachetage> rachetages;
	private List<Numerotation> numerotations;

	public EtudiantAnnee() {
		super();
	}

	

}