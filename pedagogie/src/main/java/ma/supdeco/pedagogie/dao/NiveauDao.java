package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Niveau;

@Repository
public interface NiveauDao extends JpaRepository<Niveau, Long> {

}
