package elearning.dao;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import elearning.model.Feedback;

@Repository
public class FeedDao 
{
	@Autowired
	private HibernateTemplate hiberateTemplate;
	

	
	@Transactional
	public int savefeed(Feedback feed) {
		int id = (Integer)this.hiberateTemplate.save(feed);
		return id;
	}
	
}
