package problem2;

public class product {

	private int pid;
	private String pname;
	private double price;
	
	private category cname;

	public product(int pid, String pname, double price, category cname) 
	{
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.cname = cname;
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	public category getCname() {
		return cname;
	}
	
	public String toString()
	{
		return "pid= "+pid+" pname= "+pname+" price= "+price+" cname= "+cname;
	}
	
	
}
