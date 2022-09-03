package ma.supdeco.pedagogie.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supdeco.pedagogie.dao.DiplomeDao;

@Service
public class DiplomeService {

	@Autowired
	DiplomeDao diplomeDao;
}
