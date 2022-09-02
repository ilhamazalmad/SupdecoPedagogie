package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.ResponsableInscription;

@Repository
public interface ResponsableInscriptionDao extends JpaRepository<ResponsableInscription, Long> {

}
