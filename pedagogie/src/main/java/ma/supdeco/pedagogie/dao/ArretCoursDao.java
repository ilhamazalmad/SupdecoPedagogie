package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.ArretCours;

@Repository
public interface ArretCoursDao extends JpaRepository<ArretCours, Long> {

}
