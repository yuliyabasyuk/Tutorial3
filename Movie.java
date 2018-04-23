
public class Movie {
	private String title;
	private String studio;
	private String rating;
	
	public Movie(String title, String studio, String rating) {
		this.title = title;
		this.studio = studio;
		this.rating = rating;
	}
	
	public Movie(String title, String studio) {
		this.title = title;
		this.studio = studio;
		this.rating = "PG";
	}
	
	public void setTitle(String title) {
		this.title = title;
	}	
	
	public String getTitle() {
		return title;
	}	
	
	public void setStudio(String studio) {
		this.studio = studio;
	}	
	
	public String getStudio() {
		return studio;
	}	
	
	public void setRating(String rating) {
		this.rating = rating;
	}	
	
	public String getRating() {
		return rating;
	}	
	
	

}
