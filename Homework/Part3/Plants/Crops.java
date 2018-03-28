public class Crops extends Plants{
		private String CropsPurpose;
		private float HarvestPreHectareValue;
		private String HarvestPreHectareUnit;
		
		
	public setHarvestPreHectare(float NewValue, String NewUnits) {
		HarvestPreHectareValue = NewValue;
		HarvestPreHectareUnit = NewUnits;
	}
		
	public String calcHarvest(float NumberOfHectares) {
		float result = HarvestPreHectareValue * NumberOfHectares;
		return result  + " " + HarvestPreHectareUnit;
	}
	public String getCropsPurpose() {
		return CropsPurpose;
	}

	public void setCropsPurpose(String cropsPurpose) {
		CropsPurpose = cropsPurpose;
	}

	public float getHarvestPreHectareValue() {
		return HarvestPreHectareValue;
	}

	public void setHarvestPreHectareValue(float harvestPreHectareValue) {
		HarvestPreHectareValue = harvestPreHectareValue;
	}

	public String getHarvestPreHectareUnit() {
		return HarvestPreHectareUnit;
	}

	public void setHarvestPreHectareUnit(String harvestPreHectareUnit) {
		HarvestPreHectareUnit = harvestPreHectareUnit;
	}

		
}
