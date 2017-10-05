/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fsu.Y201709Ooad.guitars_enums;
/**
 * Enum for Wood Type for Guitar
 * @author Divya Kasu,Sindhuja Morampudi
 *
 */
public enum Wood {

	INDIAN_ROSEWOOD, BRAZILIAN_ROSSWOOD, MAHOGANY, MAPPLE, COCOBOLO, CEDER, ADIRONDACK, ALDER, SITKA;

	public String toString() {
		switch (this) {
		case INDIAN_ROSEWOOD:
			return "Indian Rosewood";
		case BRAZILIAN_ROSSWOOD:
			return "Brazilian Rosewood";
		case MAHOGANY:
			return "Mahogany";
		case MAPPLE:
			return "Maple";
		case COCOBOLO:
			return "Cocobolo";
		case CEDER:
			return "Cedar";
		case ADIRONDACK:
			return "Adirondack";
		case ALDER:
			return "Alder";
		case SITKA:
			return  "Sitka";
		default: 	
			return "unspecified";

	}
}
}
