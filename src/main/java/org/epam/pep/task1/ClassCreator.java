package org.epam.pep.task1;

class ClassCreator{
	
	//Creating an enumerator of special data types consisting of the confectionery types
	public enum ConfectioneryType{ SW, CH, CB };
	
	//Function to return an object based on the confectionery type
	public Confectionery createObject(ConfectioneryType confectionery, int weight) {
		switch(confectionery) {
		case SW:
			return new Sweet(weight);
		case CH:
			return new Chocolate(weight);
		case CB:
			return new CandyBar(weight);
		default:
			return new Confectionery(weight, "None");
			
		}
		
	}
	
	
}