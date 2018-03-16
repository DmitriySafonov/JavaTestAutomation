package myPackage01;

import java.util.*;

public class CustomerGoods {
		private String manufacturer;
		private String origin;
		private Boolean edible;
		private String productName;
		private Date productionDate;
		private Date expireDate;
		private float Price;
		private String packageType;
		private String measurementUnits;
		private float quantityInMeasurementUnits;
	
	//method checkExripeDate returns 'true' if expireDate does more than current date and "false" if it doesn't 
	public boolean checkExripeDate() {
		Date currentDate = new Date();
		return currentDate.before(this.expireDate);
	}
	
	public void buyProduct() {};
	public void consumeProduct() {};
	public void useProduct() {};
	public void openProductPackage() {};
	public void closePoductPackage() {};
	public void throwAway() {};
	public void recycleProduct() {};
	
	private void productSpoiling() {};
	private void decomposeInTheEnvironment() {};

	//method setExpireDate changes expireDate
	public void setExpireDate(Date newDate) {
		this.expireDate = newDate;
	}
	
}
