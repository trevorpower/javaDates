package c2a2q3_2019_GemmaMcgee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoatDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int amount = 5;
		ArrayList<Boat> boatList = new ArrayList<Boat>();
			
		boatList.add(new Boat("Usain Boat", 3.4, 6));
		boatList.add(new Boat("Sea You Later", 0.8, 3));
		boatList.add(new Boat("The Black Pearl", 8.1, 7));
		boatList.add(new Boat("Ship Happens", 5.7, 9));
		boatList.add(new Boat("Fishizzle", 7.2, 10));
		
		String shortest = getShortestLength(boatList, amount);
		String highestRated = getHighestRated(boatList);
		
		System.out.println(shortest);
		System.out.println(highestRated);
		
	}
	/**
	 * finds the boat with the shortest length in the array list
	 * @param arr
	 * @param len
	 * @return string with the details of the boat with the shortest length
	 */
	public static String getShortestLength(ArrayList<Boat> arr, int len) {
		String name = "";
		double length = len;
		int rating = 0;
		
		for(Boat boat : arr) {
			if(boat.getLength() < length) {
				name = boat.getName();
				length = boat.getLength();
				rating = boat.getRating();
			}
		}
		String output = "The boat with the shortest length is " + name + 
				" which is " + length + 
				" metres long. This boat has a rating of " + 
				rating + " on Boats\'R\'Us.";
				
		return output;
	}
	/**
	 * finds the boat with the highest rating in the array list
	 * @param arr
	 * @return string with details of the boat with the highest rating
	 */
	public static String getHighestRated(ArrayList<Boat> arr) {
		String name = "";
		double length = 0;
		int rating = 0;
		
		for(Boat boat : arr) {
			if(boat.getRating() > rating) {
				name = boat.getName();
				length = boat.getLength();
				rating = boat.getRating();
			}
		}
		String output = "The boat with the highest rating is " + name + 
				" which is " + length + 
				" metres long. This boat has a rating of " + 
				rating + " on Boats\'R\'Us.";
				
		return output;
	}
	

}
