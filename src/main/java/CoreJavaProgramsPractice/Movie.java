package CoreJavaProgramsPractice;

import java.util.*;

class compareMovieYear implements Comparator {

	@Override
	public int compare(Object m1, Object m2) {//(Movie m1, Movie m2) {
System.out.println("Calling here in movie");
m1=new Movie();m2=new Movie();
Movie m3=(Movie)m1;
Movie m4=(Movie)m2;

		//return m1.getYear() - m2.getYear();
		if(m3.getRating()>m4.getRating()) return -1;
		if(m3.getRating()<m4.getRating()) return 1;
		else return 0;
	}
	

}

public class Movie implements Comparable {

	private String name;
	private double rating;
	private int year;

	Movie() {

	}

	Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public int compareTo(Object m) {
		m = new Movie();
		Movie m2 = (Movie) m;
		return m2.year - this.year;
	}

	public static void main(String[] args) {

		List<Movie> ai = new ArrayList<Movie>();
		ai.add(new Movie("Radha", 1.64, 2011));
		ai.add(new Movie("Harsha", 1.67, 1999));
		ai.add(new Movie("Harika", 1.78, 1989));
		Collections.sort(ai);
		
		Iterator i = ai.iterator();
		Movie m = null;
		while (i.hasNext()) {
			m = (Movie) i.next();
			System.out.println(m.getName() + "" + m.getRating() + "" + m.getYear());
		}
		/*
		Collections.sort(ai,new compareMovieYear());
		Iterator i1 = ai.iterator();
		Movie m1 = null;
		while (i1.hasNext()) {
			m1 = (Movie) i1.next();
			System.out.println(m1.getName() + "" + m1.getRating() + "" + m1.getYear());
		}*/
	}



}
