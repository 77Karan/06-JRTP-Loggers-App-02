package in.ashokit.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.dao.UserDao;

@Service
public class UserService 
{
	Logger logger = LoggerFactory.getLogger(UserService.class);
	@Autowired
	private UserDao userDao;
	
	public void saveUser()
	{
		logger.info("***saveUser() --> statred");
		userDao.savetoDb();
		logger.info("***saveUser() --> ended");

	}
	

}
