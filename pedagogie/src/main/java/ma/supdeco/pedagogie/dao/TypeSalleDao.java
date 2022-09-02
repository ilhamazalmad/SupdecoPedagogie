package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.TypeSalle;

@Repository
public interface TypeSalleDao extends JpaRepository<TypeSalle, Long> {

}
