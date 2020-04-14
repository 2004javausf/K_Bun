package com.revature.driver;

import com.revature.bean.Human;

public class Driver {
public static void main (String [] args) { 
	System.out.println ("Roll Tide");
	
	Human h = new Human();
	
	System.out.println(h);
	h.setName("Laura");
	h.setAge(26);
	h.setWeight(160);
	
	System.out.println(h);
}
}
