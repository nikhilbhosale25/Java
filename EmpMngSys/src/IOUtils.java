import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class IOUtils {

	public static void StoreEmployeeDetails(String filename,List<Employee> emplist)
	{
		try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			
			obj.writeObject(emplist);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static List<Employee> RestoreEmployeeDetails(String filename)
	{
		List<Employee> emplist=new ArrayList<>();
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			emplist =(List<Employee>)in.readObject();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new ArrayList<>();
		}
		return emplist;
	}
}
