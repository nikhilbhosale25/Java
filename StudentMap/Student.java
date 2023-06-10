package practice2;

import java.io.Serializable;
import java.time.LocalDate;

public class Student implements Serializable {
	
	private String id;
	private String name;
	private LocalDate date;
	private String email;
	private Course course;
	private Qualification qualify;
	private double fees;
	
	
	public Student(String id, String name, LocalDate date, String email, Course course, Qualification qualify,
			double fees) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.email = email;
		this.course = course;
		this.qualify = qualify;
		this.fees = fees;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDate() {
		return date;
	}


	public void setDate(LocalDate date) {
		this.date = date;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Course getCourse() {
		return course;
	}


	public void setCourse(Course course) {
		this.course = course;
	}


	public Qualification getQualify() {
		return qualify;
	}


	public void setQualify(Qualification qualify) {
		this.qualify = qualify;
	}


	public double getFees() {
		return fees;
	}


	public void setFees(double fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + date + ", email=" + email + ", course=" + course
				+ ", qualify=" + qualify + ", fees=" + fees + "]";
	}
	

	
	
}
