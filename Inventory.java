/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-10-04
 */
package edu.fsu.Y201709Ooad.guitars_enums;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Adds the guitar details
 * to the inventory,search operation
 * is performed to get the matching details
 * a particular guitar from inventory
 * 
 * 
 * @author Sindhuja Morampudi,Divya Kasu
 * @version 1.0
 * @since   09-23-2017
 */
public class Inventory {
  private List<Guitar> guitars;

  public Inventory() {
    guitars = new ArrayList<Guitar>();
  }

  /**
 * Adds guitar to inventory
 * @param serialNumber,this is the serial number of the guitar given by the store
 * @param price,this is price of the guitar given by the store
 * @param spec,this is specifications of the guitar
 */
public void addGuitar(String serialNumber, double price,
                        GuitarSpec spec) {
    Guitar guitar = new Guitar(serialNumber, price, spec);
    guitars.add(guitar);
  }

  public List<Guitar> getAllGuitars(){
	  
	  return guitars;
  }
  
  
  
  /**
 * Searches  guitar by serial number
 * @param serialNumber,this is the serial number of the guitar given by the store
 * @return guitar/null,returns matching guitar based on the search performed  serial number,
 * null if no matching guitar with the serial number is found
 */
public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }

  /**
 * Returns list of matching guitars 
 * @param searchSpec,contains specifications of the guitar
 * @return matchingGuitars,this is list of guitars from the inventory
 * which matched with the input given
 */
public List<Guitar> search(GuitarSpec searchSpec) {
    List<Guitar> matchingGuitars = new ArrayList<Guitar>();
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = (Guitar)i.next();
      if (guitar.getSpec().matches(searchSpec))
        matchingGuitars.add(guitar);
    }
    return matchingGuitars;
  }

  
/**
 * Searches for the guitars with in the price parameter range given
 * @param d1,d2 d1 is the lower bound price and d2 is the upper bound price
 * @return matchByPrice,returns list of guitar if they fall in the given price range 
 */
public List<Guitar> getGuitarByPrice(double d1,double d2) {
	List<Guitar> matchByPrice = new ArrayList<Guitar>();
	for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      
	      if (guitar.getPrice()>=d1 && guitar.getPrice()<=d2 ) {
	    	 matchByPrice.add(guitar);
	      }
	    }
	return matchByPrice;
}
 
  
/**
 * Searches for the guitars when at least one parameter is given
 * @param guitindata,guitar for which the inventory to be searched
 * @return matchingGuitars,list of matching guitars from the inventory
 */
public List<Guitar> getGuitarWithIncompleteData(Guitar guitindata) {
	List<Guitar> matchingGuitars = new ArrayList<Guitar>();
	for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getSerialNumber().equals(guitindata.getSerialNumber())) {
	    	  matchingGuitars.add(guitar);
	    	  
	      }
	    	  else if(guitar.getPrice()==(guitindata.getPrice())){
	    		  matchingGuitars.add(guitar);
	    		 
	    	  }
	    	  
	    	  else if( guitar.getSpec().getModel().equalsIgnoreCase(guitindata.getSpec().getModel()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    		  
	    	  }
	    	  else if(guitar.getSpec().getBackWood().equals(guitindata.getSpec().getBackWood()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    		  
	    	  }
	    	  else if(guitar.getSpec().getTopWood().equals(guitindata.getSpec().getTopWood()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    	  }
	    	  else if(guitar.getSpec().getType().equals(guitindata.getSpec().getType()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    	  }
	    	  else if(guitar.getSpec().getBuilder().equals(guitindata.getSpec().getBuilder()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    	  }
	        
	      
	    }
	    return matchingGuitars;
}



 
}
