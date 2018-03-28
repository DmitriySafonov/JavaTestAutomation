public class HouseholdDetergents extends CustomerGoods {
				private String UsageDescription;
				private String StateOfMatter;
				private boolean IsChemicalsFree;
				
		public String readUsageDescription() {return UsageDescription;};
		private void removeDirt() {};
		public String getStateOfMatter() {
			return StateOfMatter;
		}
		public void setStateOfMatter(String stateOfMatter) {
			StateOfMatter = stateOfMatter;
		}
		public boolean isIsChemicalsFree() {
			return IsChemicalsFree;
		}
		public void setIsChemicalsFree(boolean isChemicalsFree) {
			IsChemicalsFree = isChemicalsFree;
		}
		public void setUsageDescription(String usageDescription) {
			UsageDescription = usageDescription;
		};
		
}
