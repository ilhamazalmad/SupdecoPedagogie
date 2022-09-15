package ma.supdeco.pedagogie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Etudiant;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

	@Query(value="Select e.* "
			+ "from etudiant e, etudiantAnnee ea, annee a "
			+ "where ( ea.situation != 'R' or ( ea.situation ='R' and ( ea.groupeAnnee is not null and ea.groupeAnnee != '' ) ) ) "
			+ "and ea.depart !='O' "
			+ "and ea.annee=a.idAnnee "
			+ "and a.annee=:annee "
			+ "and e.ins = ea.ins", 
			nativeQuery = true) 	
	List<Etudiant> findByAnnee(@Param("annee")String annee);
	
	
	
}
