package org.epam.pep.task1;
import java.util.*;  

class Gift{
	
	ArrayList<Confectionery> gifts = new ArrayList<Confectionery>();
	
	Gift(){
		
	}
	
	void add(Confectionery conf){
		gifts.add(conf);
	}
	
	ArrayList<Confectionery> allItems(){
		return gifts;
	}

}