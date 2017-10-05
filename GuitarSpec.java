
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
 * getters and setters for guitar specification properties
 * 
 * @author Divya Kasu,Sindhuja Morampudi
 * @version 1.0
 * @since   09-23-2017*
 */
public class GuitarSpec {
 
  private Builder builder; 
  private String model;
  private Type type;
  private int numStrings;
  private Wood backWood;
  private Wood topWood;
  
  

  /**
 * Parameterized constructor for guitar specification properties
 * @param builder,this is the builder name for guitar
 * @param model,this is the model name  of the guitar
 * @param type,this is the type of the guitar
 * @param numStrings,this is the number of the strings for the guitqr
 * @param backWood,this is type of backWood for guitar
 * @param topWood,this is the type of topWood for guitar
 */
public GuitarSpec(Builder builder, String model, Type type,
                    int numStrings, Wood backWood, Wood topWood) {

	  this.model=model;
	  this.builder=builder;
	  this.type=type;
	  this.backWood=backWood;
	  this.topWood=topWood;
	  this.numStrings=numStrings;

  }

    
  /**
 * Parameterized constructor to set builder value
 * @param builder,this is the builder name for guitar
 */
public GuitarSpec(Builder builder) {
		
	setBuilder(builder);
		
}

 /**
 * Parameterized constructor to set type value
 * @param type,this is the type of the guitar
 */
public GuitarSpec(Type type) {
		
	  setType(type);
		
}
  
  
 /**
 * Default constructor
 */
public GuitarSpec() {
	// TODO Auto-generated constructor stub
}



/**
 * Getter for the Builder value
 * @return builder,this is name of the builder of the guitar
 */
public Builder getBuilder() {
	return builder;
}



/**
 * Setter for the Builder value
 * @param builder,this is name of the builder of the guitar
 */
public void setBuilder(Builder builder) {
	this.builder = builder;
}



/**
 * Getter for the model name of the guitar
 * @return model,this is the name of the model name of the guitar
 */
public String getModel() {
	return model;
}



/**
 * Setter for the model name of the guitar
 * @param model,this is the name of the model name of the guitar
 */
public void setModel(String model) {
	this.model = model;
}



/**
 * Getter for the type of the guitar
 * @return type,this is the type of the guitar
 */
public Type getType() {
	return type;
}



/**
 * Setter for the type of the guitar
 * @param type,this is the type of the guitar
 */
public void setType(Type type) {
	this.type = type;
}



/**
 * Getter for the type of backwood for guitar
 * @return backWood,this is type of backwood for guitar
 */
public Wood getBackWood() {
	return backWood;
}



/**
 * Setter for the type of backwood for guitar
 * @param backWood,this is type of backwood for guitar
 */
public void setBackWood(Wood backWood) {
	this.backWood = backWood;
}



/**
 * Getter for the type of topWood for guitar
 * @return topWood,this is type of topWood for guitar
 */
public Wood getTopWood() {
	return topWood;
}



/**
 * Setter for the type of topWood for guitar
 * @param topWood,this is type of topWood for guitar
 */
public void setTopWood(Wood topWood) {
	this.topWood = topWood;
}



/**
 * Compares every guitar property with the input guitar properties
 * @param matchSpec,this contains guitar specification properties of I/P guitar
 * @return true/false, returns true if all the properties are matched 
 * and returns false if at least one property is not matched or null 
 */
public boolean matches(GuitarSpec matchSpec) {
    if (builder != matchSpec.builder)
    	return false;
   // if ((model != null) && (!model.equals("")) &&
    if (model!=null && !model.equals("") && !model.toLowerCase().equals(matchSpec.model.toLowerCase()))
      return false;
    if (type != matchSpec.type)
      return false;
    if (numStrings != matchSpec.numStrings)
      return false;
    if (backWood != matchSpec.backWood)
      return false;
    if (topWood != matchSpec.topWood)
      return false;
    return true;
  }
}
