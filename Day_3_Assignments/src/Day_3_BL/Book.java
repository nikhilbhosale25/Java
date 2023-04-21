package Day_3_BL;

public class Book {

	private String bname;
	private int bid;
	private String author;
	private double price;
	
	public Book()
	{
		bname="C programming";
		bid=101;
		author="Yashwant kanetkar";
		price=125.25;
	}
	
	public Book(String bname,int bid,String author,double price)
	{
		this.bname=bname;
		this.bid=bid;
		this.author=author;
		this.price=price;
	}
	
	public void setName(String bname)
	{
		this.bname=bname;
	}
	public String getName()
	{
		return bname;
	}
	
	public void setId(int bid)
	{
		this.bid=bid;
	}
	public int getId()
	{
		return bid; 
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return price;
	}
	
	public void display()
	{
		System.out.println("book name= "+this.bname);
		System.out.println("book id= "+this.bid);
		System.out.println("Author= "+this.author);
		System.out.println("book price= "+this.price);
	}
	
}
