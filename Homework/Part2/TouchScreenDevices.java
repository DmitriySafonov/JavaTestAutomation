import java.util.*;

public class TouchScreenDevices {
	private String Manufacturer;
	private String Origin;
	private String DeviceType;
	private String BrandName;
	private String Model;
	private String SerialId;
	private float ScreenSize;
	public int[] ScreenResolution = new int[2];
	private String SensorType;
	private float[] Dimentions = new float[3];
	private float Weight;
	private String Colour;
	private int WarrantyPeriod; //number of months
	public float PriceUSD;
	public int ScreenBrightness;
	public String DeviceState;
	public boolean IsScreenLocked;
	public boolean IsEnergySavingMoneOn; 
	

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


}
