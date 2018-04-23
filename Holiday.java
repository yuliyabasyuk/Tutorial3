public class Holiday {
	System.out.println("Team1");
	  private String name;
	  private int day;
	  private String month;
	
	public Holiday (String name, int day, String month) {
		this.name = name;
		this.day = day;
		this.month = month;
	}
	
	public void setDay(int day) {
		if((day > 0) & (day < 32)) {
			this.day = day;
		} 	else {
			System.out.println("Enter the valid day ");
			}
	}
	
	/*a method inSameMonth compares two instances of the class Holiday,and
	returns the Boolean value true if they have the same month, and false if they do not.*/
	
	public static boolean inSameMonth(Holiday h1, Holiday h2) {
		if (h1.month.equals(h2.month)) {
			return true;
		} 
		return false;
	}
	
	public int getDay() {
		return day;
	}	
	
}
		





