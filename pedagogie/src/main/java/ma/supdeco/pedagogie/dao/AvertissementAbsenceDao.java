package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.AvertissementAbsence;

@Repository
public interface AvertissementAbsenceDao extends JpaRepository<AvertissementAbsence, Long> {

}
