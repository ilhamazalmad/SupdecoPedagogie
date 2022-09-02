package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.GroupeAnnee;

@Repository
public interface GroupeAnneeDao extends JpaRepository<GroupeAnnee, Long> {

}
