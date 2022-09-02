package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Rachetage;

@Repository
public interface RachetageDao extends JpaRepository<Rachetage, Long> {

}
