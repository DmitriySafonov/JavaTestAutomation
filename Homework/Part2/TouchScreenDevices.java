import java.util.*;

public class TouchScreenDevices {
	private String Manufacturer;
	private String Origin;
	private String DeviceType;
	private String BrandName;
	private String Model;
	private String SerialId;
	private float ScreenSize;
	private int[] ScreenResolution = new int[2];
	private String SensorType;
	private float[] Dimentions = new float[3];
	private float Weight;
	private String Colour;
	private int WarrantyPeriod; //number of months
	private float PriceUSD;
	private int ScreenBrightness;
	private String DeviceState;
	private boolean IsScreenLocked;
	private boolean IsEnergySavingMoneOn; 
	

public void switchDeviceState(String NewState) {DeviceState=NewState;};
public void switchScreenLock() {IsScreenLocked = (IsScreenLocked==false) ? true : false;};
public void switchEnegrySavingMode() {IsEnergySavingMoneOn = (IsEnergySavingMoneOn==false)? true : false;};
public void changeResolution(int NewWidth, int NewHeight) {ScreenResolution[0]=NewWidth;ScreenResolution[1]=NewHeight;};
public void interactWithTouchScreen() {};
public String getWarrantyDetails() {
String result = "Brand name: " + BrandName + "\nModel: " + Model + "\nSerial ID: " + SerialId + "\nWarrantyPeriod: " + WarrantyPeriod + " months";
return result;
};

private void controlBatteryCharge() {};
private void overheatPotection() {};
private void processingTouches() {};
private void doEnergySavingMode() {};
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
public String getDeviceType() {
	return DeviceType;
}
public void setDeviceType(String deviceType) {
	DeviceType = deviceType;
}
public String getBrandName() {
	return BrandName;
}
public void setBrandName(String brandName) {
	BrandName = brandName;
}
public String getModel() {
	return Model;
}
public void setModel(String model) {
	Model = model;
}
public String getSerialId() {
	return SerialId;
}
public void setSerialId(String serialId) {
	SerialId = serialId;
}
public float getScreenSize() {
	return ScreenSize;
}
public void setScreenSize(float screenSize) {
	ScreenSize = screenSize;
}
public int[] getScreenResolution() {
	return ScreenResolution;
}
public void setScreenResolution(int[] screenResolution) {
	ScreenResolution = screenResolution;
}
public String getSensorType() {
	return SensorType;
}
public void setSensorType(String sensorType) {
	SensorType = sensorType;
}
public float[] getDimentions() {
	return Dimentions;
}
public void setDimentions(float[] dimentions) {
	Dimentions = dimentions;
}
public float getWeight() {
	return Weight;
}
public void setWeight(float weight) {
	Weight = weight;
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
public float getPriceUSD() {
	return PriceUSD;
}
public void setPriceUSD(float priceUSD) {
	PriceUSD = priceUSD;
}
public int getScreenBrightness() {
	return ScreenBrightness;
}
public void setScreenBrightness(int screenBrightness) {
	ScreenBrightness = screenBrightness;
}
public String getDeviceState() {
	return DeviceState;
}
public boolean getIsScreenLocked() {
	return IsScreenLocked;
}
public boolean getIsEnergySavingMoneOn() {
	return IsEnergySavingMoneOn;
};

}
