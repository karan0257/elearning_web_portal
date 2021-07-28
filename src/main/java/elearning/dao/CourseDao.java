package elearning.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import elearning.model.Course;

@Component
public class CourseDao {

	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public void createCourse(Course course) {
		this.hibernateTemplate.save(course);
	}
	
	//get all courses
	public List<Course> getAllCourses(){
		List<Course> courses = this.hibernateTemplate.loadAll(Course.class);
		return courses;
	}
	
	//delete single course
	@Transactional
	public void deleteCourse(int courseId) {
		Course course = this.hibernateTemplate.load(Course.class, courseId);
		this.hibernateTemplate.delete(course);
	}
	
	//get single product
	public Course getCourse(int courseId) {
		return this.hibernateTemplate.get(Course.class,courseId);
	}
}
