public class Monitors extends TouchScreenDevices{
					private float ColorSet;
					private float CalibrationPercent; //value between 0 and 1
					private String CurrentDisplayMode; //e.g. movie, document, manual
					
			public void calibrate(float NewCalibrationPercent) {CalibrationPercent=CalibrationPercent;};
			public void changeDisplayMode(String NewCurrentDisplayMode) {CurrentDisplayMode=NewCurrentDisplayMode;};
			public float getColorSet() {
				return ColorSet;
			}
			public void setColorSet(float colorSet) {
				ColorSet = colorSet;
			}
			public float getCalibrationPercent() {
				return CalibrationPercent;
			}
			public String getCurrentDisplayMode() {
				return CurrentDisplayMode;
			};

								
}
