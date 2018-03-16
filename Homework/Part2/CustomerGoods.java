
import java.util.*;

public class CustomerGoods {
		private String Manufacturer;
		private String Origin;
		private Boolean Edible;
		private String ProductName;
		private Date ProductionDate;
		private Date ExpireDate;
		private float Price;
		private String PackageType;
		private String MeasurementUnits;
		private float QuantityInMeasurementUnits;
	
	//method checkExripeDate returns 'true' if expireDate does more than current date and "false" if it doesn't 
	public boolean checkExripeDate() {
		Date CurrentDate = new Date();
		return CurrentDate.before(this.ExpireDate);
	}
	
	public void buyProduct() {};
	public void consumeProduct() {};
	public void useProduct() {};
	public void openProductPackage() {};
	public void closePoductPackage() {};
	public void throwAway() {};
	public void recycleProduct() {};
	
	private void productSpoiling() {Edible=false;};
	private void decomposeInTheEnvironment() {};

	//method setExpireDate changes expireDate
	public void setExpireDate(Date newDate) {
		this.ExpireDate = newDate;
	}
	
}
