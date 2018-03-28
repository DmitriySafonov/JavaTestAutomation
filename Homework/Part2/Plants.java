
import java.util.*;

public class Plants {
				private String LatinName; //Basic info
				private String Type; //Basic info
				private int YearOfDiscovery; //Basic info
				public String CommonName;
				private String AreaOfDistribution;
				private float HeightMeters; //meters
				private int LifetimePeriodValue;
				private String LifetimePeriodUnit;
				private Date LifetimeStart;
				private int LifetimeToEnablePeroduction;
				private boolean IsAbleToReproducing;
				private boolean IsAlive = true;
			
			
				public void setBasicInfo(String NewLatinName, String NewCommonName, String NewType, int NewYearOfDiscovery) {
					LatinName=NewLatinName;
					CommonName=NewCommonName;
					Type=NewType;
					YearOfDiscovery=NewYearOfDiscovery;
				};
				public String getBasicInfo() {
					String result = "Common name: " + CommonName + "\nLatin name: " + LatinName + "\nType: " + Type + "\nDiscovered in " + YearOfDiscovery;
					return result;
				};
				public float measureHeight() {return HeightMeters;};
				public void breed() {};
				public void eliminate() {IsAlive=false;};
				public void putInPlants(String NewAreaOfDistribution) {LifetimeStart= new Date();AreaOfDistribution=NewAreaOfDistribution;};

				private void grow() {};
				private void reproducing() {};
				private void decay() {};
				private void processingLifeCycle() {}
				public String getLatinName() {
					return LatinName;
				}
				public void setLatinName(String latinName) {
					LatinName = latinName;
				}
				public String getType() {
					return Type;
				}
				public void setType(String type) {
					Type = type;
				}
				public int getYearOfDiscovery() {
					return YearOfDiscovery;
				}
				public void setYearOfDiscovery(int yearOfDiscovery) {
					YearOfDiscovery = yearOfDiscovery;
				}
				public String getAreaOfDistribution() {
					return AreaOfDistribution;
				}
				public void setAreaOfDistribution(String areaOfDistribution) {
					AreaOfDistribution = areaOfDistribution;
				}
				public int getLifetimePeriodValue() {
					return LifetimePeriodValue;
				}
				public void setLifetimePeriodValue(int lifetimePeriodValue) {
					LifetimePeriodValue = lifetimePeriodValue;
				}
				public String getLifetimePeriodUnit() {
					return LifetimePeriodUnit;
				}
				public void setLifetimePeriodUnit(String lifetimePeriodUnit) {
					LifetimePeriodUnit = lifetimePeriodUnit;
				}
				public Date getLifetimeStart() {
					return LifetimeStart;
				}
				public void setLifetimeStart(Date lifetimeStart) {
					LifetimeStart = lifetimeStart;
				}
				public int getLifetimeToEnablePeroduction() {
					return lifetimeToEnablePeroduction;
				}
				public void setLifetimeToEnablePeroduction(int LifetimeToEnablePeroduction) {
					this.LifetimeToEnablePeroduction = LifetimeToEnablePeroduction;
				}
				public boolean getIsAbleToReproducing() {
					return IsAbleToReproducing;
				}
				public void setIsAbleToReproducing(boolean isAbleToReproducing) {
					IsAbleToReproducing = isAbleToReproducing;
				}
				public boolean getIsAlive() {
					return IsAlive;
				}
				public void setHeightMeters(float heightMeters) {
					HeightMeters = heightMeters;
				};
		
}
