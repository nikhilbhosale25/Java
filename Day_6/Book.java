package NewPkg;

public class Book {

	private String bname;
	private int id;
	private String author;
	private float price;

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void display() {
		System.out.println(bname);
		System.out.println(id);
		System.out.println(author);
		System.out.println(price);
	}
    public Book()
    {
    	
    }
    
    public void acceptInfo(String nm, int idnew, String auth, float pr)
    {
    	bname=nm;
		id=idnew;
		author=auth;
		price=pr;
    }
	
	Book(String nm, int idnew, String auth, float pr) {
		bname=nm;
		id=idnew;
		author=auth;
		price=pr;
	}

}
