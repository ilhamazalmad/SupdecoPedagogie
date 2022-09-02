package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.SpecialiteDiplome;

@Repository
public interface SpecialiteDiplomeDao extends JpaRepository<SpecialiteDiplome, Long> {

}
