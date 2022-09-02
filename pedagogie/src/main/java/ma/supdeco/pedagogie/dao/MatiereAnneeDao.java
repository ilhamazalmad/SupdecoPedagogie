package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.MatiereAnnee;

@Repository
public interface MatiereAnneeDao extends JpaRepository<MatiereAnnee, Long> {

}
