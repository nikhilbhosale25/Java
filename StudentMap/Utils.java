package practice2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class Utils {

	public static void storeDetails(String filename,Map<String,Student> maplist)
	{
		try(ObjectOutputStream obj=new ObjectOutputStream(new FileOutputStream(filename)))
		{
			obj.writeObject(maplist);
		}catch (Exception e) {

			e.printStackTrace();
		}
	}
	
	public static Map<String,Student> restoreDetails(String filename)
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(filename)))
		{
			Map<String,Student> maplist=(Map<String,Student>) in.readObject();
			 return maplist;
		}catch (Exception e) {
			e.printStackTrace();
			return new HashMap<>();
		}
	}
}
