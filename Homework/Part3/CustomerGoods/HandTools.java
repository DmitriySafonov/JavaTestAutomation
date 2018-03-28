public class HandTools extends CustomerGoods {
			private String Purpose;
			private String MaterialOfConstruction;
			private String UsageRestrictions;
		
			public String readRestrinctions() {return UsageRestrictions;};
			public void changePurpose(String NewPurpose) {Purpose = NewPurpose;}
			public String getMaterialOfConstruction() {
				return MaterialOfConstruction;
			}
			public void setMaterialOfConstruction(String materialOfConstruction) {
				MaterialOfConstruction = materialOfConstruction;
			}
			public String getPurpose() {
				return Purpose;
			}
			public void setUsageRestrictions(String usageRestrictions) {
				UsageRestrictions = usageRestrictions;
			};	
	
}
