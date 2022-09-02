package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.SurveillantAnnee;

@Repository
public interface SurveillantAnneeDao extends JpaRepository<SurveillantAnnee, Long> {

}
