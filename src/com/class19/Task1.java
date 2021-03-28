package com.class19;

public class Task1 {

	//write a program that will have a constructor:
	//one with parameters and second without any parameters
	//create a separate Test class where you will execute both of this constructors 1 by 1
	
	
	String name;
	Task1(){
		System.out.println("constructor without parameters is called");
	}
	
	
	Task1(String name){
		this.name=name;
		System.out.println("constructor with parameters is called");
	}
	
	
	
	
	
	
}
