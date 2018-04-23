public class MyHolidays {	

	public static void main(String[] args) {
		//Holiday holiday1 = new Holiday("New Year", 1, "Jenuary");
		//Holiday holiday2 = new Holiday("Christmas", 7, "Jenuary");
		//Holiday holiday3 = new Holiday("Birthday", 27, "December");
		
		Holiday[] holidayArray = new Holiday[10];
		
		for(int i = 0; i < holidayArray.length; i++) {
			holidayArray[i]  = new Holiday(" ", 30-3*i, " ");
		}		
		
		avgDate(holidayArray);
		
		
		/*for(int i = 0; i < holidayArray.length; i++) {
			System.out.print(holidayArray[i].getDay() + " ");
		}*/
		
		System.out.println(" ");
		
		
		
		
		
		
		/*holiday1.setDay(20);
		System.out.println(holiday1.getDay());*/
		
		
		/*if(Holiday.inSameMonth(holiday3, holiday1)) {
			System.out.println("The holidays have the same month");
		} else {
			System.out.println("The holidays have not the same month");
		}*/
		

	}
	
	/*method avgDate which takes an array of base type Holiday as its argument, and
	 returns a double that is the average of the day variables in the Holiday instances in the
	 array. You may assume that the array is full (i.e. does not have any null entries).*/
	
	public static void avgDate(Holiday[] array) {
		int sumOfDays = 0;
		double averageDay = 0;
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].getDay() != 0 ) {
				sumOfDays+=array[i].getDay();
			} else {	System.out.println("Enter day for the " + i + "th holiday ");	
					sumOfDays = 0;
					break;}
			
		}
		
		if(sumOfDays != 0) {
			averageDay = sumOfDays/array.length;
			System.out.println("The average of the day variables in the Holiday is " + averageDay);
		} 		
	}
	
	

}