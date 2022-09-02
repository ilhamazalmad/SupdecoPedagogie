package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Surveillant;

@Repository
public interface SurveillantDao extends JpaRepository<Surveillant, Long> {

}
