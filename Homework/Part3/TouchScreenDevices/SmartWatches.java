public class SmartWatches extends TouchScreenDevices{
					private float WaterProofDepthMeters;
					private float ShockResistanceJoules;
					private String WatchStrapType;
					
			private void checkDepth(float CurrentDepth) {
				if (WaterProofDepthMeters<CurrentDepth) {DeviceState="Broken";}
			};
			
			public void changeWatchStrap(String NewWatchStrapType) {WatchStrapType=NewWatchStrapType;};
			public float getWaterProofDepthMeters() {
				return WaterProofDepthMeters;
			}

			public void setWaterProofDepthMeters(float waterProofDepthMeters) {
				WaterProofDepthMeters = waterProofDepthMeters;
			}

			public float getShockResistanceJoules() {
				return ShockResistanceJoules;
			}

			public void setShockResistanceJoules(float shockResistanceJoules) {
				ShockResistanceJoules = shockResistanceJoules;
			}

			public String getWatchStrapType() {
				return WatchStrapType;
			};

}
