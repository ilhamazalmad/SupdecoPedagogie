package ma.supdeco.pedagogie.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "fiche")
public class Fiche implements Serializable{
	   private int codeFiche;
	   private String message;
	   private Date dateFiche;

}
