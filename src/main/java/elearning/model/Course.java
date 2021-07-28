package elearning.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int courseId;
	
	private String courseName;
	private String courseDescription;
	private int courseFees;
	private String courseResource;
	
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public String getCourseDescription() {
		return courseDescription;
	}
	public void setCourseDescription(String courseDescription) {
		this.courseDescription = courseDescription;
	}
	public int getCourseFees() {
		return courseFees;
	}
	public void setCourseFees(int courseFees) {
		this.courseFees = courseFees;
	}
	public String getCourseResource() {
		return courseResource;
	}
	public void setCourseResource(String courseResource) {
		this.courseResource = courseResource;
	}
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", courseDescription="
				+ courseDescription + ", courseFees=" + courseFees + ", courseResource=" + courseResource + "]";
	}
	public Course(int courseId, String courseName, String courseDescription, int courseFees, String courseResource) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseDescription = courseDescription;
		this.courseFees = courseFees;
		this.courseResource = courseResource;
	}
	public Course() {
		super();
	}
	
}
