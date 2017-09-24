package Assignment2;

/**
 * enum for Builder
 * @author divya kasu,Sindhuja Morampudi
 */
public enum Builder {
	
FENDER, MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS, ANY;
String builder = "";
public String toString(){
	switch(this){		
	case FENDER : 
		builder = "Fender";
		return builder;
	case MARTIN : 
		builder = "Martin";
		return builder;
	case GIBSON : 
		builder = "Gibson";
		return builder;
	case COLLINGS : 
		builder = "Collings";
		return builder;
	case OLSON : 
		builder = "Olson";
		return builder;
	case RYAN : 
		builder = "Ryan";
		return builder;
	case PRS : 
		builder = "PRS";
		return builder;
	case ANY : 
		builder = "Any";
		return builder;
	default:
		return "unspecified";
	}
	
}
}
