package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Semestre;

@Repository
public interface SemestreDao extends JpaRepository<Semestre, String> {

}
