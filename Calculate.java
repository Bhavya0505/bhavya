package com.nameverify;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculate {
	
	public boolean validPerson(Person p) {		
		String regex = "([A-Za-z])[A-Za-z .-]*([A-Za-z])";// name should start and end with alphabet and can contain '.','-' or ' '
		Pattern pat = Pattern.compile(regex);
		Matcher m1 = pat.matcher(p.getFname());
		Matcher m2 = pat.matcher(p.getLname());

		if(m1.matches() && m2.matches()){
			return true;
		}
		else{
				return false;
		}
		
	}
	
	public int workingHours(String workTime) { //"23:05,02:07,05:09" // hr:mm
		int totalHrs = 0;
		int totalMins = 0;
		
		String[] time1 = workTime.split(",");
		
		for(int i=0; i<time1.length;i++) {
			//String time2 =  time1[i]; //(hh:mm)
			
			String[] time2 = time1[i].split ( ":" ); 
			totalHrs += Integer.parseInt ( time2[0].trim() );
			totalMins += Integer.parseInt ( time2[1].trim() );									
		}
		
		//totalHrs = totalHrs+ (totalMins % 60); 
		//totalMins = totalMins % 60;
		
		int totalWorkingTime = (totalHrs*60) + totalMins;
		
		return totalWorkingTime;
			
	}
	/*
	 * String[] time = timme.split ( ":" );
int hour = Integer.parseInt ( time[0].trim() );
int min = Integer.parseInt ( time[1].trim() );
	 */

}
