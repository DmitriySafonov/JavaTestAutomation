public class StringInstruments extends MusicInstruments {
				private int NumberOfStrings;
				private int NumberOfFrets;
				private String StringsMaterial; //e.g. steel, nylon, brass
		
		public void putOnStrings(int NewNumberOfStrings, String NewStringMaterial) {
			NumberOfStrings = NewNumberOfStrings;
			StringsMaterial = NewStringMaterial;
		}
		
		private void rendOfStrings(int NewNumberOfStrings) {NumberOfStrings=NewNumberOfStrings;};
}
