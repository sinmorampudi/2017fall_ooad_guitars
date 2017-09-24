package Assignment2;

/**
 * enum for type
 * @author Divya Kasu,Sindhuja Morampudi
 */
public enum Type {

	ACOUSTIC, ELECTRIC;
	String acctType = "";
	public String toString(){
		switch(this){		
		case ACOUSTIC : 
			acctType = "acoustic";
			return acctType;
		case ELECTRIC : 
			acctType = "electric";
			return acctType;
		 default:  
			 return "unspecified";
		
		}
	}
}