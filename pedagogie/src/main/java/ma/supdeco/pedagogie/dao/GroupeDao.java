package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Groupe;

@Repository
public interface GroupeDao extends JpaRepository<Groupe, Long>{

}
