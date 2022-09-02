package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Session;

@Repository
public interface SessionDao extends JpaRepository<Session, Long> {

}
