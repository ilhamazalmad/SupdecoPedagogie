package ma.supdeco.pedagogie.bean;

import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "surveillantAnnee")
public class SurveillantAnnee {
   private int idSurveillantAnnee;
   private int idSurveillant;
   private int idAnnee;

}