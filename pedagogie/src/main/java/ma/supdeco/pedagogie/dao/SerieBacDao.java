package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.SerieBac;

@Repository
public interface SerieBacDao extends JpaRepository<SerieBac, Long> {

}
