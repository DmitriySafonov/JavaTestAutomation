public class Percussions extends MusicInstruments {
					public String MethodOfSoundProduction; //e.g. idiophone, membranophone, chordophone
					private String BeaterType; //e.g. hands, sticks, mallets
					private String WorkingAreaMaterial; //e.g. plastic, wood, leather
			
		public void changeBeaterType(String NewBeaterType) {BeaterType=NewBeaterType;};
		public void changeWorkingAreaMaterial(String NewWorkingAreaMaterial) {WorkingAreaMaterial=NewWorkingAreaMaterial;};
		public String getBeaterType() {
			return BeaterType;
		}
		public String getWorkingAreaMaterial() {
			return WorkingAreaMaterial;
		};
}
