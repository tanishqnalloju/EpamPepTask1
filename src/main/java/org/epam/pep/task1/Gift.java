package org.epam.pep.task1;
import java.util.*;  

class Gift{
	
	ArrayList<Confectionery> gifts = new ArrayList<Confectionery>();
	
	Gift(){
		//empty constructor
	}
	
	void add(Confectionery conf){
		this.gifts.add(conf);
	}
	
	ArrayList<Confectionery> allItems(){
		return gifts;
	}

}