package myPackage01;

import java.util.*;
import java.util.Map.Entry;

public class AmusementParks extends Entertainments{
						private String ParkType; //e.g. theme park, zoo, aquapark
						private Map<String, Float> AdditionalServicesPrice = new HashMap<String, Float>();
						private int NumberOfParkingPlaces;
						
				public void addAdditionalServivePrice(String NewServiceName, float NewServicePrice) {
					AdditionalServicesPrice.put(NewServiceName, NewServicePrice);
				}
				public String getListAdditionalServicesPrice() {
					String result;
					for( Entry<String, Float> entry : AdditionalServicesPrice.entrySet() ){
						if (result.length()==0) {
							result+= entry.getKey() + " costs " + entry.getValue() + " USD.";
						}else {
							result+= "\n" + entry.getKey() + " costs " + entry.getValue() + " USD.";
						}
					}	
					return result;
				};
				
				
}
