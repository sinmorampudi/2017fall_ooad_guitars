/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-09-20
 */
package edu.fsu.Y201709Ooad.guitars_enums;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Divya Kasu,Sindhuja Morampudi
 * Unit test for Guitar class to test add,search and fetch functionality
 */
public class InventoryTest {

	@Before
	public void setUp() throws Exception {
	}
 
	//Test for adding guitar to inventory
	@Test
	public void testAddGuitar() {
		
		Inventory test1 = new Inventory();
		    test1.addGuitar("11277", 3999.95, 
		    	      new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
		                      Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		    
		    test1.addGuitar("V95693", 1499.95, 
		    	      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                      Wood.ALDER, Wood.ALDER));
		    
		    assertEquals(2,test1.getAllGuitars().size());
		    
		    
		
	}
	
	//Test for fetching the guitar from the inventory

	@Test
	public void getGuitar() {
		
		Inventory test2 = new Inventory();
		test2.addGuitar("76531", 6295.95, 
			      new GuitarSpec(Builder.MARTIN, "OM-28", Type.ACOUSTIC, 6,
			                     Wood.BRAZILIAN_ROSSWOOD, Wood.ADIRONDACK));
		test2.addGuitar("70108276", 2295.95, 
			      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
			                     Wood.MAHOGANY, Wood.MAHOGANY));
		Guitar matchingGuitar=test2.getGuitar("76531");
		System.out.println("--------"+matchingGuitar.getSpec().getBuilder());
		assertEquals("76531",matchingGuitar.getSerialNumber());
		
		
		
		
		
	}
	
	//Test for searching only "GIBSON" as builder
	@Test
	public void testSearchGuitar1()
	{	
		Inventory test3 = new Inventory();
		test3.addGuitar("152211", 8999.95f, new GuitarSpec(Builder.COLLINGS, "CJ", Type.ACOUSTIC, 6,
                Wood.INDIAN_ROSEWOOD, Wood.SITKA));
		test3.addGuitar("52211", 8999.95f, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("V9512", 1549.95,new GuitarSpec(Builder.GIBSON, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("70108276", 2295.95, 
			      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    
	    whatErinLikes.setBuilder(Builder.GIBSON);
	
	    List<Guitar> MatchedGuitars = new ArrayList<Guitar>(); 
	    Guitar gt = new Guitar("",0.0,whatErinLikes);
	    MatchedGuitars= test3.getGuitarWithIncompleteData(gt);
	    System.out.println("only gibson as a builder:");
	    for(int i=0;i<MatchedGuitars.size();i++)
	    {
	    if (MatchedGuitars.get(i).getSpec().getBuilder().toString().equalsIgnoreCase("GIBSON") )
	    {
	    	System.out.println("matching vales found");
	      
	    }
	    }
	    assertTrue("GIBSON".equalsIgnoreCase((MatchedGuitars.get(0).getSpec().getBuilder()).toString()));
	    assertFalse("GIBSON1".equalsIgnoreCase((MatchedGuitars.get(1).getSpec().getBuilder()).toString()));
	    
	}
	
	//Test for searching only "FENDER" as builder
	@Test
	public void testSearchGuitar2()
	{	
		Inventory test3 = new Inventory();
		test3.addGuitar("V9512", 1549.95, 
			      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		test3.addGuitar("52211", 8999.95f, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("V9512", 1549.95,new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("70108276", 2295.95, 
			      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    
	    whatErinLikes.setBuilder(Builder.FENDER);
	    
	    List<Guitar> MatchedGuitars = new ArrayList<Guitar>(); 
	    Guitar gt = new Guitar("",0.0,whatErinLikes);
	    MatchedGuitars= test3.getGuitarWithIncompleteData(gt);
	    System.out.println("only Fender as a builder:");
	    for(int i=0;i<MatchedGuitars.size();i++)
	    {
	    if (MatchedGuitars.get(i).getSpec().getBuilder().toString().equalsIgnoreCase("FENDER" ))
	    {
	      
	      System.out.println("Matching values found");
	    }
	    }
	    assertTrue("FENDER".equalsIgnoreCase((MatchedGuitars.get(0).getSpec().getBuilder()).toString()));
	    assertFalse("FENDER1".equalsIgnoreCase((MatchedGuitars.get(2).getSpec().getBuilder()).toString()));
	    
	}
	
	//Test for searching only "ELECTRIC" as Type
	@Test
	public void testSearchGuitar3()
	{	
		Inventory test3 = new Inventory();
		test3.addGuitar("V9512", 1549.95, 
			      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		test3.addGuitar("52211", 8999.95f, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("V9512", 1549.95,new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("70108276", 2295.95, 
			      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    
	    whatErinLikes.setType(Type.ELECTRIC);
	    
	    List<Guitar> MatchedGuitars = new ArrayList<Guitar>(); 
	    Guitar gt = new Guitar("",0.0,whatErinLikes);
	    MatchedGuitars= test3.getGuitarWithIncompleteData(gt);
	    System.out.println("only ELECTRIC as a Type:");
	    for(int i=0;i<MatchedGuitars.size();i++)
	    {
	    	System.out.println("matching vales found");
	    if (MatchedGuitars.get(i).getSpec().getType().toString().equalsIgnoreCase("ELECTRIC" ))
	    	
	    {
	      
	      System.out.println("matching vales found");
	    }
	    }
	    assertTrue("ELECTRIC".equalsIgnoreCase((MatchedGuitars.get(0).getSpec().getType()).toString()));
	    assertFalse("ELECTRIC1".equalsIgnoreCase((MatchedGuitars.get(1).getSpec().getType()).toString()));

	    
	}
	
	//Test for searching with the given parameters
	@Test
	public void testSearchGuitar4()
	{	
		Inventory test3 = new Inventory();
		test3.addGuitar("V9512", 1549.95, 
			      new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
		                     Wood.ALDER, Wood.ALDER));
		test3.addGuitar("52211", 8999.95f, new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("V9512", 1549.95,new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, 6,
                Wood.ALDER, Wood.ALDER));
		test3.addGuitar("70108276", 2295.95, 
			      new GuitarSpec(Builder.GIBSON, "Les Paul", Type.ELECTRIC, 6,
		                     Wood.MAHOGANY, Wood.MAHOGANY));
		
		GuitarSpec whatErinLikes = new GuitarSpec();
	    
		whatErinLikes.setBuilder(Builder.FENDER);
		whatErinLikes.setType(Type.ELECTRIC);
		whatErinLikes.setBackWood(Wood.ALDER);
		whatErinLikes.setTopWood(Wood.ALDER);
		whatErinLikes.setModel("Stratocastor");
	    
	    
	    List<Guitar> MatchedGuitars = new ArrayList<Guitar>(); 
	    Guitar gt = new Guitar("",0.0,whatErinLikes);
	    MatchedGuitars= test3.getGuitarWithIncompleteData(gt);
	    System.out.println("only ELECTRIC as a Type:");
	    if (!MatchedGuitars.isEmpty()) 
	    {
	      System.out.println("Size of the guitars list is " +MatchedGuitars.size());
	      assertEquals(4,MatchedGuitars.size());
	    }
	    
	    assertTrue("ELECTRIC".equalsIgnoreCase((MatchedGuitars.get(0).getSpec().getType()).toString()));
	    assertFalse("ALDER1".equalsIgnoreCase((MatchedGuitars.get(1).getSpec().getTopWood()).toString()));
	}
	
     


}
