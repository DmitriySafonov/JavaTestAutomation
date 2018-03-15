package myPackage01;

import java.util.*;

public class TouchScreenDevices {
				private String manufacturer;
				private String origin;
				private String deviceType;
				private String brandeName;
				private String Model;
				private String serialId;
				private float screenSize;
				private int[] screenResolution = new int[2];
				private String sensorType;
				private float[] Dimentions = new float[3];
				private float weight;
				private String colour;
				private int cpuName;
				private int cpuNumberOfCores;
				private float cpuFrequencyValue;
				private String cpuFrequencyUnits;
				private String ramType;
				private int ramVolume;
				private String ramUnits;
				private int internalMemoryVolume;
				private String internalMemoryUnits;
				private int batteryCapacity;
				private int warranyPeriod; //number of months
				private float priceUSD;
				private int screenBrightness;
				private byte screenLockStatus;
				

		public void switchDeviceState() {};
		public void switchScreenLock() {};
		public void openApplication(String appName) {};
		public void closeApplication(String appName) {};
		public void chargeDevide() {};
		public void interactWithTouchScreen() {};
		
		private void controlBatteryCharge() {};
		private void overheatPotection() {};
		private void processingTouches() {};
		private void doEnergySavingMode() {};
		
		
}
