package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Mention;

@Repository
public interface MentionDao extends JpaRepository<Mention, String> {

}
