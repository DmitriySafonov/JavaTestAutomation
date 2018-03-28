public class StringInstruments extends MusicInstruments {
				private int NumberOfStrings;
				private int NumberOfFrets;
				private String StringsMaterial; //e.g. steel, nylon, brass
		
		public void putOnStrings(int NewNumberOfStrings, String NewStringMaterial) {
			NumberOfStrings = NewNumberOfStrings;
			StringsMaterial = NewStringMaterial;
		}
		
		private void rendOfStrings(int NewNumberOfStrings) {NumberOfStrings=NewNumberOfStrings;};
		public int getNumberOfStrings() {
			return NumberOfStrings;
		}

		public void setNumberOfStrings(int numberOfStrings) {
			NumberOfStrings = numberOfStrings;
		}

		public int getNumberOfFrets() {
			return NumberOfFrets;
		}

		public void setNumberOfFrets(int numberOfFrets) {
			NumberOfFrets = numberOfFrets;
		}

		public String getStringsMaterial() {
			return StringsMaterial;
		}

		public void setStringsMaterial(String stringsMaterial) {
			StringsMaterial = stringsMaterial;
		};

}
