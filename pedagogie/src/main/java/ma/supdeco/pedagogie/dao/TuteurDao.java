package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Tuteur;

@Repository
public interface TuteurDao extends JpaRepository<Tuteur, Long> {

}
