import java.util.*;

public class WindInstruments extends MusicInstruments {
				private String MajorTone; //e.g. Bass, middle, treble
				private String Family; //e.g. Brass, Woodwind
				private String TypeOfSoundGeneration; //e.g. flexible reed, air reed, lip reed
				
		private void gatheringWaterInside() {};
		public void removeWater() {};
		public String getMajorTone() {
			return MajorTone;
		}
		public void setMajorTone(String majorTone) {
			MajorTone = majorTone;
		}
		public String getFamily() {
			return Family;
		}
		public void setFamily(String family) {
			Family = family;
		}
		public String getTypeOfSoundGeneration() {
			return TypeOfSoundGeneration;
		}
		public void setTypeOfSoundGeneration(String typeOfSoundGeneration) {
			TypeOfSoundGeneration = typeOfSoundGeneration;
		};
				
}
