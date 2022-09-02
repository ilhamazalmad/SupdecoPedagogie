package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Mois;

@Repository
public interface MoisDao extends JpaRepository<Mois, Long> {

}
