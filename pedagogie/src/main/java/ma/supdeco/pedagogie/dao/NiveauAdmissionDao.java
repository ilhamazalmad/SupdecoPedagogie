package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.NiveauAdmission;

@Repository
public interface NiveauAdmissionDao extends JpaRepository<NiveauAdmission, Long> {

}
