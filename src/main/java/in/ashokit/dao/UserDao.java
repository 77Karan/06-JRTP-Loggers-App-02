package in.ashokit.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao 
{
	Logger logger = LoggerFactory.getLogger(UserDao.class);
	
	public void savetoDb()
	{
		logger.debug("savetoDB() --> Starting");
		System.out.println("Saving to DB opeartion");
		logger.info("Record Inserting into DB via savetoDB()");
		logger.debug("savetoDB() --> Stopped");

	}

}
