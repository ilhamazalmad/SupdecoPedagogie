package ma.supdeco.pedagogie.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supdeco.pedagogie.dao.RoleDao;

@Service
public class RoleService {

	@Autowired
	RoleDao roleDao;
}
