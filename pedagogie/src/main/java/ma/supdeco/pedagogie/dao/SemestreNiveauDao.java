package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.SemestreNiveau;

@Repository
public interface SemestreNiveauDao extends JpaRepository<SemestreNiveau, Long> {

}
