package com.app;

import java.util.*;

public enum DaysOfWeek{

	MONDAY("Monday"),
	TUESDAY("Tuesday"), 
	WEDNESDAY("Wednesday"), 
	THURSDAY("Thursday"), 
	FRIDAY("Friday"), 
	SUTURDAY("Saturday"), 
	SUNDAY("Sunday");

	private String title;	

	DaysOfWeek(String title){
		this.title = title;
	}

	public String getTitle(){
		return title;
	}

	@Override
	public String toString(){
		return "Day of Week { '" + title + "' }\n";
	}

	public static void main(String[] args) {

		System.out.println(Arrays.toString(DaysOfWeek.values()));
		int sundayIndex = DaysOfWeek.SUNDAY.ordinal();
		System.out.println(sundayIndex);

		VeryStrictDiet diet = new VeryStrictDiet();
		diet.takeLunch(WEDNESDAY);
	}
}

class VeryStrictDiet {

	public void takeLunch(DaysOfWeek daysOfWeek){

		switch (daysOfWeek){

			case SUNDAY: System.out.println("Sunday Lunch! Today we can eat some sweets!"); break;
			case MONDAY: System.out.println("Monday Lunch! Chicken with Spaggeti!"); break;
			case TUESDAY: System.out.println("Tuesday Lunch! Soup with Seafoods!"); break;
			default: System.out.println("Today we have nothing for eat! =("); break;
		}
	}
}