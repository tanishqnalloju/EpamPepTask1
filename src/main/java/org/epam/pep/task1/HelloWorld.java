package org.epam.pep.task1;

import java.util.logging.Logger;
import java.util.*;  

public class HelloWorld {

    public static void main(String... args) {
        //Logger logger=Logger.getLogger(HelloWorld.class.getName());
        //logger.info("This is a Hello World!");    
    	
    	ArrayList<String> typesOfConfectionery=new ArrayList<String>();
    	typesOfConfectionery.add("Sweet");
    	typesOfConfectionery.add("Chocolate");
    	typesOfConfectionery.add("CandyBar");
    	
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.println("Enter number of children");
    	int noOfChildren = sc.nextInt();
    	for(int child = 0; child < noOfChildren ; child++) {
    		
    		System.out.println("Enter the confectioneries numbers in the same line to add");
    		
    		
    	}
    	
    	}
}
