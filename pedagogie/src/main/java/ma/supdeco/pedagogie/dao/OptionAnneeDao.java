package ma.supdeco.pedagogie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ma.supdeco.pedagogie.bean.Option;
import ma.supdeco.pedagogie.bean.OptionAnnee;

@Repository
public interface OptionAnneeDao extends JpaRepository<OptionAnnee, String> {

}
