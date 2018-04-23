
public class MovieInstances {

	public static void main(String[] args) {	 
		
		Movie[] movieArray = new Movie[3];
		movieArray[0] = new Movie("Titanic", "My Little Pony", "PG");
		movieArray[1] = new Movie("Kingsman", "House", "AN");
		movieArray[2] = new Movie("Star Wars", "Paramand", "PG");
		
		Movie[] PGrating = getPG(movieArray);
		for(int i = 0; i < PGrating.length; i++) {
			if(PGrating[i] != null) {
				System.out.println(PGrating[i].getTitle() + " "+ PGrating[i].getStudio() + " " + PGrating[i].getRating()  );
			}
		}
		

	}
	
	/*public static Movie[] getPG(Movie[] array) {
		Movie[] auxiliaryArray = new Movie[array.length];
		for(int i = 0; i < array.length; i++) {
			auxiliaryArray[i] = array[i];
				if(!array[i].getRating().equals("PG")) {
					auxiliaryArray[i].setRating(" ");			
								
			}
		}
		
		return auxiliaryArray;
	}*/
	
	
	public static Movie[] getPG(Movie[] array) {
		for(int i = 0; i < array.length; i++) {
			if(!array[i].getRating().equals("PG")) {
				array[i] = null;
			} 
		}
		
		return array;
	}
	
	
	
	

}
