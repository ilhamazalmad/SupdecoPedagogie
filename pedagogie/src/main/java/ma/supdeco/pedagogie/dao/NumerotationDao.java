package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Numerotation;

@Repository
public interface NumerotationDao extends JpaRepository<Numerotation, Long> {

}
