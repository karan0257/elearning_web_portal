package elearning.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//import elearning.model.Course;
import elearning.model.User;

@Repository
public class UserDao {
	@Autowired
	private HibernateTemplate hiberateTemplate;
	

	
	@Transactional
	public int saveUser(User user) {
		int id = (Integer)this.hiberateTemplate.save(user);
		return id;
	}
	
}
