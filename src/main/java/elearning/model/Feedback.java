package elearning.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Feedback 
{
	@Id
	public int userid;
	public int feedbackid;
	public String name;
	public String email;
	public String feedback;
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getFeedbackid() {
		return feedbackid;
	}
	public void setFeedbackid(int feedbackid) {
		this.feedbackid = feedbackid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	@Override
	public String toString() {
		return "Feedback [userid=" + userid + ", feedbackid=" + feedbackid + ", name=" + name + ", email=" + email
				+ ", feedback=" + feedback + "]";
	}
}
