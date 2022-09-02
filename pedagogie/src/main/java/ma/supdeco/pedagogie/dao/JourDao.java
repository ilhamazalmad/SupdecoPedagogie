package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Jour;

@Repository
public interface JourDao extends JpaRepository<Jour, Long> {

}
