/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-10-04
 */
package edu.fsu.Y201709Ooad.guitars_enums;

/**
 * Enum for Builder name of the  Guitar
 * @author divya kasu,Sindhuja Morampudi
 */
public enum Builder {
	
FENDER, MARTIN,GIBSON,COLLINGS,OLSON,RYAN,PRS, ANY;
public String toString(){
	switch(this){		
	case FENDER : 
		return "Fender";
	case MARTIN : 
		return "Martin";
	case GIBSON : 
		return "Gibson";
	case COLLINGS : 
		return "Collings";
	case OLSON : 
		return "Olson";
	case RYAN : 
		return "Ryan";
	case PRS : 
		return "PRS";
	case ANY : 
		return "Any";
	default:
		return "unspecified";
	}
	
}
}
