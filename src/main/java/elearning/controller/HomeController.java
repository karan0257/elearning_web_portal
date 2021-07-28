package elearning.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import elearning.dao.CourseDao;
import elearning.model.Admin;
import elearning.model.Course;
import elearning.model.Feedback;
import elearning.model.Login;
import elearning.model.User;
import elearning.service.UserService;
import elearning.service.feedService;

@Controller
public class HomeController {
	@Autowired
	private CourseDao courseDao;
	@Autowired
	private UserService userService;
	@Autowired
	private feedService feedService;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	
	@RequestMapping("/admin")
	public String admin() {
		return "admin";
	}
	@RequestMapping("/feedback")
	public String feed()
	{
		return "feedback";
	}
	@RequestMapping("registration")
	public String register() {
		return "registration";
	}
	
	@RequestMapping(path = "/processform", method = RequestMethod.POST)
	public String handleForm(@ModelAttribute User user) {
		this.userService.createUser(user);
		return "success";
	}
	@RequestMapping(path = "/processfeedbackform", method = RequestMethod.POST)
	public String handleFeedback(@ModelAttribute Feedback feedback)
	{
		this.feedService.createFeed(feedback);
		return "success";
	}
	@RequestMapping(path = "/loginform", method = RequestMethod.POST)
	public String loginForm(@ModelAttribute Login login) {
		return "success";
	}
	@RequestMapping(path = "/adminform", method = RequestMethod.POST)
	public RedirectView adminForm(@ModelAttribute Admin admin,HttpServletRequest request) {
		RedirectView redirectView = new RedirectView();
		
		if(admin.getName().equals("karan") && admin.getPassword().equals("1234")) {
			redirectView.setUrl(request.getContextPath()+"/admin-profile");
		}	
		else
			redirectView.setUrl(request.getContextPath()+"/failure");
		return redirectView;
	}
	
	//handler for success and failure page
	@RequestMapping("/failure")
	public String error() {
		return "failure";
	}
	@RequestMapping("/success")
	public String noError() {
		return "success";
	}
	
	//adding courses
	@RequestMapping("/add-course")
	public String addCourse(Model m) {
		m.addAttribute("title","Add Course");
		return "add_course_form";
	}
	
	//show admin profile
	@RequestMapping(value = "/processCourse",method = RequestMethod.POST)
	public RedirectView processCourse(@ModelAttribute Course course, HttpServletRequest request) {
		this.courseDao.createCourse(course);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/admin-profile");
		return redirectView;
	}
	
	@RequestMapping("/admin-profile")
	public String adminProfile(Model m) {
		List<Course> courses = courseDao.getAllCourses();
		m.addAttribute("courses", courses);
		List<User> users = userService.getAllUsers();
		m.addAttribute("users", users);
		return "admin_profile";
	}
	
	//delete handler
	@RequestMapping("/admin-profile/delete/{courseId}")
	public RedirectView deleteCourse(@PathVariable("courseId") int courseId,HttpServletRequest request) {
		this.courseDao.deleteCourse(courseId);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+"/admin-profile");
		return redirectView;
	}
	@RequestMapping("/admin-profile/feedbackview/{userid}")
	public RedirectView feedbackprofile(@ModelAttribute Feedback feed , @PathVariable("userid") int userid ,HttpServletRequest request)
	{
		RedirectView redirectView = new RedirectView();
			redirectView.setUrl(request.getContextPath()+"/admin-profile/feedbackview");
			return redirectView;
	}
	@RequestMapping("/admin-profile/feedbackview")
	public String feedbackProfile(Model m)
	{
		List<Feedback> feeds = feedService.getAllFeedback();
		m.addAttribute("feeds", feeds);
		return "feedbacktable";
	}
}
