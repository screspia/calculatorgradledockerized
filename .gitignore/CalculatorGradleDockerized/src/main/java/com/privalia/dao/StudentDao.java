package com.privalia.dao;

import com.privalia.model.Student;
import com.privalia.dao.IDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class StudentDao implements IDao<Student> {
	
	/*static final Logger logger = lLogger.getLogger(StudentDao.class);*/
	static Properties prop = null;
	static FileInputStream input = null;
	
	static {
		prop = new Properties();
		try {
			input = new FileInputStream("scr/main/resources/config.properties");
			prop.load(input);
		} catch (IOException e) {
			/*logger.error(e.getMessage());*/
			throw new ExceptionInInitializerError(e);
		}
	}

	@Override
	public int add(Student model) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

}
