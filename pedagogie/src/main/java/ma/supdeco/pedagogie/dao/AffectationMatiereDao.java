package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.AffectationMatiere;

@Repository
public interface AffectationMatiereDao extends JpaRepository<AffectationMatiere, Long> {

}
