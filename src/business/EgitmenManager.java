package business;

import core.logging.Logger;
import dataAccess.IEgitmenDao;
import entities.Egitmen;

public class EgitmenManager {
private IEgitmenDao _egitmenDao;
private Logger[] _logger;

public EgitmenManager(IEgitmenDao egitmenDao,Logger[] loggers) {
	_egitmenDao = egitmenDao;
	_logger=loggers;
}


public void add(Egitmen egitmen) {
	_egitmenDao.add(egitmen);
}
}
