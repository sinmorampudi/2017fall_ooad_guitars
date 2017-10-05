/**
 * Class: Object-Oriented Design and Analysis
 * Professor: Orlando Montalvo
 * Assignment: HW 2
 * 
 * Date: 2017-10-04
 */
package edu.fsu.Y201709Ooad.guitars_enums;
/**
 * 
 * Guitar properties and getter and setter methods are 
 * defined in this class
 * 
 * 
 * 
 * @author Sindhuja Morampudi,Divya Kasu
 * @version 1.0
 * @since   09-23-2017
 */



public class Guitar {

  private String serialNumber;
  private double price;
  GuitarSpec spec;

  /**
 * Parameterized constructor
 * @param serialNumber,this is the serial number for guitar given by sales company
 * @param price,this is the price of the guitar given by sales company
 * @param spec,spec contains all the specifications of guitar other than serialNumber & price
 */
public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }
  

 
 /**
 * Getter for the serial number of the Guitar
 * @return serialNumber,this is serial number given by sales company
 */
public String getSerialNumber() {
    return serialNumber;
  }

  
 /**
 * Getter for price of the guitar
 * @return price ,this is price of the Guitar given by sales company
 */
public double getPrice() {
    return price;
  }


  /**
 * Setter for the price of the guitar
 * @param price ,this is price of the Guitar given by sales company
 */
public void setPrice(float newPrice) {
    this.price = newPrice;
  }
  
 
/**
 * Getter for specifications of the guitar
 * @return spec ,this is specification of the Guitar 
 */
  public GuitarSpec getSpec() {
    return spec;
  }
  
 

}
