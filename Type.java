/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fsu.Y201709Ooad.guitars_enums;

/**
 * Enum for type of Guitar
 * @author Divya Kasu,Sindhuja Morampudi
 */
public enum Type {

	ACOUSTIC, ELECTRIC;
	public String toString(){
		switch(this){		
		case ACOUSTIC : 
			return "acoustic";
		case ELECTRIC : 
			return "electric";
		 default:  
			return "unspecified";
		
		}
	}
}
