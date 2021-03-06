package com.bridgelabz.employee;

import java.util.Iterator;
import java.util.List;

public class Employee {
	private int id;
	private String name;
	private Address address;
	private List<String> answers;  
	private List<Answer> answers2;  


//	public Employee() {
//		System.out.println("def cons");
//	}
	
	public Employee(int id, String name, Address address,List<String> answers, List<Answer> answers2) {  
	    super();  
	    this.id = id;  
	    this.name = name;  
	    this.address = address; 
	    this.answers = answers; 
	    this.answers2=answers2;
	}  

	public Employee(int id) {
		this.id = id;
	}

	public Employee(String name) {
		this.name = name;
	}

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	void show() {
		System.out.println(id + " " + name);
	}
	
	void show2() {
		System.out.println(id + " " + name);
		System.out.println(address.toString()); 
	}
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    } 
	    
	} 
	public void displayInfo2(){  
	    System.out.println(id+" "+name);  
	    System.out.println(address.toString());
	    Iterator<String> itr=answers.iterator();  
	    while(itr.hasNext()){  
	        System.out.println(itr.next());  
	    } 
	    Iterator<Answer> itr2=answers2.iterator();  
	    while(itr2.hasNext()){  
	        System.out.println(itr2.next());  
	    } 
	    
	}  

}