
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
	public String getManufacturer() {
		return Manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}

	public String getOrigin() {
		return Origin;
	}

	public void setOrigin(String origin) {
		Origin = origin;
	}

	public Boolean getEdible() {
		return Edible;
	}

	public void setEdible(Boolean edible) {
		Edible = edible;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public Date getProductionDate() {
		return ProductionDate;
	}

	public void setProductionDate(Date productionDate) {
		ProductionDate = productionDate;
	}

	public float getPrice() {
		return Price;
	}

	public void setPrice(float price) {
		Price = price;
	}

	public String getPackageType() {
		return PackageType;
	}

	public void setPackageType(String packageType) {
		PackageType = packageType;
	}

	public String getMeasurementUnits() {
		return MeasurementUnits;
	}

	public void setMeasurementUnits(String measurementUnits) {
		MeasurementUnits = measurementUnits;
	}

	public float getQuantityInMeasurementUnits() {
		return QuantityInMeasurementUnits;
	}

	public void setQuantityInMeasurementUnits(float quantityInMeasurementUnits) {
		QuantityInMeasurementUnits = quantityInMeasurementUnits;
	}

	public Date getExpireDate() {
		return ExpireDate;
	}

}
