package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Etudiant;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

}
