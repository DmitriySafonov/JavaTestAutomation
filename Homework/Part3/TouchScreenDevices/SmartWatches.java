package myPackage01;

public class SmartWatches extends TouchScreenDevices{
					private float WaterProofDepthMeters;
					private float ShockResistanceJoules;
					private String WatchStrapType;
					
			private void checkDepth(float CurrentDepth) {
				if (WaterProofDepthMeters<CurrentDepth) {DeviceState="Broken";}
			};
			
			public void changeWatchStrap(String NewWatchStrapType) {WatchStrapType=NewWatchStrapType;};
}
