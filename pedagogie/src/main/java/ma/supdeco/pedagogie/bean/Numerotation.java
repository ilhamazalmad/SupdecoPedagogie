package ma.supdeco.pedagogie.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "numero")
public class Numerotation implements Serializable{
	private int idNumerotation;
	   private int numerotation;
}
