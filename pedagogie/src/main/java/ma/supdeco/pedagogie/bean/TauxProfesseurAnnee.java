package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tauxProfesseurAnnee")
public class TauxProfesseurAnnee {
   private int idTauxAnnee;
   private int idTaux;
   private int idAnnee;
   private int idProfesseur;
   private int idTypeSeance;

}