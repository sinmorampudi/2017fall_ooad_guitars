package Assignment2;



/**
 * 
 * getters and setters for guitar spec properties
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
  
  //parameterized constructor

  public GuitarSpec(Builder builder, String model, Type type,
                    int numStrings, Wood backWood, Wood topWood) {
	    setModel(model);
		setBuilder(builder);
		setType(type);
		setBackWood(backWood);
		setTopWood(topWood);
  }

  public GuitarSpec(Builder builder) {
		
		setBuilder(builder);
		
}

  public GuitarSpec(Type type) {
		
	  setType(type);
		
}
  
  
  public GuitarSpec() {
	// TODO Auto-generated constructor stub
}



public Builder getBuilder() {
	return builder;
}



public void setBuilder(Builder builder) {
	this.builder = builder;
}



public String getModel() {
	return model;
}



public void setModel(String model) {
	this.model = model;
}



public Type getType() {
	return type;
}



public void setType(Type type) {
	this.type = type;
}



public Wood getBackWood() {
	return backWood;
}



public void setBackWood(Wood backWood) {
	this.backWood = backWood;
}



public Wood getTopWood() {
	return topWood;
}



public void setTopWood(Wood topWood) {
	this.topWood = topWood;
}



/**
 * compare matchSpec properties with enum vallues
 * @param matchSpec
 * @return true/false
 */
public boolean matches(GuitarSpec matchSpec) {
    if (builder != matchSpec.builder)
      return false;
   // if ((model != null) && (!model.equals("")) &&
    		if ((model != null) && (model.equals("")) &&		
        (!model.toLowerCase().equals(matchSpec.model.toLowerCase())))
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
