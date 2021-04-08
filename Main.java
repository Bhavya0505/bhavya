package com.nameverify;

public class Main {

	public static void main(String[] args) {
		PersonDetails pd1 = new PersonDetails(new Person("John","Cena"),"23:05,02:07,05:09");
		PersonDetails pd2 = new PersonDetails(new Person("Triple-H","Game"),"24:15,02:17,05:09");
		PersonDetails pd3 = new PersonDetails(new Person("The great","Khali"),"2:05,12:07,25:09");
		PersonDetails pd4 = new PersonDetails(new Person("J.T","Undertaker"),"23:11,02:43,05:22");
		PersonDetails pd5 = new PersonDetails(new Person("abc5f","Kane"),"23:11,02:43,05:22");
		
		Calculate c = new Calculate();
		
		System.out.println(" Name verification for person 1 : "+pd1.getPerson() + " is "+c.validPerson(pd1.getPerson()));
		System.out.println(" Total Working hrs for  : "+pd1 + " is "+c.workingHours(pd1.getWorkTime())+" minutes");
		System.out.println("*************************************************");
		
		System.out.println(" Name verification for person 2 : "+pd2.getPerson() + " is "+c.validPerson(pd2.getPerson()));
		System.out.println(" Total Working hrs for  : "+pd2 + " is "+c.workingHours(pd2.getWorkTime())+" minutes");
		System.out.println("*************************************************");
		
		System.out.println(" Name verification for person 3 : "+pd3.getPerson() + " is "+c.validPerson(pd3.getPerson()));
		System.out.println(" Total Working hrs for  : "+pd3 + " is "+c.workingHours(pd3.getWorkTime())+" minutes");
		System.out.println("*************************************************");
		
		System.out.println(" Name verification for person 4 : "+pd4.getPerson() + " is "+c.validPerson(pd4.getPerson()));
		System.out.println(" Total Working hrs for  : "+pd4 + " is "+c.workingHours(pd4.getWorkTime())+" minutes");
		System.out.println("*************************************************");
		
		System.out.println(" Name verification for person 5 : "+pd5.getPerson() + " is "+c.validPerson(pd5.getPerson()));
		System.out.println(" Total Working hrs for  : "+pd5 + " is "+c.workingHours(pd5.getWorkTime())+" minutes");
		System.out.println("*************************************************");
	}

}
