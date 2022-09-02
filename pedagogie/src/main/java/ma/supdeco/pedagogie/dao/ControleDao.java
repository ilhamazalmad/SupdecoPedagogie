package ma.supdeco.pedagogie.dao;

import java.util.ResourceBundle.Control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ControleDao extends JpaRepository<Control, Long> {

}
