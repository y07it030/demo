package com.example.demo.java8practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable {
	private int year;
	private double rating;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	public Movie(int year, double rating, String name) {
		this.year = year;
		this.rating = rating;
		this.name = name;
	}

	@Override
	public int compareTo(Object o) {
		Movie m = (Movie) o;
		return this.year - m.year;
	}
}

class Rating implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Movie m1 = (Movie) o1;
		Movie m2 = (Movie) o2;
		if (m2.getRating() > m1.getRating())
			return -1;
		if (m2.getRating() < m1.getRating())
			return 1;
		else
			return 0;
	}

}

public class ComoparingListUsingComparator {
	public static void main(String[] args) {
		List<Movie> ai = new ArrayList();
		ai.add(new Movie(2019, 2.5, "Bahubali"));
		ai.add(new Movie(3019, 1.5, "Kattappa"));
		ai.add(new Movie(1019, 0.5, "Balalla"));
		Collections.sort(ai);
		for (Movie m : ai) {
			System.out.println(m.getYear() + "--" + m.getRating() + "--" + m.getName());
		}

		Collections.sort(ai, new Rating());
		for (Movie m : ai) {
			System.out.println(m.getYear() + "--" + m.getRating() + "--" + m.getName());
		}
	}
}
