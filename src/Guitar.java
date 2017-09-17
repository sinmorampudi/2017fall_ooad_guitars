/**
 * 
 * Guitar properties and getter and setter methods are 
 * defined in this class
 * 
 * 
 * 
 * @author Sindhuja Morampudi
 * @version 1.0
 * @since   09-09-2017
 */
 
public class Guitar {

  private String serialNumber, builder, model, type, backWood, topWood;
  private double price;
  
  
  //Parameterized constructor
  public Guitar(String serialNumber, double price,
                String builder, String model, String type,
                String backWood, String topWood) {
    this.serialNumber = serialNumber;
    this.price = price;
    this.builder = builder;
    this.model = model;
    this.type = type;
    this.backWood = backWood;
    this.topWood = topWood;
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
  public String getBuilder() {
    return builder;
  }
  public String getModel() {
    return model;
  }
  public String getType() {
    return type;
  }
  public String getBackWood() {
    return backWood;
  }
  public String getTopWood() {
    return topWood;
  }
}
