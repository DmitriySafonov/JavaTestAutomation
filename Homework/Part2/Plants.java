
import java.util.*;

public class Plants {
			private String LatinName; //Basic info
			private String Type; //Basic info
			private int YearOfDiscovery; //Basic info
			public String CommonName;
			public String AreaOfDistribution;
			public float HeightMeters; //meters
			private int LifetimePeriodValue;
			private String LifetimePeriodUnit;
			public Date LifetimeStart;
			private int lifetimeToEnablePeroduction;
			public boolean IsAbleToReproducing;
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
		public void purInPlants() {LifetimeStart= new Date();};
		
		private void grow() {};
		private void reproducing() {};
		private void decay() {};
		private void processingLifeCycle() {};
		
}
