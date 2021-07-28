package elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import elearning.dao.UserDao;
import elearning.model.Course;
import elearning.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private  HibernateTemplate hibernateTemplate;
	
	public int createUser(User user) {
		return this.userDao.saveUser(user);
	}

	public List<User> getAllUsers() {
		List<User> users = this.hibernateTemplate.loadAll(User.class);
		return users;
	}
}
