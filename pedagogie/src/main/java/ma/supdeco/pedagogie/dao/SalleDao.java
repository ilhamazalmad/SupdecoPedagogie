package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Salle;

@Repository
public interface SalleDao extends JpaRepository<Salle, String> {

}
