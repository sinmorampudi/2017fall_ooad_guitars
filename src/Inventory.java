import java.util.Iterator;
import java.util.LinkedList;
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
 * @author Sindhuja Morampudi
 * @version 1.0
 * @since   09-09-2017
 */

public class Inventory {
  private List<Guitar> guitars;
  
  
//constructor
  
  public Inventory() {
    guitars = new LinkedList<Guitar>();
  }

  /**
 * This method is used to add guitars to the inventory
 * @param serialNumber
 * @param price
 * @param builder
 * @param model
 * @param type
 * @param backWood
 * @param topWood
 */
public void addGuitar(String serialNumber, double price,
                        String builder, String model,
                        String type, String backWood, String topWood) {
    Guitar guitar = new Guitar(serialNumber, price, builder,
                               model, type, backWood, topWood);
    guitars.add(guitar);
  }
  
  
  /**
 * This method accepts serialNumber as I/P
 * and returns guitar based on serial number
 * @param serialNumber
 * @return guitar
 */
public Guitar getGuitar(String serialNumber) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar = i.next();
      if (guitar.getSerialNumber().equals(serialNumber)) {
        return guitar;
      }
    }
    return null;
  }
  /**
 * This method is used to search for the 
 * matching guitar in the inventory
 * @param searchGuitar
 * @return guitar
 */
public Guitar search(Guitar searchGuitar) {
    for (Iterator<Guitar> i = guitars.iterator(); i.hasNext(); ) {
      Guitar guitar =i.next();
      // Ignore serial number since that's unique
      // Ignore price since that's unique
      String builder = searchGuitar.getBuilder();
      if ((builder != null) && (!builder.equals("")) &&
          (!builder.equals(guitar.getBuilder())))
        continue;
      String model = searchGuitar.getModel();
      if ((model != null) && (!model.equals("")) &&
          (!model.equals(guitar.getModel())))
        continue;
      String type = searchGuitar.getType();
      if ((type != null) && (!searchGuitar.equals("")) &&
          (!type.equals(guitar.getType())))
        continue;
      String backWood = searchGuitar.getBackWood();
      if ((backWood != null) && (!backWood.equals("")) &&
          (!backWood.equals(guitar.getBackWood())))
        continue;
      String topWood = searchGuitar.getTopWood();
      if ((topWood != null) && (!topWood.equals("")) &&
          (!topWood.equals(guitar.getTopWood())))
        continue;
      return guitar;
    }
    return null;
  }
}
