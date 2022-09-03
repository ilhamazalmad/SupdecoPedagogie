package ma.supdeco.pedagogie.service.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.supdeco.pedagogie.dao.EtablissementDiplomeDao;

@Service
public class EtablissementDiplomeService {

	@Autowired
	EtablissementDiplomeDao etablissementDiplomeDao;
}
