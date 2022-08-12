package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "tauxSurveillantAnnee")
public class TauxSurveillantAnnee {
   private int idTauxAnnee;
   private int idTaux;
   private int idAnnee;
   private int idProfesseur;
   private int idTypeSeance;

}