

public class MusicInstruments {
			private String Manufacturer;
			private int ProductionYear;
			private String MadeIn; 
			private String Brand;
			private String Model;
			private String Classification; //Stringed, Precussion, Wind, Electronic etc.
			private String Colour;
			private int WarrantyPeriod; //Number of months
			private float WeightNet;
			private float WeightBrutto;
			private float Price;
			private String Currency;
			private boolean IsPacked;
			private float TuneLevelPercent; //value between 0 and 1 
			
		public void tuningSound() {TuneLevelPercent=1;};
		public void cleaning() {};
		public void repair() {};
		public void customization() {};
		public void playOn() {generationOfSound();};
		public void pack() {IsPacked=true;};			
		public void unpack() {IsPacked=false;};
		
		private void generationOfSound() {};
		private void deterioration() {};
		private void lossingTune(float NewTuneLevelPercent) {TuneLevelPercent=NewTuneLevelPercent;};
		
		public String getManufacturer() {
			return Manufacturer;
		}
		public void setManufacturer(String manufacturer) {
			Manufacturer = manufacturer;
		}
		public int getProductionYear() {
			return ProductionYear;
		}
		public void setProductionYear(int productionYear) {
			ProductionYear = productionYear;
		}
		public String getMadeIn() {
			return MadeIn;
		}
		public void setMadeIn(String madeIn) {
			MadeIn = madeIn;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
		}
		public String getModel() {
			return Model;
		}
		public void setModel(String model) {
			Model = model;
		}
		public String getClassification() {
			return Classification;
		}
		public void setClassification(String classification) {
			Classification = classification;
		}
		public String getColour() {
			return Colour;
		}
		public void setColour(String colour) {
			Colour = colour;
		}
		public int getWarrantyPeriod() {
			return WarrantyPeriod;
		}
		public void setWarrantyPeriod(int warrantyPeriod) {
			WarrantyPeriod = warrantyPeriod;
		}
		public float getWeightNet() {
			return WeightNet;
		}
		public void setWeightNet(float weightNet) {
			WeightNet = weightNet;
		}
		public float getWeightBrutto() {
			return WeightBrutto;
		}
		public void setWeightBrutto(float weightBrutto) {
			WeightBrutto = weightBrutto;
		}
		public float getPrice() {
			return Price;
		}
		public void setPrice(float price) {
			Price = price;
		}
		public String getCurrency() {
			return Currency;
		}
		public void setCurrency(String currency) {
			Currency = currency;
		}
		public boolean getIsPacked() {
			return IsPacked;
		}
		public float getTuneLevelPercent() {
			return TuneLevelPercent;
		};
}
