package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Ville;

@Repository
public interface VilleDao extends JpaRepository<Ville, Long> {

}
