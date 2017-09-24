package Assignment2;
//package com.oops.concepts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * This class adds the guitar details
 * to the inventory,search operation
 * is performed to get the matching details
 * a particular guitar from inventory
 * 
 * 
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
 * adds guitar to inventory
 * @param serialNumber
 * @param price
 * @param spec
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
 * searches by serial number
 * @param serialNumber
 * @return guitar or null
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
 * returns list of matching guitars
 * @param searchSpec
 * @return matching guitars
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
 * searches by price
 * @param d
 * @return guitar or null
 */
public Guitar getGuitarByPrice(double d) {
	for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
	      Guitar guitar = (Guitar)i.next();
	      if (guitar.getPrice()==d) {
	        return guitar;
	      }
	    }
	    return null;
}
 
  
/**
 * searches with incomplete data
 * @param guitindata
 * 
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
	    	  else if(guitar.getSpec().matches(guitindata.getSpec()))
	    	  {
	    		  matchingGuitars.add(guitar);
	    		  
	    	  }
	    	  else if(guitar.getSpec().getModel().equalsIgnoreCase(guitindata.getSpec().getModel()))
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
