package myPackage01;

import java.util.*;

public class TouchScreenDevices {
				private String Manufacturer;
				private String Origin;
				private String DeviceType;
				private String BrandeName;
				private String Model;
				private String SerialId;
				private float ScreenSize;
				private int[] ScreenResolution = new int[2];
				private String SensorType;
				private float[] Dimentions = new float[3];
				private float Weight;
				private String Colour;
				private int CpuName;
				private int CpuNumberOfCores;
				private float CpuFrequencyValue;
				private String CpuFrequencyUnits;
				private String RamType;
				private int RamVolume;
				private String RamUnits;
				private int InternalMemoryVolume;
				private String InternalMemoryUnits;
				private int BatteryCapacity;
				private int WarranyPeriod; //number of months
				private float PriceUSD;
				private int ScreenBrightness;
				private byte ScreenLockStatus;
				

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
