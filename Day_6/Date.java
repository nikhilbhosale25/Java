package Day_6;

public class Date {

		private int day;
		private int month;
		private int year;
		
		
		public  Date()
		{
			this.day=25;
			this.month=5;
			this.year=2001;
		}
		
		public  Date(int year)
		{
			this.day=29;
			this.month=6;
			this.year=year;
		}
		
		public  Date(int month,int year)
		{
			this.day=29;
			this.month=month;
			this.year=year;
		}
		
		public String toString()
		{
			return "Date= "+day+"/"+month+"/"+year;
		}
		
}
