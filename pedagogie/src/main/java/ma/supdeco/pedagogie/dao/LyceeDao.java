package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Lycee;

@Repository
public interface LyceeDao extends JpaRepository<Lycee, Long> {

}
