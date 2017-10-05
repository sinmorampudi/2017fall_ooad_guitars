/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-10-04
 */
package edu.fsu.Y201709Ooad.guitars_enums;


import java.util.Iterator;
import java.util.List;


/**
 * Used to test the functionalities 
 * like adding guitar,getting price,searching guitar ect
 * 
 * 
 * 
 * @author Sindhuja Morampudi,Divya Kasu
 * @version 1.0
 * @since   09-23-2017
 *
 */

public class FindGuitarTester {
/**
 * 
 * Prints the data for complete and incomplete search
 * 
 */	 	
  public static void main(String[] args) {
    // Set up Rick's guitar inventory
	  
    Inventory inventory = new Inventory();
    initializeInventory(inventory);
    
    //Input for complete search
    GuitarSpec whatErinLikes = 
      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
              Wood.BRAZILIAN_ROSSWOOD, Wood.ADIRONDACK);
    List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
    if (!matchingGuitars.isEmpty()) {
      System.out.println("!!!!Erin, you might like these guitars:");
      for (Iterator<Guitar> i = matchingGuitars.iterator(); i.hasNext(); ) {
        Guitar guitar = i.next();
        GuitarSpec spec = guitar.getSpec();
         System.out.println("  We have a " +
           spec.getBuilder() + " " + spec.getModel() + " " +
           spec.getType() + " guitar:\n     " +
           spec.getBackWood() + " back and sides,\n     " +
           spec.getTopWood() + " top.\n  You can have it for only $" +
           guitar.getPrice() + "!\n  ----");
      }
    } else {
      System.out.println("Sorry, Erin, we have nothing for you.");
    }
    
        //Input for search based on serial number
    Guitar guitar = inventory.getGuitar("827655001");
    if(guitar!=null && guitar.getSerialNumber().equals("82765501")){
		System.out.println("Yes I got the Guitar, was the one I am looking for !!!! \n");
	}else{
		System.out.println(" Requested Guitar with this serial number is not available in the List");
	}
        
        //Input for search based on price
    List<Guitar> guitarprice = inventory.getGuitarByPrice(3000.00d,6000.00d);
    if(guitarprice!=null ){
    	System.out.println("Yes we have "+" "+guitarprice.size()+""+"matching guitars with in this price range " );
    	for (Iterator<Guitar> i = guitarprice.iterator(); i.hasNext(); )
    	{
    		Guitar guitar1 = i.next();
        GuitarSpec spec = guitar1.getSpec();
         System.out.println("  We have a " +
           spec.getBuilder() + " " + spec.getModel() + " " +
           spec.getType() + " guitar:\n     " +
           spec.getBackWood() + " back and sides,\n     " +
           spec.getTopWood() + " top.\n  You can have it for only $" +
           guitar1.getPrice() + "!\n  ----");
		
    	}
	}else{
		System.out.println("Requested Guitar is not available in the List");
	}
       //Only one input value to search for Guitar
    Guitar incompletedata=new Guitar("V95693",0,new GuitarSpec());
    List<Guitar> matchingGuitars1 = inventory.getGuitarWithIncompleteData(incompletedata);
    if(matchingGuitars1!=null && matchingGuitars1.size()>0)
    {
    	for (Iterator<Guitar> i = matchingGuitars1.iterator(); i.hasNext(); ) {
            Guitar guitars = i.next();
            GuitarSpec spec = guitars.getSpec();
            System.out.println("  I have a " +
              spec.getBuilder() + " " + spec.getModel() + " " +
              spec.getType() + " guitar:\n     " +
              spec.getBackWood() + " back and sides,\n     " +
              spec.getTopWood() + " top.\n  You can have it for only $" +
              guitars.getPrice() + "!\n  ----" +
              guitars.getSerialNumber());
          }
    }
    
  }

  /**
 * Guitars are added to inventory
 * @param inventory,this is an inventory object
 */
private static void initializeInventory(Inventory inventory) {
    inventory.addGuitar("11277", 3999.95, 
      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
                     Wood.INDIAN_ROSEWOOD, Wood.SITKA));
    inventory.addGuitar("V95693", 1499.95, 
      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                     Wood.ALDER, Wood.ALDER));
    inventory.addGuitar("V9512", 1549.95, 
      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                     Wood.ALDER, Wood.ALDER));
    inventory.addGuitar("122784", 5495.95, 
      new GuitarSpec(Builder.MARTIN, "D-18", Type.ACOUSTIC, 6,
                     Wood.MAHOGANY, Wood.ADIRONDACK));
    inventory.addGuitar("76531", 6295.95, 
      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
                     Wood.BRAZILIAN_ROSSWOOD, Wood.ADIRONDACK));
    inventory.addGuitar("70108276", 2295.95, 
      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
                     Wood.MAHOGANY, Wood.MAHOGANY));
    inventory.addGuitar("82765501", 1890.95, 
      new GuitarSpec(Builder.GIBSON, "SG '61 Reissue", Type.ELECTRIC, 6,
                     Wood.MAHOGANY, Wood.MAHOGANY));
    inventory.addGuitar("77023", 6275.95, 
      new GuitarSpec(Builder.MARTIN, "D-28", Type.ACOUSTIC, 6,
                     Wood.BRAZILIAN_ROSSWOOD, Wood.ADIRONDACK));
    inventory.addGuitar("1092", 12995.95, 
      new GuitarSpec(Builder.OLSON, "SJ", Type.ACOUSTIC, 12,
                     Wood.BRAZILIAN_ROSSWOOD, Wood.CEDER));
    inventory.addGuitar("566-62", 8999.95, 
      new GuitarSpec(Builder.RYAN, "Cathedral", Type.ACOUSTIC, 12,
                     Wood.COCOBOLO, Wood.CEDER));
   inventory.addGuitar("6 29584", 2100.95, 
     new GuitarSpec(Builder.PRS, "Dave Navarro Signature", Type.ELECTRIC, 
                    6, Wood.MAHOGANY, Wood.MAPPLE));
    
  }
  
 


}
