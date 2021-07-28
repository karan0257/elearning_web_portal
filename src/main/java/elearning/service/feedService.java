package elearning.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import elearning.dao.FeedDao;
import elearning.model.Feedback;
import elearning.model.User;

@Service
public class feedService 
{
	@Autowired
	private FeedDao FeedDao;
	@Autowired
	private  HibernateTemplate hibernateTemplate;
	public int createFeed(Feedback feedback) 
	{
		return this.FeedDao.savefeed(feedback);
	}
	public List<Feedback> getAllFeedback() {
		List<Feedback> feeds = this.hibernateTemplate.loadAll(Feedback.class);
		return feeds;
	}
}
