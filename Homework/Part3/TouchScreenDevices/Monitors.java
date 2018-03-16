package myPackage01;

public class Monitors extends TouchScreenDevices{
					private float ColorSet;
					private float CalibrationPercent; //value between 0 and 1
					private String CurrentDisplayMode; //e.g. movie, document, manual
					
			public void calibrate(float NewCalibrationPercent) {CalibrationPercent=CalibrationPercent;};
			public void changeDisplayMode(String NewCurrentDisplayMode) {CurrentDisplayMode=NewCurrentDisplayMode;};
								
}
