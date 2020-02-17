package org.epam.pep.task1;

import java.util.logging.Logger;
import java.util.*;  
import org.epam.pep.task1.ClassCreator;

public class HelloWorld {

    public static void main(String... args) {
        //Logger logger=Logger.getLogger(HelloWorld.class.getName());
        //logger.info("This is a Hello World!");    
    	
    	//Creating an object to access the createObject() in ClassCreator
    	ClassCreator creator = new ClassCreator();
    	
    	
    	//Creating a list of all the available confectionery class
    	ArrayList<String> Menu = new ArrayList<String>();
    	HashMap<Integer, ClassCreator.ConfectioneryType> typesOfConfectionery=new HashMap<Integer, ClassCreator.ConfectioneryType>();
    	/*
    	 * Depreceated data structure for the types of confectioneries
    	 * Reused for printing the list of all types of confectioneries
    	 */
    	Menu.add("Sweet");
    	Menu.add("Chocolate");
    	Menu.add("CandyBar");
    	/**/
    	//Using HashMap for mapping (key, value) pairs i.e. (Number, Name)
    	
    	typesOfConfectionery.put(1, ClassCreator.ConfectioneryType.SW);
    	typesOfConfectionery.put(2, ClassCreator.ConfectioneryType.CH);
    	typesOfConfectionery.put(3, ClassCreator.ConfectioneryType.CB);
    	
    	//HashMap<String, String> Menu = new HashMap<String, String>;
    	//Menu.put(ClassCreator.ConfectioneryType.SW, "Sweet");    	
    	
    	
    	//creating a scanner object for input
    	Scanner inputReader = new Scanner(System.in);
    	
    	//Input for the number of children the program has to store
    	System.out.println("Enter number of children");
    	int noOfChildren = inputReader.nextInt();
    	//Loop for reading all the children details
    	
    	//creating an array list of children
    	ArrayList<Child> children = new ArrayList<Child>();
    	
    	for(int child = 0; child < noOfChildren ; child++) {
    		
    		//Displaying the list of all items in the confectionery
    		System.out.println("Confectinery Menu");
    		//To iterate through the keySet() of the HashMap 
    		//Iterator item = typesOfConfectionery.keySet().iterator();
    		
    		int index = 0;
    		for(String item : Menu) {
    			System.out.println(index + " " +item);
    			index ++ ;
    		}
    		/*
    		while(item.hasNext()) {
    			System.out.println(item.next());
    		}
    		*/
    		
    		
    		//Reading the confectionery number as in the list displayed and it's respective weight
    		//E.g. 1 200
    		// The '1' denotes the 'Sweet' in the list and the '200' represents the weight of the 
    		//sweet in grams like 200 grams of the confectionery type sweet.
    		
    		System.out.println("Enter the confectioneries numbers with in the same line to add");
    		System.out.println("End input with a empty line or double enter!");
    		
    		String pair = inputReader.nextLine();
    		String skip = "";
    		while(!pair.equals(skip)) {
    			System.out.println("Number Weight");
    			String[] keyValue = pair.split(" ");
    			int confectioneryNumber = Integer.parseInt(keyValue[0]);
    			int confectioneryWeight = Integer.parseInt(keyValue[1]);
    			
    			
    			
    			
    		}
    		
    		
    		
    	}
    	
    	}
}
