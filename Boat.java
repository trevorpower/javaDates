package c2a2q3_2019_GemmaMcgee;

public class Boat {
	
	private String name;
	private double length;
	private int rating;
	
	
	public Boat(String name, double length, int rating) {
		this.name = name;
		this.length = length;
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public double getLength() {
		return length;
	}
	
	public int getRating() {
		return rating;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLength(double len) {
		this.length = len;
	}
	
	public void setRating(int rate) {
		this.rating = rate;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
