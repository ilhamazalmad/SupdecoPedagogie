package ma.supdeco.pedagogie.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.EtudiantAnnee;

@Repository
public interface EtudiantAnneeDao extends JpaRepository<EtudiantAnnee, Long> {

	List<EtudiantAnnee> findBySituation(String situation);
	List<EtudiantAnnee> findByDepart(String depart);

	@Query(value="Select ea.* "
			+ "from etudiantAnnee ea, annee a "
			+ "where ( ea.situation != 'R' or ( ea.situation ='R' and ( ea.groupeAnnee is not null and ea.groupeAnnee != '' ) ) ) "
			+ "and ea.depart !='O' "
			+ "and ea.annee=a.idAnnee "
			+ "and a.annee=:annee ", 
			nativeQuery = true) 	
	List<EtudiantAnnee> findByAnnee(@Param("annee")String annee);
		

	
}
