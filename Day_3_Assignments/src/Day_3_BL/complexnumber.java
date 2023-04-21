package Day_3_BL;

public class complexnumber {
	private int real;
	private int imag;
	
	public complexnumber ()
	{
		this.real=10;
		this.imag=20;
	}
	
	public complexnumber(int real,int imag)
	{
		this.real=real;
		this.imag=imag;
	}
	
	public void setReal(int real)
	{
		this.real=real;
	}
	
	public int getReal()
	{
		return real;
	}
	
	public void setImag(int imag)
	{
		this.imag=imag;
	}
	
	public int getImag()
	{
		return imag;
	}
	
	public void display()
	{
		System.out.println("Complex Number = "+real+"+"+imag+"i");
	}

}
