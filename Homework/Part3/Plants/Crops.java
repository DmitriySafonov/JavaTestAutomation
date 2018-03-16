public class Crops extends Plants{
		private String CropsPurpose;
		private float HarvestPreHectareValue;
		private String HarvestPreHectareUnit;
		
		
	public setHarvestPreHectare(float NewValue, String NewUnits) {
		HarvestPreHectareValue = NewValue;
		HarvestPreHectareUnit = NewUnits;
	}
		
	public String calctHarvest(float NumberOfHectares) {
		float result = HarvestPreHectareValue * NumberOfHectares;
		return result  + " " + HarvestPreHectareUnit;
	}
		
}
