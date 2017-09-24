package Assignment2;
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

//Parameterized constructor
  public Guitar(String serialNumber, double price, GuitarSpec spec) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.spec = spec;
  }
  
//getters and setters for guitar properties

  public String getSerialNumber() {
    return serialNumber;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(float newPrice) {
    this.price = newPrice;
  }

  public GuitarSpec getSpec() {
    return spec;
  }
  
  public String toString(){
      return serialNumber+"         : "+price;
  }

}
