import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable{

	private String id;
	private String firstName;
	private String lastName;
	private LocalDate joinDate;
	private double salary;
	private Dept department;
	
	public Employee(String id, String firstName, String lastName, LocalDate joinDate, double salary,Dept department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.joinDate = joinDate;
		this.salary = salary;
		this.department=department;
	}
	
	public Employee(String id)
	{
		this.id=id;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(LocalDate joinDate) {
		this.joinDate = joinDate;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(department);
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", joinDate=" + joinDate
				+ ", salary=" + salary + ", department=" + department + "]";
	}

	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Employee)
			return this.id.equals(((Employee)obj).id);
		return false;
		
	}
	
	

	
	
}
