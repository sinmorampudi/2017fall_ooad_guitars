package Assignment2;


/**
 * enum for Wood
 * @author Divya Kasu,Sindhuja Morampudi
 *
 */
public enum Wood {

	INDIAN_ROSSWOOD, BRAZILIAN_ROSSWOOD, MAHOGANY, MAPPLE, COCOBOLO, CEDER, ADIRONDACK, ALDER, SITKA;
	String wood = "";

	public String toString() {
		switch (this) {
		case INDIAN_ROSSWOOD:
			wood = "Indian Rosewood";
			return wood;
		case BRAZILIAN_ROSSWOOD:
			wood = "Brazilian Rosewood";
			return wood;
		case MAHOGANY:
			wood = "Mahogany";
			return wood;
		case MAPPLE:
			wood = "Maple";
			return wood;
		case COCOBOLO:
			wood = "Cocobolo";
			return wood;
		case CEDER:
			wood = "Cedar";
			return wood;
		case ADIRONDACK:
			wood = "Adirondack";
			return wood;
		case ALDER:
			wood = "Alder";
			return wood;
		case SITKA:
			wood = "Sitka";
			return wood;
		default: 	
			return "unspecified";

	}
}
}
