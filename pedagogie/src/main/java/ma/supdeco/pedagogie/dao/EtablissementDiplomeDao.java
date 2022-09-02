package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.EtablissementDiplome;

@Repository
public interface EtablissementDiplomeDao extends JpaRepository<EtablissementDiplome, Long> {

}
